package com.spring.sample.service.impl;

import java.util.List;

import com.spring.sample.model.User;

/**
 * 
 * @author Shekar
 *
 */
public interface UserService {
	User save(User user);

	User update(String name, User user);

	User delete(String name);

	User get(String name);

	List<User> getAll();
}
