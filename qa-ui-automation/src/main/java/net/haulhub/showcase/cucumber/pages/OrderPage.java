package net.haulhub.showcase.cucumber.pages;

import net.haulhub.showcase.cucumber.utils.ElementUtils;
import net.haulhub.showcase.cucumber.utils.LearningPlatformConstants;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;


public class OrderPage extends PageObject {

	public OrderPage(WebDriver driver) {
		super(driver);
	}

	public ElementUtils elementUtils = new ElementUtils(getDriver());

	@FindBy(how = How.XPATH, using = "//button[.='Materials Only']")
	public WebElementFacade MaterialOrderOnlybtn;
	
	@FindBy(how = How.XPATH, using = "//h3[.='New Material Order']")
	public WebElementFacade BookNewMaterialOrderLbl;
	
	//@FindBy(how = How.XPATH, using ="//div[@class='Select-input']//input[@id='customer_id']")
	//public WebElementFacade Customerid;
	//input[@placeholder='Select or Create...']
	
	@FindBy(how = How.XPATH, using ="//input[@placeholder='Select or Create...']")
	public WebElementFacade Customerid;
	
	@FindBy(how = How.XPATH, using = "//div[@class='Select-input']//input[@id='from_job_site_id']")
	public WebElementFacade StartingLocationid;
	
	@FindBy(how = How.XPATH, using = "//div[@class='rdt']//input[@type='text']")
	public WebElementFacade LoadTimeDrd;
	
	@FindBy(how = How.XPATH, using = "//input[@name='date']")
	public WebElementFacade LoadDateTxt;
	
	@FindBy(how = How.XPATH, using = "//button[.='Continue ']")
	public WebElementFacade OrderContinueBtn;
	
	@FindBy(how = How.XPATH, using = "//input[@name='destination']")
	public WebElementFacade OrderDestinationTxt;
	
	@FindBy(how = How.XPATH, using = "//input[@name='address']")
	public WebElementFacade OrderAddressTxt;
	
	@FindBy(how = How.XPATH, using = "//input[@name='contact_phone']")
	public WebElementFacade OrderContactNumberTxt;
	
	@FindBy(how = How.XPATH, using = "//div[@class='Select-input']//input[@id='billing_job_site_id']")
	public WebElementFacade BillingJobSiteDrd;
	
	@FindBy(how = How.XPATH, using = "//div[@class='css-1pcexqc-container contact-name-selector']//input[@type='text']")
	public WebElementFacade JobSiteContact;
	
	@FindBy(how = How.XPATH, using = "//span[.='12 Andover Road, Billerica, MA, USA']")
	public WebElementFacade Addresspick;
	
	@FindBy(how = How.XPATH, using = "//div[@class='css-1pcexqc-container contact-name-selector']")
	public WebElementFacade JobSiteDropdwn;
	
	@FindBy(how = How.XPATH, using = "//input[@id='tonnage']")
	public WebElementFacade Tonnagetxt;
	
	@FindBy(how = How.XPATH, using = "//input[@id='production_rate']")
	public WebElementFacade ProductionRatetxt;
	
	@FindBy(how = How.XPATH, using = "//button[.='Place Order']")
	public WebElementFacade PlaceOrderBtn;
	
