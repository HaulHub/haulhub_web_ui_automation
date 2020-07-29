package net.haulhub.showcase.cucumber.pages;

import net.haulhub.showcase.cucumber.utils.ElementUtils;
import net.haulhub.showcase.cucumber.utils.LearningPlatformConstants;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TruckScedulePage extends PageObject {

	public TruckScedulePage(WebDriver driver) {
		super(driver);
	}

	public ElementUtils elementUtils = new ElementUtils(getDriver());
   
	@FindBy(how = How.XPATH, using = "//span[text()='Material order is missing trucks']")  
	public WebElementFacade MatertialOrdeMissinglbl;
	
	@FindBy(how = How.XPATH, using = "//div[text()='#2468']//parent::div//following::div[10]//button[.='+ Add Trucks']")
	public WebElementFacade AddTrucksbtn;
	
	@FindBy(how = How.XPATH, using = "//a[.='Truck Schedule']")
	public WebElementFacade TruckScedulelbl;
	
	@FindBy(how = How.XPATH, using = "//button[.='Yes, Send Invites']")
	public WebElementFacade Sendinvitesconfirmationbtn;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Fleets and drivers have been notified')]")
	public WebElementFacade DriverMessagereceivedlbl;
	
	@FindBy(how = How.XPATH, using = "//button[.='Truck Report']")
	public WebElementFacade truckreportbt;	
	
	@FindBy(how = How.XPATH, using = "//div[.='Add recipients to auto-report settings in order to select one.']")
	public WebElementFacade elementreceipientlbl;
	
	@FindBy(how = How.XPATH, using = "//a[.='Add Email']")
	public WebElementFacade receipientemailadd;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Email']")
	public WebElementFacade emailtxt;

	@FindBy(how = How.XPATH, using = "//button[.='Save']")
	public WebElementFacade truckreportsavebtn;
	
	@FindBy(how = How.XPATH, using = "//label[.='vignesh@haulhub.com']//parent::div//input[1]")
	public WebElementFacade receiptinputbox;
	
	@FindBy(how = How.XPATH, using = "//button[.='Send']")
	public WebElementFacade receiptsendbtn;

		
	/*
      * This method is used to click Validate truck missing message and Add Trucks
       */
	   public boolean ValidateTruckmissingmessageAddtrucks() {
	    try {
	    	Thread.sleep(1000);
	    	elementUtils.fluentWaitForElement(getDriver(),TruckScedulelbl).isDisplayed();
	    	Actions action1 = new Actions(getDriver());
			action1.moveToElement(this.TruckScedulelbl).click().build().perform();
	        Thread.sleep(1000);
	        String ordernumber = LearningPlatformConstants.ordernumber.get().toString();
			System.out.println("updated ordernumber is" + ordernumber); 
			WebElement Addtrucksbtn = getDriver().findElement(By.xpath("//div[text()='" + ordernumber + "']//parent::div//following::div[10]//button[.='+ Add Trucks']"));
            elementUtils.fluentWaitForElement(getDriver(), Addtrucksbtn).isDisplayed();
            elementUtils.safeJavaScriptClick(Addtrucksbtn);
            Thread.sleep(500);
		  return true;
		 } catch (NoSuchElementException e) {
		   e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	 }
	   
		/*
		  * This method is used to Fill Fleet details and click send invites button
	   */
		public boolean Fillfleetdetails(String fleet ,String fleetpriority) {
			try {
				  Thread.sleep(1000);
				  String ordernumber = LearningPlatformConstants.ordernumber.get().toString();
				  System.out.println("updated ordernumber is" + ordernumber); 
				  WebElement FleetPriority = getDriver().findElement(By.xpath("//div[text()='" + ordernumber + "']//parent::div//following::div[17]//div[@class='shift-fleet-select__input']//input"));
				  Actions action1 = new Actions(getDriver());
		          action1.moveToElement(FleetPriority).click().build().perform();
		          Thread.sleep(1000);
		          elementUtils.fluentWaitForElement(getDriver(),FleetPriority).sendKeys(fleetpriority);
		          Thread.sleep(1000);
		          WebElement Fleet= getDriver().findElement(By.xpath("//div[text()='" + ordernumber + "']//parent::div//following::div[@class='css-pil9xh shift-fleet-select__value-container'][1]//div[@class='shift-fleet-select__input']//input"));
				  Actions action = new Actions(getDriver());
		          action.moveToElement(Fleet).click().build().perform();
		          Thread.sleep(1000);
		          elementUtils.fluentWaitForElement(getDriver(),Fleet).sendKeys(fleet);
		          Thread.sleep(500);
		          WebElement SendinviteBtn= getDriver().findElement(By.xpath("//div[text()='" + ordernumber + "']//parent::div//following::button[@class='fob-btn fob-btn--success send-invites-btn'][1]"));
				  Actions actionbtn = new Actions(getDriver());
				  actionbtn .moveToElement(SendinviteBtn).click().build().perform();
		          return true;
		        } catch (NoSuchElementException e) {
				   e.printStackTrace();
		    	} catch (Exception e) {
					e.printStackTrace();
		    	}
				return false;
	   }

		/*
		  * This method is validate the SMS Confirmation message up on the screen
	   */
		public boolean SMSConfirmation() {
			try {
				elementUtils.fluentWaitForElement(getDriver(),Sendinvitesconfirmationbtn).isDisplayed();
				elementUtils.fluentWaitForElement(getDriver(),Sendinvitesconfirmationbtn).click();
				Thread.sleep(1000);
				elementUtils.fluentWaitForElement(getDriver(),DriverMessagereceivedlbl).isDisplayed();
				Thread.sleep(500);
		          return true;
		        } catch (NoSuchElementException e) {
				   e.printStackTrace();
		    	} catch (Exception e) {
					e.printStackTrace();
		    	}
				return false;
	   }

		/*
		  * This method is to select a receipient if the receipient already exists else create a new receipeint email id and sends a report
	   */
		public boolean sendtruckreport() {
			try {
				Thread.sleep(500);
				if (elementUtils.fluentWaitForElement(getDriver(),elementreceipientlbl).isDisplayed()) {
					elementUtils.fluentWaitForElement(getDriver(),receipientemailadd).waitUntilVisible();
					elementUtils.fluentWaitForElement(getDriver(),receipientemailadd).click();
					Thread.sleep(500);
					elementUtils.fluentWaitForElement(getDriver(),emailtxt).waitUntilVisible();
					elementUtils.fluentWaitForElement(getDriver(),emailtxt).sendKeys("vignesh@haulhub.com");
					Thread.sleep(500);
					elementUtils.fluentWaitForElement(getDriver(),truckreportsavebtn).waitUntilVisible();
					elementUtils.fluentWaitForElement(getDriver(),truckreportsavebtn).click();
					Thread.sleep(500);
					elementUtils.fluentWaitForElement(getDriver(),receiptinputbox).waitUntilVisible();
					elementUtils.fluentWaitForElement(getDriver(),receiptinputbox).click();
					Thread.sleep(500);
					elementUtils.fluentWaitForElement(getDriver(),receiptsendbtn).waitUntilVisible();
					elementUtils.fluentWaitForElement(getDriver(),receiptsendbtn).click();
				}
			     else {
						elementUtils.fluentWaitForElement(getDriver(),receiptinputbox).waitUntilVisible();
						elementUtils.fluentWaitForElement(getDriver(),receiptinputbox).click();
						Thread.sleep(500);
						elementUtils.fluentWaitForElement(getDriver(),receiptsendbtn).waitUntilVisible();
						elementUtils.fluentWaitForElement(getDriver(),receiptsendbtn).click();
					}	
		         return true;
		        } catch (NoSuchElementException e) {
				   e.printStackTrace();
		    	} catch (Exception e) {
					e.printStackTrace();
		    	}
				return false;
	   }
		
		/*
		  * This method is to click the truckreport btn
	   */
		public boolean clicktruckreportbtn() {
			try {
				elementUtils.fluentWaitForElement(getDriver(),truckreportbt).isDisplayed();
				elementUtils.fluentWaitForElement(getDriver(),truckreportbt).click();
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