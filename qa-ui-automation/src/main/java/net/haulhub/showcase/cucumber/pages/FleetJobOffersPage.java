package net.haulhub.showcase.cucumber.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
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
import org.openqa.selenium.support.ui.Select;
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
public class FleetJobOffersPage extends PageObject {
	
	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	public FleetJobOffersPage(WebDriver driver) {
		super(driver);
	}

	MouseUtils mouseUtils = new MouseUtils(getDriver());
	public ElementUtils elementUtils = new ElementUtils(getDriver());
	public PaginationUtils paginationUtils = new PaginationUtils(getDriver());
	public ProjectUtils projectUtils = new ProjectUtils();

	@FindBy(how = How.XPATH, using = "//td[@class='customer-name']")
	public WebElementFacade fleetcustomernamelbl;
	
	@FindBy(how = How.XPATH, using = "//input[@name='commit']")
	public WebElementFacade fleetassigndriversbtn;
	
	@FindBy(how = How.XPATH, using = "//input[@name='accept']")
	public WebElementFacade fleetaccepttermsconditionsbtn;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Triaxle ($30.00/hour)')]")
	public WebElementFacade fleetviewsecondbrokerratelbl;
	
	@FindBy(how = How.XPATH, using = "//input[@id='assign-drivers-submit-btn']")
	public WebElementFacade fleetbookjobsbtn;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Welcome back')]")
	public WebElementFacade fleetcustomerwelcomebacklbl;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Documents')]")
	public WebElementFacade fleetdocumentlnk;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Certified Payroll Documents')]")
	public WebElementFacade fleetcertifiedpayrolldocumentlnk;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Drivers')]")
	public WebElementFacade fleetdriverlnk;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Trucks')]")
	public WebElementFacade fleettrucklnk;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Contracts')]")
	public WebElementFacade Contractlnk;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Agent')]")
	public WebElementFacade Addagentbtn;
	
	@FindBy(how = How.XPATH, using = "//input[@id='insurance_agent_name']")
	public WebElementFacade Insuranceagencytxt;
	
	@FindBy(how = How.XPATH, using = "//input[@id='insurance_agent_contact_name']")
	public WebElementFacade Insuranceagencycontactnametxt;
	
	@FindBy(how = How.XPATH, using = "//input[@id='insurance_agent_email']")
	public WebElementFacade Insuranceagencyemailtxt;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Save']")
	public WebElementFacade InsuranceSavebtn;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Fleet')]")
	public WebElementFacade fleetheaderlnk;


	/**
     * This method is used to click fleet shift and assign drivers and fleet views the second broker truck rates
     */
	public boolean fleet_assigndrivers() {
	try {
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), fleetcustomerwelcomebacklbl).waitUntilClickable();
		    elementUtils.fluentWaitForElement(getDriver(), fleetcustomerwelcomebacklbl).isDisplayed();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), fleetcustomernamelbl).waitUntilClickable();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.safeJavaScriptClick(fleetcustomernamelbl);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(), fleetviewsecondbrokerratelbl).isDisplayed();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(), fleetassigndriversbtn).waitUntilClickable();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.safeJavaScriptClick(fleetassigndriversbtn);
			   WebElement FleetDrivername= getDriver().findElement(By.xpath("//select[@class='form-control driver-select']"));
			   elementUtils.fluentWaitForElement(getDriver(), FleetDrivername).isEnabled();
			   elementUtils.fluentWaitForElement(getDriver(), FleetDrivername).click();
			   getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			   Select select = new Select(FleetDrivername);
               select.selectByVisibleText("Vignesh Nehru");
               WebElement FleeTruckname= getDriver().findElement(By.xpath("//select[@class='form-control truck-select']"));
			   elementUtils.fluentWaitForElement(getDriver(), FleeTruckname).isEnabled();
			   elementUtils.fluentWaitForElement(getDriver(), FleeTruckname).click();
			   getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			   Select select1 = new Select(FleeTruckname);
               select1.selectByVisibleText("VIGN 1 (Triaxle)"); 
            elementUtils.fluentWaitForElement(getDriver(), fleetaccepttermsconditionsbtn).waitUntilClickable();
   		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   			elementUtils.safeJavaScriptClick(fleetaccepttermsconditionsbtn);
   		    elementUtils.fluentWaitForElement(getDriver(), fleetbookjobsbtn).waitUntilClickable();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.safeJavaScriptClick(fleetbookjobsbtn);
   		     return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/**
     * This method is used to click and view the ceritired payroll documents
     */
	public boolean certified_payrolldocument() {
	try {
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), fleetdocumentlnk).isDisplayed();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), fleetdocumentlnk).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), fleetcertifiedpayrolldocumentlnk).isDisplayed();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/**
     * This method is used to click and view the truck drivers details
     */
	public boolean Trucks_Drivers() {
		try {
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(), fleetheaderlnk).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), fleetdriverlnk).waitUntilPresent();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), fleettrucklnk).waitUntilPresent();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
     * This method is used to add new insurance agent Contract
     */
	public boolean Addinsurnace_agentdetails() {
	try {
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), Contractlnk).click();
		    elementUtils.fluentWaitForElement(getDriver(), Addagentbtn).waitUntilPresent();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), Addagentbtn).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), Insuranceagencytxt).sendKeys("test");
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), Insuranceagencycontactnametxt).sendKeys("test");
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), Insuranceagencyemailtxt).sendKeys("test@gmail.com");
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), InsuranceSavebtn).click();
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