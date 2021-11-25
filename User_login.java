package com.vst.cfs;

public class User_login {

	public  void user_Authentication (String user ,String password) {
		System.out.println("Welcome to Verve Square");
		 System.out.println("Enter username:");//username:user
		 System.out.println("Enter password:");//password:user
		  if(user.equals("user") && password.equals("user"))
	        {
	            System.out.println("Authentication Successful");
	        }
	        else
	        {
	            System.out.println("Authentication Failed");
	        }

	}

}
