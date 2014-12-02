package com.lq.personal.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.lq.personal.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private int id;
	private LoginService loginService;

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String login() {
		String password1 = null;
		try{
		password1= loginService.getUser(username).get(0).getPassword();
		}
		catch(Exception e){
			ServletActionContext.getRequest().setAttribute("msg",
					"用户名或密码错误");
			return "fail";
		}
		id = loginService.getUser(username).get(0).getId();
		if (password1 != null&&!"".equals(password1)) {
			if (password.equals(password1)) {
				ServletActionContext.getRequest().getSession().setMaxInactiveInterval(-1);
				ServletActionContext.getRequest().getSession()
						.setAttribute("id", id);
				return "success";

			} else {
				ServletActionContext.getRequest().setAttribute("msg",
						"用户名或密码错误");
				return "fail";
			}
		} else {
			return "fail";
		}

	}

}
