package com.mkyong.user.bo.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import com.mkyong.user.bo.UserBo;
import com.mkyong.user.dao.UserDao;

@Named
public class UserBoImpl implements UserBo{
 @Autowired
	private UserDao userDao;
	
	public String getMessage() {
		
		return  userDao.getMessage();
	
	}
 
}