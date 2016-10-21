package com.spring.sample.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.audit4j.core.annotation.Audit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.sample.model.User;
import com.spring.sample.service.impl.UserService;

/**
 * 
 * @author Shekar
 *
 */

@RestController
@SuppressWarnings("rawtypes")
@Audit
public class TestContoller {
	@Autowired
	UserService userService;
	/**
	 * Logger
	 */
	private static final Logger logger = Logger.getLogger(TestContoller.class);

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/user/{name}", method = RequestMethod.GET)
	public ResponseEntity getUser(@PathVariable("name") String name) {
		logger.info("get user with name " + name);
		ResponseEntity response = null;
		User user = userService.get(name);
		if (user != null) {
			response = new ResponseEntity(user, HttpStatus.OK);
		} else {
			response = new ResponseEntity("User not found", HttpStatus.BAD_REQUEST);
		}
		return response;
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/user/{name}", method = RequestMethod.PUT)
	public ResponseEntity updateUser(@RequestBody User user, @PathVariable("name") String name) {
		logger.info("update user");
		ResponseEntity response = null;
		User userModel = userService.update(name, user);
		if (userModel != null) {
			response = new ResponseEntity(userModel, HttpStatus.OK);
		}

		return response;
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public ResponseEntity saveUser(@RequestBody User user) {
		logger.info("save user");
		System.out.println("Save User");
		ResponseEntity response = null;
		User userModel = userService.save(user);
		if (userModel != null) {
			response = new ResponseEntity(userModel, HttpStatus.OK);
		}

		return response;
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/user/{name}", method = RequestMethod.DELETE)
	public ResponseEntity updateUser(@PathVariable("name") String name) {
		logger.info("delete user");
		ResponseEntity response = null;
		User userModel = userService.delete(name);
		if (userModel != null) {
			response = new ResponseEntity(userModel, HttpStatus.OK);
		}

		return response;
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ResponseEntity getAll() {
		logger.info("get all users");
		// String actor = MyApplicationContext.getAuthanticatedUser();
		/*
		 * AuditManager manager = AuditManager.getInstance(); manager.audit(new
		 * AuditEvent("sekhar", "getAll", new Field("myParam1Name", "adfaf"),
		 * new Field("myParam2Name", "asddaf")));
		 */
		ResponseEntity response = null;
		List<User> users = userService.getAll();
		if (users != null && !users.isEmpty()) {
			response = new ResponseEntity(users, HttpStatus.OK);
		} else {
			response = new ResponseEntity(HttpStatus.NO_CONTENT);
		}

		return response;
	}

}
