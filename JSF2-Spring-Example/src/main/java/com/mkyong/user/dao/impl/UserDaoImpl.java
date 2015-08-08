package com.mkyong.user.dao.impl;

import javax.inject.Named;

import com.mkyong.user.dao.UserDao;

@Named
public class UserDaoImpl  extends UserInformation implements UserDao {
	
	public String getMessage() {
		
		return "JSF 2 + Spring Integration's Vaquar Khan"+getName();
	
	}

}
