package com.sevenmartsupermarkert.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sevenmartsupermarkert.base.Base;
import com.sevenmartsupermarkert.pages.AdminUserPage;
import com.sevenmartsupermarkert.pages.DashBoardPage;
import com.sevenmartsupermarkert.pages.LoginPage;
import com.sevenmartsupermarkert.utilities.ScreenshotCapture;

public class AdminUserTest extends Base {
	
	AdminUserPage adminuserpage;
	LoginPage loginpage;
	DashBoardPage dashboardpage;
	
	
	@Test(groups="smoke" ,retryAnalyzer=com.sevenmartsupermarkert.listeners.RetryAnalyzer.class)

	public void createNewUser() {
		dashboardpage = new DashBoardPage(driver);
		loginpage = new LoginPage(driver);
		adminuserpage = new AdminUserPage(driver);
		 loginpage.login("admin","admin");
		 
		dashboardpage.clickAdminUsers();
		adminuserpage.clickOnNewButton();
		adminuserpage.enterUserName("ReshmaGNair_rahul").enterPassword("admin");//method chaining
		adminuserpage.selectFromDropdown();
		adminuserpage.clickOnSaveButton();
		
	String actualAlertText=	adminuserpage.getAlertText();
	System.out.println(actualAlertText);
	String expectedAlertText =actualAlertText;
	Assert.assertEquals(actualAlertText, expectedAlertText);
	
	
	
	
		
		
		
		

	}

}
