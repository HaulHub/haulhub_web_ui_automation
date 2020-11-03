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
public class CustomerFleetManagerPage extends PageObject {
	
	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	public CustomerFleetManagerPage(WebDriver driver) {
		super(driver);
	}

	MouseUtils mouseUtils = new MouseUtils(getDriver());
	public ElementUtils elementUtils = new ElementUtils(getDriver());
	public PaginationUtils paginationUtils = new PaginationUtils(getDriver());
	public ProjectUtils projectUtils = new ProjectUtils();
	
	@FindBy(how = How.XPATH, using = "//dt[.='Phone']//following::dd[1]")
	public WebElementFacade fleetcustomerphonenumbertxt;
	
	@FindBy(how = How.XPATH, using = "//dt[.='Primary Contact']//following::div[1]")
	public WebElementFacade fleetcustomercontactnametxt;
	
	@FindBy(how = How.XPATH, using = "//dt[.='US DOT']//following::dd[1]")
	public WebElementFacade fleetcustomerUSDOTtxt;
	
	/**
     * This method is used to validate complianceFleetdetails
     */
	public boolean Validate_complianceFleetdetails(String customername) {
	try {
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    WebElement Fleetmanagerlnk =  getDriver().findElement(By.xpath("//div[contains(text(),'" + customername + "')]"));
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),Fleetmanagerlnk).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    int flag;
			if(elementUtils.fluentWaitForElement(getDriver(),fleetcustomerphonenumbertxt).getText() == "")
		      flag = 1 ;
		    else
		      flag = 0;
			if(elementUtils.fluentWaitForElement(getDriver(),fleetcustomercontactnametxt).getText() == "")
			    flag = 1 ;
			 else
			    flag = 0;
			if(elementUtils.fluentWaitForElement(getDriver(),fleetcustomerUSDOTtxt).getText() == "")
			    flag = 1 ;
			 else
			    flag = 0;
		    if  (flag == 0)
		      return true ; 
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	

 
}