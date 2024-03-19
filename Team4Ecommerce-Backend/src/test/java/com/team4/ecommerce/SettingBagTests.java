package com.team4.ecommerce;

import com.team4.ecommerce.entity.setting.Setting;
import com.team4.ecommerce.entity.setting.SettingBag;
import com.team4.ecommerce.entity.setting.SettingCategory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class SettingBagTests {

    private SettingBag settingBag;
    private List<Setting> initialSettings;

    @BeforeEach
    public void setup() {
        initialSettings = new ArrayList<>();
        initialSettings.add(new Setting("site_name", "My eCommerce Site", SettingCategory.GENERAL));
        settingBag = new SettingBag(initialSettings);
    }

    @Test
    public void testGetValue() {
        String siteName = settingBag.getValue("site_name");
        assertThat(siteName).isEqualTo("My eCommerce Site");

        String nonExistent = settingBag.getValue("non_existent_key");
        assertThat(nonExistent).isNull();
    }

    @Test
    public void testUpdate() {
        settingBag.update("site_name", "Updated eCommerce Site");
        assertThat(settingBag.getValue("site_name")).isEqualTo("Updated eCommerce Site");

        settingBag.update("non_existent_key", "Should not exist");
        assertThat(settingBag.getValue("non_existent_key")).isNull();
    }

    @Test
    public void testList() {
        List<Setting> settings = settingBag.list();
        assertThat(settings).hasSize(2).containsAll(initialSettings);
    }

    @Test
    public void testGetSetting() {

        Setting setting = settingBag.get("contact_email");
        assertThat(setting).isNotNull();
        assertThat(setting.getKey()).isEqualTo("contact_email");
        assertThat(setting.getValue()).isEqualTo("contact@example.com");

        Setting nonExistent = settingBag.get("non_existent_key");
        assertThat(nonExistent).isNull();
    }
}
