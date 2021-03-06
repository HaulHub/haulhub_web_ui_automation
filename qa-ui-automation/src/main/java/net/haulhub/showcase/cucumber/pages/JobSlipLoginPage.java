package net.haulhub.showcase.cucumber.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.haulhub.showcase.cucumber.utils.ElementUtils;
import net.haulhub.showcase.cucumber.utils.LearningPlatformConstants;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class JobSlipLoginPage extends PageObject {

	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	public JobSlipLoginPage(WebDriver driver) {
		super(driver);
	}

	public ElementUtils elementUtils = new ElementUtils(getDriver());
	
	@FindBy(how = How.XPATH, using = "//input[@type='text']")
	public WebElementFacade txtUsername;
	
	@FindBy(how = How.XPATH, using = "//input[@type='password']")
	public WebElementFacade txtPassword;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	public WebElementFacade btnSubmit;
	
	@FindBy(how = How.XPATH, using = "//label[text()='Phone Number']//following::input[@type='text'][1]")
	public WebElementFacade txtPhoneNumber;
	
	@FindBy(how = How.XPATH, using = "//label[text()='Password']//following::input[@type='password'][1]")
	public WebElementFacade txtPasswordOne;
	
	@FindBy(how = How.XPATH, using = "//label[text()='Password Confirmation']//following::input[@type='password'][1]")
	public WebElementFacade txtConfirmPassword;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Already have an account?']")
	public WebElementFacade lnkAllredyHaveAccount;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Redeem an invitation code']")
	public WebElementFacade lnkRedeemInvitationCode;
		
	
	/***
	 * This method is used to login into JobSlip applications as customer
	 * 
	 * @param userName
	 * @param passWord
	 * @return HomeDashboard PAGEOBJECT
	 * @throws InterruptedException
	 */
	public JobSlipFeedPage JobSlipUserlogin(String userName, String passWord) {
		try {
			getDriver().manage().window().maximize();
			elementUtils.fluentWaitForElement(getDriver(), txtUsername).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), txtUsername).sendKeys(userName);
			elementUtils.fluentWaitForElement(getDriver(), txtPassword).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), txtPassword).sendKeys(passWord);
			elementUtils.fluentWaitForElement(getDriver(), btnSubmit).waitUntilVisible();
			Actions action = new Actions(getDriver());
			action.moveToElement(btnSubmit).click().perform();
			String envURL = getDriver().getCurrentUrl();
			LearningPlatformConstants.environmentURL.set(envURL);
			JobSlipFeedPage Feedpage = this.switchToPage(JobSlipFeedPage.class);
			return Feedpage;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null  ;
	}
}
