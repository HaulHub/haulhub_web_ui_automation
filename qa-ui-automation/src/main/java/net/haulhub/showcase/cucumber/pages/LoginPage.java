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

public class LoginPage extends PageObject {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public ElementUtils elementUtils = new ElementUtils(getDriver());

	@FindBy(how = How.XPATH, using = "//input[@id='associate_phone']")
	public WebElementFacade userNameEditBox;

	@FindBy(how = How.XPATH, using = "//input[@id='associate_password']")
	public WebElementFacade passWordEditBox;
	
    @FindBy(how = How.XPATH, using = "//button[.='Log In']")
	public WebElementFacade loginButton;
   
    @FindBy(how = How.XPATH, using = "//input[@type='text']")
	public WebElementFacade txtUsername;
	
	@FindBy(how = How.XPATH, using = "//input[@type='password']")
	public WebElementFacade txtPassword;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	public WebElementFacade btnSubmit;


	/***
	 * This method is used to login into Haulhub applications as customer
	 * 
	 * @param userName
	 * @param passWord
	 * @return HomeDashboard PAGEOBJECT
	 * @throws InterruptedException
	 */
	public HomeDashboardPage customerLogin(String userName, String passWord) {
		try {
			elementUtils.fluentWaitForElement(getDriver(), userNameEditBox).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), userNameEditBox).sendKeys(userName);
			elementUtils.fluentWaitForElement(getDriver(), passWordEditBox).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), passWordEditBox).sendKeys(passWord);
			elementUtils.fluentWaitForElement(getDriver(), loginButton).waitUntilVisible();
			Actions action = new Actions(getDriver());
			action.moveToElement(loginButton).click().perform();
			String envURL = getDriver().getCurrentUrl();
			LearningPlatformConstants.environmentURL.set(envURL);
			HomeDashboardPage HomeDashboard = this.switchToPage(HomeDashboardPage.class);
			return HomeDashboard;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null  ;
	}
	
	
  }
	
	