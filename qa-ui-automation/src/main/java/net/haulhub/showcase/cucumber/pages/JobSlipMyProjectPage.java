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
public class JobSlipMyProjectPage extends PageObject {

	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	public JobSlipMyProjectPage(WebDriver driver) {
		super(driver);
	}

	public ElementUtils elementUtils = new ElementUtils(getDriver());
	
	@FindBy(how = How.XPATH, using = "//span[text()='My Projects']")
	public WebElementFacade lnkMyProjects; 
	
	@FindBy(how = How.XPATH, using = "//span[text()='Feed']") 
	public WebElementFacade lnkFeeds; 
	
	@FindBy(how = How.XPATH, using = "//span[text()='Project Name']//button[@type='button']")
	public WebElementFacade btnProjectNameFilter; 
	
	@FindBy(how = How.XPATH, using = "//span[text()='Material']//button[@type='button']")
	public WebElementFacade btnMaterialFilter; 
	
	@FindBy(how = How.XPATH, using = "//span[text()='Project Number']//button[@type='button']")
	public WebElementFacade btnProjectNumberFilter; 
	
	@FindBy(how = How.XPATH, using = "//span[text()='Date and time']//button[@type='button']")
	public WebElementFacade btnDateTimeFilter; 
	
	@FindBy(how = How.XPATH, using = "//span[text()='Producer']//button[@type='button']")
	public WebElementFacade btnProducerFilter; 
	
	@FindBy(how = How.XPATH, using = "//span[text()='Truck']//button[@type='button']")
	public WebElementFacade btnTruckFilter; 
	
	@FindBy(how = How.XPATH, using = "//span[text()='Plant']//button[@type='button']")
	public WebElementFacade btnPlantFilter; 
	
	@FindBy(how = How.XPATH, using = "//button[@type='button']//parent :: span[text()='Project Name']")
	public WebElementFacade lblProjectName; 
	
	@FindBy(how = How.XPATH, using = "//span[text()='Apply']")
	public WebElementFacade btnApply; 
	
	@FindBy(how = How.XPATH, using = "//span[text()='Clear']")
	public WebElementFacade btnClear;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search']") 
	public WebElementFacade txtSearch;
	
	@FindBy(how = How.XPATH, using = "//span[text()='SELECT DATE RANGE']//following::button[3]")
	public WebElementFacade btnCalEdit;
	
	@FindBy(how = How.XPATH, using = "//span[text()='SELECT DATE RANGE']//following::input[1]")
	public WebElementFacade btnCalStartDate;
		
