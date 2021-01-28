package net.haulhub.showcase.cucumber.pages;

import java.util.concurrent.TimeUnit;

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

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Asphalt Trip Cost: Per Ton')]")
	public WebElementFacade tripcostmodallbl;
	
	/*@FindBy(how = How.XPATH, using = "//i[@class='fa fa-dollar fa-stack-1x fa-inverse']")
	public WebElementFacade TripCostModal;*/
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'10 Wheel')]//following::span[1]")
	public WebElementFacade TripCostModal;
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-times-circle']")
	public WebElementFacade CloseTripCostModal;
	
	@FindBy(how = How.XPATH, using = "//div[@class='search-input-wrap']//input")
	public WebElementFacade Searchinputtxt;

	
	/**
     * This method is used to click Trip cost modal link and validate it opens correctly
     */
	public boolean ClickTripcostmodalvalidate() {
	try {
               getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
               Actions action = new Actions(getDriver());
	           action.moveToElement(this.Searchinputtxt).click().build().perform();
	           getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	           elementUtils.fluentWaitForElement(getDriver(),Searchinputtxt).typeAndEnter("VigneshTripCostPlant");
	           getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
               elementUtils.fluentWaitForElement(getDriver(),  TripCostModal).isDisplayed();
			   elementUtils.fluentWaitForElement(getDriver(),  TripCostModal).click();
			   getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
               elementUtils.fluentWaitForElement(getDriver(),  tripcostmodallbl).isDisplayed();
			   getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
			 return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
 
}