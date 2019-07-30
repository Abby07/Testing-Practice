package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSelenium1 {

	
	public static void main(String[]args){
		
System.setProperty("webdriver.chrome.driver","/Users/Abiola/workspace/chromedriver");

WebDriver driver= new ChromeDriver();
driver.get("https://www.facebook.com/");

driver.findElement(By.id("u_0_k")).sendKeys("Abiola");

	}
}
