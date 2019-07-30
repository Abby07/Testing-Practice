package com.Practice_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	
	public static WebElement element = null;

	//navigate to flight tab
	/*public static void navigatetoflightab(WebDriver driver) {
		driver.findElement(By.id("tab-flight-tab-hp"));
		element.click();*/
	//}
	public static WebElement flightTab(WebDriver driver){
		 element = driver.findElement(By.id("tab-flight-tab-hp"));
		 return element;
		 }
	public static void clickFlightTab(WebDriver driver) {
		 flightTab(driver).click();}

	//return flight origin text box element
	public static WebElement originTextBox (WebDriver driver) {
		element= driver.findElement(By.id("flight-origin-hp-flight"));
		return element;
	}
	public static void fillingOriginTextBox(WebDriver driver, String origin ){
		element = originTextBox(driver);
		element.sendKeys(origin);
	}
	
		
	//return destination text box element
	public static WebElement destinationTextBox (WebDriver driver) {
			element= driver.findElement(By.id("flight-destination-hp-flight"));
			return element;
	}
		
		//inserting Departure date
	public static WebElement departuredateTextBox (WebDriver driver) {
	element= driver.findElement(By.id("flight-departing-hp-flight"));
	return element;
		}
		
		//inserting arrival date
	public static WebElement arrivaldateTextBox (WebDriver driver) {
	element= driver.findElement(By.id("flight-returning-hp-flight"));
	return element;
				}
		
		/*//Return the search button element
	public static WebElement searchButton (WebDriver driver) {
	element= driver.findElement(By.xpath("//*[@id='gcw-flights-form-hp-flight']//div/label/ght-returning-hp-flight"));
	return element;
				}*/
	
	public static WebElement searchButton(WebDriver driver){
		 element = driver.findElement(By.id("search-button-hp-package"));
		 return element;
		 }
	
	//click on search button
	public static void clickOnSearchButton(WebDriver driver) {
		element = searchButton(driver);
		element.click();
		
		
	}
}

