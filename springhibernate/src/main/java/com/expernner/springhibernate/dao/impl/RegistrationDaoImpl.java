package com.expernner.springhibernate.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.expernner.springhibernate.dao.RegistrationDao;
import com.expernner.springhibernate.model.UserRegistration;

@Repository
public class RegistrationDaoImpl implements RegistrationDao {

	@Autowired
	 SessionFactory sessionFactory;


	public UserRegistration save(UserRegistration consumerRegistration) {

		Session session = this.sessionFactory.getCurrentSession();
		Integer id = (Integer) session.save(consumerRegistration);
		UserRegistration reg = (UserRegistration) session.get(UserRegistration.class, id);
		return reg;
	}

	public List<UserRegistration> getConsumers() {
		Session session = this.sessionFactory.getCurrentSession();
		List<UserRegistration> list = session.createQuery("from ConsumerRegistration").list();
		return list;
	}

}
