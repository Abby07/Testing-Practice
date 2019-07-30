package com.Practice_XPath;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateElements {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		
		
		System.setProperty("webdriver.gecko.driver","/Users/Abiola/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseUrl="http://letskodeit.teachable.com/";
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void test() throws InterruptedException {
		
		driver.get(baseUrl);
		String Title= driver.getTitle();
		System.out.println("The baseUrl Title is :" + Title);
		
		String currentUrl= driver.getCurrentUrl();
		System.out.println("The Current baseURL is: " + currentUrl);
		
		//Page to navigate to;
		driver.navigate().to("http://letskodeit.teachable.com/p/practice");
		
		currentUrl= driver.getCurrentUrl();
		System.out.println("The Current navigateURL is: " + currentUrl);
		
		Thread.sleep(2000);
		driver.navigate().back();
		currentUrl= driver.getCurrentUrl();
		System.out.println("The Current navigatebackURL is: " + currentUrl);
		
		Thread.sleep(2000);
		driver.navigate().forward();
		currentUrl= driver.getCurrentUrl();
		System.out.println("The Current navigateforwardURL is: " + currentUrl);
		
		Thread.sleep(2000);
		driver.navigate().back();
		currentUrl= driver.getCurrentUrl();
		System.out.println("The Current navigatebackURL is: " + currentUrl);
		driver.navigate().refresh();
		System.out.println("Navigate Refresh");
		driver.get(currentUrl);
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	

}
