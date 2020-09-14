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
public class BrokerScedulerPage extends PageObject {
	
	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	public BrokerScedulerPage(WebDriver driver) {
		super(driver);
	}

	MouseUtils mouseUtils = new MouseUtils(getDriver());
	public ElementUtils elementUtils = new ElementUtils(getDriver());
	public PaginationUtils paginationUtils = new PaginationUtils(getDriver());
	public ProjectUtils projectUtils = new ProjectUtils();

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Job Management')]")
	public WebElementFacade brokerJobmanagementlnk;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Scheduler')]")
	public WebElementFacade brokerScedulerlnk;
	
	@FindBy(how = How.XPATH, using = "//tr[3]//td[6]//button[contains(text(),'Decline')]")
	public WebElementFacade secondbrokerdeclinetruck;
	
	@FindBy(how = How.XPATH, using = "//div[@class='selectize-control driver-select single']//input[@placeholder='Select driver...']")
	public WebElementFacade secondbrokerdriverselectiondropdown;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Send Invites')]")
	public WebElementFacade secondbrokerSendinvitebtn;
	
	/**
     * This method as second broker within Job management  click the sceduler and assign 1 shift to internal truck  and one shift to fleet
     */
	public boolean click_sceduler_assignshifts() {
	try {
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),brokerJobmanagementlnk).click();
		    elementUtils.fluentWaitForElement(getDriver(),brokerScedulerlnk).waitUntilClickable();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),brokerScedulerlnk).click();	
		    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		    List<WebElement> listofItems = getDriver().findElements(By.xpath("//input[@placeholder ='Select fleet...']"));
			for (int i=0; i<=listofItems.size()-1; i++)
			  {
				  Actions action = new Actions(getDriver());
				  getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                  action.moveToElement(listofItems.get(i)).click().build().perform();
                  System.out.println("the item number is" + listofItems.get(i));  
			      if (i==0) {
                        elementUtils.fluentWaitForElement(getDriver(),listofItems.get(i)).sendKeys("VIGN 1 (Triaxle)");
                        elementUtils.fluentWaitForElement(getDriver(),listofItems.get(i)).sendKeys(Keys.ENTER);
                        Thread.sleep(500);
			          }
			      else if (i==1){
			    	    elementUtils.fluentWaitForElement(getDriver(),listofItems.get(i)).sendKeys("Vigneshcompany");
                        elementUtils.fluentWaitForElement(getDriver(),listofItems.get(i)).sendKeys(Keys.ENTER);
                        Thread.sleep(500);
			          }
			   }
			 Actions action = new Actions(getDriver());
	         action.moveToElement(secondbrokerdriverselectiondropdown).click().build().perform();
	         getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	         elementUtils.fluentWaitForElement(getDriver(),secondbrokerdriverselectiondropdown).typeAndEnter("brokerdriver2 brokerdriver2");
	         elementUtils.fluentWaitForElement(getDriver(),secondbrokerdeclinetruck).waitUntilClickable();
	         getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
             elementUtils.fluentWaitForElement(getDriver(), secondbrokerSendinvitebtn).click();
             Thread.sleep(1000);
             elementUtils.fluentWaitForElement(getDriver(),brokerScedulerlnk).waitUntilClickable();
 		     getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		     elementUtils.fluentWaitForElement(getDriver(),brokerScedulerlnk).click();
 		     Thread.sleep(1000);
			 elementUtils.safeJavaScriptClick(secondbrokerdeclinetruck);
		     getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		           Alert alert = getDriver().switchTo().alert();		    
		           String alertMessage= getDriver().switchTo().alert().getText();		
		           System.out.println(alertMessage);	
		           getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		           alert.accept();	
	         getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
             Thread.sleep(500);
	    return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/**
     * This method is used to view the drivername within the broker dashboard
     */
	public boolean view_driver_name(String drivername) {
	try {
		   getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       elementUtils.fluentWaitForElement(getDriver(),brokerJobmanagementlnk).click();
	       elementUtils.fluentWaitForElement(getDriver(),brokerScedulerlnk).waitUntilClickable();
	       getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       elementUtils.fluentWaitForElement(getDriver(),brokerScedulerlnk).click();
	       getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       WebElement  drivernamelbl =  getDriver().findElement(By.xpath("//div[contains(text(),'" + drivername + "')]"));
	        if (drivernamelbl.isDisplayed()){
	        	return true;
	        }
	        else{
	        	return false;
	        }
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
 
}