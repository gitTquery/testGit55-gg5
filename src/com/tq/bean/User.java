package com.tq.bean;

public class User {
	private String  username;
	private String  pwd;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		System.out.println("---------->IGbb");
		this.username = username+"=====>fucker";
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		System.out.println("======ÅòÕÍUzi=============");
		return "User===TGK====>GGG[username=" + username + ", pwd=" + pwd + "]";
		
	}
	
	public void jokeRgg(){
		System.out.println("stupid55555");
	}
}
