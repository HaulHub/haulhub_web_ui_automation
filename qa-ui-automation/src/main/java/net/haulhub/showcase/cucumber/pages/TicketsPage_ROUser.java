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

public class TicketsPage_ROUser extends PageObject {

	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	public TicketsPage_ROUser(WebDriver driver) {
		super(driver);
	}

	public ElementUtils elementUtils = new ElementUtils(getDriver());   
	

	@FindBy(how = How.XPATH, using = "//button[text()='Export Tickets']")
	public WebElementFacade btnExportTickets;
	
	@FindBy(how = How.XPATH, using = "//button[@class='MuiButtonBase-root MuiIconButton-root icon-link MuiIconButton-sizeSmall']")
	public WebElementFacade btnTicketMatch;
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-bars']")
	public WebElementFacade btnMenu;
	
	
	
	/*Check accessibility of buttons in Tickets page*/
	
	public boolean checkAccessibilityOfButtonsInTickets(){
		try {
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			if ((elementUtils.fluentWaitForElement(getDriver(),btnExportTickets).getAttribute("disabled") != null) && 
		       (elementUtils.fluentWaitForElement(getDriver(),btnTicketMatch).getAttribute("disabled") != null)){		
			   return true;
		    } else { 
		      
		    }
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}  return false;
	}
		

}
