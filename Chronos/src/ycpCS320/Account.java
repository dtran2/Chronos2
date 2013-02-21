package ycpCS320;

public class Account {
	private String userName, password;
	public Account(String usr, String pwd){
		this.userName = usr;
		this.password = pwd;
	}
	public String getUserName(){
		return userName;
	}
	public String getPassword(){
		return password;
	}
}
