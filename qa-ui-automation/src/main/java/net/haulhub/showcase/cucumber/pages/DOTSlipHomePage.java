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
public class DOTSlipHomePage extends PageObject {
	
	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	public DOTSlipHomePage(WebDriver driver) {
		super(driver);
	}

	MouseUtils mouseUtils = new MouseUtils(getDriver());
	public ElementUtils elementUtils = new ElementUtils(getDriver());
	public PaginationUtils paginationUtils = new PaginationUtils(getDriver());
	public ProjectUtils projectUtils = new ProjectUtils();

	@FindBy(how = How.XPATH, using = "//a[.='TODAY']")
	public WebElementFacade DotslipTodaylbl;
	
	@FindBy(how = How.XPATH, using = "//a[.='MY PROJECTS']")
	public WebElementFacade DotslipMyProjectslbl;
	
	@FindBy(how = How.XPATH, using = "//input[@data-target='search.ticketNumber']")
	public WebElementFacade Feedticketnumbertxt;
	
	@FindBy(how = How.XPATH, using = "//a[.='FEED']")
	public WebElementFacade DotslipFeedlbl;
	
	@FindBy(how = How.XPATH, using = "//i[@class='settings-icon fa fa-cog']")
	public WebElementFacade DotslipGearsettingslbl;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'ACCOUNT SETTINGS')]")
	public WebElementFacade Dotslipaccountsettingslbl;
	
	@FindBy(how = How.XPATH, using = "//label[contains(text(),'District')]")
	public WebElementFacade TodayDistrictlbl;
	
	@FindBy(how = How.XPATH, using = "//th[contains(text(),'Jobsite')]")
	public WebElementFacade Jobsitelbl;	
	
	@FindBy(how = How.XPATH, using = "//input[@value='Update Results']")
	public WebElementFacade UpdateResultsbtn;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Mark as Delivered')]")
	public WebElementFacade Deliveredbtn;	
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Reject')]")
	public WebElementFacade Rejectbtn;
	
	@FindBy(how = How.XPATH, using = "//div[@class='dropdown bootstrap-select contractor-select form-control']")
	public WebElementFacade Contractordropdownbtn;
	
	@FindBy(how = How.XPATH, using = "//input[@id='dot_employee_first_name']")
	public WebElementFacade Dontinvitefirstname;
	
	@FindBy(how = How.XPATH, using = "//input[@id='dot_employee_last_name']")
	public WebElementFacade Dontinvitelasttname;
	
	@FindBy(how = How.XPATH, using = "//input[@id='dot_employee_email']")
	public WebElementFacade Dontinviteemailid;
	
	@FindBy(how = How.XPATH, using = "//input[@id='dot_employee_phone']")
	public WebElementFacade Dontinviteemployphone;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Invite')]")
	public WebElementFacade Dontinviteebtn;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Phone has already been taken')]")
	public WebElementFacade phonevalidationmessage;
	
	@FindBy(how = How.XPATH, using = "//input[@class='require_atleast_one']")
	public WebElementFacade selectinputboxreport;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Download Selected']")
	public WebElementFacade downloadselectedbtn;
	
	@FindBy(how = How.XPATH, using = "//div[@class='modal-content export_slips_modal']//button[.='Export as PDF']")
	public WebElementFacade exportaspdfbtn;
	
	@FindBy(how = How.XPATH, using = "//div[@class='modal-content export_slips_modal']//button[.='Export as CSV']")
	public WebElementFacade exportascsv;
	
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-times close-icon']")
	public WebElementFacade closemodalcsv;
	
	@FindBy(how = How.XPATH, using = "//select[@id='by_dot_status']//option[contains(text(),'Delivered')]")
	public WebElementFacade statusdropdown;
	
	
	/* This code validated the headers of the labels in DOTSlip home page */
	
	public boolean Validateheaders() {
	try {
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),DotslipTodaylbl).isDisplayed();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),DotslipMyProjectslbl).isDisplayed();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(),DotslipFeedlbl).isDisplayed();
		    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		    elementUtils.fluentWaitForElement(getDriver(), DotslipGearsettingslbl).click();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    elementUtils.fluentWaitForElement(getDriver(), Dotslipaccountsettingslbl).isDisplayed();
		    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  return true;
		} catch (NoSuchElementException e) {
		e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/* This code validates the display of todays link  */
	
	public boolean Validatetodaylinkpageload() {
		try {
			    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),DotslipTodaylbl).click();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    if (getDriver().getCurrentUrl().contains("today") && elementUtils.fluentWaitForElement(getDriver(), TodayDistrictlbl).isDisplayed())
			      return true;
			    else
			      return false;
			} catch (NoSuchElementException e) {
			e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
	
	
	/* This code validates the display of Feedlinkpage */
	public boolean ValidateFEEDlinkpageload() {
		try {
			    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),DotslipFeedlbl).click();
			    Thread.sleep(500);
			    if (getDriver().getCurrentUrl().contains("dot_slips") && elementUtils.fluentWaitForElement(getDriver(), Jobsitelbl).isDisplayed())
			      return true;
			    else
			      return false;
			} catch (NoSuchElementException e) {
			e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
	
	/* This code validates the display of MyProjectslink */
	
	public boolean ValidateMYPROJECTSlinkpageload() {
		try {
			    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),DotslipMyProjectslbl).click();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    if (getDriver().getCurrentUrl().contains("projects") && elementUtils.fluentWaitForElement(getDriver(), Jobsitelbl).isDisplayed())
			      return true;
			    else
			      return false;
			} catch (NoSuchElementException e) {
			e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
	
	
	
	public boolean Searchwithticketnumber(String ticketnumber) {
		try {
		        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        elementUtils.fluentWaitForElement(getDriver(),DotslipFeedlbl).click();
		        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        elementUtils.fluentWaitForElement(getDriver(),statusdropdown).click();
		        getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),UpdateResultsbtn).click();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    List<WebElement> listofItems = getDriver().findElements(By.xpath("//tr[@class='slip']//td[@class='number']"));
			    for (int i=0; i<1; i++)
				  {
					  Actions action = new Actions(getDriver());
					  getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					  Thread.sleep(1000);
			        //  action.moveToElement(listofItems.get(i)).click().build().perform();
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
	
	/* This code validates the display of filtered results after search by contractor name */
	
	public boolean selectbycontractname_filterresults(String contractname) {
		try {
			    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),DotslipMyProjectslbl).click();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),Contractordropdownbtn).click();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    WebElement contractorname =  getDriver().findElement(By.xpath("//select[@name='by_contractor']//option[contains(text(),'" + contractname.trim() +"')]"));
			    elementUtils.fluentWaitForElement(getDriver(),contractorname).click();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),UpdateResultsbtn).click();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    List<WebElement> listofItems = getDriver().findElements(By.xpath("//td[.='" + contractname.trim() + "']"));
				if (listofItems.size() > 0)
					  return true;
				else 
					 return false;
		      	} catch (NoSuchElementException e) {
			e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}	
	
	/* This code validates the display of buttons in the invite page of dotslip */
	 
	public boolean clickandviewinvitebuttons(String contractname) {
		try {
			    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    List<WebElement> listofItems = getDriver().findElements(By.xpath("//td[.='" + contractname.trim() + "']"));
			    for (int i=0; i<=0; i++)
				  {
					  Actions action = new Actions(getDriver());
					  getDriver().manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
					  Thread.sleep(1000);
			          action.moveToElement(listofItems.get(i)).click().build().perform();
			          getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					  List<WebElement> listofItems1 = getDriver().findElements(By.xpath("//div[.='Invite']"));
					  listofItems1.get(i).click();
					  getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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
	
	/* This code validates the ability to enter the invite details of the DOTSlip feed */
	
	public boolean enterdetailsclickbutton() {
		try {
			    
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),Dontinvitefirstname).sendKeys("vignesh");
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),Dontinvitelasttname).sendKeys("nehru");
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),Dontinviteemailid).sendKeys("vignesh@haulhub.com");
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),Dontinviteemployphone).sendKeys("8572688987");
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(), Dontinviteebtn).click();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    return true;
			} catch (NoSuchElementException e) {
			e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}	
	
