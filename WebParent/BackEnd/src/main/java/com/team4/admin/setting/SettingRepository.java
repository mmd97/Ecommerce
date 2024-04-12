package com.team4.admin.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.team4.ecommerce.entity.setting.Setting;
import com.team4.ecommerce.entity.setting.SettingCategory;

public interface SettingRepository extends CrudRepository<Setting, String> {
	public List<Setting> findByCategory(SettingCategory category);
}
