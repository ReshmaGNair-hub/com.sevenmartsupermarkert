package com.sevenmartsupermarkert.tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sevenmartsupermarkert.base.Base;
import com.sevenmartsupermarkert.pages.DashBoardPage;
import com.sevenmartsupermarkert.pages.LoginPage;
import com.sevenmartsupermarkert.utilities.ExcelReader;
import com.sevenmartsupermarkert.utilities.GeneralUtility;

public class LoginTest extends Base{
	 LoginPage loginpage;
	 DashBoardPage dashboardpage;
	 ExcelReader excelreader= new  ExcelReader();
	
	 
	 @Test(groups="regression")
	 public void verifyAdminUserLogin()
	 
	 {
		 loginpage = new LoginPage(driver);
		 dashboardpage=loginpage.login("h","admin");
		 excelreader.setExcelFile("Login","login");
		 String readUserName=excelreader.getCellData(1, 0);
		 String readPassword= excelreader.getCellData(1, 1);
		 System.out.println(readUserName);
		 System.out.println(readPassword);
		 
		
		 
		 String actualProfileName =dashboardpage.getProfileName();
		 System.out.println(actualProfileName);
		String expectedProfileName="Admin";
		 Assert.assertEquals(actualProfileName, expectedProfileName);
		 System.out.println(GeneralUtility.getRandomAddress());
		 System.out.println(GeneralUtility.getRandomName());
		 System.out.println("hii");
		 
		
		 
		 
		 
		 
		 
	 }
	 
	
	 
	 
	

}
