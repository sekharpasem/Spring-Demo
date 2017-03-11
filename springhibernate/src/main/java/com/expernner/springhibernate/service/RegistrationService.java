package com.expernner.springhibernate.service;

import java.util.List;

import com.expernner.springhibernate.model.UserRegistration;

public interface RegistrationService {
	public UserRegistration save(UserRegistration consumerRegistration);

	public List<UserRegistration> getConsumers();
}
