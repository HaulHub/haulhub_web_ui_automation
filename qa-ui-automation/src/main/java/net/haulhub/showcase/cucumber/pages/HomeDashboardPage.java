package net.haulhub.showcase.cucumber.pages;

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
public class HomeDashboardPage extends PageObject {
	
	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	public HomeDashboardPage(WebDriver driver) {
		super(driver);
	}

	MouseUtils mouseUtils = new MouseUtils(getDriver());
	public ElementUtils elementUtils = new ElementUtils(getDriver());
	public PaginationUtils paginationUtils = new PaginationUtils(getDriver());
	public ProjectUtils projectUtils = new ProjectUtils();

	@FindBy(how = How.XPATH, using = "//span[.='Order Dashboard']")
	public WebElementFacade orderLnk;
	
	@FindBy(how = How.XPATH, using = "//label[.='Hide Canceled']")
	public WebElementFacade hidecancelcheckbox;
	
	@FindBy(how = How.XPATH, using = "//button[.='New Order ']")
	public WebElementFacade neworderbtn;
	
	@FindBy(how = How.XPATH, using = "//button[@class='today-button fob-btn']")
	public WebElementFacade gotodaybtnlnk;
	
	@FindBy(how = How.XPATH, using = "//div[text()='Accepted']")
	public WebElementFacade AcceptedOrdertxt;
	
	@FindBy(how = How.XPATH, using = "//button[.='Cancel Order']")
	public WebElementFacade  cancelorderbtn;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Total 0')]")
	public WebElementFacade  TotalCountlbl;
	
	@FindBy(how = How.XPATH, using = "//span[.='Rebook']")
	public WebElementFacade  rebookOrderbtn;
	
	@FindBy(how = How.XPATH, using = "//button[.='Reject Order']")
	public WebElementFacade  rejectOrderbtn;
	
	@FindBy(how = How.XPATH, using = "//a[.='Order Dashboard']")
	public WebElementFacade  orderdashboardlnk;
	
	@FindBy(how = How.XPATH, using = "//button[.='Order Report']")
	public WebElementFacade  orderreportbtn;

	@FindBy(how = How.XPATH, using = "//button[.='Cancel']")
	public WebElementFacade  orderCancelbtn;
	
	@FindBy(how = How.XPATH, using = "//button[.='Preview']")
	public WebElementFacade  orderPreviewlnk;
	
