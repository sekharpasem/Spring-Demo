package com.expernner.springhibernate.dao;

import java.util.List;

import com.expernner.springhibernate.model.UserRegistration;

public interface RegistrationDao {
	public UserRegistration save(UserRegistration consumerRegistration);

	public List<UserRegistration> getConsumers();
}
