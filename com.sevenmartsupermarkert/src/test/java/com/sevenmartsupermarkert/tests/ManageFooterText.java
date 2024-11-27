package com.sevenmartsupermarkert.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sevenmartsupermarkert.base.Base;
import com.sevenmartsupermarkert.pages.DashBoardPage;
import com.sevenmartsupermarkert.pages.LoginPage;
import com.sevenmartsupermarkert.pages.ManageFooterPage;

public class ManageFooterText extends Base {
	LoginPage loginpage;
	DashBoardPage dashboardpage;
	ManageFooterPage managefooterpage;
	
	@Test(groups="sanity")
	public void verifytableHeadings()
	
	{
		loginpage = new LoginPage(driver);
		dashboardpage = new DashBoardPage(driver);
		managefooterpage= new ManageFooterPage(driver);
		loginpage.login();
		dashboardpage.clickOnManageFooter();
		List<String>actualTableHeadings=managefooterpage.tableHeading();
		List<String> expectedTableHeadings=actualTableHeadings;
		Assert.assertEquals(actualTableHeadings,expectedTableHeadings);
		
		
		
	}

}
