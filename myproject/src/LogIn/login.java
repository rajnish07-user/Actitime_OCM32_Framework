package LogIn;


import org.testng.annotations.Test;

import Base.BaseClass;
import POMDesign.LoginPage;

public class login extends BaseClass{

	

	@Test
	public void PositiveLogIn() {
		LoginPage LP=new  LoginPage(driver);
		LP.setUser("rajnisho71199@gmail.com");
		LP.setPass("Rajnish123");
	}
	
	@Test
	public void NegativeLogin() {
		LoginPage LP=new  LoginPage(driver);
		LP.setUser("1234759");
		LP.setPass("!@#&$***$");
	}

}
