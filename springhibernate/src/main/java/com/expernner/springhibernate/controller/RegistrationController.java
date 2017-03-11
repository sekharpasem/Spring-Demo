package com.expernner.springhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.expernner.springhibernate.model.UserRegistration;
import com.expernner.springhibernate.service.RegistrationService;

@RestController
public class RegistrationController {
	@Autowired
	RegistrationService registrationService;

	@RequestMapping(value = "/user-registration", method = RequestMethod.POST)
	public ResponseEntity saveRegistration(@RequestBody UserRegistration userRegistration) {
		UserRegistration model = registrationService.save(userRegistration);
		return new ResponseEntity(model, HttpStatus.OK);
	}

	@RequestMapping(value = "/user-registration", method = RequestMethod.GET)
	public ResponseEntity getConsumers() {
		List<UserRegistration> userRegistrations = registrationService.getConsumers();
		return new ResponseEntity(userRegistrations, HttpStatus.OK);
	}

}
