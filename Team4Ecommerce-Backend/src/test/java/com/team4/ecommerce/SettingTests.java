package com.team4.ecommerce;

import com.team4.ecommerce.entity.setting.Setting;
import com.team4.ecommerce.entity.setting.SettingCategory;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SettingTests {

    @Test
    public void testCreateNewSetting() {
        Setting setting = new Setting();
        setting.setKey("site_name");
        setting.setValue("My eCommerce Site");
        setting.setCategory(SettingCategory.GENERAL);

        assertThat(setting.getKey()).isEqualTo("site_name");
        assertThat(setting.getValue()).isEqualTo("My eCommerce Site");
        assertThat(setting.getCategory()).isEqualTo(SettingCategory.GENERAL);
    }
}
