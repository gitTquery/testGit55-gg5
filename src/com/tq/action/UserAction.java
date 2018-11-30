package com.tq.action;

import com.tq.bean.User;

public class UserAction {
	private   User  user;

	
	
	public String  exec(){
		
		System.out.println("dfghbredtf"+user);
		return "success";
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
