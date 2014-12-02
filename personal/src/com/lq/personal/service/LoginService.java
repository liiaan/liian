package com.lq.personal.service;

import java.util.List;

import com.lq.personal.dao.LoginDao;
import com.lq.personal.entity.User;

public class LoginService {
	private LoginDao loginDao;

	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}
	
	public List<User> getUser(String username){
		List<User> li = loginDao.getUser(username);
		return li;
	}

}
