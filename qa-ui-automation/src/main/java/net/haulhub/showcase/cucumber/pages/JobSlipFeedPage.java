package net.haulhub.showcase.cucumber.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import net.haulhub.showcase.cucumber.utils.ElementUtils;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class JobSlipFeedPage extends PageObject {

	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	public JobSlipFeedPage(WebDriver driver) {
		super(driver);
	}

	public ElementUtils elementUtils = new ElementUtils(getDriver());
	
	@FindBy(how = How.XPATH, using = "//span[text()='My Projects']")
	public WebElementFacade lnkMyProjects;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Edit Columns']")
	public WebElementFacade lnkEditColumns; 
	
	@FindBy(how = How.XPATH, using = "//span[text()='Download Slips']")
	public WebElementFacade btnDowloadSlips; 
	
	@FindBy(how = How.XPATH, using = "//span[text()='Download']")
	public WebElementFacade btnDownloads; 
	
	@FindBy(how = How.XPATH, using = "//*[@class='sc-fznOgF glfmCu']//following::div[text()='Date']")
	public WebElementFacade lnkDateFilter; 
	
	@FindBy(how = How.XPATH, using = "//*[@class='sc-fznOgF glfmCu']//following::div[text()='Date']//following::div[text()='Project']")
	public WebElementFacade lnkProjectFilter; 
	
	@FindBy(how = How.XPATH, using = "//*[text()='Plant']")
	public WebElementFacade lnkPlantFilter; 
	
	@FindBy(how = How.XPATH, using = "//*[text()='Supplier']")
	public WebElementFacade btnSupplierFilter; 
	
	@FindBy(how = How.XPATH, using = "//*[text()='Truck']")
	public WebElementFacade btnTruckFilter; 
	
	@FindBy(how = How.XPATH, using = "//*[text()='Product']")
	public WebElementFacade btnProductFilter; 
	
	@FindBy(how = How.XPATH, using = "//*[text()='Quantity']")
	public WebElementFacade btnQuantityFilter; 
	
	@FindBy(how = How.XPATH, using = "//*[text()='UOM']")
	public WebElementFacade btnUOMFilter; 
	
	@FindBy(how = How.XPATH, using = "//*[text()='Ticket Number']")
	public WebElementFacade btnTicketNumberFilter; 
	
	@FindBy(how = How.XPATH, using = "//*[text()='Ticket Status']")
	public WebElementFacade btnTicketStatusFilter; 
	
	@FindBy(how = How.XPATH, using = "//span[text()='Mark as Delivered']")
	public WebElementFacade btnMarkDelivered;
	
	@FindBy(how = How.XPATH, using = "//*[@class='DateInput DateInput_1'][1]")
	public WebElementFacade txtFromDateFilter;
	
	@FindBy(how = How.XPATH, using = "//*[@class='DateInput DateInput_1'][2]")
	public WebElementFacade txtToDateFilter;
	
	@FindBy(how = How.XPATH, using = "//option[text()='Equal']//following::input[1]")
	public WebElementFacade txtFilter;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Filter')]")
	public WebElementFacade btnFilter;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Clear')]")
	public WebElementFacade btnClear;
	
		
	/*Navigate to My Projects page*/
	
	public boolean navigateToMyProjects() throws InterruptedException{
               try {
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),lnkMyProjects).click();
			Thread.sleep(1000);
		        return true;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
		return false;
	}
	
	/*Search by date in 'Feed page'*/ 

	public boolean searchDate(String sDate, String eDate){
		try {
			String trticketNo = sDate.trim();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 		
			elementUtils.fluentWaitForElement(getDriver(),lnkDateFilter).click();
			elementUtils.fluentWaitForElement(getDriver(),txtFromDateFilter).clear();
			elementUtils.fluentWaitForElement(getDriver(),txtFromDateFilter).sendKeys(sDate);
			elementUtils.fluentWaitForElement(getDriver(),txtToDateFilter).clear();
			elementUtils.fluentWaitForElement(getDriver(),txtToDateFilter).sendKeys(eDate);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),btnFilter).click();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			String pticketNo = elementUtils.fluentWaitForElement(getDriver(),txtToDateFilter).getText();
			elementUtils.fluentWaitForElement(getDriver(),txtToDateFilter).click();
			elementUtils.fluentWaitForElement(getDriver(),btnClear).click();
			if (pticketNo.equals(trticketNo)){
				return true;
			}
			else {
				return false;
			}
		}catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
		return false;
	}	
	
}