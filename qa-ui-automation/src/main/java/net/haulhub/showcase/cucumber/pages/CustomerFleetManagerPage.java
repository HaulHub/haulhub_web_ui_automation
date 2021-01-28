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
public class CustomerFleetManagerPage extends PageObject {
	
	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	public CustomerFleetManagerPage(WebDriver driver) {
		super(driver);
	}

	MouseUtils mouseUtils = new MouseUtils(getDriver());
	public ElementUtils elementUtils = new ElementUtils(getDriver());
	public PaginationUtils paginationUtils = new PaginationUtils(getDriver());
	public ProjectUtils projectUtils = new ProjectUtils();
	
	@FindBy(how = How.XPATH, using = "//dt[.='Phone']//following::dd[1]")
	public WebElementFacade fleetcustomerphonenumbertxt;
	
	@FindBy(how = How.XPATH, using = "//dt[.='Primary Contact']//following::div[1]")
	public WebElementFacade fleetcustomercontactnametxt;
	
	@FindBy(how = How.XPATH, using = "//dt[.='US DOT']//following::dd[1]")
	public WebElementFacade fleetcustomerUSDOTtxt;
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-plus']")
	public WebElementFacade fleetAddInsurancebtn;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Add Insurance')]")
	public WebElementFacade fleetAddInsuranceheaderlbl;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Cancel')]")
	public WebElementFacade fleetCancelBtn;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Insurance Agents')]")
	public WebElementFacade fleetInsuranceagentsbtn;
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-plus']")
	public WebElementFacade fleetAddAgentssbtn;
	
	@FindBy(how = How.XPATH, using = "//input[@id='nameField']")
	public WebElementFacade agencynametxt;
	
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	public WebElementFacade inputphonenumbertxt;
	
	@FindBy(how = How.XPATH, using = "//input[@id='contactName']")
	public WebElementFacade contactnametxt;
	
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	public WebElementFacade insuranceemailtxt;
	
	@FindBy(how = How.XPATH, using = "//button[.='Add Agent']")
	public WebElementFacade insuranceaddagenttxt;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Contract')]")
	public WebElementFacade Contractheaderlbl;
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-plus']")
	public WebElementFacade fleetAddDocumentsbtn;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Add Contract Document')]")
	public WebElementFacade fleetAddContractDocumentlbl;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Monitoring')]")
	public WebElementFacade monitoringheaderlbl;
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-plus']")
	public WebElementFacade Addreportsbtn;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Create New Monitoring Report')]")
	public WebElementFacade createnewmonitoringreportlbl;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Documents')]")
	public WebElementFacade Documentheaderlbl;
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-plus']")
	public WebElementFacade Adddocumentsbtn;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Add Document')]")
	public WebElementFacade Adddocumentlbl;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Drivers')]")
	public WebElementFacade Drivertheaderlbl;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Drivers')]")
	public WebElementFacade Driversname;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Trucks')]")
	public WebElementFacade Trucksheaderlbl;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Trucks')]")
	public WebElementFacade Trucksname;
	


/*	*//**
     * This method is used to validate complianceFleetdetails
     *//*
	public boolean Validate_complianceFleetdetails(String customername) {
	try {
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    WebElement Fleetmanagerlnk =  getDriver().findElement(By.xpath("//div[contains(text(),'" + customername + "')]"));
		    getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),Fleetmanagerlnk).click();
		    getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		 /*   getDriver().manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		    int flag;
		    Thread.sleep(500);
			if(elementUtils.fluentWaitForElement(getDriver(),fleetcustomerphonenumbertxt).isDisplayed()
					&& elementUtils.fluentWaitForElement(getDriver(),fleetcustomercontactnametxt).isDisplayed()
					   && elementUtils.fluentWaitForElement(getDriver(),fleetcustomerUSDOTtxt).isDisplayed())
		      return true ;
		    else
		    	return false;
		    return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}*/
	
	/**
     * This method is used to validate complianceFleetdetails
     */
	public boolean Validate_complianceFleetdetails(String customername) {
	try {
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    WebElement Fleetmanagerlnk =  getDriver().findElement(By.xpath("//div[contains(text(),'" + customername + "')]"));
		    getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),Fleetmanagerlnk).click();
		    getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		    return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/**
     * This method is used to validate add insurance compliance display fields 
     */
	public boolean add_insurance_displayfields() {
	try {
		    
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    Thread.sleep(500);
		    WebElement InsuranceTab =  getDriver().findElement(By.xpath("//li[@class='tab-list__item'][1]"));
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    Thread.sleep(500);
		    elementUtils.fluentWaitForElement(getDriver(),InsuranceTab).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),fleetAddInsurancebtn).isDisplayed();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),fleetAddInsurancebtn).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),fleetAddInsuranceheaderlbl).isDisplayed();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),fleetCancelBtn).click();  
		    return true ; 
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
     * This method is used to validate add insurance agent details
     */
	public boolean add_insurance_agentbtn() {
	try {
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),fleetInsuranceagentsbtn).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),fleetAddAgentssbtn).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),agencynametxt).sendKeys("test");
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),inputphonenumbertxt).sendKeys("7655677898");
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),contactnametxt).sendKeys("kristen");
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),insuranceemailtxt).sendKeys("vignesh@haulhub.com");
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), insuranceaddagenttxt).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    Thread.sleep(1000);
		    return true ; 
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/**
     * This method is used to validate add contract btn
     */
	public boolean add_contract_btn() {
	try {
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),Contractheaderlbl).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), fleetAddDocumentsbtn).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), fleetAddContractDocumentlbl).isDisplayed();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),fleetCancelBtn).click();  
		  return true ; 
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}
	

	/**
     * This method is used to monitoringheader_newmonitorwindow
     */
	public boolean monitoringheader_newmonitorwindow() {
	try {
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),monitoringheaderlbl).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), Addreportsbtn).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), createnewmonitoringreportlbl).isDisplayed();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),fleetCancelBtn).click();  
		  return true ; 
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
}
	

	/**
     * This method is used to Documentheader launching
     */
	public boolean documentheader() {
	try {
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),Documentheaderlbl).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), Adddocumentsbtn).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), Adddocumentlbl).isDisplayed();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),fleetCancelBtn).click();  
		  return true ; 
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
}
	
	/**
     * This method is used to driver header label load launching
     */
	public boolean driverheaderlableload() {
	try {
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),Drivertheaderlbl).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), Driversname).isDisplayed();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  return true ; 
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
}
	

	/**
     * This method is used to Truck header label load launching
     */
	public boolean Trucksheaderlableload() {
	try {
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),Trucksheaderlbl).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), Trucksname).isDisplayed();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  return true ; 
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
  }

	
	
	
}