package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedifPractice {
	
	public static void main(String []args) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver","/Users/Abiola/workspace/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.rediff.com/");
		
		//driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		//driver.findElement(By.className("n_tabnormal")).click();
		//driver.findElement(By.id("srchword")).sendKeys("movies");
		
		
		
		driver.findElement(By.className("newsrchbtn")).click();
		
		//driver.findElement(By.className("mw001-widget-getquote-btn")).click();
		Thread.sleep(3000);
		
		driver.quit();
		
		//driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		//driver.findElement(By.className("n_tabnormal")).click();
		//driver.findElement(By.id("srchword")).sendKeys("movies");//driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		//driver.findElement(By.className("n_tabnormal")).click();
		//driver.findElement(By.id("srchword")).sendKeys("movies");//driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		//driver.findElement(By.className("n_tabnormal")).click();
		//driver.findElement(By.id("srchword")).sendKeys("movies");
		
		
		
	}
	

}
