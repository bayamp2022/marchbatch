package com.bayamp.team.selenium.programs;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ValidateCompanyTableDynamically {
	
	
	private final By COMPANY_TABLE_ROWS_LOCATOR = By.xpath("//table[@id='customers']/tbody/tr");
	

	private final String EXPECTED_COMPANY_NAME = "Island Trading";
	
	@Test
	public void validateW3SchoolsCompanyTable() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","/Users/harisha/bayamp-training/drivers/chrome/chromedriver");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File srcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
		//TODO
		//Write a java program to check if screenshot folder exists , if not create it 
		
        File destFile=new File("./screenshots/mypic.png");

        //Copy file at destination

        FileUtils.copyFile(srcFile, destFile);
		
        Reporter.log("<a href='"+ destFile.getAbsolutePath() + "'> <img src='"+ destFile.getAbsolutePath() + "' height='500' width='500'/> </a>");
		List<WebElement> allCustomerTableRows = driver.findElements(COMPANY_TABLE_ROWS_LOCATOR);
		
		boolean found = false;
		for (int i = 1; i < allCustomerTableRows.size(); i++) {
			
			WebElement row = allCustomerTableRows.get(i);
			
			String company = row.findElement(By.xpath("./td[1]")).getText();
			
			if(EXPECTED_COMPANY_NAME.equals(company)) {
				found = true;
				Reporter.log("Found " + EXPECTED_COMPANY_NAME +" Company contacts table",true);
				Assert.assertTrue(found);
				break;
			}
				
		}
		
		if(!found) {
			driver.quit();
			Assert.fail("Not Found " + EXPECTED_COMPANY_NAME +" Company in the contacts table");
		}
		driver.quit();
	
	}

}
