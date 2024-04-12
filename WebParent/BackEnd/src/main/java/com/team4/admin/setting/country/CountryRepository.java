package com.team4.admin.setting.country;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.team4.ecommerce.entity.Country;

public interface CountryRepository extends CrudRepository<Country, Integer> {
	public List<Country> findAllByOrderByNameAsc();
}
