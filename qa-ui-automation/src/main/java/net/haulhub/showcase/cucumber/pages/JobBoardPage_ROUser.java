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
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class JobBoardPage_ROUser extends PageObject {

	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	public JobBoardPage_ROUser(WebDriver driver) {
		super(driver);
	}

	public ElementUtils elementUtils = new ElementUtils(getDriver());
	
	@FindBy(how = How.XPATH, using = "//*[@class='page-header__content']//*[contains(text(),'Job Board')]")
	public WebElementFacade lblJobBoard;

	@FindBy(how = How.XPATH, using = "//*[@class='nav-sidebar']//*[contains(text(),'Job Management')]")
	public WebElementFacade lnkJobManagement;
	
	@FindBy(how = How.XPATH, using = "//*[@class='nav-sidebar']//*[contains(text(),'Daily Lineup')]")
	public WebElementFacade lnkDailyLineUp;
	
	@FindBy(how = How.XPATH, using = "//*[@class='nav-sidebar']//*[contains(text(),'Job Board')]")
	public WebElementFacade lnkJobBoard;
	
	@FindBy(how = How.XPATH, using = "//*[@class='nav-sidebar']//*[contains(text(),'Tickets')]") 
	public WebElementFacade lnkTickets;

	@FindBy(how = How.XPATH, using = "//span[text()='Order Dashboard']") 
	public WebElementFacade lnkOrderDashBoard;
		
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Select...')]") 
	public WebElementFacade selStatus;
		
	@FindBy(how = How.XPATH, using = "//*[@class='sub-nav__item']//*[contains(@href,'customer/jobs/')]")
	public WebElementFacade lnkJobnumber;	
	
	@FindBy(how = How.XPATH, using = "//*[@class='search-input-wrap']//*[@type='text']")
	public WebElementFacade txtSearch;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Upcoming']")
	public WebElementFacade lnkUpcoming;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Draft']")
	public WebElementFacade lnkDraft;
		
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Notify Reserved')]")
	public WebElementFacade btnNotifyReserved;
		
	@FindBy(how = How.XPATH, using = "//*[@role='row']/*[@role='gridcell'][1]/a")
	public WebElementFacade lnkJobNumber;
	
	@FindBy(how = How.XPATH, using = "//*[.='Edit Job']")
	public WebElementFacade btnEditJob;
	
	@FindBy(how = How.XPATH, using = "//*[.='Rebook Job']")
	public WebElementFacade btnRebook;
	
	@FindBy(how = How.XPATH, using = "//*[.='Add Shift']")
	public WebElementFacade btnAddShift;
	
	@FindBy(how = How.XPATH, using = "//*[.='Edit Shift']")
	public WebElementFacade btnEditShift;
	
	@FindBy(how = How.XPATH, using = "//*[.='Edit Shift Schedule']")   
	public WebElementFacade btnEditShiftSchedule;
	
	@FindBy(how = How.XPATH, using = "//*[@role='rowgroup'][1]//*[@role='gridcell'][1]/a") 
	public WebElementFacade lnkShiftID;
	
	@FindBy(how = How.XPATH, using = "//*[@role='rowgroup'][2]//*[@role='gridcell'][1]/a") 
	public WebElementFacade lnkJobNo;
	
	@FindBy(how = How.XPATH, using = "//*[@role='rowgroup'][1]//*[@role='gridcell']//*[contains(text(),'Cancel')]")
	public WebElementFacade btnCancel;
	
	@FindBy(how = How.XPATH, using = "//*[@role='rowgroup'][2]//*[@role='gridcell']//*[contains(text(),'Cancel')]")
	public WebElementFacade btnCancelDraft;
	
	@FindBy(how = How.XPATH, using = "//span[@class='button-wrapper']//*[.='Cancel Job']")
	public WebElementFacade btnCancelJob;
	
	@FindBy(how = How.XPATH, using = "//button[.='Cancel']")
	public WebElementFacade btnCancelShift;
	
	@FindBy(how = How.XPATH, using = "//a[.='Finish']")
	public WebElementFacade btnFinish;
	
	@FindBy(how = How.XPATH, using = "//button[.='Update']") 
	public WebElementFacade btnUpdate;
	
	@FindBy(how = How.XPATH, using = "//button[.='Save']")
	public WebElementFacade btnSave;
	
	@FindBy(how = How.XPATH, using = "//*[@class='row item-row'][2]//*[@class='item-value']")
	public WebElementFacade lnkStartinglocation;
	
	@FindBy(how = How.XPATH, using = "//*[@class='row item-row'][3]//*[@class='item-value']")
	public WebElementFacade btnDestination;

	/*Verify navigation to Jobboard page*/
	
	public boolean CheckNavigationToJobBoardPage(){

		try {
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),lblJobBoard).isDisplayed();

			return true;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
		return false;
	}
	
	/*Verify navigation to Tickets page*/
	
	public boolean NavigateToTicketsPage(){

		try {
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),lnkTickets).click();

			return true;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
		return false;
	}

	/*Verify accessibility of each link*/

	public boolean checkAccessAvailability() {

		try {
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),lnkJobManagement).isEnabled();

			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),lnkDailyLineUp).isEnabled();

			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),lnkJobBoard).isEnabled();

			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),lnkTickets).isEnabled();

			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),lnkOrderDashBoard).isEnabled();
			
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),lnkDailyLineUp).click();

			return true;
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
		return false;
	}
	
	/*Verify a element is disabled in the page*/
	
	public boolean checkVisibilityOfNotifyReservedbutton(){
		try {
		 	getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			if (elementUtils.fluentWaitForElement(getDriver(),btnNotifyReserved).getAttribute("disabled") != null) {				 
			    return true;
			}
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
	return false;
	}
		
	/*Filter by status 'Upcoming'*/
	
	public boolean filterByUpcomingStatus(){
		try {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		elementUtils.fluentWaitForElement(getDriver(),selStatus).click();
		Actions action = new Actions(getDriver());
		action.moveToElement(lnkUpcoming).click().build().perform();
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
	return true;
	}
	
	/*Filter by status 'Draft'*/
	
	public boolean filterByDraftStatus(){
		try {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		elementUtils.fluentWaitForElement(getDriver(),selStatus).click();
		Actions action = new Actions(getDriver());
		action.sendKeys("Draft", Keys.chord(Keys.ENTER)).perform();
		elementUtils.fluentWaitForElement(getDriver(),lnkJobNumber).click();
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
	return true;
	}
	
	/*Filter by status 'Started'*/
	
	public boolean filterByStartedStatus(){
		try {
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),selStatus).click();
			Actions action = new Actions(getDriver());
			action.sendKeys("Started", Keys.chord(Keys.ENTER)).perform();
			elementUtils.fluentWaitForElement(getDriver(),lnkJobNumber).click();
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
	return true;
	}
		
	/*Check accessibility of buttons in Upcoming page*/
	
	public boolean checkAccessibilityOfButtonsInUpcoming(){
		
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if ((elementUtils.fluentWaitForElement(getDriver(),btnCancel).getAttribute("disabled") != null) && 
		    (elementUtils.fluentWaitForElement(getDriver(),btnEditJob).getAttribute("disabled") != null) &&
		    (elementUtils.fluentWaitForElement(getDriver(),btnCancelJob).getAttribute("disabled") != null) &&
		    (elementUtils.fluentWaitForElement(getDriver(),btnEditShiftSchedule).getAttribute("disabled") != null)){		
		return true;
		} else
	{ return false;
	}
	}	
	
	/*Check accessibility of buttons in Draft page*/
	
	public boolean checkAccessibilityOfButtonsInDraft(){
		
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if ((elementUtils.fluentWaitForElement(getDriver(),btnCancelDraft).getAttribute("disabled") != null) && 
		    (elementUtils.fluentWaitForElement(getDriver(),btnEditJob).getAttribute("disabled") != null) &&
		    (elementUtils.fluentWaitForElement(getDriver(),btnCancelJob).getAttribute("disabled") != null) &&
		    (elementUtils.fluentWaitForElement(getDriver(),btnEditShiftSchedule).getAttribute("disabled") != null) &&
		    (elementUtils.fluentWaitForElement(getDriver(),btnRebook).getAttribute("disabled") != null)){
		
		return true;
		} else
	{ return false;
	}
	}
	
	/*Check accessibility of buttons in Started page*/
	
	public boolean checkAccessibilityOfButtonsInStarted(){
		
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if ((elementUtils.fluentWaitForElement(getDriver(),btnCancelDraft).getAttribute("disabled") != null) && 
		    (elementUtils.fluentWaitForElement(getDriver(),btnEditJob).getAttribute("disabled") != null) &&
		    (elementUtils.fluentWaitForElement(getDriver(),btnEditShift).getAttribute("disabled") != null) &&
		    (elementUtils.fluentWaitForElement(getDriver(),btnAddShift).getAttribute("disabled") != null) &&
		    (elementUtils.fluentWaitForElement(getDriver(),btnCancelJob).getAttribute("disabled") != null) &&
		    (elementUtils.fluentWaitForElement(getDriver(),btnEditShiftSchedule).getAttribute("disabled") != null) &&
		    (elementUtils.fluentWaitForElement(getDriver(),btnRebook).getAttribute("disabled") != null)){
		
		return true;
		} else
	{ return false;
	}
	}
		
	/*Click on a job number*/
	
	public boolean clickOnJobNumber(){
		try {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		elementUtils.fluentWaitForElement(getDriver(),lnkJobNo).click();
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
	return true;
	}
	
	/*Click on a job number*/
	
	public boolean clickOnShiftID(){
		try {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		elementUtils.fluentWaitForElement(getDriver(),lnkShiftID).click();
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
	return true;
	}
	
    /*Check accessibility of Cancel Finish Update and Save buttons in shift*/
	
	public boolean checkAccessibilityOfButtonsInShifts(){
		
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if ((elementUtils.fluentWaitForElement(getDriver(),btnCancelShift).getAttribute("disabled") != null) && 
		    (elementUtils.fluentWaitForElement(getDriver(),btnFinish).hasClass("disabled")) &&
		    (elementUtils.fluentWaitForElement(getDriver(),btnUpdate).getAttribute("disabled") != null) &&
		    (elementUtils.fluentWaitForElement(getDriver(),btnSave).getAttribute("disabled") != null)){
		
		return true;
		} else
	{ return false;
	}
	}	 
	
	/*Check accessibility of Cancel Finish Update and Save buttons and plant job locations in shift*/
	
	public boolean checkAccessibilityOfButtonsInShiftsInStarted(){
		
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if ((elementUtils.fluentWaitForElement(getDriver(),btnCancelShift).getAttribute("disabled") != null) && 
		    (elementUtils.fluentWaitForElement(getDriver(),btnFinish).hasClass("disabled")) &&
		    (elementUtils.fluentWaitForElement(getDriver(),btnUpdate).getAttribute("disabled") != null) &&
		    (elementUtils.fluentWaitForElement(getDriver(),btnSave).getAttribute("disabled") != null) &&
			(elementUtils.fluentWaitForElement(getDriver(),lnkStartinglocation).isEnabled()) &&
			(elementUtils.fluentWaitForElement(getDriver(),btnDestination).isEnabled())) {
		
		return true;
		} else
	{ return false;
	}
	}	
		 	 
}
