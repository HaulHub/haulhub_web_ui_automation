package net.haulhub.showcase.cucumber.pages;

import net.haulhub.showcase.cucumber.utils.ElementUtils;
import net.haulhub.showcase.cucumber.utils.LearningPlatformConstants;
import net.haulhub.showcase.cucumber.utils.ProjectUtils;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CustomersPage extends PageObject {

	public CustomersPage(WebDriver driver) {
		super(driver);
	}

	public ElementUtils elementUtils = new ElementUtils(getDriver());

	@FindBy(how = How.XPATH, using = "//a[.='Customers']")
	public WebElementFacade customerslnk;
	
	@FindBy(how = How.XPATH, using = "//a[.='Profiles']")
	public WebElementFacade profileslnk;
	
	@FindBy(how = How.XPATH, using = "//span[@class='fa fa-plus']")
	public WebElementFacade newcustomerlnk;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Customer Name']")
	public WebElementFacade customernametxt;
	
	@FindBy(how = How.XPATH, using = "//button[.='Save']")
	public WebElementFacade customersavebtn;


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
			  //div[contains(text(),'Automation Customername66759')]
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
				    	action1.moveToElement(deletequipmentbtn).click().build().perform();
				    	Thread.sleep(500);
				    	elementUtils.fluentWaitForElement(getDriver(),deletequipmentbtn).isDisplayed();
				    	Actions action = new Actions(getDriver());
				    	action.moveToElement(deletequipmentbtn).click().build().perform();
				    	return true;
					 } catch (NoSuchElementException e) {
					   e.printStackTrace();
					} catch (Exception e) {
						e.printStackTrace();
					}
					return false;
				 }
	   

 }			  