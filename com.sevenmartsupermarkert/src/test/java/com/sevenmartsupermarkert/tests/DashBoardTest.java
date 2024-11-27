package com.sevenmartsupermarkert.tests;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sevenmartsupermarkert.base.Base;
import com.sevenmartsupermarkert.pages.AdminUserPage;
import com.sevenmartsupermarkert.pages.DashBoardPage;
import com.sevenmartsupermarkert.pages.LoginPage;

public class DashBoardTest extends Base {
	
	 LoginPage loginpage;
	 DashBoardPage dashboardpage;
	 AdminUserPage adminuserpage;
	 
	 


@Test(groups="smoke")
public void dashBoards()
{
	
	 loginpage = new LoginPage(driver);
	 dashboardpage =loginpage.login();
	 List<String> actualDashBoardNames =dashboardpage.allDashBoardNames();
	 System.out.println(actualDashBoardNames);
	 List<String> expectedDasnBoardNames= actualDashBoardNames;
	 Assert.assertEquals(actualDashBoardNames,expectedDasnBoardNames );
	 
}

@Test(groups="sanity")
public void textOfDashboardFooter()
{
	
	 loginpage = new LoginPage(driver);
	 dashboardpage = new  DashBoardPage(driver);
	 loginpage.login();
	 String actualText = dashboardpage.textOfFooter();
	 String expectedText =actualText;
	Assert.assertEquals(actualText,expectedText );
	 adminuserpage=dashboardpage.clickAdminUsers();
	 
	
	
}


}

