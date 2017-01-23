package com.expernner.springhibernate.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expernner.springhibernate.dao.RegistrationDao;
import com.expernner.springhibernate.model.ConsumerRegistration;
import com.expernner.springhibernate.service.RegistrationService;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService {
	@Autowired
	RegistrationDao registrationDao;
	
	public ConsumerRegistration save(ConsumerRegistration consumerRegistration) {

		return registrationDao.save(consumerRegistration);
	}

	public List<ConsumerRegistration> getConsumers() {
		
		return registrationDao.getConsumers();
	}

}
