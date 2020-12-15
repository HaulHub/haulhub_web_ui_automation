package net.haulhub.showcase.cucumber.pages;

import java.util.concurrent.TimeUnit;

//import static org.junit.Assert.assertTrue;

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
public class HomeAdminDashboardPage extends PageObject {
	
	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	public HomeAdminDashboardPage(WebDriver driver) {
		super(driver);
	}

	MouseUtils mouseUtils = new MouseUtils(getDriver());
	public ElementUtils elementUtils = new ElementUtils(getDriver());
	public PaginationUtils paginationUtils = new PaginationUtils(getDriver());
	public ProjectUtils projectUtils = new ProjectUtils();

	@FindBy(how = How.XPATH, using = "//a[.=' Customers']")
	public WebElementFacade customerlnk;
	
	@FindBy(how = How.XPATH, using = "//input[@name='filter']")
	public WebElementFacade cutomersearchtxt;
	
	//Old method
	/*@FindBy(how = How.XPATH, using = "//td[contains(text(),'Georgia Department Of Transportation')]")
	public WebElementFacade departmentname;*/
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'vigneshDOT')]")
	public WebElementFacade departmentname;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'DOT Employees')]")
	public WebElementFacade DOTEmployeelnk;
	
	@FindBy(how = How.XPATH, using = "//td[.='Active']")
	public WebElementFacade activestatus;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Associates')]")
	public WebElementFacade associatedlnk;

	@FindBy(how = How.XPATH, using = "//td[.='Vignesh Nehru']")
	public WebElementFacade associatename;
	
	@FindBy(how = How.XPATH, using = "//td[.='Vignesh Nehru']")
	public WebElementFacade fleetnamenametxt;

	@FindBy(how = How.XPATH, using = "//a[contains(@href, '/customer/login/token')]")
	public WebElementFacade associatetokenlnk;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Brokers')]")
	public WebElementFacade brokerlnk;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'DOT')]")
	public WebElementFacade DOTlnk;
	
	//Old path
	//@FindBy(how = How.XPATH, using = "//a[contains(text(),'fG7oVfXrUFhjtoAroMHj2htD')]")
	//public WebElementFacade DOTlogintokenlnk;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@href, '/dot_slips/login/token?')]")
	public WebElementFacade DOTlogintokenlnk;

	
	@FindBy(how = How.XPATH, using = "//ul[@class='nav nav-pills nav-stacked']//a[contains(text(),'Drivers')]")
	public WebElementFacade driverslnk;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'brokerdriver1 brokerdriver1')]")
	public WebElementFacade firstbrokernametxt;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'brokerdriver2 brokerdriver2')]")
	public WebElementFacade secondbrokernametxt;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Login as this user')]")
	public WebElementFacade firstbrokerlogintoken;
	
	@FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle'][contains(text(),'Fleets')]")
	public WebElementFacade fleetslnk;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'All Fleets')]")
	public WebElementFacade fleetssublink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign in as')]")
	public WebElementFacade loginpersonalizationlnk;


	
	/**
     * This method is used to search for firstcustomername
     */
	public boolean searchcustomer(String firstcustomername) {
	try {
		    elementUtils.fluentWaitForElement(getDriver(), customerlnk).waitUntilClickable();
			elementUtils.safeJavaScriptClick(customerlnk);
			Thread.sleep(500);
			elementUtils.fluentWaitForElement(getDriver(), cutomersearchtxt).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), cutomersearchtxt).typeAndEnter(firstcustomername);
			Thread.sleep(500);
			elementUtils.fluentWaitForElement(getDriver(), activestatus).waitUntilVisible();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(), activestatus).click();
			Thread.sleep(1000);
			elementUtils.fluentWaitForElement(getDriver(), associatedlnk).waitUntilVisible();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(), associatedlnk).click();
			Thread.sleep(500);
			elementUtils.fluentWaitForElement(getDriver(), associatename).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), associatename).click();
			Thread.sleep(500);
			elementUtils.fluentWaitForElement(getDriver(), loginpersonalizationlnk).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), loginpersonalizationlnk).click();
			Thread.sleep(500);
		    return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/**
     * This method is used to search for firstbrokername
     */
	public boolean searchfirstbrokername(String firstbrokername) {
	try {
		    elementUtils.fluentWaitForElement(getDriver(), brokerlnk).waitUntilClickable();
			elementUtils.safeJavaScriptClick(brokerlnk);
			Thread.sleep(500);
			elementUtils.fluentWaitForElement(getDriver(), cutomersearchtxt).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), cutomersearchtxt).typeAndEnter(firstbrokername.trim());
			getDriver().manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			Thread.sleep(500);
			elementUtils.fluentWaitForElement(getDriver(), activestatus).waitUntilPresent();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(), activestatus).click();
			Thread.sleep(1000);
			elementUtils.fluentWaitForElement(getDriver(), driverslnk).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), driverslnk).click();
			Thread.sleep(500);
			elementUtils.fluentWaitForElement(getDriver(), firstbrokernametxt).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), firstbrokernametxt).click();
			Thread.sleep(500);
			elementUtils.fluentWaitForElement(getDriver(), firstbrokerlogintoken).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), firstbrokerlogintoken).click();
			Thread.sleep(500);
		    return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/**
     * This method is used to search for search dotemployeename (Old method params)
     *//*
	public boolean searchdotemployeename(String DOTEmployee) {
	try {
		    elementUtils.fluentWaitForElement(getDriver(), DOTlnk).waitUntilClickable();
			elementUtils.safeJavaScriptClick(DOTlnk);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(), departmentname).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), departmentname).click();
			getDriver().manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(), DOTEmployeelnk).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), DOTEmployeelnk).click();
			getDriver().manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			WebElement DOTEmployeename  = getDriver().findElement(By.xpath("//td[text()='"+ DOTEmployee.trim() +"']"));
			Actions actionbtn = new Actions(getDriver());
			actionbtn .moveToElement(DOTEmployeename).click().build().perform();
			getDriver().manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(), DOTlogintokenlnk).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), DOTlogintokenlnk).click();
			getDriver().manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		    Thread.sleep(500);
		    return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}*/
	
	
	/**
     * This method is used to search for search dotemployeename (New method params)
     */
	public boolean searchdotemployeename(String DOTEmployee) {
	try {
		    elementUtils.fluentWaitForElement(getDriver(), DOTlnk).waitUntilClickable();
			elementUtils.safeJavaScriptClick(DOTlnk);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 elementUtils.fluentWaitForElement(getDriver(), cutomersearchtxt).waitUntilVisible();
		    elementUtils.fluentWaitForElement(getDriver(), cutomersearchtxt).typeAndEnter(DOTEmployee.trim());
			elementUtils.fluentWaitForElement(getDriver(), departmentname).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), departmentname).click();
			getDriver().manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(), DOTEmployeelnk).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), DOTEmployeelnk).click();
			getDriver().manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			WebElement DOTEmployeename  = getDriver().findElement(By.xpath("//td[text()='"+ DOTEmployee.trim() +"']"));
			Actions actionbtn = new Actions(getDriver());
			actionbtn .moveToElement(DOTEmployeename).click().build().perform();
			getDriver().manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(), loginpersonalizationlnk).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), loginpersonalizationlnk).click();
			getDriver().manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		    Thread.sleep(500);
		    return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	
	/**
     * This method is used to search for search fleetname
     */
	public boolean searchfleetname(String fleetname) {
	try {
		    elementUtils.fluentWaitForElement(getDriver(), fleetslnk).waitUntilClickable();
			elementUtils.safeJavaScriptClick(fleetslnk);
			Thread.sleep(1000);
			elementUtils.fluentWaitForElement(getDriver(), fleetssublink).waitUntilClickable();
			elementUtils.safeJavaScriptClick(fleetssublink);
			Thread.sleep(800);
            elementUtils.fluentWaitForElement(getDriver(), cutomersearchtxt).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), cutomersearchtxt).typeAndEnter(fleetname.trim());
			Thread.sleep(500);
			elementUtils.fluentWaitForElement(getDriver(), activestatus).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), activestatus).click();
			Thread.sleep(1000);
			elementUtils.fluentWaitForElement(getDriver(), driverslnk).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), driverslnk).click();
			Thread.sleep(500);
			elementUtils.fluentWaitForElement(getDriver(), fleetnamenametxt).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), fleetnamenametxt).click();
			Thread.sleep(500);
			elementUtils.fluentWaitForElement(getDriver(), firstbrokerlogintoken).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), firstbrokerlogintoken).click();
			Thread.sleep(500);
		    return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/**
     * This method is used to search for secondrokername
     */
	public boolean searchsecondbrokername(String secondbrokername) {
	try {
		    elementUtils.fluentWaitForElement(getDriver(), brokerlnk).waitUntilClickable();
			elementUtils.safeJavaScriptClick(brokerlnk);
			Thread.sleep(500);
			elementUtils.fluentWaitForElement(getDriver(), cutomersearchtxt).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), cutomersearchtxt).typeAndEnter(secondbrokername.trim());
			getDriver().manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			Thread.sleep(500);
			elementUtils.fluentWaitForElement(getDriver(), activestatus).waitUntilClickable();
			elementUtils.safeJavaScriptClick(activestatus);
			Thread.sleep(600);
			elementUtils.fluentWaitForElement(getDriver(), driverslnk).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), driverslnk).click();
			Thread.sleep(500);
			elementUtils.fluentWaitForElement(getDriver(), secondbrokernametxt).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), secondbrokernametxt).click();
			Thread.sleep(500);
			elementUtils.fluentWaitForElement(getDriver(), firstbrokerlogintoken).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), firstbrokerlogintoken).click();
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