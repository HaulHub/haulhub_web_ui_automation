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

public class SettingsPage extends PageObject {

	public SettingsPage(WebDriver driver) {
		super(driver);
	}

	public ElementUtils elementUtils = new ElementUtils(getDriver());

	@FindBy(how = How.XPATH, using = "//span[.='Settings']")
	public WebElementFacade settingslnk;
	
	@FindBy(how = How.XPATH, using = "//a[.='Equipment List']")
	public WebElementFacade equipmentListlnk;
	
	@FindBy(how = How.XPATH, using = "//a[.='Material List']")
	public WebElementFacade materialListlnk;
	
	@FindBy(how = How.XPATH, using = "//span[@class='fa fa-plus']")
	public WebElementFacade equipmentaddbtn;
	
	@FindBy(how = How.XPATH, using = "//button[@class='fob-material-type-btn fob-btn fob-btn--primary fob-btn--icon-right']")
	public WebElementFacade materialaddbtn;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Equipment Type']")
	public WebElementFacade equipmenttxt;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Material Name']")
	public WebElementFacade materialtxt;
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn button--black']")
	public WebElementFacade equipmenSubmitbtn;
	
	@FindBy(how = How.XPATH, using = "//button[.='Submit']")
	public WebElementFacade materialSubmitbtn;
	
	@FindBy(how = How.XPATH, using = "//button[.='Confirm']")
	public WebElementFacade equipmenDeleteconfirmbtn;
	
	@FindBy(how = How.XPATH, using = "//button[.='Delete']")
	public WebElementFacade materialDeleteconfirmbtn;
	

