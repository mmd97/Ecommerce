package com.team4.admin.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.team4.ecommerce.entity.Currency;

public interface CurrencyRepository extends CrudRepository<Currency, Integer> {
	
	public List<Currency> findAllByOrderByNameAsc();
}
