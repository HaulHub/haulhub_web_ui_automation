package net.haulhub.showcase.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.thoughtworks.selenium.webdriven.commands.GetText;
import net.haulhub.showcase.cucumber.utils.ElementUtils;
import net.haulhub.showcase.cucumber.utils.LearningPlatformConstants;
import net.haulhub.showcase.cucumber.utils.MouseUtils;
import net.haulhub.showcase.cucumber.utils.PaginationUtils;
import net.haulhub.showcase.cucumber.utils.ProjectUtils;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.exceptions.ElementNotFoundAfterTimeoutError;

@SuppressWarnings("unused")
public class JobboardPage extends PageObject {
	
	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	public JobboardPage(WebDriver driver) {
		super(driver);
	}

	MouseUtils mouseUtils = new MouseUtils(getDriver());
	public ElementUtils elementUtils = new ElementUtils(getDriver());
	public PaginationUtils paginationUtils = new PaginationUtils(getDriver());
	public ProjectUtils projectUtils = new ProjectUtils();

	@FindBy(how = How.XPATH, using = "//span[.='Order Dashboard']")
	public WebElementFacade orderLnk;
	
	@FindBy(how = How.XPATH, using = "//a[.='Per Ton Trip Cost']")
	public WebElementFacade TripCostModal;
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-times-circle']")
	public WebElementFacade CloseTripCostModal;
	
	/**
     * This method is used to click Tripcost modal link and validate it opens correctly
     */
	public boolean ClickTripcostmodalvalidate(String Jobid) {
	try {

		       Thread.sleep(1000);
			   WebElement tripcosticon = getDriver().findElement(By.xpath("//a[.='" + Jobid.trim() +"']//following::span//i[@class='fa fa-dollar fa-stack-1x fa-inverse']"));
			   elementUtils.fluentWaitForElement(getDriver(), tripcosticon).isDisplayed();
			   Thread.sleep(500);
			   elementUtils.fluentWaitForElement(getDriver(), tripcosticon).click();
			   Thread.sleep(500);
			   elementUtils.fluentWaitForElement(getDriver(), TripCostModal).isDisplayed();
			   Thread.sleep(500);
			   elementUtils.fluentWaitForElement(getDriver(), CloseTripCostModal).isDisplayed();
			   Thread.sleep(500);	   
			return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
 
}