	@FindBy(how = How.XPATH, using = "//button[.='Okay']")
	public WebElementFacade OrderOkayBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@class='css-16pqwjk-indicatorContainer']")
	public WebElementFacade MaterialTypeDropdwn;
	
	@FindBy(how = How.XPATH, using = "//div[@class='css-1pcexqc-container material-name-selector']//input[@type='text']")
	public WebElementFacade MaterialNameInput;
	
	@FindBy(how = How.XPATH, using = "//span[.='Summary']")
	public WebElementFacade Summarytab;
	
	@FindBy(how = How.XPATH, using = "//button[.='Cancel']")
	public WebElementFacade CancelRebooklbl;
	
	@FindBy(how = How.XPATH, using = "//button[.='Materials + Trucks']")
	public WebElementFacade MaterialTrucksBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@class='Select-input']")
	public WebElementFacade WorktypeDropdwn;
	
	@FindBy(how = How.XPATH, using = "//input[@id='work_type']")
	public WebElementFacade WorktypeDropinput;
	
	@FindBy(how = How.XPATH, using = "//label[.='Triaxle']")
	public WebElementFacade Acceptabletrucktypelbl;
	
	@FindBy(how = How.NAME, using = "trucks_sending")
	public WebElementFacade Trucksrequiredtxt;
	
	@FindBy(how = How.CSS, using = "#third_party_billing")
	public WebElementFacade truckbillingpersontxt;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Schedule Trucks')]")
	public WebElementFacade SceduleTrucklbl;
	
	@FindBy(how = How.XPATH, using = "//a[.='Truck Schedule']")
	public WebElementFacade TruckScedulelbl;
	
	@FindBy(how = How.XPATH, using = "//button[.='Confirm']")
	public WebElementFacade TrucksConfirmBtn;
	
	@FindBy(how = How.XPATH, using = "//button[.='Plant Report']")
	public WebElementFacade PlantReportbtn;
	
	@FindBy(how = How.XPATH, using = "//a[.='Order Dashboard']")
	public WebElementFacade OrderBreadcrumblnk;
	
	@FindBy(how = How.XPATH, using = "//button[.='Preview']")
	public WebElementFacade Plantpreviewlnk;
	
	@FindBy(how = How.XPATH, using = "//button[.='Save']")
	public WebElementFacade Plantsavelnk;
	
	@FindBy(how = How.XPATH, using = "//button[.='Continue']")
	public WebElementFacade PlantreportContinuebtn;
	
	@FindBy(how = How.XPATH, using = "//button[.='Send Report']")
	public WebElementFacade PlantSendreportbtn;
	
	@FindBy(how = How.XPATH, using = "//button[.='Cancel']")
	public WebElementFacade cancelbtn;
	
	
	/*
      * This method is used to click Materials only btn
       */
	   public boolean clickMaterialsOnlybtn() {
	    try {
		    elementUtils.fluentWaitForElement(getDriver(), MaterialOrderOnlybtn).waitUntilClickable();
			elementUtils.safeJavaScriptClick(MaterialOrderOnlybtn);
			return true;
		 } catch (NoSuchElementException e) {
		   e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	 }
	   
	   
	   /*
	      * This method is used to click plant report btn after clicking the order breadcrumb link 
	       */
		   public boolean clickplantreportbtn() {
		    try {
		    	Thread.sleep(500);
		    	elementUtils.fluentWaitForElement(getDriver(), OrderBreadcrumblnk).waitUntilClickable();
				elementUtils.safeJavaScriptClick(OrderBreadcrumblnk);
		    	Thread.sleep(500);
			    elementUtils.fluentWaitForElement(getDriver(), PlantReportbtn).waitUntilClickable();
				elementUtils.safeJavaScriptClick(PlantReportbtn);
				return true;
			 } catch (NoSuchElementException e) {
			   e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		 }
	   

		/*
	      * This method is used to gradb the orderid
	       */
		   public boolean graborderid() {
		    try {
		    	getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    WebElement AcceptedOrderidtxt = getDriver().findElement(By.xpath("//div[text()='Accepted']//parent::div//following::div[13]"));
			    getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    String Ordernumber  = AcceptedOrderidtxt.getText();
			    String updatedOrderNumber = "#" + Ordernumber;
			    LearningPlatformConstants.ordernumber.set(updatedOrderNumber);
			    System.out.println("updated ordernumber is" + updatedOrderNumber);
			    return true;
			 } catch (NoSuchElementException e) {
			   e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		 }
	   
	   /*
	      * This method is used to click CancelRebook button
	       */
		   public boolean  clickCanelcelRebookbtn() {
		    try {
			    elementUtils.fluentWaitForElement(getDriver(), CancelRebooklbl).waitUntilClickable();
				elementUtils.safeJavaScriptClick(CancelRebooklbl);
				return true;
			 } catch (NoSuchElementException e) {
			   e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		 }
		   
		   
		  /*
	       * This method is used to click MaterialsTrucks button click
	       */
			public boolean clickMaterialsTrucksbtn() {
			    try {
				    elementUtils.fluentWaitForElement(getDriver(), MaterialTrucksBtn).waitUntilClickable();
					elementUtils.safeJavaScriptClick(MaterialTrucksBtn);
					return true;
				 } catch (NoSuchElementException e) {
				   e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
				return false;
		   }
			
			
    	  /*
	      * This method is used to select Worktype
	      */
		public boolean selectworktype(String worktype) {
				    try {
				          Thread.sleep(1500);
		                  Actions action1 = new Actions(getDriver());
					      action1.moveToElement(WorktypeDropinput).click().build().perform();
					      Thread.sleep(1000);
					      elementUtils.fluentWaitForElement(getDriver(),WorktypeDropinput).typeAndEnter(worktype);
						return true;
					 } catch (NoSuchElementException e) {
					   e.printStackTrace();
					} catch (Exception e) {
						e.printStackTrace();
					}
					return false;
			   }
			
	   
	   /*
	    * This method is used to validate the book material order items are displayed correctly during preload save
	    */
		public boolean validatepresavedbookingdetails(String customername,String startinglocation) {
		 try {
			   Thread.sleep(1000);
			   WebElement customernametxt = getDriver().findElement(By.xpath("//div[@class='Select-multi-value-wrapper']//span[contains(text(),'"+ customername.trim() +"')]"));
			   elementUtils.fluentWaitForElement(getDriver(), customernametxt).isDisplayed();
			   WebElement statringlocationtxt = getDriver().findElement(By.xpath("//div[@class='Select-multi-value-wrapper']//span[contains(text(),'"+ startinglocation.trim() +"')]"));
			   Thread.sleep(500);
			   elementUtils.fluentWaitForElement(getDriver(), statringlocationtxt).isDisplayed();
		       return true;
			 } catch (NoSuchElementException e) {
			   e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;
		}
		

		   /*
		    * This method is used to display validateBookNewMaterialOrder form
		    */
			public boolean validateBookNewMaterialOrder() {
			 try {
				 Thread.sleep(1500);
				 elementUtils.fluentWaitForElement(getDriver(), BookNewMaterialOrderLbl).isDisplayed();
				 
			       return true;
				 } catch (NoSuchElementException e) {
				   e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
				return false;
			}
	
		

		   /*
		    * This method is used to display of the send,preview components in plant Report page
		    */
			public boolean viewcomponents() {
			 try {
				  elementUtils.fluentWaitForElement(getDriver(), Plantsavelnk).isDisplayed();
				  Thread.sleep(500);
				  elementUtils.fluentWaitForElement(getDriver(), Plantpreviewlnk).isDisplayed();
				  Thread.sleep(500);
				  return true;
				 } catch (NoSuchElementException e) {
				   e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
				return false;
			}
			
			 /*
			    * This method is used to select myplant and click send a report to get acknowledged with send plant confirmation message report
			    */
				public boolean selectmyplantclickreportview() {
				 try {
					  String Myplant = "VigneshPlant";
					  Thread.sleep(1000);
					  WebElement Plantnameslectionchkbok = getDriver().findElement(By.xpath("//label[text()='VigneshPlant']//parent::div//input"));
					  Actions actionbtn = new Actions(getDriver());
					  actionbtn .moveToElement(Plantnameslectionchkbok).click().build().perform();
					  Thread.sleep(1000);
					  elementUtils.fluentWaitForElement(getDriver(), PlantreportContinuebtn).isDisplayed();
					  elementUtils.safeJavaScriptClick(PlantreportContinuebtn);
					  Thread.sleep(500);
					  elementUtils.fluentWaitForElement(getDriver(), PlantSendreportbtn).isDisplayed();
					  elementUtils.safeJavaScriptClick(PlantSendreportbtn); 
					  Thread.sleep(500);
					  elementUtils.fluentWaitForElement(getDriver(),OrderOkayBtn).waitUntilClickable();
					  elementUtils.safeJavaScriptClick(OrderOkayBtn);
					  return true;
					 } catch (NoSuchElementException e) {
					   e.printStackTrace();
					} catch (Exception e) {
						e.printStackTrace();
					}
					return false;
				}
		
		/*
		  * This method is used to select the customer name and the Starting Location for material pickup
	   */
		public boolean Filldatestartdetails(String Customername,String StartingLocation) {
			try {
				   Thread.sleep(1000);
		           elementUtils.fluentWaitForElement(getDriver(), Customerid).waitUntilClickable();
		           Actions action = new Actions(getDriver());
		           action.moveToElement(this.Customerid).click().build().perform();
		           Thread.sleep(1000);
		           elementUtils.fluentWaitForElement(getDriver(),Customerid).typeAndEnter(Customername.trim());
		           Thread.sleep(1000);
		           elementUtils.fluentWaitForElement(getDriver(), StartingLocationid).waitUntilVisible();
		           Actions action1 = new Actions(getDriver());
		           action1.moveToElement(this.StartingLocationid).click().build().perform();
		           Thread.sleep(1000);
		           elementUtils.fluentWaitForElement(getDriver(),StartingLocationid).typeAndEnter(StartingLocation);
		           return true;
		        } catch (NoSuchElementException e) {
				   e.printStackTrace();
		    	} catch (Exception e) {
					e.printStackTrace();
		    	}
				return false;
	   }
		
		/*
		  * This method is used to fill the load time and date and continue to DestionationTab
	   */
		public boolean FillContinueDestinationTab() {
			try {
				  Thread.sleep(1000);
		          elementUtils.fluentWaitForElement(getDriver(), LoadTimeDrd).waitUntilVisible();
		          elementUtils.safeJavaScriptClick(LoadTimeDrd);
		          Thread.sleep(1000);
		          Actions action1 = new Actions(getDriver());
		          action1.moveToElement(this.LoadDateTxt).click().build().perform();
		          System.out.println("todays date is" + elementUtils.TodaysDate());
		          elementUtils.fluentWaitForElement(getDriver(),LoadDateTxt).typeAndEnter(elementUtils.TodaysDate());
		          Thread.sleep(1000);
		          elementUtils.fluentWaitForElement(getDriver(),OrderContinueBtn).waitUntilClickable();
		          Thread.sleep(1000);
		          elementUtils.fluentWaitForElement(getDriver(),OrderContinueBtn).click();
		        
		          return true;
		    	 } catch (NoSuchElementException e) {
				   e.printStackTrace();
		    	 } catch (Exception e) {
					e.printStackTrace();
		    	 }
				return false;
		}
		
		
		/*
		  * This method is used to fill the load time and date and Rebooks the order
	   */
		public boolean FillRebookdetails() {
			try {
				  elementUtils.fluentWaitForElement(getDriver(), LoadTimeDrd).waitUntilVisible();
		          elementUtils.safeJavaScriptClick(LoadTimeDrd);
		          
		          Actions action1 = new Actions(getDriver());
		          action1.moveToElement(this.LoadDateTxt).click().build().perform();
		          System.out.println("todays date is" + elementUtils.TodaysDate());
		          elementUtils.fluentWaitForElement(getDriver(),LoadDateTxt).typeAndEnter(elementUtils.TodaysDate());
		          Thread.sleep(1000);
		          
		          elementUtils.fluentWaitForElement(getDriver(),Summarytab).waitUntilClickable();
		          Thread.sleep(1000);
		          elementUtils.fluentWaitForElement(getDriver(),Summarytab).click();
		          
		          Thread.sleep(1000); 
		          elementUtils.fluentWaitForElement(getDriver(),PlaceOrderBtn).waitUntilClickable();
		          elementUtils.fluentWaitForElement(getDriver(),PlaceOrderBtn).click();
		          Thread.sleep(1000); 
		          
		          elementUtils.fluentWaitForElement(getDriver(),OrderOkayBtn).waitUntilClickable();
		          elementUtils.fluentWaitForElement(getDriver(),OrderOkayBtn).click();
		          Thread.sleep(2000);
		        
		          return true;
		    	 } catch (NoSuchElementException e) {
				   e.printStackTrace();
		    	 } catch (Exception e) {
					e.printStackTrace();
		    	 }
				return false;
		}
		
		/*
		  * This method is used to fill different fields with in the Destination tab in Order material form
	   */
		public boolean FillDestinationfieldDetails(String Destination,String Contactnumber,String Address) {
			try {
		          elementUtils.fluentWaitForElement(getDriver(), OrderDestinationTxt).waitUntilVisible();
		          Actions action = new Actions(getDriver());
		          action.moveToElement(this.OrderDestinationTxt).click().build().perform();
		          elementUtils.fluentWaitForElement(getDriver(),OrderDestinationTxt).typeAndEnter(Destination);
		         
		          elementUtils.fluentWaitForElement(getDriver(), BillingJobSiteDrd).waitUntilVisible();
		          Actions action2 = new Actions(getDriver());
		          action2.moveToElement(this.BillingJobSiteDrd).click().build().perform();
		          elementUtils.fluentWaitForElement(getDriver(),BillingJobSiteDrd).typeAndEnter("VigneshPlant");
		         
		          elementUtils.fluentWaitForElement(getDriver(),OrderAddressTxt).waitUntilVisible();
		          elementUtils.fluentWaitForElement(getDriver(),OrderAddressTxt).clear();
		          Thread.sleep(1000);
		          elementUtils.fluentWaitForElement(getDriver(),OrderAddressTxt).typeAndEnter(Address);
		   
		          Thread.sleep(1000);
		         
		          elementUtils.fluentWaitForElement(getDriver(), JobSiteDropdwn).waitUntilClickable();
                  elementUtils.fluentWaitForElement(getDriver(), JobSiteDropdwn).click();
		          Thread.sleep(1000); 
                  elementUtils.fluentWaitForElement(getDriver(), JobSiteContact).waitUntilVisible();
                  
                  Actions action1 = new Actions(getDriver());
			      action1.moveToElement(this.JobSiteContact).click().build().perform();
			      elementUtils.fluentWaitForElement(getDriver(),JobSiteContact).typeAndEnter("Kristen");
			      
		          elementUtils.fluentWaitForElement(getDriver(),OrderContactNumberTxt).waitUntilVisible();
		          elementUtils.fluentWaitForElement(getDriver(),OrderContactNumberTxt).clear();
		          elementUtils.fluentWaitForElement(getDriver(),OrderContactNumberTxt).typeAndEnter(Contactnumber); 
		          elementUtils.fluentWaitForElement(getDriver(),OrderContinueBtn).waitUntilClickable();
		          elementUtils.fluentWaitForElement(getDriver(),OrderContinueBtn).click();
		          return true;
		    	 } catch (NoSuchElementException e) {
				   e.printStackTrace();
		    	} catch (Exception e) {
					e.printStackTrace();
		    	}
				return false;
	   }
				
		
		/*
		  * This method is used to fill different fields with in the MaterialTagField Details and continue to Truckform
	   */
		public boolean fillTruckform(String Tonnage,String ProductionRate) {
			try {
				   
				  Thread.sleep(1500);
			      elementUtils.fluentWaitForElement(getDriver(), MaterialTypeDropdwn).waitUntilClickable();
	              elementUtils.fluentWaitForElement(getDriver(), MaterialTypeDropdwn).click(); 
	              Thread.sleep(1000);
	              
	              elementUtils.fluentWaitForElement(getDriver(), MaterialNameInput).waitUntilVisible();
	              Actions action1 = new Actions(getDriver());
				  action1.moveToElement(this.MaterialNameInput).click().build().perform();
				  getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			      elementUtils.fluentWaitForElement(getDriver(),MaterialNameInput).typeAndEnter("VignesMaterial");
				  Thread.sleep(1000);
				  
				  elementUtils.fluentWaitForElement(getDriver(),Tonnagetxt).waitUntilVisible();
		          Actions action = new Actions(getDriver());
		          action.moveToElement(this.Tonnagetxt).click().build().perform();
		          elementUtils.fluentWaitForElement(getDriver(),Tonnagetxt).typeAndEnter(Tonnage);
		          Thread.sleep(1000); 
				  
				  elementUtils.fluentWaitForElement(getDriver(), ProductionRatetxt).waitUntilVisible();
		          Actions action2 = new Actions(getDriver());
		          action2.moveToElement(this.ProductionRatetxt).click().build().perform(); 
		          elementUtils.fluentWaitForElement(getDriver(),ProductionRatetxt).typeAndEnter(ProductionRate);
		          Thread.sleep(1000); 
			
		          elementUtils.fluentWaitForElement(getDriver(),OrderContinueBtn).waitUntilClickable();
		          elementUtils.fluentWaitForElement(getDriver(),OrderContinueBtn).click();
		          Thread.sleep(1000); 
		        
		          return true;
		    	 } catch (NoSuchElementException e) {
				   e.printStackTrace();
		    	} catch (Exception e) {
					e.printStackTrace();
		    	}
				return false;
	   }
		

		/*
		  * This method is used to fill different fields with in the Truck form in material+trucks form
	   */
		public boolean FillTruckdetails(String trucktypes,String trucksrequired,String truckbillingperson) {
			try {
				
			      elementUtils.fluentWaitForElement(getDriver(), Acceptabletrucktypelbl).waitUntilClickable();
	              elementUtils.fluentWaitForElement(getDriver(), Acceptabletrucktypelbl).click(); 
	              Thread.sleep(1000);
	              
	              elementUtils.fluentWaitForElement(getDriver(), Trucksrequiredtxt).waitUntilVisible();
	              Actions action1 = new Actions(getDriver());
				  action1.moveToElement(this.Trucksrequiredtxt).click().build().perform();
			      elementUtils.fluentWaitForElement(getDriver(),Trucksrequiredtxt).typeAndEnter("10");
				  Thread.sleep(1000);
				  
				  elementUtils.fluentWaitForElement(getDriver(),truckbillingpersontxt).waitUntilVisible();
		          Actions action = new Actions(getDriver());
		          action.moveToElement(this.truckbillingpersontxt).click().build().perform();
		          elementUtils.fluentWaitForElement(getDriver(),truckbillingpersontxt).typeAndEnter(truckbillingperson);
		          Thread.sleep(1000); 
				  
		          elementUtils.fluentWaitForElement(getDriver(),OrderContinueBtn).waitUntilClickable();
		          elementUtils.fluentWaitForElement(getDriver(),OrderContinueBtn).click();
		          Thread.sleep(500); 
		          
		          elementUtils.fluentWaitForElement(getDriver(),OrderContinueBtn).waitUntilClickable();
		          elementUtils.fluentWaitForElement(getDriver(),OrderContinueBtn).click();
		          Thread.sleep(500); 
		          
		          elementUtils.fluentWaitForElement(getDriver(),PlaceOrderBtn).waitUntilClickable();
		          elementUtils.fluentWaitForElement(getDriver(),PlaceOrderBtn).click();
		          Thread.sleep(500);

		          return true;
		    	 } catch (NoSuchElementException e) {
				   e.printStackTrace();
		    	} catch (Exception e) {
					e.printStackTrace();
		    	}
				return false;
	   }
		
	
		/*
		  * This method is used to fill different fields with in the ADD Truck form in Truck Schedule page
	   */
		public boolean filltruckform(String WorkType,String trucktypes,String trucksrequired,String truckbillingperson) {
			try {
				
				  Thread.sleep(1000);
                  Actions action2 = new Actions(getDriver());
			      action2.moveToElement(this.WorktypeDropinput).click().build().perform();
			      elementUtils.fluentWaitForElement(getDriver(),WorktypeDropinput).typeAndEnter(WorkType);
			      Thread.sleep(1000); 
				
			      elementUtils.fluentWaitForElement(getDriver(), Acceptabletrucktypelbl).waitUntilClickable();
	              elementUtils.fluentWaitForElement(getDriver(), Acceptabletrucktypelbl).click(); 
	              Thread.sleep(1000);
	              
	              elementUtils.fluentWaitForElement(getDriver(), Trucksrequiredtxt).waitUntilVisible();
	              Actions action1 = new Actions(getDriver());
				  action1.moveToElement(this.Trucksrequiredtxt).click().build().perform();
			      elementUtils.fluentWaitForElement(getDriver(),Trucksrequiredtxt).typeAndEnter(trucksrequired);
				  Thread.sleep(1000);
				  
				  elementUtils.fluentWaitForElement(getDriver(),truckbillingpersontxt).waitUntilVisible();
		          Actions action = new Actions(getDriver());
		          action.moveToElement(this.truckbillingpersontxt).click().build().perform();
		          elementUtils.fluentWaitForElement(getDriver(),truckbillingpersontxt).typeAndEnter(truckbillingperson);
		          Thread.sleep(1000); 
				  
		          elementUtils.fluentWaitForElement(getDriver(),TrucksConfirmBtn).waitUntilClickable();
		          elementUtils.fluentWaitForElement(getDriver(),TrucksConfirmBtn).click();
		          Thread.sleep(500); 
		          
		          return true;
		    	 } catch (NoSuchElementException e) {
				   e.printStackTrace();
		    	} catch (Exception e) {
					e.printStackTrace();
		    	}
				return false;
	   }
		

		
		
		/*
		  * This method is used to fill different fields with in the Truck form in material+trucks form
	   */
		public boolean viewtrucksceduleorderdetail() {
			try {
				  Thread.sleep(1000);
				  elementUtils.fluentWaitForElement(getDriver(), SceduleTrucklbl).waitUntilClickable();
			      elementUtils.fluentWaitForElement(getDriver(), SceduleTrucklbl).click();
			      Thread.sleep(1000);
			      if (elementUtils.fluentWaitForElement(getDriver(), TruckScedulelbl).isDisplayed());
			        return true;
		    	 } catch (NoSuchElementException e) {
				   e.printStackTrace();
		    	} catch (Exception e) {
					e.printStackTrace();
		    	}
				return false;
	   }
		
		
		/*
		  * This method is used to fill different fields with in the MaterialTagField Details
	   */
		public boolean FillMaterialtagfieldDetails(String Tonnage,String ProductionRate) {
			try {
				
				  Thread.sleep(1500);
			      elementUtils.fluentWaitForElement(getDriver(), MaterialTypeDropdwn).waitUntilClickable();
	              elementUtils.fluentWaitForElement(getDriver(), MaterialTypeDropdwn).click(); 
	              Thread.sleep(1500);
	              
	              elementUtils.fluentWaitForElement(getDriver(), MaterialNameInput).waitUntilVisible();
	              Actions action1 = new Actions(getDriver());
				  action1.moveToElement(this.MaterialNameInput).click().build().perform();
				  Thread.sleep(1500);
				  getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			      elementUtils.fluentWaitForElement(getDriver(),MaterialNameInput).typeAndEnter("VignesMaterial");
				  Thread.sleep(1500);
				  
				  elementUtils.fluentWaitForElement(getDriver(),Tonnagetxt).waitUntilVisible();
		          Actions action = new Actions(getDriver());
		          action.moveToElement(this.Tonnagetxt).click().build().perform();
		          elementUtils.fluentWaitForElement(getDriver(),Tonnagetxt).typeAndEnter(Tonnage);
		          Thread.sleep(1000); 
				  
				  elementUtils.fluentWaitForElement(getDriver(), ProductionRatetxt).waitUntilVisible();
		          Actions action2 = new Actions(getDriver());
		          action2.moveToElement(this.ProductionRatetxt).click().build().perform();
		          Thread.sleep(1000); 
		          elementUtils.fluentWaitForElement(getDriver(),ProductionRatetxt).typeAndEnter(ProductionRate);
		          Thread.sleep(1000); 
			
		          elementUtils.fluentWaitForElement(getDriver(),OrderContinueBtn).waitUntilClickable();
		          elementUtils.fluentWaitForElement(getDriver(),OrderContinueBtn).click();
		          Thread.sleep(1000); 
		          elementUtils.fluentWaitForElement(getDriver(),PlaceOrderBtn).waitUntilClickable();
		          elementUtils.fluentWaitForElement(getDriver(),PlaceOrderBtn).click();
		          Thread.sleep(2000); 
		          
		          elementUtils.fluentWaitForElement(getDriver(),OrderOkayBtn).waitUntilClickable();
		          elementUtils.fluentWaitForElement(getDriver(),OrderOkayBtn).click();
		          Thread.sleep(1000);
		          return true;
		    	 } catch (NoSuchElementException e) {
				   e.printStackTrace();
		    	} catch (Exception e) {
					e.printStackTrace();
		    	}
				return false;
	   }
}

	
	