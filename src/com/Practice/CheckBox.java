package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","/Users/Abiola/workspace/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/create_account.php?osCsid=v66s1vmt7i4evki3f7pem6mr30");
		WebElement checkBox = driver.findElement(By.name("newsletter"));
		
boolean displayStatus = checkBox.isDisplayed();
System.out.println(displayStatus);

boolean enableStatus = checkBox.isEnabled();
System.out.println(enableStatus);

boolean selectedStatus = checkBox.isSelected();
System.out.println(selectedStatus);

Thread.sleep(2000);
checkBox.click();

boolean selectedStatus1 = checkBox.isSelected();
System.out.println(selectedStatus1);




	}

}
