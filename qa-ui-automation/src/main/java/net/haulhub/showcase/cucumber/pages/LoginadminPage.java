package net.haulhub.showcase.cucumber.pages;

import net.haulhub.showcase.cucumber.utils.ElementUtils;
import net.haulhub.showcase.cucumber.utils.LearningPlatformConstants;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginadminPage extends PageObject {

	public LoginadminPage(WebDriver driver) {
		super(driver);
	}

	public ElementUtils elementUtils = new ElementUtils(getDriver());

	@FindBy(how = How.XPATH, using = "//input[@name='session[username]']")
	public WebElementFacade adminuserNameEditBox;

	@FindBy(how = How.XPATH, using = "//input[@name='session[password]']")
	public WebElementFacade adminpassWordEditBox;
	
   @FindBy(how = How.XPATH, using = "//input[@name='commit']")
	public WebElementFacade adminloginButton;


	/***
	 * This method is used to login into Haulhub applications as admin username
	 * 
	 * @param userName
	 * @param passWord
	 * @return HomeDashboard PAGEOBJECT
	 * @throws InterruptedException
	 */
	public HomeAdminDashboardPage adminLogin(String userName, String passWord) {
		try {
			elementUtils.fluentWaitForElement(getDriver(), adminuserNameEditBox).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), adminuserNameEditBox).sendKeys(userName);
			elementUtils.fluentWaitForElement(getDriver(), adminpassWordEditBox).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), adminpassWordEditBox ).sendKeys(passWord);
			elementUtils.fluentWaitForElement(getDriver(), adminloginButton).waitUntilVisible();
			Actions action = new Actions(getDriver());
			action.moveToElement(adminloginButton).click().perform();
			String envURL = getDriver().getCurrentUrl();
			LearningPlatformConstants.environmentURL.set(envURL);
			HomeAdminDashboardPage HomeAdminDashboard = this.switchToPage(HomeAdminDashboardPage.class);
			return HomeAdminDashboard;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null  ;
	}
  }
	
	