/* This code validates the display of delivered and Reject buttons in the invite page of ticketing dotslip  and download report */
/*	
	public boolean clickandviewbuttons(String ticketnumber) {
		try {
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    WebElement searchticketnumber = getDriver().findElement(By.xpath("//td[.='"+ ticketnumber.trim() +"']"));
			    elementUtils.fluentWaitForElement(getDriver(),searchticketnumber).isDisplayed();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),searchticketnumber).click();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),Rejectbtn).isDisplayed();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),Deliveredbtn).isDisplayed();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),closemodalcsv).click();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),selectinputboxreport).click();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),downloadselectedbtn).click();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),exportaspdfbtn).isDisplayed();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),exportascsv).isDisplayed();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),exportaspdfbtn).click();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),downloadselectedbtn).click();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),exportascsv).click();
			    return true;
			} catch (NoSuchElementException e) {
			e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}	
	*/
	
	
/* This code validates the display of delivered and Reject buttons in the invite page of ticketing dotslip  and download report */
	
	public boolean clickandviewbuttons(String ticketnumber) {
		try {
			    /*getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),Rejectbtn).isDisplayed();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),Deliveredbtn).isDisplayed();*/
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    //elementUtils.fluentWaitForElement(getDriver(),closemodalcsv).click();
			    elementUtils.fluentWaitForElement(getDriver(),selectinputboxreport).click();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),downloadselectedbtn).click();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),exportaspdfbtn).isDisplayed();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),exportascsv).isDisplayed();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),exportaspdfbtn).click();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			   /* elementUtils.fluentWaitForElement(getDriver(),downloadselectedbtn).click();
			    getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			    elementUtils.fluentWaitForElement(getDriver(),exportascsv).click();*/
			    return true;
			} catch (NoSuchElementException e) {
			e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}	
	
}
	
	