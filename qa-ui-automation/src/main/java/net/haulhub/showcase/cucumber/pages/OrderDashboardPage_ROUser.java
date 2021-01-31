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

public class OrderDashboardPage_ROUser extends PageObject {
	
	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	public OrderDashboardPage_ROUser(WebDriver driver) {
		super(driver);
	}

	public ElementUtils elementUtils = new ElementUtils(getDriver());
	
	@FindBy(how = How.XPATH, using = "//a[.='Main']")
	public WebElementFacade lnkMain;
	
	@FindBy(how = How.XPATH, using = "//*[@class='page-header__content']//*[contains(text(),'Job Board')]")
	public WebElementFacade lblJobBoard;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Order Dashboard']") 
	public WebElementFacade lnkOrderDashBoard;
	
	@FindBy(how = How.XPATH, using = "//*[@class='rt-tr-group']//*[@role='rowgroup'][1]//input[@type='checkbox']") 
	public WebElementFacade btnWillCallToggle;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'New Order')]") 
	public WebElementFacade btnNeworder;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Save Changes']") 
	public WebElementFacade btnSaveChanges;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Send SMS']") 
	public WebElementFacade btnSendSMS;
	
	@FindBy(how = How.XPATH, using = "//*[@class='close-btn']") 
	public WebElementFacade btnClose;
	
	@FindBy(how = How.XPATH, using = "//*[@id='statusSelect']") 
	public WebElementFacade txtstatus;
	
	@FindBy(how = How.XPATH, using = "//*[@class='css-1e0bppx-singleValue]//*[contains(text(),'New')]") 
	public WebElementFacade optNew;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Accepted']") 
	public WebElementFacade optAccepted;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Canceled']") 
	public WebElementFacade optCancelled;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Accepted w/ Changes']") 
	public WebElementFacade optAccChanges;
	
	@FindBy(how = How.XPATH, using = "//*[@class='css-tymhex']//*[contains(text(),'New')]") 
	public WebElementFacade lnkOrder;
	
	@FindBy(how = How.XPATH, using = "//*[@class='material-orders__status-cell']/div/div") 
	public WebElementFacade lnkNewOrder;
	
	 	
	/*Check accessibility of main link in Orderdashboard page*/
	
	public boolean CheckAccessibilityOfMainLink(){

		try {
			
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),lnkOrderDashBoard).click();
			
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),lnkMain).isEnabled();
			
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),lnkMain).click();
			

			return true;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
		return false;
	}
	
	/*Set date*/ 
	public boolean setDate(String OrderDate) {
		String url = getDriver().getCurrentUrl();	
		getDriver().navigate().to(url + "?date=" + OrderDate);
		return true;
	}
	
	/*Check accessibility of buttons in Orderdashboard page*/
	
	public boolean checkAccessibilityOfButtonsOrderdashboard(){
		try {
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			if ((elementUtils.fluentWaitForElement(getDriver(),btnNeworder).getAttribute("disabled") != null) && 
		       (elementUtils.fluentWaitForElement(getDriver(),btnWillCallToggle).getAttribute("disabled") != null)){		
			   return true;
		    } else { 
		      
		    }
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}  return false;
	}
	
	/*Filter by status 'New Status'*/
	
	public boolean openNewOrder(){
		try {
			elementUtils.fluentWaitForElement(getDriver(),txtstatus).click();
	        Actions action = new Actions(getDriver());
            action.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();	
            Thread.sleep(500);
            elementUtils.fluentWaitForElement(getDriver(),lnkNewOrder).click();
            getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            if ((elementUtils.fluentWaitForElement(getDriver(),btnSaveChanges).getAttribute("disabled") != null) && 
     		    (elementUtils.fluentWaitForElement(getDriver(),btnSendSMS).getAttribute("disabled") != null)){		
     			   return true;
     		    } else { 
     		       return false;     		      
     		    }
		}catch (NoSuchElementException | InterruptedException e) {
			e.printStackTrace();
		}
		return true;		
	}

}
