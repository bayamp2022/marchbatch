package com.bayamp.team.selenium.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SearchProductTests {
	
	private final By SEARCH_FIELD_LOCATOR = By.name("field-keywords");
	private final By SEARCH_ICON_LOCATOR = By.xpath("//input[@id='nav-search-submit-button']");
	private final By PRICE_LABEL_LOCATOR = By.xpath("//div[@data-index='3']//div[contains(@class,'s-list-col-right')]//span[@class='a-offscreen']");
	
	private final String EXPECTED_PRICE_FORMAT =  "\\$\\d{2,3}\\.\\d{2}";
	@Test
	public void amazonSearchTVTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/harisha/bayamp-training/drivers/chrome/chromedriver");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("http://www.amazon.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//find serach field and enter TV 
//		WebElement searchField = driver.findElement(SEARCH_FIELD_LOCATOR);
//		searchField.sendKeys("TV");
	
		driver.findElement(SEARCH_FIELD_LOCATOR).sendKeys("TV");
		
		Thread.sleep(2000);
		
		//click on search icon
		WebElement searchIcon = driver.findElement(SEARCH_ICON_LOCATOR);
		searchIcon.click();
		
		Thread.sleep(3000);
		
		String priceOfTheThirdTV = driver.findElement(PRICE_LABEL_LOCATOR).getAttribute("innerHTML");
		Reporter.log("The Price of the 3rd TV is :" + priceOfTheThirdTV, true);
		
		
		//Validations
		boolean check = priceOfTheThirdTV.matches(EXPECTED_PRICE_FORMAT);
		
		Assert.assertTrue(check);
		
		//Assert.assertNotNull(priceOfTheThirdTV);
		driver.quit();
	
		
	}
	
	

}
