package com.sevenmartsupermarkert.pages;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenmartsupermarkert.constants.Constants;
import com.sevenmartsupermarkert.utilities.WaitUtility;



public class LoginPage {
	WebDriver driver;
	Properties properties = new Properties();
	WaitUtility waitutilitty;
	
	@FindBy(xpath="//input[@placeholder='Username']")
	 private WebElement userNameField;
	@FindBy(xpath="//input[@type='password']")
	 private WebElement passwordField;
	@FindBy(xpath="//button[text()='Sign In']")
	 private WebElement signInField;
	
	
	
	public  LoginPage(WebDriver driver)
	{
		this.driver=driver;
		waitutilitty= new WaitUtility(driver);
		PageFactory.initElements(driver,this);
		try {
			FileInputStream ip = new FileInputStream(Constants.CONFIG_FILE_PATH);
			properties.load(ip);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
	
	public void enterUserName(String userName)
	{
		userNameField.sendKeys(userName);
	}
	
	public void enterPassword(String password)
	{
		passwordField.sendKeys( password);
	}
	
	
	
	
	public void clickOnSigin()
	{
		
		waitutilitty.WaitElementForClickable(signInField, 5);
		signInField.click();
	}
	
	public DashBoardPage login(String userName , String password)
	{
		enterUserName(userName);
		enterPassword(password);
		clickOnSigin();
		 return new DashBoardPage(driver);
		
	}
	public  DashBoardPage login()
	{
		String userName=properties.getProperty("username");
		String password =properties.getProperty("password");
		enterUserName(userName);
		enterPassword(password);
		clickOnSigin();
		return new DashBoardPage(driver);
		
	}
	

}
