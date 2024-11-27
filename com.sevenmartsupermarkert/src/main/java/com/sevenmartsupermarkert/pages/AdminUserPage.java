package com.sevenmartsupermarkert.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenmartsupermarkert.utilities.PageUtility;

public class AdminUserPage {
	WebDriver driver;
	PageUtility pageutility ;
	@FindBy(xpath="//a[@href='javascript:void(0)']")
	 private WebElement newButtonField;
	@FindBy(xpath="//input[@id='username']")
	WebElement inputUserNameField;
	@FindBy(xpath="//input[@id='password']")
	WebElement inputPasswordField;
	@FindBy(xpath="//select[@id='user_type']")
	WebElement userSelectField ;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement saveButtonField;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement alertText;
	
	
	public AdminUserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		pageutility = new PageUtility (driver);
		
	}
	
	public void clickOnNewButton()
	{
		newButtonField.click();
	}
	
	public AdminUserPage enterUserName(String userName)
	{
		inputUserNameField.sendKeys(userName);
		return this;
	}
	
	public  AdminUserPage enterPassword(String password)
	{
		inputPasswordField.sendKeys(password);
		return this;
		
	}
	 public void selectFromDropdown()
	 {
		 userSelectField.click();
		 
		pageutility.selectDropdownByIndex(userSelectField, 1);
	 }
	 
	 public void clickOnSaveButton()
	 {
		
		 saveButtonField.click(); 
		 
	 }
	 
	 public String getAlertText()
	 {
		  return alertText.getText() ;
	 }
	 }
	 

