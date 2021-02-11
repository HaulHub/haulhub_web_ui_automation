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
public class BrokerJobManagementPage extends PageObject {
	
	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	public BrokerJobManagementPage(WebDriver driver) {
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
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Audit Log')]")
	public WebElementFacade check_auditlog;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Truck Report')]")
	public WebElementFacade brokerTruckreportlnk;
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-link ml-1']")
	public WebElementFacade brokerAddReceipientlnk;
	
	@FindBy(how = How.XPATH, using = "//tr[3]//td[6]//button[contains(text(),'Decline')]")
	public WebElementFacade secondbrokerdeclinetruck;
	
	@FindBy(how = How.XPATH, using = "//div[@class='selectize-control driver-select single']//input[@placeholder='Select driver...']")
	public WebElementFacade secondbrokerdriverselectiondropdown;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Send Invites')]")
	public WebElementFacade secondbrokerSendinvitebtn;
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-plus']")
	public WebElementFacade secondbrokerfleetpriorityplubtn;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Book Job')]")
	public WebElementFacade brokerBookJoblnk;
	
	@FindBy(how = How.XPATH, using = "//input[@id='placeholder_customer']")
	public WebElementFacade brokerBookContractortxt;
	
	@FindBy(how = How.XPATH, using = "//input[@id='from_job_site']")
	public WebElementFacade brokerBookstartinglocationtxt;
		
	@FindBy(how = How.XPATH, using = "//input[@id='to_job_site']")
	public WebElementFacade brokerBookDestinationlocationtxt;
	
	@FindBy(how = How.XPATH, using = "//input[@name='from_job_site_address']")
	public WebElementFacade brokerBookaddressnfromtxt;
	
	@FindBy(how = How.XPATH, using = "//input[@name='to_job_site_address']")
	public WebElementFacade brokerBookaddressntotxt;
	
	@FindBy(how = How.XPATH, using = "//input[@id='billing_job_site']")
	public WebElementFacade brokerbillingsitetxt;
	
	@FindBy(how = How.XPATH, using = "//input[@id='contact_name']")
	public WebElementFacade brokercontactnametxt;
	
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	public WebElementFacade brokercontactphonetxt;
	
	@FindBy(how = How.XPATH, using = "//input[@id='job_material_types_']")
	public WebElementFacade brokermaterialtxt;
	
	@FindBy(how = How.XPATH, using = "//input[@name='job[trucks_required]']")
	public WebElementFacade brokertrucksrequiredtxt;
	
	@FindBy(how = How.XPATH, using = "//input[@id='start_time']")
	public WebElementFacade brokertimetxt;
	
	@FindBy(how = How.XPATH, using = "//input[@id='start_date']")
	public WebElementFacade LoaddateDrdtx;
	
	@FindBy(how = How.XPATH, using = "//select[@name='job[work_type]']")
	public WebElementFacade worktypeselectdrp;
	
	@FindBy(how = How.XPATH, using = "//select[@name='job[work_type]']//option[contains(text(),'Rock')]")
	public WebElementFacade worktypeselectdrpvalue;

	@FindBy(how = How.XPATH, using = "//select[@name='job[truck_type_ids][]']//option[.='Triaxle']")
	public WebElementFacade trucktypeselectdrpvalue;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Book Job')]")
	public WebElementFacade bookjobsbtn;
	
	@FindBy(how = How.XPATH, using = "//input[@id='customer_truck_types_3_price_per_hour']")
	public WebElementFacade customertrucktyperate;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save Draft')]")
	public WebElementFacade bookjobdraft;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Accept')]")
	public WebElementFacade draftjobaccept;
		
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Job Board')]")
	public WebElementFacade JobBoardlnk;
	
	@FindBy(how = How.XPATH, using = "//select[@id='customer']")
	public WebElementFacade customertxt;
	
	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Draft')]")
	public WebElementFacade draftstatuslnk;
	
	@FindBy(how = How.XPATH, using = "//input[@name='recipients[]']")
	public WebElementFacade recepientemailidtxt;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Save']")
	public WebElementFacade trucksavebtn;
	
	@FindBy(how = How.XPATH, using = "//input[@name='recipient_emails_[0]']")
	public WebElementFacade truckreceipientemailchxbox;
	
	@FindBy(how = How.XPATH, using = "//button[.='Send']")
	public WebElementFacade truckreportsendbtn;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Truck report sent successfully.')]")
	public WebElementFacade reportsendconfirmmsg;
	
	@FindBy(how = How.XPATH, using = "//input[@name='recipients[]']//following::i[@class='fa fa-times mt-3'][1]")
	public WebElementFacade recepientemailclosebtn;
	
	@FindBy(how = How.XPATH, using = "//span[.=' ×']")
	public WebElementFacade truckcancelbtn;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Audit Log')]")
	public WebElementFacade check_auditlogbtn;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Sent Invites at ')]")
	public WebElementFacade check_auditlogbtndetails;

	/**
     * This method is used to create a new Job via the Job management link and create a job as draft
     */
	public boolean click_jobmanagment_booknewjobasdraft() {
	try {
		   getDriver().manage().window().maximize();
		   getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       elementUtils.fluentWaitForElement(getDriver(),brokerJobmanagementlnk).click();
	       getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       elementUtils.fluentWaitForElement(getDriver(),brokerBookJoblnk).waitUntilClickable();
	       elementUtils.fluentWaitForElement(getDriver(),brokerBookJoblnk).click();
	       getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   String bookjobcontractorname = "bookjobcontractorname" + ProjectUtils.getRandomNumber();
		   LearningPlatformConstants.bookjobcontractorname.set(bookjobcontractorname);
		   getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   elementUtils.fluentWaitForElement(getDriver(), brokerBookContractortxt).sendKeys(bookjobcontractorname);
		   getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   elementUtils.fluentWaitForElement(getDriver(), brokerBookstartinglocationtxt).waitUntilClickable();
		   elementUtils.fluentWaitForElement(getDriver(), brokerBookstartinglocationtxt).sendKeys("Aggregate Ashland");
		   getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   elementUtils.fluentWaitForElement(getDriver(), brokerBookDestinationlocationtxt).waitUntilClickable();
		   elementUtils.fluentWaitForElement(getDriver(), brokerBookDestinationlocationtxt).sendKeys("Aggregate Chelmsford");
		   elementUtils.fluentWaitForElement(getDriver(), brokerbillingsitetxt).isDisplayed();
		   elementUtils.fluentWaitForElement(getDriver(), brokerbillingsitetxt).typeAndEnter("Aggregate Ashland");
		   getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   elementUtils.fluentWaitForElement(getDriver(), brokercontactnametxt).waitUntilClickable();
		   elementUtils.fluentWaitForElement(getDriver(), brokercontactnametxt).sendKeys("Haulhub");
		   getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   elementUtils.fluentWaitForElement(getDriver(), brokercontactphonetxt).waitUntilClickable();
		   elementUtils.fluentWaitForElement(getDriver(), brokercontactphonetxt).sendKeys("8572677876");
		   getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   elementUtils.fluentWaitForElement(getDriver(), brokertrucksrequiredtxt).waitUntilPresent();
		   elementUtils.fluentWaitForElement(getDriver(), brokertrucksrequiredtxt).clear();
		   elementUtils.fluentWaitForElement(getDriver(), brokertrucksrequiredtxt).sendKeys("1");
		   getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   elementUtils.fluentWaitForElement(getDriver(), LoaddateDrdtx).waitUntilVisible();
	       elementUtils.safeJavaScriptClick(LoaddateDrdtx);
	       getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	         Actions action1 = new Actions(getDriver());
	         action1.moveToElement(this.LoaddateDrdtx).click().build().perform();
	         elementUtils.fluentWaitForElement(getDriver(),LoaddateDrdtx).typeAndEnter(elementUtils.TodaysDate());
		   elementUtils.fluentWaitForElement(getDriver(), brokertimetxt).waitUntilClickable();
		   elementUtils.fluentWaitForElement(getDriver(), brokertimetxt).typeAndTab("6:00 AM");
		   getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   elementUtils.fluentWaitForElement(getDriver(), worktypeselectdrpvalue).waitUntilClickable();
		   elementUtils.fluentWaitForElement(getDriver(), worktypeselectdrpvalue).click();
		   getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   elementUtils.fluentWaitForElement(getDriver(), trucktypeselectdrpvalue).waitUntilPresent();
		   elementUtils.fluentWaitForElement(getDriver(), trucktypeselectdrpvalue).click();
		   Thread.sleep(1000);
		   elementUtils.fluentWaitForElement(getDriver(), customertrucktyperate).waitUntilPresent();
		   elementUtils.fluentWaitForElement(getDriver(), customertrucktyperate).sendKeys("40");
		   Thread.sleep(1500);
		   getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		      Actions action = new Actions(getDriver());
	          action.moveToElement(this.brokerBookaddressnfromtxt).click().build().perform();
	          Thread.sleep(1000);
	          elementUtils.fluentWaitForElement(getDriver(), brokerBookaddressnfromtxt).type("129 Concord Rd, Billerica, MA, 01821");
	          Thread.sleep(500);
		    elementUtils.fluentWaitForElement(getDriver(),brokerBookaddressnfromtxt).sendKeys(Keys.COMMAND.DOWN.ENTER);
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),brokerBookaddressnfromtxt).sendKeys(Keys.DOWN);
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),brokerBookaddressnfromtxt).sendKeys(Keys.ENTER);
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		       Actions action2 = new Actions(getDriver());
	           action2.moveToElement(this.brokerBookaddressntotxt).click().build().perform();
	           Thread.sleep(1000);
		       elementUtils.fluentWaitForElement(getDriver(), brokerBookaddressntotxt).type("129 Concord Rd, Billerica, MA, 01821"); 
		       Thread.sleep(500);
		    elementUtils.fluentWaitForElement(getDriver(),brokerBookaddressntotxt).sendKeys(Keys.COMMAND.DOWN.ENTER);
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),brokerBookaddressntotxt).sendKeys(Keys.DOWN);
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),brokerBookaddressntotxt).sendKeys(Keys.ENTER);
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   elementUtils.fluentWaitForElement(getDriver(), bookjobdraft).waitUntilEnabled();
		   Thread.sleep(500);
		   getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		      Actions action4 = new Actions(getDriver());
	          action4.moveToElement(this.bookjobdraft).click().build().perform();
	       Thread.sleep(500);
	          getDriver().manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		      Actions action5 = new Actions(getDriver());
	          action5.moveToElement(this.draftjobaccept).click().build().perform();
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
     * This method is used to create a job that was initially created as a draft
     */
	public boolean click_jobmanagment_booknewjob() {
	try {
		   getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       elementUtils.fluentWaitForElement(getDriver(),brokerJobmanagementlnk).click();
	       getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       elementUtils.fluentWaitForElement(getDriver(),JobBoardlnk).click();
	       getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       String bookjobcontractorname =  LearningPlatformConstants.bookjobcontractorname.get().toString();
	       WebElement bookjobcontractordrpvalue= getDriver().findElement(By.xpath("//select[@id='customer']//option[.='" + bookjobcontractorname + "']"));
	       Thread.sleep(1000);
	       getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       bookjobcontractordrpvalue.click();
	       getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       elementUtils.fluentWaitForElement(getDriver(),draftstatuslnk).waitUntilPresent();
	       elementUtils.fluentWaitForElement(getDriver(),draftstatuslnk).click();
	       getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       elementUtils.fluentWaitForElement(getDriver(), bookjobsbtn).waitUntilEnabled();
	       Thread.sleep(1000);
		   elementUtils.safeJavaScriptClick(bookjobsbtn);
		   return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/**
     * This method is used to click truck report as logged in firstbroker
     */
	public boolean firstbroker_clicktruckreport() {
	try {
	      getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      elementUtils.fluentWaitForElement(getDriver(),brokerJobmanagementlnk).click();
	      elementUtils.fluentWaitForElement(getDriver(),brokerScedulerlnk).waitUntilClickable();
	      getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      elementUtils.fluentWaitForElement(getDriver(),brokerScedulerlnk).click();	
	      getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      elementUtils.fluentWaitForElement(getDriver(),brokerTruckreportlnk).waitUntilClickable();
	      elementUtils.fluentWaitForElement(getDriver(),brokerTruckreportlnk).click();
	      getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      elementUtils.fluentWaitForElement(getDriver(), brokerAddReceipientlnk).waitUntilClickable();
	      elementUtils.fluentWaitForElement(getDriver(), brokerAddReceipientlnk).click();
	      getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      elementUtils.fluentWaitForElement(getDriver(), recepientemailidtxt).isDisplayed();
	      getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      elementUtils.fluentWaitForElement(getDriver(), recepientemailidtxt).sendKeys("vignesh@haulhub.com");
	      getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      elementUtils.fluentWaitForElement(getDriver(), trucksavebtn).waitUntilClickable();
	      getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      elementUtils.fluentWaitForElement(getDriver(), trucksavebtn).click();
	      getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      elementUtils.fluentWaitForElement(getDriver(),truckreceipientemailchxbox).click();
	      elementUtils.fluentWaitForElement(getDriver(), truckreportsendbtn).waitUntilClickable();
	      getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      elementUtils.fluentWaitForElement(getDriver(), truckreportsendbtn).click();
	      getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      elementUtils.fluentWaitForElement(getDriver(), reportsendconfirmmsg).isDisplayed();
	      getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      elementUtils.fluentWaitForElement(getDriver(), recepientemailclosebtn).isDisplayed();
	      getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      elementUtils.fluentWaitForElement(getDriver(), recepientemailclosebtn).click();
	      elementUtils.fluentWaitForElement(getDriver(), trucksavebtn).waitUntilClickable();
	      getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      elementUtils.fluentWaitForElement(getDriver(), trucksavebtn).click();
	      getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      elementUtils.fluentWaitForElement(getDriver(), truckcancelbtn).waitUntilPresent();
	      elementUtils.fluentWaitForElement(getDriver(), truckcancelbtn).click();
	      getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	      
	      return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	} 
	
	/**
     * This method is used to check audit logs
     */
	public boolean check_auditlogs() {
	try {
	      getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      elementUtils.fluentWaitForElement(getDriver(),check_auditlogbtn).waitUntilClickable();
	      elementUtils.fluentWaitForElement(getDriver(),check_auditlogbtn).click();
	      getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	      elementUtils.fluentWaitForElement(getDriver(),check_auditlogbtndetails).isDisplayed();
	     return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	} 
	
}

