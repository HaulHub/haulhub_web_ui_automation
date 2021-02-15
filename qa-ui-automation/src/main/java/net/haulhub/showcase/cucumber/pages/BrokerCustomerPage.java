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
public class BrokerCustomerPage extends PageObject {
	
	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	public BrokerCustomerPage(WebDriver driver) {
		super(driver);
	}

	MouseUtils mouseUtils = new MouseUtils(getDriver());
	public ElementUtils elementUtils = new ElementUtils(getDriver());
	public PaginationUtils paginationUtils = new PaginationUtils(getDriver());
	public ProjectUtils projectUtils = new ProjectUtils();

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Customers')]")
	public WebElementFacade brokercustomerslnk;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Customer')]")
	public WebElementFacade brokerAddcustomersbtn;

	@FindBy(how = How.XPATH, using = "//input[@name='placeholder_customer[name]']")
	public WebElementFacade brokercustomertxt;
	
	@FindBy(how = How.XPATH, using = "//input[@name='placeholder_customer[address]']")
	public WebElementFacade brokercustomeraddresstxt;
	
	@FindBy(how = How.XPATH, using = "//div[@id='company-part']//div[5]//button[contains(text(),'Next Step')]")
	public WebElementFacade brokercustomernextstepbtn;
	
	@FindBy(how = How.XPATH, using = "//input[@name='placeholder_customer[contact_name]']")
	public WebElementFacade brokercustomercontactnametxt;
	
	@FindBy(how = How.XPATH, using = "//input[@name='placeholder_customer[contact_phone]']")
	public WebElementFacade brokercustomercontactphonenumbertxt;
	
	@FindBy(how = How.XPATH, using = "//form[@id='customer-form']//div[2]//button[contains(text(),'Next Step')]")
	public WebElementFacade brokercustomerprimarycontactnextstep;
	
	@FindBy(how = How.XPATH, using = "//form[@id='customer-form']//button[@data-action='customer-form#validatePrimaryContactAndGoToNextTab']")
	public WebElementFacade brokercustomerprimaryeditnextstep;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Select Truck Types')]")
	public WebElementFacade brokercustomertrucktype;
	
	@FindBy(how = How.XPATH, using = "//li//span[.='Triaxle']")
	public WebElementFacade brokercustomertruckselection;
	
	@FindBy(how = How.XPATH, using = "//div[@class='action-button']//button[.='Add Customer']")
	public WebElementFacade brokercustomerAddCustomer;

	@FindBy(how = How.XPATH, using = "//input[@class='form-control price-per-hour-field validate-numeric-field']")
	public WebElementFacade brokercustomerinput;
	
	@FindBy(how = How.XPATH, using = "//h5[.='Add Managed Customer']")
	public WebElementFacade mangecustomerlbl;
	
	@FindBy(how = How.XPATH, using = "//a[.='Job Sites']")
	public WebElementFacade brokercustomersJobsitelnk;
	
	@FindBy(how = How.XPATH, using = "//button[.='New Job Site']")
	public WebElementFacade NewJobJobsitebtn;
	
	@FindBy(how = How.XPATH, using = "//input[@id='job_site_name']")
	public WebElementFacade NewJobJobsitenametxt;
	
	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	public WebElementFacade brokercustomersaddresstxt;
	
