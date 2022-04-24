package com.bayamp.webmail.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends Page {
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean login(String user,String passswrod) throws InterruptedException {
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#user")).sendKeys("user1@bayamp.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#pass")).sendKeys("user1");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#login_submit")).click();
		

		//Thread.sleep(3000);
		//user dynamic wait to check if Logout is present or visible
				
		//if logout button on landing page is visible then return true else return false
		
		return true;
	}

}
