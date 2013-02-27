package ycpCS320;

public class Account {
	private String email, userName, password;
	public Account(String emailaddress, String usr, String pwd){
		this.email = emailaddress;
		this.userName = usr;
		this.password = pwd;
	}
	public String getUserName(){
		return userName;
	}
	public String getPassword(){
		return password;
	}
	
	public String getEmail(){
		return email;
	}
}