	@FindBy(how = How.XPATH, using = "//button[.='Download']")
	public WebElementFacade  orderDownloadlnk;
	
	
	
	
	/**
     * This method is used to click Order dashboard link
     */
	public boolean clickOrderdashboardlink() {
	try {
		    elementUtils.fluentWaitForElement(getDriver(), orderLnk).waitUntilClickable();
			elementUtils.safeJavaScriptClick(orderLnk);
			return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
   
   /**
    * This method is used to click HideCancel checkbox 
    */
   public boolean clickHideCancelchkbox() {
		try {
			    elementUtils.fluentWaitForElement(getDriver(), hidecancelcheckbox).waitUntilClickable();
				elementUtils.safeJavaScriptClick(hidecancelcheckbox);
				return true;
			} catch (NoSuchElementException e) {
			e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
   
   

   /**
    * This method is used to click order report btn in the FOB homepage
    */
   public boolean  checkclickorderreportbtn() {
		try {
		       Thread.sleep(1000);
			    elementUtils.fluentWaitForElement(getDriver(), orderreportbtn).waitUntilClickable();
				elementUtils.safeJavaScriptClick(orderreportbtn);
				return true;
			} catch (NoSuchElementException e) {
			e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
   
  

   /**
    * This method is used to check Cancelpreview and downloand links avilablity in the OrderReport page
    */
   public boolean checkCancelPreviewDownloadlnks() {
		try {
			    Thread.sleep(1000);
			    elementUtils.fluentWaitForElement(getDriver(), orderCancelbtn).isDisplayed();
			    elementUtils.fluentWaitForElement(getDriver(), orderPreviewlnk).isDisplayed();
			    elementUtils.fluentWaitForElement(getDriver(), orderDownloadlnk).isDisplayed();
			    return true;
			} catch (NoSuchElementException e) {
			e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
   
   
   /**
    * This method is used to click the Cancel button in the order report 
    */
   public boolean clickCancelOrderreport() {
		try {
			    Thread.sleep(1000);
			    elementUtils.fluentWaitForElement(getDriver(), orderCancelbtn).click();
			    return true;
			} catch (NoSuchElementException e) {
			e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
  
   
   
   /**
    * This method is used to click Gotoday link
    */
   public boolean gotodaylink() {
		try {
			    elementUtils.fluentWaitForElement(getDriver(), gotodaybtnlnk).waitUntilClickable();
				elementUtils.safeJavaScriptClick(gotodaybtnlnk);
				return true;
			} catch (NoSuchElementException e) {
			e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
   
   
   /**
    * This method is used to click cancelorder link
    */
   public boolean  clickCancelOrderbtn() {
		try {
			    elementUtils.fluentWaitForElement(getDriver(), cancelorderbtn).waitUntilClickable();
				elementUtils.safeJavaScriptClick(cancelorderbtn);
				return true;
			} catch (NoSuchElementException e) {
			e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
   
   /**
    * This method is used to click RebookOrderBtn 
    */
   public boolean clickRebookOrderbtn() {
		try {
			    elementUtils.fluentWaitForElement(getDriver(),rebookOrderbtn).waitUntilClickable();
				elementUtils.safeJavaScriptClick(rebookOrderbtn);
				return true;
			} catch (NoSuchElementException e) {
			e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
   
   
   /**
    * This method is used to check OrderCancelled 
    */
   public boolean OrderCancelledvalidation() {
		try {
			   if  (elementUtils.fluentWaitForElement(getDriver(), TotalCountlbl).isDisplayed() == true)
				   return true;
			   else 
				   return false;    
			} catch (NoSuchElementException e) {
			e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
   
  
   
   /**
    * This method is used to viewCreatedOrderDetails
    */
   public boolean viewCreatedOrderDetails() {
		try {
			    elementUtils.fluentWaitForElement(getDriver(), AcceptedOrdertxt).waitUntilClickable();
				elementUtils.safeJavaScriptClick(AcceptedOrdertxt);
				return true;
			} catch (NoSuchElementException e) {
			e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
   
   

   /**
    * This method is used to Rejectordetails
    */
   public boolean RejectOrderDetails() {
		try {
			    viewCreatedOrderDetails();
			    Thread.sleep(1000);
			    elementUtils.fluentWaitForElement(getDriver(),  rejectOrderbtn).waitUntilClickable();
				elementUtils.safeJavaScriptClick(rejectOrderbtn);
				return true;
			} catch (NoSuchElementException e) {
			e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
   

   /**
    * This method is used to ClickOrderdashboard breadcrumblnk
    */
   public boolean  Clickorderdashboardlnk() {
		try {
			    Thread.sleep(1000);
			    elementUtils.fluentWaitForElement(getDriver(),orderdashboardlnk).waitUntilClickable();
				elementUtils.safeJavaScriptClick(orderdashboardlnk);
				return true;
			} catch (NoSuchElementException e) {
			e.printStackTrace();
			} catch (Exception e) {
				 e.printStackTrace();
			}
		    return false;
   }
   
  
   /**
    * This method is used to click NewOrder button
    */
   public boolean clickneworderbutton() {
		try {
			    elementUtils.fluentWaitForElement(getDriver(), neworderbtn).waitUntilClickable();
				elementUtils.safeJavaScriptClick(neworderbtn);
				return true;
			} catch (NoSuchElementException e) {
			e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
 
}