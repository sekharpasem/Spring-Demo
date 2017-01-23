package com.expernner.springhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.expernner.springhibernate.model.ConsumerRegistration;
import com.expernner.springhibernate.service.RegistrationService;

@RestController
public class RegistrationController {
	@Autowired
	RegistrationService registrationService;

	@RequestMapping(value = "/reg/consumer", method = RequestMethod.POST)
	public ResponseEntity saveConsumer(@RequestBody ConsumerRegistration consumerRegistration) {
		System.out.println(consumerRegistration);
		ConsumerRegistration model = registrationService.save(consumerRegistration);
		return new ResponseEntity(model, HttpStatus.OK);
	}

	@RequestMapping(value = "/consumers", method = RequestMethod.GET)
	public ResponseEntity getConsumers() {
		List<ConsumerRegistration> consumerRegistrations = registrationService.getConsumers();
		return new ResponseEntity(consumerRegistrations, HttpStatus.OK);
	}

}
