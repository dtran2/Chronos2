package edu.ycp.cs320.chronos.database;

public class Account {
	private String userName, password, emailAddress;
	public Account(String usr, String pwd, String email){
		this.userName = usr;
		this.password = pwd;
		this.emailAddress = email;
	}
	public String getUserName(){
		return userName;
	}
	public String getPassword(){
		return password;
	}
	public String getEmail(){
		return emailAddress;
	}
}
