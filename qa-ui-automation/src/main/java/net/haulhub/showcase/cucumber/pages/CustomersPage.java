package net.haulhub.showcase.cucumber.pages;

import net.haulhub.showcase.cucumber.utils.ElementUtils;
import net.haulhub.showcase.cucumber.utils.LearningPlatformConstants;
import net.haulhub.showcase.cucumber.utils.ProjectUtils;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CustomersPage extends PageObject {

	public CustomersPage(WebDriver driver) {
		super(driver);
	}

	public ElementUtils elementUtils = new ElementUtils(getDriver());

	@FindBy(how = How.XPATH, using = "//a[.='Customers']")
	public WebElementFacade customerslnk;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'E-Ticket Customers')]")
	public WebElementFacade Eticketcustomerslnk;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Invite E-Ticket Customer')]")
	public WebElementFacade inviteticketcustomerbtn;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='HaulHub Customer']")
	public WebElementFacade haulhubcustomernametxt;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ein']")
	public WebElementFacade EINnumbertxt;

  @FindBy(how = How.XPATH, using = "//input[@id='contact_name']")
	public WebElementFacade firstnametxt;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Last Name']")
	public WebElementFacade lastnametxt;
	
	@FindBy(how = How.XPATH, using = "//a[.='Profiles']")
	public WebElementFacade profileslnk;
	
	@FindBy(how = How.XPATH, using = "//span[@class='fa fa-plus']")
	public WebElementFacade newcustomerlnk;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Customer Name']")
	public WebElementFacade customernametxt;
	
	@FindBy(how = How.XPATH, using = "//button[.='Save']")
	public WebElementFacade customersavebtn;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Remove')]")
	public WebElementFacade removequipmentbtn;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Phone']")
	public WebElementFacade Phonenumbertxt;
	
	@FindBy(how = How.XPATH, using = "//button[.='Invite']")
	public WebElementFacade Invitebtn;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save')]")
	public WebElementFacade eticketcustomersavebtn;

	

	/***
	 * This method is used to click on the equipments list under the Settings parent header
	
	 */
	   public boolean gotomanagecustomerpage() {
	    try {
	    	Thread.sleep(500);
	    	elementUtils.fluentWaitForElement(getDriver(), customerslnk).waitUntilVisible();
	    	Actions action1 = new Actions(getDriver());
	    	action1.moveToElement(customerslnk).click().build().perform();
	    	Thread.sleep(500);
	    	Actions action = new Actions(getDriver());
		    elementUtils.fluentWaitForElement(getDriver(), profileslnk).waitUntilVisible();
		    action.moveToElement(this.profileslnk).click().build().perform();
			return true;
		 } catch (NoSuchElementException e) {
		   e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	 }
	   
	   /***
		 * This method is used to click manage customer e-tickets customers
		
		 */
		   public boolean ETicket_manage_customers() {
		    try {
		    	Thread.sleep(500);
		    	elementUtils.fluentWaitForElement(getDriver(), customerslnk).waitUntilVisible();
		    	Actions action1 = new Actions(getDriver());
		    	action1.moveToElement(customerslnk).click().build().perform();
		    	Thread.sleep(500);
		    	Actions action = new Actions(getDriver());
			    elementUtils.fluentWaitForElement(getDriver(), Eticketcustomerslnk).waitUntilVisible();
			    action.moveToElement(this.Eticketcustomerslnk).click().build().perform();
				return true;
			 } catch (NoSuchElementException e) {
			   e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		 }

		   /***
			 * This method is used to invite ETicketcustomer with new Haulhub Customername
			
			 */
			   public boolean ETicket_typing_new_Haulhubcustomername() {
			    try {
			    	Thread.sleep(500);
			    	elementUtils.fluentWaitForElement(getDriver(), inviteticketcustomerbtn).waitUntilVisible();
			    	Actions action1 = new Actions(getDriver());
			    	action1.moveToElement(inviteticketcustomerbtn).click().build().perform();
			    	Thread.sleep(500);
			    	elementUtils.fluentWaitForElement(getDriver(), haulhubcustomernametxt).waitUntilVisible();
					String customername = "Automation" + ProjectUtils.getRandomNumber();
					LearningPlatformConstants.haulhubcustomername.set(customername);
				    elementUtils.fluentWaitForElement(getDriver(),haulhubcustomernametxt).sendKeys(customername);
				    Thread.sleep(500);
				    elementUtils.fluentWaitForElement(getDriver(), EINnumbertxt).waitUntilVisible();
					String EINnumber =  ProjectUtils.getRandomNumberwith9digits();
				    elementUtils.fluentWaitForElement(getDriver(),EINnumbertxt).sendKeys(EINnumber);
				    Thread.sleep(500);
					String firstname =  ProjectUtils.getRandomNumberwith9digits();
					getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
					List<WebElement> listofItems= getDriver().findElements(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiAutocomplete-input MuiAutocomplete-inputFocused MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense']"));
					   System.out.println("the list size is" + listofItems.size()); 	
					   for (int i=1; i<=listofItems.size()-1; i++)
					    {
						  Actions action = new Actions(getDriver());
						  getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			              action.moveToElement(listofItems.get(2)).click().build().perform();
			              Thread.sleep(500);
			              elementUtils.fluentWaitForElement(getDriver(),listofItems.get(2)).sendKeys(customername);
			              Thread.sleep(500);
	                      elementUtils.fluentWaitForElement(getDriver(),listofItems.get(2)).sendKeys(Keys.ENTER);
	                      getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	                      break ;
					    }  
				    elementUtils.fluentWaitForElement(getDriver(), lastnametxt).waitUntilVisible();
				    elementUtils.fluentWaitForElement(getDriver(),lastnametxt).sendKeys("testlast");
				    Thread.sleep(500);
				    elementUtils.fluentWaitForElement(getDriver(), Phonenumbertxt).waitUntilVisible();
					String Phonenumber =  ProjectUtils.getRandomNumberwith10digits();
				    elementUtils.fluentWaitForElement(getDriver(),Phonenumbertxt).sendKeys(Phonenumber);
				    Thread.sleep(500);
				    elementUtils.fluentWaitForElement(getDriver(), Invitebtn).waitUntilVisible();
				    elementUtils.fluentWaitForElement(getDriver(),Invitebtn).click();
				    return true;
				 } catch (NoSuchElementException e) {
				   e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
				return false;
			 }
	
			   
			   /***
				 * This method is used to Edit the eticketing customer newly invited and created by manager access level customer
				
				 */
				   public boolean edit_Eticket_customer() {
				    try {
				    	Thread.sleep(500);
				    	elementUtils.fluentWaitForElement(getDriver(), inviteticketcustomerbtn).waitUntilVisible();
				    	String newcustomername = LearningPlatformConstants.haulhubcustomername.get().toString();
				    	getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    	WebElement customernamedisplayed = getDriver().findElement(By.xpath("//div[contains(text(),'" + newcustomername + "')]//following::i[@class='fa fa-pencil']"));
				    	  if (customernamedisplayed.isDisplayed()) {
				    		  getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				    		  customernamedisplayed.click();
				    		  getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				    		  eticketcustomersavebtn.click();
				    	       return true;
				    	  }
					 } catch (NoSuchElementException e) {
					   e.printStackTrace();
					} catch (Exception e) {
						e.printStackTrace();
					}
					return false;
				 }
			   
			   
			  

	   
	   /***
		 * This method is used to add a customer profile and check the customer profile added successfully
		 */
		   public boolean validate_newcustomerprofile() {
		    try {
		    	Thread.sleep(500);
		    	elementUtils.fluentWaitForElement(getDriver(), newcustomerlnk).waitUntilVisible();
		    	Actions action1 = new Actions(getDriver());
		    	action1.moveToElement(this.newcustomerlnk).click().build().perform();
				Thread.sleep(500);
				elementUtils.fluentWaitForElement(getDriver(), customernametxt).waitUntilVisible();
				String customername = "Automation" + ProjectUtils.getRandomNumber();
				LearningPlatformConstants.customername.set(customername);
			    elementUtils.fluentWaitForElement(getDriver(), customernametxt).sendKeys(customername);
			    Thread.sleep(500);
			    elementUtils.fluentWaitForElement(getDriver(), customersavebtn).waitUntilPresent();
			    elementUtils.safeJavaScriptClick(customersavebtn);
			    WebElement savedcustomername = getDriver().findElement(By.xpath("//div[contains(text(),'" + customername + "')]"));
			    if (LearningPlatformConstants.customername.get().toString().equalsIgnoreCase(savedcustomername.getText().toString()))
			    	System.out.println("the savedmaterialname name appeared correctly as" + savedcustomername);
				return true;
			 } catch (NoSuchElementException e) {
			   e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		  }

			/***
			 * This method is used to edit an customer profile with a new name 
			 */
			   public boolean  edit_customernamereflected() {
			    try {
			    	Thread.sleep(500);
			    	String customername = LearningPlatformConstants.customername.get().toString();
					System.out.println("updated customername is" + customername); 
					WebElement Editcustomernamebtn = getDriver().findElement(By.xpath("//div[.='" + customername + "']//following::i[@class='fa fa-pencil'][1]"));
		            elementUtils.fluentWaitForElement(getDriver(), Editcustomernamebtn).isDisplayed();
			    	Actions action1 = new Actions(getDriver());
			    	action1.moveToElement(Editcustomernamebtn).click().build().perform();
			    	Thread.sleep(500);
			    	elementUtils.fluentWaitForElement(getDriver(), customernametxt).waitUntilVisible();
					String updatedcustomername = customername + ProjectUtils.getRandomNumber();
					LearningPlatformConstants.customername.set(updatedcustomername);
					elementUtils.fluentWaitForElement(getDriver(), customernametxt).clear();
				    elementUtils.fluentWaitForElement(getDriver(), customernametxt).sendKeys(updatedcustomername);
				    Thread.sleep(500);
				    elementUtils.fluentWaitForElement(getDriver(), customersavebtn).waitUntilPresent();
				    elementUtils.safeJavaScriptClick(customersavebtn);
				    WebElement savedupdatedcustomername = getDriver().findElement(By.xpath("//div[contains(text(),'" + customername + "')]"));
				    if (LearningPlatformConstants.customername.get().toString().equalsIgnoreCase(savedupdatedcustomername.getText().toString()))
				    	System.out.println("the updated customername name appeared correctly as" + savedupdatedcustomername);
					return true;
				 } catch (NoSuchElementException e) {
				   e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
				return false;
			 }
		
			   /***
				 * This method is used to delete a customer name already created
				 */
				   public boolean delete_customernamereflected() {
				    try {
				    	Thread.sleep(500);
				    	String customername = LearningPlatformConstants.customername.get().toString();
						System.out.println("customernameto be deleted is" + customername); 
						WebElement deletequipmentbtn = getDriver().findElement(By.xpath("//div[contains(text(),'" + customername + "')]//following::i[@class='fa fa-trash'][1]"));
			            elementUtils.fluentWaitForElement(getDriver(), deletequipmentbtn).isDisplayed();
				    	Actions action1 = new Actions(getDriver());
				    	getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    	action1.moveToElement(deletequipmentbtn).click().build().perform();
				    	Thread.sleep(500);
				    	Actions action = new Actions(getDriver());
				    	getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				    	action.moveToElement(removequipmentbtn).click().build().perform();
				  
				    	return true;
					 } catch (NoSuchElementException e) {
					   e.printStackTrace();
					} catch (Exception e) {
						e.printStackTrace();
					}
					return false;
				 }
	   

 }			  