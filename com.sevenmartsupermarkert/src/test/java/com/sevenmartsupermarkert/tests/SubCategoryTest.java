package com.sevenmartsupermarkert.tests;


import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sevenmartsupermarkert.base.Base;
import com.sevenmartsupermarkert.pages.AdminUserPage;
import com.sevenmartsupermarkert.pages.DashBoardPage;
import com.sevenmartsupermarkert.pages.LoginPage;
import com.sevenmartsupermarkert.pages.SubCategoryPages;

public class SubCategoryTest extends Base {
	SubCategoryPages subcategorypages;
	LoginPage loginpage;
	DashBoardPage dashboardpage;

	@Test(groups={"smoke","regression"})
	public void testingButtons() {
		loginpage = new LoginPage(driver);
		dashboardpage = new DashBoardPage(driver);
		subcategorypages = new SubCategoryPages(driver);
		loginpage.login("admin", "admin");
		dashboardpage.clickSubCategory();
        System.out.println(subcategorypages.NewButtonClickable());
	}
	
	@Test(groups={"smoke","regression"})
	
	public void tableHeadings()
	{
		loginpage = new LoginPage(driver);
		dashboardpage = new DashBoardPage(driver);
		subcategorypages = new SubCategoryPages(driver);
		loginpage.login("admin", "admin");
		dashboardpage.clickSubCategory();
		subcategorypages.NewButtonClickable();
		List<String>actualTableHeadings=subcategorypages.getAllHeadings();
		List<String> expectedTableHeadings=actualTableHeadings;
		Assert.assertEquals(actualTableHeadings,expectedTableHeadings);
		
		
		
		
	}

}
