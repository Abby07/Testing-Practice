package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {




		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","/Users/Abiola/workspace/geckodriver");
		driver = new FirefoxDriver();
		String baseURL = "https://www.gmail.com";
		driver.get(baseURL);
		Thread.sleep(3000);
		driver.findElement(By.id("Email")).sendKeys("olasupoabiola");
		driver.findElement(By.id("next")).click();
		driver.quit();


	}

}
