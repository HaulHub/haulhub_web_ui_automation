package net.haulhub.showcase.cucumber.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import net.haulhub.showcase.cucumber.utils.ElementUtils;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DelDotProjectsPage extends PageObject {

	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	public DelDotProjectsPage(WebDriver driver) {
		super(driver);
	}

	public ElementUtils elementUtils = new ElementUtils(getDriver());

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Assigned Projects')]")
	public WebElementFacade btnAssignProj; 

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Assigned Projects')]")
	public WebElementFacade txtAssignProjects; 

	@FindBy(how = How.XPATH, using = "//input[@type='text']")
	public WebElementFacade inpAssignProjSearch; 

	@FindBy(how = How.XPATH, using = "//input[@type='text']//following::input[@type='checkbox']//parent::span")
	public WebElementFacade chkAssignProj; 

	@FindBy(how = How.XPATH, using = "//input[@type='text']//following::*[text()='Chris Woodside']")
	public WebElementFacade txtStaffName; 

	@FindBy(how = How.XPATH, using = "//input[@type='text']//following::*[text()='Area Manager']")
	public WebElementFacade txtStaffRole; 

	@FindBy(how = How.XPATH, using = "//input[@type='text']//following::*[text()='+12318388573']")
	public WebElementFacade txtStaffPhone; 

	@FindBy(how = How.XPATH, using = "//button[@aria-label='close']")
	public WebElementFacade btnStaffClose; 

	@FindBy(how = How.XPATH, using = "//*[text()='DelDOT TESTING PROJECT LIVE TICKETS']//following::span[4]")
	public WebElementFacade btnStaff;

	@FindBy(how = How.XPATH, using = "//span[text()='Save']")
	public WebElementFacade btnSaveProj; 

	@FindBy(how = How.XPATH, using = "//h3[text()='DelDOT TESTING PROJECT LIVE TICKETS']")
	public WebElementFacade txtProjHeading; 

	@FindBy(how = How.XPATH, using = "//span[text()='Save']//preceding::input[@type='checkbox'][1]//parent::span")
	public WebElementFacade chkAssignedProj; 

	@FindBy(how = How.XPATH, using = "//span[text()='Show Inactive']")
	public WebElementFacade chkShowArchived; 

	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']//following::span[text()='Under Construction']")
	public WebElementFacade btnUnderConstruction; 

	@FindBy(how = How.XPATH, using = "//li/div/div/span[text()='Inactive']")
	public WebElementFacade optArchived;
	
	@FindBy(how = How.XPATH, using = "//li/div/div/span[text()='Completed']")
	public WebElementFacade optCompleted;

	@FindBy(how = How.XPATH, using = "//li/div/div/span[text()='Under Construction']")
	public WebElementFacade optUnderConstruction;

	@FindBy(how = How.XPATH, using = "//*[text()='Update']")
	public WebElementFacade btnpdate;

	@FindBy(how = How.XPATH, using = "//*[@id='selectStatus']")
	public WebElementFacade txtselectStatus;

	@FindBy(how = How.XPATH, using = "//*[text()='DelDOT TESTING PROJECT LIVE TICKETS']//following::span[text()='Under Construction']")
	public WebElementFacade btnArchived;
	
	@FindBy(how = How.XPATH, using = "//*[text()='DelDOT TESTING PROJECT LIVE TICKETS']//following::span[text()='Completed']")
	public WebElementFacade btnCompleted;
	
	@FindBy(how = How.XPATH, using = "//*[text()='DelDOT TESTING PROJECT LIVE TICKETS']//following::span[contains(text(),'Inactive')]")
	public WebElementFacade btnInactive;
	
	@FindBy(how = How.XPATH, using = "//*[text()='51735597'][1]")
	public WebElementFacade txtContractID;
	
	@FindBy(how = How.XPATH, using = "//*[text()='51735597'][2]")
	public WebElementFacade txtProjectID;
	
	@FindBy(how = How.XPATH, using = "//*[text()='3/8/2021']")
	public WebElementFacade txtProjectStarts;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Project ID']//following::*[text()='HaulHub DOTslip'][1]")
	public WebElementFacade txtVendor;
	
	@FindBy(how = How.XPATH, using = "//*[text()='2032']")
	public WebElementFacade txtTotalTickets;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Total Tickets']//following::*[text()='0.00 Tons'][1]")
	public WebElementFacade txtPentxtDelivered;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Total Tickets']//following::*[text()='47,057.96 Tons'][1]")
	public WebElementFacade txtPending;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Total Tickets']//following::*[text()='0.00 Tons'][2]")
	public WebElementFacade txtRejected;
	
	@FindBy(how = How.XPATH, using = "//*[text()='DelDOT TESTING PROJECT LIVE TICKETS']//following::span[text()='View Project'][1]")
	public WebElementFacade btnViewProject;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Back']")
	public WebElementFacade btnBack;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Ticket']")
	public WebElementFacade btnTicket;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Date']")
	public WebElementFacade btnDate;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Contractor']")
	public WebElementFacade btnContractor;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Supplier']")
	public WebElementFacade btnSupplier;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Material']")
	public WebElementFacade btnMaterial;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Quantity']")
	public WebElementFacade btnQuantity;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Status']")
	public WebElementFacade btnStatus;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Show rows where:']//following::*[@type='checkbox'][1]//parent::span")
	public WebElementFacade chkSearchFilter;	
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Filter')]")
	public WebElementFacade btnFilter;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Clear')]")
	public WebElementFacade btnClear;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Show rows where:']//following::input[1]")
	public WebElementFacade txtFilter;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Ticket']/following::div[32]")
	public WebElementFacade lblTicket;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Ticket']/following::div[36]")
	public WebElementFacade lblContractor;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Ticket']/following::div[38]")
	public WebElementFacade lblSupplier;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Ticket']/following::div[40]")
	public WebElementFacade lblMaterial;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/logout']")
	public WebElementFacade btnLogout;
	
	@FindBy(how = How.XPATH, using = "//h1[text()='Login']")
	public WebElementFacade txtlogin;
	
	/*Logout*/

	public boolean validateLogoutFunctionality() throws InterruptedException{ 
		try {
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnLogout).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),txtlogin).isDisplayed();
				return true;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
		return false;
	}
	
	
	/*Validate assigned Projects*/

	public boolean validateAssignProjects(String projectName) throws InterruptedException{ 
		try {
			String projtName = projectName.trim();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			
			elementUtils.fluentWaitForElement(getDriver(),btnAssignProj).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(7000);
			elementUtils.fluentWaitForElement(getDriver(),inpAssignProjSearch).clear();
			elementUtils.fluentWaitForElement(getDriver(),inpAssignProjSearch).sendKeys(projtName, Keys.ENTER);
			Thread.sleep(500);
			elementUtils.fluentWaitForElement(getDriver(),chkAssignedProj).click();
			elementUtils.fluentWaitForElement(getDriver(),btnSaveProj).click();
			Thread.sleep(4000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			if (getDriver().findElements(By.xpath("//h3[contains(text(),'DelDOT TESTING PROJECT LIVE TICKETS')]")).size() > 0){
				return true;
			}
			else {
				elementUtils.fluentWaitForElement(getDriver(),btnAssignProj).click();
				Thread.sleep(8000);
				getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				elementUtils.fluentWaitForElement(getDriver(),inpAssignProjSearch).clear();
				elementUtils.fluentWaitForElement(getDriver(),inpAssignProjSearch).sendKeys(projtName, Keys.ENTER);
				Thread.sleep(500);
				elementUtils.fluentWaitForElement(getDriver(),chkAssignedProj).click(); 
				elementUtils.fluentWaitForElement(getDriver(),btnSaveProj).click();
				Thread.sleep(4000);
				if (getDriver().findElements(By.xpath("//h3[contains(text(),'DelDOT TESTING PROJECT LIVE TICKETS')]")).size() > 0){
					return true;
				}
				return false;
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
		return false;
	}

	/*Archive Projects*/

	public boolean validateArchiveProjects() throws InterruptedException{ 
		try {
			Thread.sleep(10000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnArchived).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),txtselectStatus).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),optArchived).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnpdate).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(2500);
			elementUtils.fluentWaitForElement(getDriver(),chkShowArchived).click();
			elementUtils.fluentWaitForElement(getDriver(),txtProjHeading).isDisplayed();
			Thread.sleep(8000);
			elementUtils.fluentWaitForElement(getDriver(),btnInactive).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),txtselectStatus).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),optUnderConstruction).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnpdate).click();
			Thread.sleep(2500);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),chkShowArchived).click();
			Thread.sleep(8000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),txtProjHeading).isDisplayed();	
			return true;
		
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
		return false;
	}

	/*Staffing button and search functionality*/

	public boolean validateStaffSearch(String staffName, String staffRole, String staffPhone) throws InterruptedException{ 
		try {
			String stafName = staffName.trim();
			Thread.sleep(10000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnStaff).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),inpAssignProjSearch).clear();
			elementUtils.fluentWaitForElement(getDriver(),inpAssignProjSearch).sendKeys(stafName);
			Thread.sleep(2500);
			if ((elementUtils.fluentWaitForElement(getDriver(),txtStaffName).getText() == stafName) &&
				(elementUtils.fluentWaitForElement(getDriver(),txtStaffRole).getText() == staffRole) &&
				(elementUtils.fluentWaitForElement(getDriver(),txtStaffPhone).getText() == staffPhone)) {
				elementUtils.fluentWaitForElement(getDriver(),btnStaffClose).click();
				return true;					
			}
			else {
				return false;		 
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
		return false;
	}
	
	/*Completed Projects*/

	public boolean validateCompletedProjects(String projectName) throws InterruptedException{ 
		try {
			Thread.sleep(10000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnArchived).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),txtselectStatus).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),optCompleted).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnpdate).click();
			Thread.sleep(2500);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnCompleted).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),txtselectStatus).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),optUnderConstruction).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnpdate).click();	
			Thread.sleep(2500);
			elementUtils.fluentWaitForElement(getDriver(),btnUnderConstruction).isVisible();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
		return false;
	}
	
	/*Validate data in slip card*/

	public boolean validateDataInSlipCard() throws InterruptedException{ 
		try {
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnViewProject).click();
			Thread.sleep(5000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),txtContractID).isVisible();
			elementUtils.fluentWaitForElement(getDriver(),txtProjectID).isVisible();
			elementUtils.fluentWaitForElement(getDriver(),txtProjectStarts).isVisible();
			elementUtils.fluentWaitForElement(getDriver(),txtVendor).isVisible();
