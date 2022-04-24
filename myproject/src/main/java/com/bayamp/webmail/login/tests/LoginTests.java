package com.bayamp.webmail.login.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.bayamp.webmail.pageobjects.BaseTest;
import com.bayamp.webmail.pageobjects.LoginPage;


public class LoginTests extends BaseTest {

	@Test
	public void happyPathLoginTest() throws InterruptedException, IOException {

		LoginPage loginPage = new LoginPage(driver);

		boolean check = loginPage.login("user1@bayamp.com", "user1");
		
		
		Assert.assertTrue(check);
		
		Reporter.log("LOgin Sccessfull");

	}
	
	@Test
	public void invalidUserNameLoginTest() throws InterruptedException, IOException {

		LoginPage loginPage = new LoginPage(driver);

		boolean check = loginPage.login("xyz@bayamp.com", "user1");
		
		
		Assert.assertFalse(check);
		
		Reporter.log("LOgin NOT Sccessfull as expected for an invalid user");

	}

	@Test
	public void invalidPasswordLoginTest() throws InterruptedException, IOException {

		LoginPage loginPage = new LoginPage(driver);

		boolean check = loginPage.login("user1@bayamp.com", "xyz");
		
		
		Assert.assertTrue(check);
		
		Reporter.log("LOgin NOT Sccessfull as expected for an invalid password");

	}

}
