package com.caveofprogramming.designpatterns.demo1.view;

public class LoginFormEvent {
	private String name;
	private String password;
	private String action;

	public LoginFormEvent(String name, String password, String action) {
		this.name = name;
		this.password = password;
		this.action = action;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}
