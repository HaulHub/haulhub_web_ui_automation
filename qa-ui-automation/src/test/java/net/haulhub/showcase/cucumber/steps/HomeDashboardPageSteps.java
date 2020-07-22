package net.haulhub.showcase.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityHomeDashboardSteps;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityOrderSteps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;

@SuppressWarnings("unused")
public class HomeDashboardPageSteps {

	@Steps
	SerenityHomeDashboardSteps serenityHomeDashboardSteps;
	
    @Given("I click the OrderDashboard link in FOB home page")
     public void click_orderdashboard_link() throws Exception {
     assertTrue(serenityHomeDashboardSteps.clickOrderDashboardlink());
	}
    
    @Given("I click the FOB Materials logo")
    public void click_FOB_Material_logo() throws Exception {
    assertTrue(serenityHomeDashboardSteps.clickFOBMateriallogo());
	}
    
    @Given("I click add a job site button")
    public void click_add_jobsite() throws Exception {
    assertTrue(serenityHomeDashboardSteps.click_add_jobsite());
	}
    
    @Given("I click the Hide Canceled checkbox")
    public void click_Hide_Cancelled_checkbox() throws Exception{
   	assertTrue(serenityHomeDashboardSteps.clickHideCancelledchkbox());
	}
    
    @Given("I see Order Report button in Dashboard page")
    public void see_Order_Report_button() throws Exception{
   	assertTrue(serenityHomeDashboardSteps.checkclickorderreportbtn());
	}
    
    @Given("I see Cancel and Preview and Download links avilable in Order Report window page")
    public void see_Cancel_preview_Downloadlnk() throws Exception{
   	assertTrue(serenityHomeDashboardSteps.checkCancelPreviewDownloadlnks());
   	assertTrue(serenityHomeDashboardSteps.clickCancelOrderreport());
   	}
    
    @And("I enter jobsitename(.*) and onsitecontactname(.*) and phonenumber(.*) and address(.*) details and save the jobsite")
    public void fill_jobsite_details(String jobsitename,String onsitecontactname,String phonenumber,String Address) throws Exception{
   	assertTrue(serenityHomeDashboardSteps.filljobsitedetails(jobsitename,onsitecontactname,phonenumber,Address));
	}
    
    @And("I see the Created Jobsite name appears correctly")
    public void I_see_theCreated_Jobsite() throws Exception{
   	assertTrue(serenityHomeDashboardSteps.validate_jobsite_created());
	}
 
    @Given("I click the New Order button")
    public void click_NewOrder_button() throws Exception{
   	assertTrue(serenityHomeDashboardSteps.clickNewOrderbutton());
	}
   
    @Given("I click GotoToday Link View the OrderDetails and Cancel Order and check order is Cancelled")
    public void click_GotoTodayLink_Viewdetail_Cancel() throws Exception{
   	assertTrue(serenityHomeDashboardSteps.clickGotoTodayLink());
   	assertTrue(serenityHomeDashboardSteps.viewCreatedOrderDetails());
   	assertTrue(serenityHomeDashboardSteps.clickCancelOrderbtn());
	}
    
    @Given("I click GotoToday Link View the OrderDetails and Click Rebook Orderbutton")
    public void click_GotoTodayLink_Rebook_Acceptedorder() throws Exception{
   	assertTrue(serenityHomeDashboardSteps.clickGotoTodayLink());
   	assertTrue(serenityHomeDashboardSteps.viewCreatedOrderDetails());
   	assertTrue(serenityHomeDashboardSteps.clickReBookOrder()); 	
   	
	}
    
    @When("I Reject the Order and check the Total Tons set to Zero")
    public void Reject_Order() throws Exception{
   	assertTrue(serenityHomeDashboardSteps.reject_order());
 	}
    
    @Given("I go to Homedashboard and Cancel the sceduled Order")
    public void cancel_sceduled_order() throws Exception{
    assertTrue(serenityHomeDashboardSteps.clickOrderDashboarlnk());	
   	assertTrue(serenityHomeDashboardSteps.viewCreatedOrderDetails());
   	assertTrue(serenityHomeDashboardSteps.clickCancelOrderbtn());
	}
    
  
  

  }
