package com.Practice;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Test_New {
	WebDriver driver;
	String baseUrl;
	

	@Before
	public void setUp() throws Exception {
		
		//System.setProperty("webdriver.gecko.driver","/Users/Abiola/workspace/geckodriver");
		
		//driver = new FirefoxDriver();
		driver = new SafariDriver();
		//WebDriver driver= new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/pages/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	
	@Test
	public void test() throws InterruptedException {	
		
		driver.get(baseUrl);
		
		WebElement buttonElement = driver.findElement(By.id("opentab"));
		String elementText = buttonElement.getText();
		
		System.out.println("Text on the element is: " + elementText);
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
		
	}

}
