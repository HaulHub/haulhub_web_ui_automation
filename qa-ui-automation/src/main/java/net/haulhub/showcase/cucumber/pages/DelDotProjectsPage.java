package net.haulhub.showcase.cucumber.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import net.haulhub.showcase.cucumber.utils.ElementUtils;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DelDotProjectsPage extends PageObject {

	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	public DelDotProjectsPage(WebDriver driver) {
		super(driver);
	}

	public ElementUtils elementUtils = new ElementUtils(getDriver());

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Assigned Projects')]")
	public WebElementFacade btnAssignProj; 

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Assigned Projects')]")
	public WebElementFacade txtAssignProjects; 

	@FindBy(how = How.XPATH, using = "//input[@type='text']")
	public WebElementFacade inpAssignProjSearch; 

	@FindBy(how = How.XPATH, using = "//input[@type='text']//following::input[@type='checkbox']//parent::span")
	public WebElementFacade chkAssignProj; 

	@FindBy(how = How.XPATH, using = "//span[text()='Save']")
	public WebElementFacade btnSaveProj; 

	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'DelDOT TESTING 01']")
	public WebElementFacade txtProjHeading; 
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'DelDOT TESTING 01')]//preceding::input[@type='checkbox'][1]//parent::span")
	public WebElementFacade chkAssignedProj; 
	
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
	public WebElementFacade chkShowArchived; 
	
	@FindBy(how = How.XPATH, using = "//*[text()='DelDOT TESTING 01']/following::span[text()='Under Construction'][1]")
	public WebElementFacade btnUnderConstruction; 
	
	@FindBy(how = How.XPATH, using = "//*[text()='Archived']")
	public WebElementFacade optArchived;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Select Status']//following::*[text()='Under Construction']")
	public WebElementFacade optUnderConstruction;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Update']")
	public WebElementFacade btnpdate;
	
	@FindBy(how = How.XPATH, using = "//*[@id='selectStatus']")
	public WebElementFacade txtselectStatus;
	
	@FindBy(how = How.XPATH, using = "//*[text()='Archived']")
	public WebElementFacade btnArchived;
	
	/*Validate assigned Projects*/

	public boolean validateAssignProjects(String projectName) throws InterruptedException{ 
		try {
			String projtName = projectName.trim();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnAssignProj).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),inpAssignProjSearch).clear();
			elementUtils.fluentWaitForElement(getDriver(),inpAssignProjSearch).sendKeys(projtName);
			Thread.sleep(500);
			Actions action = new Actions(getDriver());
			action.sendKeys(chkAssignedProj).perform();
//			elementUtils.fluentWaitForElement(getDriver(),chkAssignedProj).click();
			elementUtils.fluentWaitForElement(getDriver(),btnSaveProj).click();
			if (getDriver().findElements(By.xpath("//h3[contains(text(),'DelDOT TESTING 01')]")).size() > 0){
			return true;
			}
			else {
				elementUtils.fluentWaitForElement(getDriver(),btnAssignProj).click();
				getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				elementUtils.fluentWaitForElement(getDriver(),inpAssignProjSearch).clear();
				elementUtils.fluentWaitForElement(getDriver(),inpAssignProjSearch).sendKeys(projtName);
				Thread.sleep(500);
				elementUtils.fluentWaitForElement(getDriver(),chkAssignedProj).click();
				elementUtils.fluentWaitForElement(getDriver(),btnSaveProj).click();
				if (getDriver().findElements(By.xpath("//h3[contains(text(),'DelDOT TESTING 01')]")).size() > 0){
					return true;
				}
				return false;
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
		return false;
	}
	
	/*Archive Projects*/

	public boolean validateArchiveProjects(String projectName) throws InterruptedException{ 
		try {
			String projtName = projectName.trim();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnUnderConstruction).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),txtselectStatus).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),optArchived).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			elementUtils.fluentWaitForElement(getDriver(),btnpdate).click();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(2500);
			elementUtils.fluentWaitForElement(getDriver(),chkShowArchived).click();
			if (elementUtils.fluentWaitForElement(getDriver(),txtProjHeading).getText() == projtName){
				getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				elementUtils.fluentWaitForElement(getDriver(),btnArchived).click();
				getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				elementUtils.fluentWaitForElement(getDriver(),optUnderConstruction).click();
				getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				elementUtils.fluentWaitForElement(getDriver(),btnpdate).click();
				getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				elementUtils.fluentWaitForElement(getDriver(),chkShowArchived).click();	
				getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				elementUtils.fluentWaitForElement(getDriver(),txtProjHeading).isDisplayed();	
				return true;
			}
			else {
				return false;		 
				}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
		return false;
	}

}

