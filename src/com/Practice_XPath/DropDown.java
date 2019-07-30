package com.Practice_XPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		//String baseUrl;
		
		System.setProperty("webdriver.chrome.driver","/Users/Abiola/workspace/chromedriver");
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		
		
		/*Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByIndex(3);
		
		Thread.sleep(3000);
		s.selectByValue("5");
		
		Thread.sleep(3000);
		s.selectByVisibleText("6 Adults");*/
		
		
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
