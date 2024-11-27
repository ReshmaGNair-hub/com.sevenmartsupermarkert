package com.sevenmartsupermarkert.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	WebDriver driver;
	Actions actions;
	JavascriptExecutor js;

	public PageUtility(WebDriver driver) {
		this.driver = driver;
		actions = new Actions(driver);
		js = (JavascriptExecutor) driver;

	}

	public void selectDropdownByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	public void selectDropdownByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);

	}
	
	public void parctiseAction1(WebElement element)
	{
		actions.moveToElement(element).build().perform();
		actions.click();
		
	}
	public void practiseJs(WebElement element)
	{
		js.executeScript("argument[0].click();",element );
	}
	
	public void practisejs2(WebElement element)
	{
		js.executeScript("argument[0].scrollIntoview()",element);
	}

	public void scrollIntoElement(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public void mouseDoubleClick(WebElement element) {
		actions.doubleClick(element).build().perform();

	}

	public void jsClick(WebElement element) {
		js.executeScript("arguments[0].click();", element);
	}
	
	
	


	public boolean isClicked(WebElement element) {
		try {
			element.click();
			return true;
		} catch (Exception e) {
			return false;

		}

	}

	public void scrollAndClick(WebElement element) {
		int index = 0;
		while (!isClicked(element)) {
			js.executeScript("window.scrollBy(0," + index + ")");
			index = index + 2;

		}
		
		
		
		
	}
}
