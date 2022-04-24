package com.bayamp.team.selenium.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ValidateCompanyTable {
	
	private final By COMPANY_TABLE_LOCATOR = By.id("customers");
	
	private final By COMPANY_TABLE_ROWS_LOCATOR = By.xpath("//table[@id='customers']/tbody/tr");
	
	private final By COMPANY_TABLE_ISLAND_ROW_LOCATOR = By.cssSelector("table[id='customers']>tbody>tr:nth-child(5)>td:nth-child(1)");
	
	
	private final int EXPECTED_CUSTOMER_COUNT = 7;
	private final String EXPECTED_COMPANY_NAME = "Island Trading";
	
	@Test
	public void validateW3SchoolsCompanyTable() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/harisha/bayamp-training/drivers/chrome/chromedriver");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		List<WebElement> allCustomerTableRows = driver.findElements(COMPANY_TABLE_ROWS_LOCATOR);
		
		int rowCount = allCustomerTableRows.size();
		
		Reporter.log("Total row count of customers table = "+ rowCount,true);
		
		Assert.assertTrue(rowCount>2);
		Assert.assertEquals(rowCount,EXPECTED_CUSTOMER_COUNT);
	
		
		String companyName = driver.findElement(COMPANY_TABLE_ISLAND_ROW_LOCATOR).getText();
	
		Assert.assertEquals(companyName,EXPECTED_COMPANY_NAME);
		
		driver.quit();
	}

}
