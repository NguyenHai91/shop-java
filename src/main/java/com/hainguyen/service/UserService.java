package com.hainguyen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hainguyen.dao.*;
import com.hainguyen.daoimp.*;

@Service
public class UserService implements UserImp {
	
	@Autowired
	UserDAO userDAO;

	public boolean CheckLogin(String email, String password) {
		boolean check = userDAO.CheckLogin(email, password);
		return check;
	}


}
