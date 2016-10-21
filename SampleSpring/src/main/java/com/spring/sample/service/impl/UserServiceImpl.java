package com.spring.sample.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

import com.spring.sample.model.User;

/**
 * 
 * @author Shekar
 *
 */
@Service
public class UserServiceImpl implements UserService {
	Map<String, User> dbMap = new HashMap<String, User>();

	UserServiceImpl() {
		dummyUsers();
	}

	private void dummyUsers() {
		User user = null;
		String name = "name";
		for (int i = 0; i < 10; i++) {
			user = new User(name + i, name + "@user.com", "901023565" + i);
			dbMap.put(name + i, user);
		}

	}

	public User save(User user) {
		dbMap.put(user.getName(), user);
		return user;
	}

	public User update(String id, User user) {
		dbMap.put(user.getName(), user);
		return user;
	}

	public User delete(String name) {

		return dbMap.remove(name);
	}

	public User get(String name) {

		return dbMap.get(name);
	}

	public List<User> getAll() {
		Iterator<java.util.Map.Entry<String, User>> iterator = dbMap.entrySet().iterator();
		List<User> users = new ArrayList<User>();
		while (iterator.hasNext()) {
			Entry<String, User> userEntry = iterator.next();
			users.add(userEntry.getValue());
		}
		return users;
	}

}
