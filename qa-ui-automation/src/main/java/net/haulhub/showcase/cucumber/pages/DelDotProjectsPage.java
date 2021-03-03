package net.haulhub.showcase.cucumber.pages;

import java.util.concurrent.TimeUnit;
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

	@FindBy(how = How.XPATH, using = "//input[@type='text']//following::*[text()='TestAreaManager DOTTesting']")
	public WebElementFacade txtStaffName; 

	@FindBy(how = How.XPATH, using = "///input[@type='text']//following::*[text()='Area Manager']")
	public WebElementFacade txtStaffRole; 

	@FindBy(how = How.XPATH, using = "//input[@type='text']//following::*[text()='+13125552222']")
	public WebElementFacade txtStaffPhone; 

	@FindBy(how = How.XPATH, using = "//button[@aria-label='close']")
	public WebElementFacade btnStaffClose; 

	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']//following::span[6]")
	public WebElementFacade btnStaff;

	@FindBy(how = How.XPATH, using = "//span[text()='Save']")
	public WebElementFacade btnSaveProj; 

	@FindBy(how = How.XPATH, using = "//h3[text()='DelDOT TESTING PROJECT 01']")
	public WebElementFacade txtProjHeading; 

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'DelDOT TESTING PROJECT 01')]//preceding::input[@type='checkbox'][1]//parent::span")
	public WebElementFacade chkAssignedProj; 

	@FindBy(how = How.XPATH, using = "//span[text()='Show Archived']")
	public WebElementFacade chkShowArchived; 

	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']//following::span[text()='Under Construction']")
	public WebElementFacade btnUnderConstruction; 

	@FindBy(how = How.XPATH, using = "//li[text()='Archived']")
	public WebElementFacade optArchived;
	
	@FindBy(how = How.XPATH, using = "//li[text()='Completed']")
	public WebElementFacade optCompleted;

	@FindBy(how = How.XPATH, using = "//li[text()='Under Construction']")
	public WebElementFacade optUnderConstruction;

	@FindBy(how = How.XPATH, using = "//*[text()='Update']")
	public WebElementFacade btnpdate;

	@FindBy(how = How.XPATH, using = "//*[@id='selectStatus']")
	public WebElementFacade txtselectStatus;

	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']//following::span[4]")
	public WebElementFacade btnArchived;
	
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']//following::span[text()='Completed']")
	public WebElementFacade btnCompleted;
	
	@FindBy(how = How.XPATH, using = "//*[text()='WS210204'][1]")
	public WebElementFacade txtContractID;
	
	@FindBy(how = How.XPATH, using = "//*[text()='WS210204'][2]")
	public WebElementFacade txtProjectID;
	
	@FindBy(how = How.XPATH, using = "//*[text()='10/6/2020']")
	public WebElementFacade txtProjectStarts;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Project ID']//following::*[text()='Granite Construction Company - Pacific Northwest'][1]")
	public WebElementFacade txtVendor;
	
	@FindBy(how = How.XPATH, using = "//*[text()='4']")
	public WebElementFacade txtTotalTickets;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Total Tickets']//following::*[text()='0.00 Tons'][1]")
	public WebElementFacade txtPentxtDelivered;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Total Tickets']//following::*[text()='52.88 Tons'][1]")
	public WebElementFacade txtPending;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Total Tickets']//following::*[text()='0.00 Tons'][2]")
	public WebElementFacade txtRejected;
	
	@FindBy(how = How.XPATH, using = "//*[text()='DelDOT TESTING PROJECT 01']//following::span[text()='View Project'][1]")
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
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Filter')]")
	public WebElementFacade btnFilter;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Clear')]")
	public WebElementFacade btnClear;
	
	@FindBy(how = How.XPATH, using = "//option[text()='Equal']//following::input[1]")
	public WebElementFacade txtFilter;
	
	@FindBy(how = How.XPATH, using = "//*[text()='260426']")
	public WebElementFacade lblTicket;
	
	
	/*Validate assigned Projects*/

	public boolean validateAssignProjects(String projectName) throws InterruptedException{ 
		try {
			String projtName = projectName.trim();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnAssignProj).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),inpAssignProjSearch).clear();
			elementUtils.fluentWaitForElement(getDriver(),inpAssignProjSearch).sendKeys(projtName);
			Thread.sleep(500);
			Actions action = new Actions(getDriver());
			action.sendKeys(chkAssignedProj).perform();
			//			elementUtils.fluentWaitForElement(getDriver(),chkAssignedProj).click();
			elementUtils.fluentWaitForElement(getDriver(),btnSaveProj).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			if (getDriver().findElements(By.xpath("//h3[contains(text(),'DelDOT TESTING PROJECT 01')]")).size() > 0){
				return true;
			}
			else {
				elementUtils.fluentWaitForElement(getDriver(),btnAssignProj).click();
				getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				elementUtils.fluentWaitForElement(getDriver(),inpAssignProjSearch).clear();
				elementUtils.fluentWaitForElement(getDriver(),inpAssignProjSearch).sendKeys(projtName);
				Thread.sleep(500);
				Actions action1 = new Actions(getDriver());
				action1.sendKeys(chkAssignedProj).perform();
				//				elementUtils.fluentWaitForElement(getDriver(),chkAssignedProj).click();
				elementUtils.fluentWaitForElement(getDriver(),btnSaveProj).click();
				if (getDriver().findElements(By.xpath("//h3[contains(text(),'DelDOT TESTING PROJECT 01')]")).size() > 0){
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

	public boolean validateArchiveProjects(String projectName) throws InterruptedException{ 
		try {
			String projtName = projectName.trim();
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
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			if (elementUtils.fluentWaitForElement(getDriver(),txtProjHeading).getText() == projtName){
				getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				elementUtils.fluentWaitForElement(getDriver(),btnArchived).click();
				getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				elementUtils.fluentWaitForElement(getDriver(),optUnderConstruction).click();
				getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				elementUtils.fluentWaitForElement(getDriver(),btnpdate).click();
				getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				elementUtils.fluentWaitForElement(getDriver(),chkShowArchived).click();	
				getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				elementUtils.fluentWaitForElement(getDriver(),txtProjHeading).isDisplayed();	
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

	/*Staffing button and search functionality*/

	public boolean validateStaffSearch(String staffName, String staffRole, String staffPhone) throws InterruptedException{ 
		try {
			String stafName = staffName.trim();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnStaff).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),inpAssignProjSearch).clear();
			elementUtils.fluentWaitForElement(getDriver(),inpAssignProjSearch).sendKeys(stafName);
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
			String projtName = projectName.trim();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnArchived).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),txtselectStatus).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),optCompleted).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnpdate).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(2500);
			if ((elementUtils.fluentWaitForElement(getDriver(),txtProjHeading).getText() == projtName) &&
			    (elementUtils.fluentWaitForElement(getDriver(),btnCompleted).isVisible())) {			
				getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				elementUtils.fluentWaitForElement(getDriver(),btnArchived).click();
				getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				elementUtils.fluentWaitForElement(getDriver(),txtselectStatus).click();
				getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				elementUtils.fluentWaitForElement(getDriver(),optUnderConstruction).click();
				getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				elementUtils.fluentWaitForElement(getDriver(),btnpdate).click();	
				Thread.sleep(2500);
				if ((elementUtils.fluentWaitForElement(getDriver(),txtProjHeading).getText() == projtName) &&
				    (elementUtils.fluentWaitForElement(getDriver(),btnUnderConstruction).isVisible())) {
					return true;
				}
				return false;
			}
			else {
				return false;		 
			}
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
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),txtContractID).isVisible();
			elementUtils.fluentWaitForElement(getDriver(),txtProjectID).isVisible();
			elementUtils.fluentWaitForElement(getDriver(),txtProjectStarts).isVisible();
			elementUtils.fluentWaitForElement(getDriver(),txtVendor).isVisible();
			elementUtils.fluentWaitForElement(getDriver(),txtTotalTickets).isVisible();
			elementUtils.fluentWaitForElement(getDriver(),txtPentxtDelivered).isVisible();
			elementUtils.fluentWaitForElement(getDriver(),txtPending).isVisible();
			elementUtils.fluentWaitForElement(getDriver(),txtRejected).isVisible();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnBack).click();
			return true;		 
		
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
		return false;
	}
	
	/*Validate data in slip card*/

	public boolean filterByTicketNo(String ticketNo) throws InterruptedException{ 
		try {
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnViewProject).click();
			String trticketNo = ticketNo.trim();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 		
			elementUtils.fluentWaitForElement(getDriver(),btnTicket).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),txtFilter).sendKeys(trticketNo);
			Thread.sleep(1000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),btnFilter).click();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			String ticket = elementUtils.fluentWaitForElement(getDriver(),lblTicket).getText();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnTicket).click();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
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

	
}

