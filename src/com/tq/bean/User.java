package com.tq.bean;

public class User {
	private String  username;
	private String  pwd;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "User==LZ改了=====>GGG[username=" + username + ", pwd=" + pwd + "]";
	}
	
	public void jokeRgg(){
		System.out.println("stupid555-----------------怎么的55");
	}
}
