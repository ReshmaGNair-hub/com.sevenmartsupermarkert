package com.sevenmartsupermarkert.utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	WebDriver driver;
	WebDriverWait explicitwait;
	public  WaitUtility(WebDriver driver)
	{
		this.driver= driver;
		
	}
	
	public void WaitElementForClickable(WebElement element, long time )
	{
		explicitwait= new WebDriverWait(driver,Duration.ofSeconds(time));
		explicitwait.until(ExpectedConditions.elementToBeClickable(element));
	} 
	
	public void WaitElementtoVisible(WebElement element, long time)
	{
		explicitwait = new 	WebDriverWait(driver,Duration.ofSeconds(time));
		explicitwait.until(ExpectedConditions.visibilityOf(element));
		
	}
	public void WaitElementToVisibilebByXpath(String element, long time)
	{
		explicitwait = new 	WebDriverWait(driver,Duration.ofSeconds(time));
		explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
		
		
	}
	

}
