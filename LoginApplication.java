package com.Login;

import com.Login.Controller.LoginController;
import com.Login.Model.LoginModel;


public class LoginApplication {

	public static void main(String[] args) throws Exception {
		
		LoginModel loginObj=new LoginModel();
		
		loginObj.setUserName("kathir1708");
		loginObj.setPassword("kathir@123");
		
		LoginController controllerObj=new LoginController();
		System.out.println(controllerObj.authenticateUserLogin(loginObj));
		
		
		
	}

}
