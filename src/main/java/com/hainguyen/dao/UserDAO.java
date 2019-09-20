package com.hainguyen.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hainguyen.daoimp.UserImp;
import com.hainguyen.entity.User;

@Repository
public class UserDAO implements UserImp {
	
	@Autowired
	SessionFactory sessionFactory;

	public boolean CheckLogin(String email, String password) {
		Session session = sessionFactory.getCurrentSession();
		try {
			User user = (User)session.createQuery("from User where email=" + email);
			if (user != null) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}


	

}
