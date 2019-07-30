package com.Practice_XPath;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver","/Users/Abiola/workspace/geckodriver");
		driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		driver.findElement(By.xpath("//input[@value='Milk']")).click();
		driver.findElement(By.xpath("//input[@value='Water']")).click();
		
		System.out.println("The Radio button size of group1 is " + driver.findElements(By.xpath("//input[@name='group1']")).size());
		
		System.out.println("The Radio button size of group2 is " + driver.findElements(By.xpath("//input[@name='group2']")).size());
		
		
		
		//Thread.sleep(4000);
		driver.quit();
		

	}

}
