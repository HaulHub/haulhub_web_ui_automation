package net.haulhub.showcase.cucumber.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
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
	
	@FindBy(how = How.XPATH, using = "//span[text()='Edit Columns']//following::div[text()='Date'][2]")
	public WebElementFacade lnkDateFilter; 
	
	@FindBy(how = How.XPATH, using = "//span[text()='Edit Columns']//following::div[text()='Date'][1]")
	public WebElementFacade lnkDateFilterClear; 
	
	@FindBy(how = How.XPATH, using = "//span[text()='Edit Columns']//following::div[text()='Plant'][1]")
	public WebElementFacade lnkPlantFilterClear; 
	
	@FindBy(how = How.XPATH, using = "//*[text()='Project']")
	public WebElementFacade lnkProjectFilter; 
	
	@FindBy(how = How.XPATH, using = "//*[text()='Plant']")
	public WebElementFacade lnkPlantFilter; 
	
	@FindBy(how = How.XPATH, using = "//*[text()='Supplier']")
	public WebElementFacade btnSupplierFilter; 
	
	@FindBy(how = How.XPATH, using = "//*[text()='Supplier']//following::*[text()='Truck']")
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
	
	@FindBy(how = How.XPATH, using = "//*[text()='Date']/div")
	public WebElementFacade txtDate;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Project']/div")
	public WebElementFacade txtProject;
	
	@FindBy(how = How.XPATH, using = "//option[text()='Choose One...']")
	public WebElementFacade txtStatus;
	
	@FindBy(how = How.XPATH, using = "//option[text()='delivered']")
	public WebElementFacade optDelivered;
	
	@FindBy(how = How.XPATH, using = "//*[text()='2/5/2021, 3:05 PM']")
	public WebElementFacade lblGetDate;
	
	@FindBy(how = How.XPATH, using = "//*[text()='vigneshcompany']")
	public WebElementFacade lblGetSup;
	
	@FindBy(how = How.XPATH, using = "//*[text()='VV 4446&9717514 I-16 VIGN']")
	public WebElementFacade lblGetProjName;
	
	@FindBy(how = How.XPATH, using = "//*[text()=' Drag a column here to group by column ']//following::*[text()='VIGN'][1]")
	public WebElementFacade lblGetTruck;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Edit Columns']//following::div[text()='Plant'][1]//following::*[text()='VIGN-Plant'][1]")
	public WebElementFacade lblGetPlant;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Edit Columns']//following::div[text()='Plant'][1]//following::*[text()='12.5 MM SP W/LIME'][1]")
	public WebElementFacade lblGetProduct;
	
	@FindBy(how = How.XPATH, using = "//*[text()='44.66']")
	public WebElementFacade lblGetQuantity;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Edit Columns']//following::div[text()='UOM'][1]//following::*[text()='TON'][1]")
	public WebElementFacade lblGetUOM;
	
	@FindBy(how = How.XPATH, using = "//*[text()='22004402']")
	public WebElementFacade lblGeTicketNo;
	
	@FindBy(how = How.XPATH, using = "//*[text()='delivered']")
	public WebElementFacade lblGeTicketStatus;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'2021-02-05')]")
	public WebElementFacade lnkDate;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'VV 4446&9717514 I-16 VIGN')]")
	public WebElementFacade lnkPName;
	
	@FindBy(how = How.XPATH, using = "//button[@data-test-id='initial-message-close-button']")
	public WebElementFacade btnCloseChatbox;
	
	
	
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
	
	/*Search by plant in 'Feed page'*/ 

	public boolean searchPlant(String plant){
		try {
			String trplant = plant.trim();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 		
			elementUtils.fluentWaitForElement(getDriver(),lnkPlantFilter).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),txtFilter).sendKeys(trplant);
			Thread.sleep(1000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),btnFilter).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),lnkDate).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),lnkPName).click();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			String pln = elementUtils.fluentWaitForElement(getDriver(),lblGetPlant).getText();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),lnkPlantFilter).click();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnClear).click();
			if (pln.equals(trplant)){
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
	
	/*Search by quantity in 'Feed page'*/ 

	public boolean searchQuantity(String quantity){
		try {
			String trquantity = quantity.trim();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 		
			elementUtils.fluentWaitForElement(getDriver(),btnQuantityFilter).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),txtFilter).sendKeys(trquantity);
			Thread.sleep(1000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),btnFilter).click();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			String qun = elementUtils.fluentWaitForElement(getDriver(),lblGetQuantity).getText();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnQuantityFilter).click();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnClear).click();
			if (qun.equals(trquantity)){
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
	
	
	/*Search by Ticket in 'Feed page'*/ 

	public boolean searchTicket(String ticket){
		try {
			String trticket = ticket.trim();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 		
			elementUtils.fluentWaitForElement(getDriver(),btnTicketNumberFilter).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),txtFilter).sendKeys(trticket);
			Thread.sleep(1000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),btnFilter).click();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			String tic = elementUtils.fluentWaitForElement(getDriver(),lblGeTicketNo).getText();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnTicketNumberFilter).click();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnClear).click();
			if (tic.equals(trticket)){
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
	
	/*Search by UOM in 'Feed page'*/ 

	public boolean searchUOM(String uom){
		try {
			String truom = uom.trim();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 		
			elementUtils.fluentWaitForElement(getDriver(),btnUOMFilter).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),txtFilter).sendKeys(truom);
			Thread.sleep(1000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),btnFilter).click();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			String uo = elementUtils.fluentWaitForElement(getDriver(),lblGetUOM).getText();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnUOMFilter).click();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnClear).click();
			if (uo.equals(truom)){
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
	
	/*Search by Ticket status in 'Feed page'*/ 

	public boolean searchTicketStatus(String ticketStatus){
		try {
			String trticketStatus = ticketStatus.trim();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 		
			elementUtils.fluentWaitForElement(getDriver(),btnTicketStatusFilter).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Actions action = new Actions(getDriver());
			action.moveToElement(txtStatus).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),optDelivered).click();
			Thread.sleep(1000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),btnFilter).click();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			String ticStatus = elementUtils.fluentWaitForElement(getDriver(),lblGeTicketStatus).getText();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnTicketStatusFilter).click();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnClear).click();
			if (ticStatus.equals(trticketStatus)){
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
	
	/*Search by date in 'Feed page'*/ 

	public boolean searchDate(String sDate, String eDate){
		try {
			String trsDate = sDate.trim();
			String treDate = eDate.trim();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 		
			elementUtils.fluentWaitForElement(getDriver(),lnkDateFilter).click();
			Actions action = new Actions(getDriver());
			action.sendKeys(trsDate).perform();
			action.moveToElement(txtFromDateFilter).sendKeys(trsDate);
			action.moveToElement(txtFromDateFilter).sendKeys(treDate);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),btnFilter).click();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);		
			elementUtils.fluentWaitForElement(getDriver(),txtProject).click();
			elementUtils.fluentWaitForElement(getDriver(),txtDate).click();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			String date = elementUtils.fluentWaitForElement(getDriver(),lblGetDate).getText();
			String[] separated = date.split(",");
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),lnkDateFilterClear).click();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnClear).click();
			if (separated[0].equals(sDate)){
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
	
	/*Search by supplier in 'Feed page'*/ 

	public boolean searchSupplier(String supplier){
		try {
			String trsupplier = supplier.trim();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 		
			elementUtils.fluentWaitForElement(getDriver(),btnSupplierFilter).click();
			getDriver().manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),txtFilter).sendKeys(trsupplier);
			Thread.sleep(1000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),btnFilter).click();	
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			String sup = elementUtils.fluentWaitForElement(getDriver(),lblGetSup).getText();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnSupplierFilter).click();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnClear).click();
			if (supplier.equals(sup)){
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
	
	/*Search by product in 'Feed page'*/ 

	public boolean searchProduct(String product){
		try {
			String trproduct = product.trim();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 		
			elementUtils.fluentWaitForElement(getDriver(),btnProductFilter).click();
			getDriver().manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),txtFilter).sendKeys(trproduct);
			Thread.sleep(1000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),btnFilter).click();	
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			String prod = elementUtils.fluentWaitForElement(getDriver(),lblGetProduct).getText();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),lnkProjectFilter).click();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnClear).click();
			if (trproduct.equals(prod)){
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
	
	/*Search by supplier in 'Feed page'*/ 

	public boolean searchProject(String project){
		try {
			String trproject = project.trim();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 		
			elementUtils.fluentWaitForElement(getDriver(),lnkProjectFilter).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),txtFilter).sendKeys(trproject);
			Thread.sleep(1000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),btnFilter).click();	
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			String prj = elementUtils.fluentWaitForElement(getDriver(),lblGetProjName).getText();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),lnkProjectFilter).click();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnClear).click();
			if (trproject.equals(prj)){
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
	
	/*Search by truck in 'Feed page'*/ 

	public boolean searchTruck(String truck){
		try {
			String trtruck = truck.trim();
			getDriver().manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 		
			elementUtils.fluentWaitForElement(getDriver(),btnTruckFilter).click();
			Thread.sleep(1000);
			getDriver().manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),txtFilter).sendKeys(trtruck);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),btnFilter).click();
			getDriver().manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),lnkDate).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),lnkPName).click();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			String tru = elementUtils.fluentWaitForElement(getDriver(),lblGetTruck).getText();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnTruckFilter).click();
			getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnClear).click();
			if (trtruck.equals(tru)){
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