	/***
	 * This method is used to click on the equipments list under the Settings parent header
	
	 */
	   public boolean gotoequipmentlistpage() {
	    try {
	    	Thread.sleep(500);
	    	elementUtils.fluentWaitForElement(getDriver(), settingslnk).waitUntilVisible();
	    	Actions action1 = new Actions(getDriver());
	    	action1.moveToElement(this.settingslnk).click().build().perform();
	    	Thread.sleep(500);
	    	Actions action = new Actions(getDriver());
		    elementUtils.fluentWaitForElement(getDriver(), equipmentListlnk).waitUntilVisible();
		    action.moveToElement(this.equipmentListlnk).click().build().perform();
			return true;
		 } catch (NoSuchElementException e) {
		   e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	 }
	   

		/***
		 * This method is used to click on the material list under the Settings parent header
		
		 */
		   public boolean gotomateriallistpage() {
		    try {
		    	Thread.sleep(500);
		    	elementUtils.fluentWaitForElement(getDriver(), settingslnk).waitUntilVisible();
		    	Actions action1 = new Actions(getDriver());
		    	action1.moveToElement(this.settingslnk).click().build().perform();
		    	Thread.sleep(500);
		    	Actions action = new Actions(getDriver());
			    elementUtils.fluentWaitForElement(getDriver(), materialListlnk).waitUntilVisible();
			    action.moveToElement(this.materialListlnk).click().build().perform();
				return true;
			 } catch (NoSuchElementException e) {
			   e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		 }
	   
	   
		/***
		 * This method is used to edit an equipment added successfully
		 */
		   public boolean edit_equipment() {
		    try {
		    	Thread.sleep(500);
		    	String equipmentname = LearningPlatformConstants.equipmentname.get().toString();
				System.out.println("updated ordernumber is" + equipmentname); 
				WebElement Editequipmentbtn = getDriver().findElement(By.xpath("//td[.='" + equipmentname + "']//following::i[@class='fa fa-pencil'][1]"));
	            elementUtils.fluentWaitForElement(getDriver(), Editequipmentbtn).isDisplayed();
		    	Actions action1 = new Actions(getDriver());
		    	action1.moveToElement(Editequipmentbtn).click().build().perform();
		    	Thread.sleep(500);
		    	elementUtils.fluentWaitForElement(getDriver(), equipmenttxt).waitUntilVisible();
				String updatedequipmentname = equipmentname + ProjectUtils.getRandomNumber();
				LearningPlatformConstants.equipmentname.set(updatedequipmentname);
				elementUtils.fluentWaitForElement(getDriver(), equipmenttxt).clear();
			    elementUtils.fluentWaitForElement(getDriver(), equipmenttxt).sendKeys(updatedequipmentname);
			    Thread.sleep(500);
			    elementUtils.fluentWaitForElement(getDriver(), equipmenSubmitbtn).waitUntilPresent();
			    elementUtils.safeJavaScriptClick(equipmenSubmitbtn);
			    WebElement savedupdatedequipmentname = getDriver().findElement(By.xpath("//td[.='" + updatedequipmentname + "']"));
			    if (LearningPlatformConstants.equipmentname.get().toString().equalsIgnoreCase(savedupdatedequipmentname.getText().toString()))
			    	System.out.println("the updated equpment name appeared correctly as" + savedupdatedequipmentname );
				return true;
			 } catch (NoSuchElementException e) {
			   e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		 }
		   
		   /***
			 * This method is used to edit an material that was added successfully
			 */
			   public boolean edit_material() {
			    try {
			    	Thread.sleep(500);
			    	String materialname = LearningPlatformConstants.materialname.get().toString();
					System.out.println("updated materialname is" + materialname); 
					WebElement Editequipmentbtn = getDriver().findElement(By.xpath("//span[.='" + materialname + "']//following::span[@class='fa fa-pencil'][1]"));
		            elementUtils.fluentWaitForElement(getDriver(), Editequipmentbtn).isDisplayed();
			    	Actions action1 = new Actions(getDriver());
			    	action1.moveToElement(Editequipmentbtn).click().build().perform();
			    	Thread.sleep(500);
			    	elementUtils.fluentWaitForElement(getDriver(), materialtxt).waitUntilVisible();
					String updatedmaterialname = materialname + ProjectUtils.getRandomNumber();
					LearningPlatformConstants.materialname.set(updatedmaterialname);
					elementUtils.fluentWaitForElement(getDriver(), materialtxt).clear();
				    elementUtils.fluentWaitForElement(getDriver(), materialtxt).sendKeys(updatedmaterialname);
				    Thread.sleep(500);
				    elementUtils.fluentWaitForElement(getDriver(), materialSubmitbtn).waitUntilPresent();
				    elementUtils.safeJavaScriptClick(materialSubmitbtn);
				    WebElement savedmaterialname = getDriver().findElement(By.xpath("//span[.='" + updatedmaterialname + "']"));
				    if (LearningPlatformConstants.materialname.get().toString().equalsIgnoreCase(savedmaterialname.getText().toString()))
				    	System.out.println("the updated materialtxt name appeared correctly as" + savedmaterialname);
					return true;
				 } catch (NoSuchElementException e) {
				   e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
				return false;
			   }
		   
		   
		   /***
			 * This method is used to delete an updated equipment 
			 */
			   public boolean delete_updated_equipment() {
			    try {
			    	Thread.sleep(500);
			    	String equipmentname = LearningPlatformConstants.equipmentname.get().toString();
					System.out.println("ordernumber to be deleted is" + equipmentname); 
					WebElement deletequipmentbtn = getDriver().findElement(By.xpath("//td[.='" + equipmentname + "']//following::i[@class='fa fa-trash'][1]"));
		            elementUtils.fluentWaitForElement(getDriver(), deletequipmentbtn).isDisplayed();
			    	Actions action1 = new Actions(getDriver());
			    	action1.moveToElement(deletequipmentbtn).click().build().perform();
			    	Thread.sleep(500);
			    	elementUtils.fluentWaitForElement(getDriver(),equipmenDeleteconfirmbtn).isDisplayed();
			    	Actions action = new Actions(getDriver());
			    	action.moveToElement(equipmenDeleteconfirmbtn).click().build().perform();
			    	return true;
				 } catch (NoSuchElementException e) {
				   e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
				return false;
			 }
			  
			   /***
				 * This method is used to delete an updated material
				 */
				   public boolean  delete_updated_material() {
				    try {
				    	Thread.sleep(500);
				    	String materialname = LearningPlatformConstants.materialname.get().toString();
						System.out.println("materialnumberto  be deleted is" + materialname); 
						WebElement deletmaterialnamebtn = getDriver().findElement(By.xpath("//span[.='" + materialname + "']//following::span[@class='fa fa-remove'][1]"));
			            elementUtils.fluentWaitForElement(getDriver(), deletmaterialnamebtn).isDisplayed();
				    	Actions action1 = new Actions(getDriver());
				    	action1.moveToElement(deletmaterialnamebtn).click().build().perform();
				    	Thread.sleep(500);
				    	elementUtils.fluentWaitForElement(getDriver(),materialDeleteconfirmbtn).isDisplayed();
				    	Actions action = new Actions(getDriver());
				    	action.moveToElement(materialDeleteconfirmbtn).click().build().perform();
				    	return true;
					 } catch (NoSuchElementException e) {
					   e.printStackTrace();
					} catch (Exception e) {
						e.printStackTrace();
					}
					return false;
				 }
		
	   /***
		 * This method is used to add an material to the material list and validate the material is appearing successfully
		 */
		   public boolean  materialadddedsuccessfuly() {
		    try {
		    	Thread.sleep(500);
		    	elementUtils.fluentWaitForElement(getDriver(), materialaddbtn).waitUntilVisible();
		    	Actions action1 = new Actions(getDriver());
		    	action1.moveToElement(this.materialaddbtn).click().build().perform();
				Thread.sleep(500);
				elementUtils.fluentWaitForElement(getDriver(), materialtxt).waitUntilVisible();
				String materialname = "AutomationMaterial" + ProjectUtils.getRandomNumber();
				LearningPlatformConstants.materialname.set(materialname);
			    elementUtils.fluentWaitForElement(getDriver(), materialtxt).sendKeys(materialname);
			    Thread.sleep(500);
			    elementUtils.fluentWaitForElement(getDriver(), materialSubmitbtn).waitUntilPresent();
			    elementUtils.safeJavaScriptClick(materialSubmitbtn);
			    WebElement savedmaterialname = getDriver().findElement(By.xpath("//span[.='" + materialname + "']"));
			    if (LearningPlatformConstants.materialname.get().toString().equalsIgnoreCase(savedmaterialname.getText().toString()))
			    	System.out.println("the savedmaterialname name appeared correctly as" + savedmaterialname);
				return true;
			 } catch (NoSuchElementException e) {
			   e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		  }
		   
		   
		   /***
			 * This method is used to add an equipment to the equpiment list and validate the epuipment is appearing successfully
			 */
			   public boolean  equipmentadddedsuccessfuly() {
			    try {
			    	Thread.sleep(500);
			    	elementUtils.fluentWaitForElement(getDriver(), equipmentaddbtn).waitUntilVisible();
			    	Actions action1 = new Actions(getDriver());
			    	action1.moveToElement(this.equipmentaddbtn).click().build().perform();
					Thread.sleep(500);
					elementUtils.fluentWaitForElement(getDriver(), equipmenttxt).waitUntilVisible();
					String equipmentname = "AutomationEquipment" + ProjectUtils.getRandomNumber();
					LearningPlatformConstants.equipmentname.set(equipmentname);
				    elementUtils.fluentWaitForElement(getDriver(), equipmenttxt).sendKeys(equipmentname);
				    Thread.sleep(500);
				    elementUtils.fluentWaitForElement(getDriver(), equipmenSubmitbtn).waitUntilPresent();
				    elementUtils.safeJavaScriptClick(equipmenSubmitbtn);
				    WebElement savedequipmentname = getDriver().findElement(By.xpath("//td[.='" + equipmentname + "']"));
				    if (LearningPlatformConstants.equipmentname.get().toString().equalsIgnoreCase(savedequipmentname.getText().toString()))
				    	System.out.println("the equpment name appeared correctly as" + savedequipmentname);
					return true;
				 } catch (NoSuchElementException e) {
				   e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
				return false;
			  }
 }			  