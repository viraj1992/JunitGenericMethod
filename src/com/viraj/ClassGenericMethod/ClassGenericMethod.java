package com.viraj.ClassGenericMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassGenericMethod {
	
	private WebDriver driver;
	
	public ClassGenericMethod(WebDriver driver){
		this.driver = driver;
		}
	
	public WebElement getElement(String locator, String type){
		type = type.toLowerCase();
		if(type.equals("id")){
			System.out.println("driver found with id: " + locator);
			return driver.findElement(By.id(locator));
			
		} else if(type.equals("xpath")){
			System.out.println("driver found with xpath: " + locator);
			return driver.findElement(By.xpath(locator));
		} else
			 return null;		
	}

}
