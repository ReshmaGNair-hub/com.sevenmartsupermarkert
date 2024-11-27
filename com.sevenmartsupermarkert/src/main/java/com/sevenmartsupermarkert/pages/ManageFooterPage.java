package com.sevenmartsupermarkert.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenmartsupermarkert.utilities.GeneralUtility;

public class ManageFooterPage {
	WebDriver driver;
	GeneralUtility  generalutility = new GeneralUtility();
	@FindBy(xpath="//table//tr//th")
List<WebElement> tableHeading;
	
	public ManageFooterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public List<String> tableHeading()
	{
		List<String> allHeadings =generalutility.getTextOfElements(tableHeading);
		System.out.println( allHeadings);
		return allHeadings;
		
	}
	
	

}
