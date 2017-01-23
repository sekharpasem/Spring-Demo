package com.expernner.springhibernate.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.expernner.springhibernate.dao.RegistrationDao;
import com.expernner.springhibernate.model.ConsumerRegistration;

@Repository
public class RegistrationDaoImpl implements RegistrationDao {

	@Autowired
	 SessionFactory sessionFactory;


	public ConsumerRegistration save(ConsumerRegistration consumerRegistration) {

		Session session = this.sessionFactory.getCurrentSession();
		Integer id = (Integer) session.save(consumerRegistration);
		ConsumerRegistration reg = (ConsumerRegistration) session.get(ConsumerRegistration.class, id);
		return reg;
	}

	public List<ConsumerRegistration> getConsumers() {
		Session session = this.sessionFactory.getCurrentSession();
		List<ConsumerRegistration> list = session.createQuery("from ConsumerRegistration").list();
		return list;
	}

}
