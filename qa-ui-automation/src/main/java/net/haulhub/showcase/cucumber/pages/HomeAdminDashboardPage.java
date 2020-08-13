package net.haulhub.showcase.cucumber.pages;

//import static org.junit.Assert.assertTrue;

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
public class HomeAdminDashboardPage extends PageObject {
	
	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	public HomeAdminDashboardPage(WebDriver driver) {
		super(driver);
	}

	MouseUtils mouseUtils = new MouseUtils(getDriver());
	public ElementUtils elementUtils = new ElementUtils(getDriver());
	public PaginationUtils paginationUtils = new PaginationUtils(getDriver());
	public ProjectUtils projectUtils = new ProjectUtils();

	@FindBy(how = How.XPATH, using = "//a[.=' Customers']")
	public WebElementFacade customerlnk;
	
	@FindBy(how = How.XPATH, using = "//input[@name='filter']")
	public WebElementFacade cutomersearchtxt;
	
	@FindBy(how = How.XPATH, using = "//td[.='Active']")
	public WebElementFacade activestatus;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/admin/customers/33/associates']")
	public WebElementFacade associatedlnk;
	
	@FindBy(how = How.XPATH, using = "//td[.='Alisa Deychman']")
	public WebElementFacade associatename;
	
	@FindBy(how = How.XPATH, using = "//a[.='xrSiyqkp8VVAy7xesEXMGQL1']")
	public WebElementFacade associatetokenlnk;
	
	
	/**
     * This method is used to click Order dashboard link
     */
	public boolean searchcustomer(String Customername) {
	try {
		    elementUtils.fluentWaitForElement(getDriver(), customerlnk).waitUntilClickable();
			elementUtils.safeJavaScriptClick(customerlnk);
			Thread.sleep(500);
			elementUtils.fluentWaitForElement(getDriver(), cutomersearchtxt).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), cutomersearchtxt).typeAndEnter(Customername);
			Thread.sleep(500);
			elementUtils.fluentWaitForElement(getDriver(), activestatus).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), activestatus).click();
			Thread.sleep(1000);
			elementUtils.fluentWaitForElement(getDriver(), associatedlnk).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), associatedlnk).click();
			Thread.sleep(500);
			elementUtils.fluentWaitForElement(getDriver(), associatename).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), associatename).click();
			Thread.sleep(500);
			elementUtils.fluentWaitForElement(getDriver(), associatetokenlnk).waitUntilVisible();
			elementUtils.fluentWaitForElement(getDriver(), associatetokenlnk).click();
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