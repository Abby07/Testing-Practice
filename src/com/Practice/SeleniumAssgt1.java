package com.Practice;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumAssgt1 {
	WebDriver driver;
	String BaseUrl;
	

	@Before
	public void setUp() throws Exception {
	System.setProperty("webdriver.gecko.driver","/Users/Abiola/workspace/geckodriver");

		driver=new FirefoxDriver();
	BaseUrl="https://www.google.co.uk";
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws InterruptedException {
    driver.get(BaseUrl);
    String Title= driver.getTitle();
    System.out.println("The title of the page is " + Title);
    System.out.println("The BaseUrl of the page is " + BaseUrl);
    //driver.findElement(By.xpath("//input[@id='gs_htif0']")).sendKeys("Selenium");
    //driver.findElement(By.name("btnK")).click();
    
   
    //System.out.println("The Current Url is " + currentUrl);
    
    String currentUrl=driver.getCurrentUrl();
    
    String urlToNavigate="http://docs.seleniumhq.org/";
    driver.navigate().to(urlToNavigate);
    currentUrl=driver.getCurrentUrl();
    System.out.println("The Current Url is " + currentUrl);
    
    Thread.sleep(3000);
    
    driver.navigate().back();
    System.out.println("Navigate Back");
    currentUrl=driver.getCurrentUrl();
    System.out.println("The Current Url is " + currentUrl);
    
    
	}
   	
	@After
	public void tearDown() throws Exception {
    Thread.sleep(3000);
	driver.quit();
		
	}

	
	}

//}
