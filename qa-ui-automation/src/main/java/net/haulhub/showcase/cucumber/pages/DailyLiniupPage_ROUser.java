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

public class DailyLiniupPage_ROUser extends PageObject {
	
	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	public DailyLiniupPage_ROUser(WebDriver driver) {
		super(driver);
	}

	public ElementUtils elementUtils = new ElementUtils(getDriver());
	
	@FindBy(how = How.XPATH, using = "//*[.='File Export']")
	public WebElementFacade btnFileExport;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Job Board')]")
	public WebElementFacade lblJobBoard;
	
	
	/*Check disability of file export button*/
	public boolean CheckDisabilityOfFileExportButton(){
	                getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			if (elementUtils.fluentWaitForElement(getDriver(),btnFileExport).getAttribute("disabled") != null) {
			return true;
		} else
		{ return false;
		}
	}
	
	/*Navigate to Jobboard page*/
	public boolean navigateToJobboardPage(){
               try {
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),lblJobBoard).click();
		        return true;
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
		return false;
	}
}
