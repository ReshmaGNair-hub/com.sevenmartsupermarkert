package com.sevenmartsupermarkert.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenmartsupermarkert.utilities.GeneralUtility;

public class SubCategoryPages {
	WebDriver driver;
	GeneralUtility  generalutility = new GeneralUtility();
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
	 private WebElement newButtonField;
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']//thead//tr//th")
	 private List<WebElement> tableHeadingField;
	public SubCategoryPages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public boolean NewButtonClickable()
	{
		newButtonField.isEnabled();
		return true;	
	}
	public List<String> getAllHeadings()
	{
		List<String> allHeadings =generalutility.getTextOfElements(tableHeadingField);
		System.out.println( allHeadings);
		return allHeadings;
	
	
	
	
	

}
}
