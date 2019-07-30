package com.Practice_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QA_xpath {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		String baseUrl;
		System.setProperty("webdriver.gecko.driver","/Users/Abiola/workspace/geckodriver");
		driver= new FirefoxDriver();
		baseUrl="http://www.qaclickacademy.com/index.php";
		driver.get(baseUrl);
		
		
		driver.findElement(By.xpath("//body//ul/li[3]/a/span")).click();
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
