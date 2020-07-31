package net.haulhub.showcase.cucumber.steps.serenity;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import net.haulhub.showcase.cucumber.pages.OrderPage;
import net.haulhub.showcase.cucumber.utils.LearningPlatformConstants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class SerenityOrderSteps extends ScenarioSteps {

	 public OrderPage orderpage;
  
    @Step
	public boolean clickMaterialsonlybtn() throws Exception  {
		return orderpage.clickMaterialsOnlybtn();
	 }
    
    @Step
  	public boolean clickplantreportbtn() throws Exception  {
  		return orderpage.clickplantreportbtn();
  	 }
    
    @Step
  	public boolean viewcomponents() throws Exception  {
  		return orderpage.viewcomponents();
  	 }
    
    @Step
  	public boolean selectmyplantclickreportview() throws Exception  {
  		return orderpage.selectmyplantclickreportview();
  	 }
   
    
    @Step
	public boolean  grabacceptedorderid() throws Exception  {
		return orderpage.graborderid();
	 }
    
    @Step
	public boolean BookNewMaterialOrder_display()  throws Exception {
		return orderpage.validateBookNewMaterialOrder();
	 }
    
    @Step
	public boolean see_presaved_bookingdetails(String customername,String startinglocation)  throws Exception {
		return orderpage.validatepresavedbookingdetails(customername,startinglocation);
	 }
    
    @Step
	public boolean Filldatestartdetails(String CustomerName, String StartingLocation) throws Exception  {
		return orderpage.Filldatestartdetails(CustomerName,StartingLocation);
	 }
    
    @Step
	public boolean FillAndContinueDestinationTab() throws Exception  {
		return orderpage.FillContinueDestinationTab();
    }
    
    @Step
	public boolean FillDestinationTabDetails(String destination,String contactnumber,String address) throws Exception  {
		return orderpage.FillDestinationfieldDetails(destination,contactnumber,address);
    }
    
    @Step
   	public boolean FilltheRebookdetails() throws Exception  {
   		return orderpage.FillRebookdetails();
       }
    
    @Step
	public boolean FillMaterialtagfieldDetails(String Tonnage,String ProductionRate) throws Exception  {
		return orderpage.FillMaterialtagfieldDetails(Tonnage,ProductionRate);
    }
    
    @Step
  	public boolean FillTruckform(String Tonnage,String ProductionRate) throws Exception  {
  		return orderpage.fillTruckform(Tonnage,ProductionRate);
      }
    
    @Step
  	public boolean truckdetail(String trucktypes,String trucksrequired,String truckbillingperson) throws Exception  {
  		return orderpage.FillTruckdetails(trucktypes,trucksrequired,truckbillingperson);
      }
    
    @Step
  	public boolean fill_truckform(String WorkType,String trucktypes,String trucksrequired,String truckbillingperson) throws Exception  {
  		return orderpage.filltruckform(WorkType,trucktypes,trucksrequired,truckbillingperson);
      }
   
    @Step
  	public boolean viewtrucksceduleorderdetail() throws Exception  {
  		return orderpage.viewtrucksceduleorderdetail();
      }
    
    @Step
  	public boolean  Selectworktype(String worktype) throws Exception  {
  		return orderpage.selectworktype(worktype);
      }
 
    
    @Step
   	public boolean clickCancelRebookbtn() throws Exception  {
   		return orderpage.clickCanelcelRebookbtn();
   	 }
    
    @Step
   	public boolean clickMaterialsTrucksbtn() throws Exception  {
   		return orderpage.clickMaterialsTrucksbtn();
   	 }   
     
    
}