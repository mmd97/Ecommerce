package com.team4.admin.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.team4.ecommerce.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {

}
