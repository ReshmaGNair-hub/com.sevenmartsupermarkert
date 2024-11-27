package com.sevenmartsupermarkert.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sevenmartsupermarkert.utilities.GeneralUtility;
import com.sevenmartsupermarkert.utilities.WaitUtility;

public class DashBoardPage {
	WebDriver driver;
	WaitUtility waitutility;
	GeneralUtility generalutility = new GeneralUtility();
	@FindBy(xpath = "//a[@class='d-block']")
	private WebElement profileName;
	@FindBy(xpath = "//div[@class='small-box bg-info']//p")
	private List<WebElement> dashBoardNames;
	@FindBy(xpath = "//footer[@class='main-footer text-sm']")
	private WebElement footerText;
	@FindBy(xpath = "//div[@class='small-box bg-info']//a[@href=\"https://groceryapp.uniqassosiates.com/admin/list-admin\"]")
	private WebElement adminUsers;
	@FindBy(xpath = "//div[@class='small-box bg-info']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category']")
	private WebElement subCategory;

	@FindBy(xpath = "//ul[@class='nav nav-pills nav-sidebar flex-column']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext']")
	WebElement ManageFooterText;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		waitutility = new WaitUtility(driver);
	}

	public String getProfileName() {
		return profileName.getText();
	}

	public List<String> allDashBoardNames() {
		List<String> allNamesOfDashBoard = generalutility.getTextOfElements(dashBoardNames);
		return allNamesOfDashBoard;
	}

	public String textOfFooter() {
		return footerText.getText();
	}

	public AdminUserPage clickAdminUsers() {

		waitutility.WaitElementtoVisible(adminUsers, 10);
		adminUsers.click();
		return new AdminUserPage(driver);
	}

	public void clickSubCategory() {
		subCategory.click();
	}

	public void clickOnManageFooter() {
		ManageFooterText.click();
	}

}
