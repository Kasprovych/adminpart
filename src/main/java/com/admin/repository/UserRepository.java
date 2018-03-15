package com.admin.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.admin.domain.User;

public interface  UserRepository extends CrudRepository<User, Long>{
	User findByUsername(String name);

}