	@FindBy(how = How.XPATH, using = "//input[@id='contact_name']")
	public WebElementFacade brokercustomeronsitecontacttxt;
	
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	public WebElementFacade jobsitecontactnumbertxt;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save Changes')]")
	public WebElementFacade jobsitesavechangesbtn;
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-pencil']")
	public WebElementFacade Jobsiteeditlnk;
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-secondary']")
	public WebElementFacade Jobsitecancelbtn;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'New Material')]")
	public WebElementFacade brokercustomersnewmaterialbtn;
	
	@FindBy(how = How.XPATH, using = "//input[@id='material_name']")
	public WebElementFacade brokercustomersmaterialinput;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save Changes')]")
	public WebElementFacade brokercustomersmaterialsavechangesbtn;

	@FindBy(how = How.XPATH, using = "//a[.='Materials']")
	public WebElementFacade brokercustomersmaterialnk;
	
	@FindBy(how = How.XPATH, using = "//a[.='Jobs']")
	public WebElementFacade brokercustomersjobslnk;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Book New Job')]")
	public WebElementFacade Jobsbooknewbtn;
	
	@FindBy(how = How.XPATH, using = "//h4[.='Booking Preview']")
	public WebElementFacade Jobsbookpreviewlbl;
	
	@FindBy(how = How.XPATH, using = "//select[@name='limit']")
	public WebElementFacade Materialpagination;
	
	@FindBy(how = How.XPATH, using = "//select[@name='limit']//option[.='100']")
	public WebElementFacade Materialpaginationchange;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Edit Profile')]")
	public WebElementFacade BrokerEditProfilebtn;
	
	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Add Managed Customer')]")
	public WebElementFacade BrokerEditProfileheaderlbl;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save Changes')]")
	public WebElementFacade brokercustomerSavechanges;


	/**
     * This method is used to create a customer via the Broker Customer creation Work flows and check the ability to view the created profile
     */
	public boolean enter_brokercustomerdetails() {
	try {
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),brokercustomerslnk).waitUntilClickable();
		    elementUtils.fluentWaitForElement(getDriver(),brokercustomerslnk).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),brokerAddcustomersbtn).waitUntilClickable();
		    elementUtils.fluentWaitForElement(getDriver(),brokerAddcustomersbtn).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    String brokercustomername = "brokercustomer" + ProjectUtils.getRandomNumber();
			LearningPlatformConstants.brokercustomername.set(brokercustomername);
		    elementUtils.fluentWaitForElement(getDriver(), brokercustomertxt).sendKeys(brokercustomername);
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), brokercustomeraddresstxt).sendKeys("12 Andover Road, Billerica, MA, USA");
		    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), brokercustomernextstepbtn).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), brokercustomercontactnametxt).sendKeys("kristen");
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), brokercustomercontactphonenumbertxt).sendKeys("6172457654");
		    Thread.sleep(500);
		    elementUtils.fluentWaitForElement(getDriver(), brokercustomerprimarycontactnextstep).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), brokercustomertrucktype).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), brokercustomertruckselection).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), mangecustomerlbl).click();
		    elementUtils.fluentWaitForElement(getDriver(), brokercustomerAddCustomer).click();
            getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), brokercustomerinput).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    Thread.sleep(500);
		    elementUtils.fluentWaitForElement(getDriver(), brokercustomerinput).sendKeys("40");
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), brokercustomerAddCustomer).click();
		    getDriver().manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		    List<WebElement> listofItems= getDriver().findElements(By.xpath("//tr[@class='clickable-link customer-link']"));
			 for (int i=1; i<listofItems.size()-1; i++)
			  {
				  Actions action = new Actions(getDriver());
				  getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                  action.moveToElement(listofItems.get(i)).click().build().perform();
                  Thread.sleep(500);
                  System.out.println("the size of the list is" + listofItems.size());
                  System.out.println("the item number is" + listofItems.get(i).toString()); 
                  break;
              }
		     return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/**
     * This method is used to validate the brokeredit profile is editable
     */
	public boolean  update_brokercustomerdetails() {
	try {
		   getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   elementUtils.fluentWaitForElement(getDriver(), BrokerEditProfilebtn).isDisplayed();
		   elementUtils.fluentWaitForElement(getDriver(), BrokerEditProfilebtn).waitUntilClickable();
		   return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	
	/**
     * This method is used to create a new Jobsite
     */
	public boolean create_Jobsite() {
	try {
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),brokercustomersJobsitelnk).waitUntilClickable();
		    elementUtils.fluentWaitForElement(getDriver(),brokercustomersJobsitelnk).click();
		    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),NewJobJobsitebtn).waitUntilClickable();
		    elementUtils.fluentWaitForElement(getDriver(),NewJobJobsitebtn).click();
		    getDriver().manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),NewJobJobsitenametxt).waitUntilClickable();
		    elementUtils.fluentWaitForElement(getDriver(),NewJobJobsitenametxt).click();
		    Thread.sleep(1000);
		    String brokerjobsitename = "Brokerjobsitename" + ProjectUtils.getRandomNumber();
			LearningPlatformConstants.brokerjobsitename.set(brokerjobsitename);
		    elementUtils.fluentWaitForElement(getDriver(), NewJobJobsitenametxt).sendKeys(brokerjobsitename);
		    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),brokercustomersaddresstxt).waitUntilClickable();
		    getDriver().manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		    Actions action3 = new Actions(getDriver());
	    	action3.moveToElement(this.brokercustomersaddresstxt).click().build().perform();
			Thread.sleep(800);
		    elementUtils.fluentWaitForElement(getDriver(), brokercustomersaddresstxt).type("12 Andover Road, Billerica, MA, USA");
		    Thread.sleep(800);
		    elementUtils.fluentWaitForElement(getDriver(),brokercustomersaddresstxt).sendKeys(Keys.COMMAND.DOWN.ENTER);
		    getDriver().manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),brokercustomersaddresstxt).sendKeys(Keys.DOWN);
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),brokercustomersaddresstxt).sendKeys(Keys.ENTER);
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),brokercustomeronsitecontacttxt).waitUntilClickable();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),brokercustomeronsitecontacttxt).sendKeys("Kristen");
		    getDriver().manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),jobsitecontactnumbertxt).waitUntilClickable();
		    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),jobsitecontactnumbertxt).sendKeys("8562344561");
		    getDriver().manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),jobsitesavechangesbtn).waitUntilClickable();
		    elementUtils.safeJavaScriptClick(jobsitesavechangesbtn);
		    getDriver().manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		    WebElement brokerjobsitenameupdated = getDriver().findElement(By.xpath("//td[.='" + brokerjobsitename + "']"));
		    if (LearningPlatformConstants.brokerjobsitename.get().toString().equalsIgnoreCase(brokerjobsitenameupdated.getText().toString()))
		    	System.out.println("the updated brokercustomer name appeared correctly as" + brokerjobsitenameupdated);
		        return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/**
     * This method is used to view the edit jobsite view modal
     */
	public boolean edit_Jobsite() {
	try {
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),Jobsiteeditlnk).waitUntilClickable();
		    elementUtils.fluentWaitForElement(getDriver(),Jobsiteeditlnk).isDisplayed();
		    return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

		/**
	     * This method is used to create a new Material within the brokercustomer view 
	     */
		public boolean create_Material() {
		try {
			    elementUtils.fluentWaitForElement(getDriver(),brokercustomersmaterialnk).waitUntilClickable();
		        elementUtils.fluentWaitForElement(getDriver(),brokercustomersmaterialnk).click();
			    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),brokercustomersnewmaterialbtn).waitUntilClickable();
			    elementUtils.fluentWaitForElement(getDriver(),brokercustomersnewmaterialbtn).click();
			    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    String brokermaterialname = "Brokermaterialname" + ProjectUtils.getRandomNumber();
				LearningPlatformConstants.brokermaterialname.set(brokermaterialname);
			    elementUtils.fluentWaitForElement(getDriver(),brokercustomersmaterialinput).waitUntilClickable();
			    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),brokercustomersmaterialinput).sendKeys(brokermaterialname);
			    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),brokercustomersmaterialsavechangesbtn).waitUntilClickable();
			    elementUtils.safeJavaScriptClick(brokercustomersmaterialsavechangesbtn);
			    WebElement brokermaterialnameupdated = getDriver().findElement(By.xpath("//td[.='" + brokermaterialname + "']"));
			    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    if (LearningPlatformConstants.brokermaterialname.get().toString().equalsIgnoreCase(brokermaterialnameupdated.getText().toString()))
			    	System.out.println("the updated brokercustomer name appeared correctly as" + brokermaterialnameupdated);
			        return true;
			} catch (NoSuchElementException e) {
			e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
		

		/**
	     * This method is used to check the Book new job appearence within the Job link
	     */
		public boolean joblinkbooknewjob() {
		try {
			    elementUtils.fluentWaitForElement(getDriver(),brokercustomersjobslnk).waitUntilClickable();
	            elementUtils.fluentWaitForElement(getDriver(),brokercustomersjobslnk).click();
		        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),Jobsbooknewbtn).waitUntilClickable();
			    elementUtils.fluentWaitForElement(getDriver(),Jobsbooknewbtn).click();
			    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),Jobsbookpreviewlbl).isDisplayed();
			    return true;
			} catch (NoSuchElementException e) {
			e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
		
	
	
 
}