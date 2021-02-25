package net.haulhub.showcase.cucumber.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
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

	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Plant 48 - Macon']")
	public WebElementFacade txtProjHeading; 
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Plant 48 - Macon')]//preceding::input[@type='checkbox'][1]//parent::span")
	public WebElementFacade chkAssignedProj; 	
	
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
			elementUtils.fluentWaitForElement(getDriver(),chkAssignedProj).click();
			elementUtils.fluentWaitForElement(getDriver(),btnSaveProj).click();
			if (getDriver().findElements(By.xpath("//h3[contains(text(),'Plant 48 - Macon')]")).size() > 0){
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
				if (getDriver().findElements(By.xpath("//h3[contains(text(),'Plant 48 - Macon')]")).size() > 0){
					return true;
				}
				return false;
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} 
		return false;
	}

}

