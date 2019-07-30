package com.Practice_XPath;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import page.classes.SearchPage;



public class PageObject {
	private WebDriver driver;
	private String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver","/Users/Abiola/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseUrl="http://expedia.co.uk/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			
	}
	@Test
	public void test() {
		driver.get(baseUrl);
		SearchPage.clickFlightTab(driver);
		SearchPage.fillingOriginTextBox(driver, "New York" );
		SearchPage.destinationTextBox(driver).sendKeys("London");
		SearchPage.departuredateTextBox(driver).sendKeys("22/10/2017");
		SearchPage.arrivaldateTextBox(driver).clear();
		SearchPage.arrivaldateTextBox(driver).sendKeys("12/12/2017");
		SearchPage.clickOnSearchButton(driver);
		
				
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}

	

}
