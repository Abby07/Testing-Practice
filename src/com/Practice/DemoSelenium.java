package com.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSelenium {
	public static void main(String[]args){
		first();
	}
	
public static void first(){
	
	System.setProperty("webdriver.chrome.driver","/Users/Abiola/workspace/chromedriver");
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://google.co.uk");
	String title=driver.getTitle();
	System.out.println("The page title is " +title);

	
}
}