	@FindBy(how = How.XPATH, using = "//*[@class='MuiCardContent-root']//span[text()='Project Number']//preceding::strong")
	public WebElementFacade lblGetProjectName;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Quantity by Material Type']//following::div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-3']") 
	public WebElementFacade lblGetProjectMaterial;
	
	@FindBy(how = How.XPATH, using = "//*[@class='MuiCardContent-root']//span[text()='Project Number']//following::strong[1]") 
	public WebElementFacade lblGetProjectNumber;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Supplier']//following::strong[1]") 
	public WebElementFacade lblGetProducer;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Project Start Date']//following::strong[1]") 
	public WebElementFacade lblGetStratDate;
	
	@FindBy(how = How.XPATH, using = "//span[text()='View Project']")
	public WebElementFacade btnViewProject;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Select all']//preceding::input")
	public WebElementFacade chkSelectAll;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Back to My Projects']")
	public WebElementFacade btnBackProject;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Download Selected']")
	public WebElementFacade btnDownloadSelected;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Edit Project']")
	public WebElementFacade btnEditProject;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Download']")
	public WebElementFacade btnDownload;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Cancel']")
	public WebElementFacade btnDownloadCancel;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Save']")
	public WebElementFacade btnEditSave;
	
	@FindBy(how = How.XPATH, using = "//label[text()='Project']//following::input[1]")
	public WebElementFacade txtEditProjName;
	
	@FindBy(how = How.XPATH, using = "//a[text()='My Projects']")
	public WebElementFacade linkMyProjectsBack;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Mark as Delivered']")
	public WebElementFacade btnMarkDelivered;
	
	
	/*Search by project Name in 'My Projects'*/ 
	
	public boolean searchByProjectName(String projectName){
		try {
			String trprojectName = projectName.trim();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),btnProjectNameFilter).click();
			elementUtils.fluentWaitForElement(getDriver(),txtSearch).click();
			elementUtils.fluentWaitForElement(getDriver(),txtSearch).sendKeys(trprojectName);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),btnApply).click();
			Thread.sleep(2000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String pName = elementUtils.fluentWaitForElement(getDriver(),lblGetProjectName).getText();
			elementUtils.fluentWaitForElement(getDriver(),btnProjectNameFilter).click();
			elementUtils.fluentWaitForElement(getDriver(),btnClear).click();
			if (pName.equals(trprojectName)){
				return true;
			}
			else {
				return false;
			}
		}catch (NoSuchElementException | InterruptedException e) {
			e.printStackTrace();
		} 
		return false;
	}
	
	/*Search by project Number in 'My Projects'*/ 
	
	public boolean searchByProjectNumber(String projectNumber){
		try {
			String trprojectNumber = projectNumber.trim();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 		
			elementUtils.fluentWaitForElement(getDriver(),btnProjectNumberFilter).click();
			elementUtils.fluentWaitForElement(getDriver(),txtSearch).clear();
			elementUtils.fluentWaitForElement(getDriver(),txtSearch).sendKeys(trprojectNumber);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),btnApply).click();
			Thread.sleep(2000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String pNum = elementUtils.fluentWaitForElement(getDriver(),lblGetProjectNumber).getText();
			elementUtils.fluentWaitForElement(getDriver(),btnProjectNumberFilter).click();
			elementUtils.fluentWaitForElement(getDriver(),btnClear).click();
			if (pNum.equals(trprojectNumber)){
				return true;
			}
			else {
				return false;
			}
		}catch (NoSuchElementException | InterruptedException e) {
			e.printStackTrace();
		} 
		return false;
	}
	
	/*Search by project Material in 'My Projects'*/ 
	
	public boolean searchByProjectMaterial(String projectMaterial){
		try {
			String trprojectMaterial = projectMaterial.trim();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 		
			elementUtils.fluentWaitForElement(getDriver(),btnMaterialFilter).click();
			elementUtils.fluentWaitForElement(getDriver(),txtSearch).clear();
			elementUtils.fluentWaitForElement(getDriver(),txtSearch).sendKeys(trprojectMaterial);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),btnApply).click();
			Thread.sleep(2000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String pMaterial = elementUtils.fluentWaitForElement(getDriver(),lblGetProjectMaterial).getText();
			elementUtils.fluentWaitForElement(getDriver(),btnMaterialFilter).click();
			elementUtils.fluentWaitForElement(getDriver(),btnClear).click();
			if (pMaterial.equals(trprojectMaterial)){
				return true;
			}
			else {
				return false;
			}
		}catch (NoSuchElementException | InterruptedException e) {
			e.printStackTrace();
		} 
		return false;
	}	
	
	/*Search by supplier in 'My Projects'*/ 
	
	public boolean searchByProducer(String producer){
		try {
			String trproducer = producer.trim();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 		
			elementUtils.fluentWaitForElement(getDriver(),btnProducerFilter).click();
			elementUtils.fluentWaitForElement(getDriver(),txtSearch).clear();
			elementUtils.fluentWaitForElement(getDriver(),txtSearch).sendKeys(trproducer);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),btnApply).click();
			Thread.sleep(2000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String pProducer = elementUtils.fluentWaitForElement(getDriver(),lblGetProducer).getText();
			elementUtils.fluentWaitForElement(getDriver(),btnProducerFilter).click();
			elementUtils.fluentWaitForElement(getDriver(),btnClear).click();
			if (pProducer.equals(trproducer)){
				return true;
			}
			else {
				return false;
			}
		}catch (NoSuchElementException | InterruptedException e) {
			e.printStackTrace();
		} 
		return false;
	}	
	
	/*Search by start date in 'My Projects'*/ 
	
	public boolean searchByProjectStartDate(String startDate){
		try {
			String trstartDate = startDate.trim();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 		
			elementUtils.fluentWaitForElement(getDriver(),btnDateTimeFilter).click();
			Thread.sleep(1000);
			elementUtils.fluentWaitForElement(getDriver(),btnCalEdit).click();
			elementUtils.fluentWaitForElement(getDriver(),btnCalStartDate).sendKeys(trstartDate);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),btnApply).click();
			Thread.sleep(1000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String pstartDate = elementUtils.fluentWaitForElement(getDriver(),lblGetStratDate).getText();
			elementUtils.fluentWaitForElement(getDriver(),btnDateTimeFilter).click();
			elementUtils.fluentWaitForElement(getDriver(),btnCalEdit).click();
			elementUtils.fluentWaitForElement(getDriver(),btnClear).click();
			if (pstartDate.equals(trstartDate)){
				return true;
			}
			else {
				return false;
			}
		}catch (NoSuchElementException | InterruptedException e) {
			e.printStackTrace();
		} 
		return false;
	}			
	
	
	/*Search by Truck number in 'My Projects'*/ 
	
	public boolean searchTruck(String truckNo){
		try {
			String trtruckNo = truckNo.trim();
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 		
			elementUtils.fluentWaitForElement(getDriver(),btnTruckFilter).click();
			elementUtils.fluentWaitForElement(getDriver(),txtSearch).clear();
			elementUtils.fluentWaitForElement(getDriver(),txtSearch).sendKeys(trtruckNo);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			elementUtils.fluentWaitForElement(getDriver(),btnApply).click();
			Thread.sleep(2000);
			getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String ptrtruckNo = elementUtils.fluentWaitForElement(getDriver(),lblGetStratDate).getText();
			elementUtils.fluentWaitForElement(getDriver(),btnTruckFilter).click();
			elementUtils.fluentWaitForElement(getDriver(),btnClear).click();
			if (ptrtruckNo.equals(ptrtruckNo)){
				return true;
			}
			else {
				return false;
			}
		}catch (NoSuchElementException | InterruptedException e) {
			e.printStackTrace();
		} 
		return false;
	}			
	
	
	

}
