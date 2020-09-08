package net.haulhub.showcase.cucumber.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
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
import org.openqa.selenium.support.ui.Select;
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
public class BrokerDashboardPage extends PageObject {
	
	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	public BrokerDashboardPage(WebDriver driver) {
		super(driver);
	}

	MouseUtils mouseUtils = new MouseUtils(getDriver());
	public ElementUtils elementUtils = new ElementUtils(getDriver());
	public PaginationUtils paginationUtils = new PaginationUtils(getDriver());
	public ProjectUtils projectUtils = new ProjectUtils();

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Dashboard')]")
	public WebElementFacade brokerdashboardLnk;
	
	@FindBy(how = How.XPATH, using = "//h6[contains(text(),'Needs Review')]//parent::div//h6[contains(text(),'vigneshcompany')]")
	public WebElementFacade firstbrokerintialview;
	
	@FindBy(how = How.XPATH, using = "//div[@class='checkbox select-all']//input")
	public WebElementFacade firstbrokerselectallshiftschkbox;
	
	@FindBy(how = How.XPATH, using = "//button[@class='button btn btn-success btn-lg']")
	public WebElementFacade firstbrokeracceptassignbtn;
	
	@FindBy(how = How.XPATH, using = "//tr[5]//td[6]//button[.='Decline']")
	public WebElementFacade firstbrokerdeclinelasttruck;
	
	@FindBy(how = How.XPATH, using = "//div[.='brokerdriver1 brokerdriver1']")
	public WebElementFacade firstbrokerdriverselectionvalue;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='<-- Select -->']")
	public WebElementFacade firstbrokerdriverselectiondropdown;
	
	@FindBy(how = How.XPATH, using = "//button[.='Send Invites']")
	public WebElementFacade firstbrokersendinvitebtn;
	
	@FindBy(how = How.XPATH, using = "//div[.='Marketplace Jobs']//parent::div//h6[contains(text(),'vigneshcompany')]")
	public WebElementFacade firstbrokerdeclinedshiftinmarketplace;
	
	/**
     * This method is used to click firstBroker dashboard link
     */
	public boolean clickbrokerDashboardlink() {
	try {
		    elementUtils.fluentWaitForElement(getDriver(), brokerdashboardLnk).waitUntilClickable();
			elementUtils.safeJavaScriptClick(brokerdashboardLnk);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(), firstbrokerintialview).isDisplayed();
			return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	/**
     * This method is used to select all shifts and assign drivers
     */
	public boolean selectallshifts_assigndrivers() {
	try {
		  getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  elementUtils.fluentWaitForElement(getDriver(), firstbrokerintialview).click();
		  getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  elementUtils.fluentWaitForElement(getDriver(), firstbrokerselectallshiftschkbox).click();
		  getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  elementUtils.fluentWaitForElement(getDriver(), firstbrokeracceptassignbtn).click();	
		  
		  return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
     * This method is used to assign shifts to different entities like internal truck, second broker and declines one shift.
     */
	public boolean firstbroker_assignstodifferent_entities() {
	try {
		  getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  List<WebElement> listofItems= getDriver().findElements(By.xpath("//tr[@class='retenderable-shift-rows']//td[2]//select"));
		  System.out.println("the list size is" + listofItems.size()); 	
		  for (int i=0; i<=listofItems.size()-1; i++)
		  {
			  Actions action = new Actions(getDriver());
			  getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
              action.moveToElement(listofItems.get(i)).click().build().perform();
              Thread.sleep(500);
              System.out.println("the item number is" + listofItems.get(i)); 
              elementUtils.fluentWaitForElement(getDriver(),listofItems.get(i)).click();
              if (i==0) {
            	  System.out.println("value of i is" + i); 
                  Select select = new Select(listofItems.get(i));
                  select.selectByVisibleText("VIGN 1 (Triaxle)");
                  getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
              }
              else if (i==1 || i==2 || i==3){
            	  System.out.println("value of i is" + i); 
            	  Select select = new Select(listofItems.get(i));
                  select.selectByVisibleText("Vigneshbroker2");
                  getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
              }
              else if (i==4){
                  getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                  firstbrokerdeclinelasttruck.isDisplayed();
        		  getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        		  firstbrokerdeclinelasttruck.click();
        		    Alert alert = getDriver().switchTo().alert();		    
        	        String alertMessage= getDriver().switchTo().alert().getText();		
        	        System.out.println(alertMessage);	
        	        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        	        alert.accept();	
              }
    	  }
	      getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  //firstbrokerdriverselectiondropdown.click();
		  Actions action = new Actions(getDriver());
          action.moveToElement(firstbrokerdriverselectiondropdown).click().build().perform();
          getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
          elementUtils.fluentWaitForElement(getDriver(),firstbrokerdriverselectiondropdown).typeAndEnter("brokerdriver1 brokerdriver1");
		//  getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 // firstbrokerdriverselectionvalue.click();
		  getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  firstbrokersendinvitebtn.click();
		   return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/**
     * This method is used to click firstBroker dashboard link
     */
	public boolean declinedshift_appearing_undermarketplace() {
	try {
	    	getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), firstbrokerdeclinedshiftinmarketplace).isDisplayed();
			return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

 
}