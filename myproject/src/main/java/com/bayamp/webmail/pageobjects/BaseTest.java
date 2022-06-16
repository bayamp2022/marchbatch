package com.bayamp.webmail.pageobjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	protected WebDriver driver;
	private Properties prop;

	@BeforeSuite
	public void loadDriver() throws IOException {
		
		if (prop == null) {
			InputStream configFile = new FileInputStream("./src/main/resources/config.properties");
			prop = new Properties();
			prop.load(configFile);
		}
		
		String browser = prop.getProperty("browserType");
		Reporter.log("Browser Type is :" + browser,true);
		
		String driverLocation = prop.getProperty("driver.location");
		Reporter.log("Driver Location  is :" + driverLocation,true);
		
		if("chrome".equals(browser)) {
			Reporter.log("Loading chrome driver",true);
			System.setProperty("webdriver.chrome.driver",driverLocation );
			
		}
		
		if("firefox".equals(browser)) {
			Reporter.log("Loading firefox driver",true);
			System.setProperty("webdriver.gecko.driver",driverLocation );
			
		}
				


	}

	/**
	 * descritpion : this method initlizes the web driver and launches the URL
	 * @throws InterruptedException
	 */
	@BeforeMethod
	public void initWebDriver() throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//launch URL 
		driver.get("http://webmail.bayamp.com");

		//maximize
		driver.manage().window().maximize();

		Thread.sleep(3000);
	}

	@AfterMethod
	public void quitWebDriver() {

		driver.quit();
	}

}
