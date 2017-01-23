package com.expernner.springhibernate.dao;

import java.util.List;

import com.expernner.springhibernate.model.ConsumerRegistration;

public interface RegistrationDao {
	public ConsumerRegistration save(ConsumerRegistration consumerRegistration);

	public List<ConsumerRegistration> getConsumers();
}
