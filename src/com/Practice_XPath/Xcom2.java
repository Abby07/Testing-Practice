package com.Practice_XPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xcom2 {

	//div[@id='basiclayout']//div[4]/a/span
	public static void main(String[]args) throws InterruptedException{
		
		WebDriver driver;
		
		
		System.setProperty("webdriver.gecko.driver","/Users/Abiola/workspace/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
				
		/*String baseUrl;
		baseUrl = "https://booking.com";
		driver.get(baseUrl);*/
		driver.get( "https://www.booking.com/");
		//driver.findElement(By.xpath("//*[@id='b_tt_holder_2']//div/span")).click();
		
		driver.findElement(By.xpath("div[@id='home_featured_destinations']/div[2]//a")).click();
		//div[@id='home_featured_destinations']/div[2]//a
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
	}
}
