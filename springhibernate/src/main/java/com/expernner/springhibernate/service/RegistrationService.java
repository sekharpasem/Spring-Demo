package com.expernner.springhibernate.service;

import java.util.List;

import com.expernner.springhibernate.model.ConsumerRegistration;

public interface RegistrationService {
	public ConsumerRegistration save(ConsumerRegistration consumerRegistration);

	public List<ConsumerRegistration> getConsumers();
}
