package com.Practice_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xcommand {
	
	public static void main(String[]args) throws InterruptedException{
		
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver","/Users/Abiola/workspace/geckodriver");
		
		driver = new FirefoxDriver();
		String baseUrl;
		baseUrl = "https://www.booking.com/";
		driver.get(baseUrl);
		
		
		
		driver.findElement(By.id("user_name")).sendKeys("adeola");
		driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("ade@yahoo.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
