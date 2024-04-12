package com.team4.admin.setting.state;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.team4.ecommerce.entity.Country;
import com.team4.ecommerce.entity.State;

public interface StateRepository extends CrudRepository<State, Integer> {
	
	public List<State> findByCountryOrderByNameAsc(Country country);
}
