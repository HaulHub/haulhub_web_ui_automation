package net.haulhub.showcase.cucumber.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import net.haulhub.showcase.cucumber.utils.ElementUtils;
import net.haulhub.showcase.cucumber.utils.LearningPlatformConstants;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DelDotLoginPage extends PageObject {

	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	public DelDotLoginPage(WebDriver driver) {
		super(driver);
	}

	public ElementUtils elementUtils = new ElementUtils(getDriver());
	
	@FindBy(how = How.XPATH, using = "//input[@type='tel']")
	public WebElementFacade txtUsername;
	
	@FindBy(how = How.XPATH, using = "//input[@type='password']")
	public WebElementFacade txtPassword;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	public WebElementFacade btnSubmit;	
	
	/***
	 * This method is used to login into JobSlip applications as customer
	 * 
	 * @param userName
	 * @param passWord
	 * @return DelDotDashboardPage PAGEOBJECT
	 * @throws InterruptedException
	 */
	public DelDotDashboardPage deldot_administrator_login(String userName, String passWord) {
		try {
			elementUtils.fluentWaitForElement(getDriver(), txtUsername).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), txtUsername).sendKeys(userName);
			elementUtils.fluentWaitForElement(getDriver(), txtPassword).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), txtPassword).sendKeys(passWord);
			elementUtils.fluentWaitForElement(getDriver(), btnSubmit).waitUntilVisible();
			Actions action = new Actions(getDriver());
			action.moveToElement(btnSubmit).click().perform();
			String envURL = getDriver().getCurrentUrl();
			LearningPlatformConstants.environmentURL.set(envURL);
			DelDotDashboardPage dashboardspage = this.switchToPage(DelDotDashboardPage.class);
			return dashboardspage;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null  ;
	}
}