//			elementUtils.fluentWaitForElement(getDriver(),txtTotalTickets).isVisible();
//			elementUtils.fluentWaitForElement(getDriver(),txtPentxtDelivered).isVisible();
//			elementUtils.fluentWaitForElement(getDriver(),txtPending).isVisible();
//			elementUtils.fluentWaitForElement(getDriver(),txtRejected).isVisible();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnBack).click();
			return true;		 
		
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
		return false;
	}
	
	/*Filter by ticket number in slip card*/

	public boolean filterByTicketNo(String ticketNo) throws InterruptedException{ 
		try {
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnViewProject).click();
			String trticketNo = ticketNo.trim();
			Thread.sleep(3000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 		
			elementUtils.fluentWaitForElement(getDriver(),btnTicket).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),txtFilter).sendKeys(trticketNo);
			Thread.sleep(1000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),btnFilter).click();
			getDriver().manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			Thread.sleep(1000);
			String ticket = elementUtils.fluentWaitForElement(getDriver(),lblTicket).getText();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnTicket).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnClear).click();
			if (ticket.equals(trticketNo)){
				return true;
			}
			else {
				return false;
			}
		}catch (NoSuchElementException | InterruptedException e) {
			e.printStackTrace();
		} 
		return false;
	}
	
	/*Filter by contractor in slip card*/

	public boolean filterByContractor(String contractor) throws InterruptedException{ 
		try {
			String trcontractor = contractor.trim(); 
			Thread.sleep(1000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 		
			elementUtils.fluentWaitForElement(getDriver(),btnContractor).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),txtFilter).sendKeys(trcontractor);
			Thread.sleep(1000);
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),chkSearchFilter).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),btnFilter).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(1000);
			String cont = elementUtils.fluentWaitForElement(getDriver(),lblContractor).getText();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnContractor).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnClear).click();
			if (cont.equals(trcontractor)){
				return true;
			}
			else {
				return false;
			}
		}catch (NoSuchElementException | InterruptedException e) {
			e.printStackTrace();
		} 
		return false;
	}
	
	/*Filter by supplier in slip card*/

	public boolean filterBySupplier(String supplier) throws InterruptedException{ 
		try {
			String trsupplier = supplier.trim(); 
			Thread.sleep(1000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 		
			elementUtils.fluentWaitForElement(getDriver(),btnSupplier).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),txtFilter).sendKeys(trsupplier);
			Thread.sleep(1000);
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),chkSearchFilter).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),btnFilter).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(1000);
			String supp = elementUtils.fluentWaitForElement(getDriver(),lblSupplier).getText();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnSupplier).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnClear).click();
			if (supp.equals(trsupplier)){
				return true;
			}
			else {
				return false;
			}
		}catch (NoSuchElementException | InterruptedException e) {
			e.printStackTrace();
		} 
		return false;
	}
	
	/*Filter by material in slip card*/

	public boolean filterByMateial(String material) throws InterruptedException{ 
		try {
			String trmaterial = material.trim(); 
			Thread.sleep(1000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 		
			elementUtils.fluentWaitForElement(getDriver(),btnMaterial).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),txtFilter).sendKeys(trmaterial);
			Thread.sleep(1000);
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),chkSearchFilter).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),btnFilter).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(1000);
			String mat = elementUtils.fluentWaitForElement(getDriver(),lblMaterial).getText();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnMaterial).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnClear).click();
			if (mat.equals(trmaterial)){
				return true;
			}
			else {
				return false;
			}
		}catch (NoSuchElementException | InterruptedException e) {
			e.printStackTrace();
		} 
		return false;
	}

	
}

