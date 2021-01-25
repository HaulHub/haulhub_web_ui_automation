package net.haulhub.showcase.cucumber.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
	
	
	@FindBy(how = How.XPATH, using = "//span[text()='Upcoming']")
	public WebElementFacade lnkUpcoming;
	
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Notify Reserved')]")
	public WebElementFacade btnNotifyReserved;
	
	
	@FindBy(how = How.XPATH, using = "//*[@role='row']/*[@role='gridcell'][1]/a")
	public WebElementFacade lnkJobNumber;
	
	
	@FindBy(how = How.XPATH, using = "//*[.='Edit Job']")
	public WebElementFacade btnEditJob;
	
	@FindBy(how = How.XPATH, using = "//*[.='Edit Shift Schedule']")
	public WebElementFacade btnEditShiftSchedule;
	
	@FindBy(how = How.XPATH, using = "//*[@role='rowgroup'][1]//*[@role='gridcell'][1]/a")
	public WebElementFacade lnkShiftID;
	
	@FindBy(how = How.XPATH, using = "//*[@role='rowgroup'][1]//*[@role='gridcell']//*[contains(text(),'Cancel')]")
	public WebElementFacade btnCancel;
	

	/*Verify visibility of an element in the page*/
	
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
	
	/*Verify a element not exists in the page*/
	
	public boolean checkVisibilityOfNotifyReservedbutton(){
		try {
		 	getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			if (getDriver().findElements(By.xpath("//*[contains(text(),'Notify Reserved')]")).size() > 0) {				 
			    return false;
			}
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
	return true;
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
	
	
	/*Click on a job number*/
	
	public boolean clickOnJobNumber(){
		try {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		elementUtils.fluentWaitForElement(getDriver(),lnkJobNumber).click();
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
	return true;
	}
	
	
	//Currently working on this - Kaveendra
	/*Check accessibility of Cancel Rebook EditShiftSchedule EditShift AddShift CancelShift buttons*/
	
//	public boolean checkAccessibilityOfButtons(){
//		
//		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		if (elementUtils.fluentWaitForElement(getDriver(),btnCancel).getAttribute("disabled") != null) {
//		
//		return true;
//		} else
//	{ return false;
//	}
//	
//	}

}
