package net.haulhub.showcase.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityOrderSteps;
import net.thucydides.core.annotations.Steps;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;

@SuppressWarnings("unused")
public class OrderPageSteps {

	@Steps
	SerenityOrderSteps serenityordersteps;

    @When("I click Materials Only button in the New Order dialog box")
     public void click_Materialsonly_btn() throws Exception{
    	assertTrue(serenityordersteps.clickMaterialsonlybtn());
	}
    
    @When("I click Plant Report button in Dashboard page")
    public void click_plant_report_btn() throws Exception{
   	assertTrue(serenityordersteps.clickplantreportbtn());
	}
    
    @When("I see the Plant Details page with Preview Autosend and Continue links")
    public void Plant_Details_page_with_componets() throws Exception{
   	assertTrue(serenityordersteps.viewcomponents());
	}
    
    @When("I select myplant and click send a report to get acknoledged with send plant confirmation message report")
    public void select_myplant_clickreport_view() throws Exception{
   	assertTrue(serenityordersteps.selectmyplantclickreportview());
	}
  
    @When("I grab the Orderid associated with the newly created offer")
    public void grab_orderid_accepted_offer() throws Exception{
   	assertTrue(serenityordersteps.grabacceptedorderid());
	}
  
    @When("I fill the Truck form details worktype(.*) and Acceptabletrucktypes(.*) and Trucksrequired(.*) and Truckbilling(.*) details")
    public void fill_truckform_details(String worktype,String Acceptabletrucktypes,String Trucksrequired,String Truckbilling) throws Exception{
   	assertTrue(serenityordersteps.fill_truckform( worktype,Acceptabletrucktypes,Trucksrequired,Truckbilling));
	}
  
    @When("I should see Book new Material Order form")
     public void see_BookNewMaterialOrder_display() throws Exception {
    	assertTrue(serenityordersteps.BookNewMaterialOrder_display());
	}
    
    @And("I fill order details for CustomerName(.*) and StartingLocation (.*)")
     public void fill_the_date_start_details(String CustomerName,String StartingLocation) throws Exception{
    	assertTrue(serenityordersteps.Filldatestartdetails(CustomerName,StartingLocation));
	}
    
    @And("I fill Load Today date time and Continue to Destination filling tab")
    public void fill_date_time_Continue_Destinationfilling() throws Exception{
   	assertTrue(serenityordersteps.FillAndContinueDestinationTab());
	}
    
    @And("I fill Destination Tab field destination(.*) and contactnumber(.*) and address(.*) details")
    public void fill_Destination_Tab_field_details(String destination,String contactnumber,String address) throws Exception{
   	assertTrue(serenityordersteps.FillDestinationTabDetails(destination,contactnumber,address));
	}
    
    @And("I fill Material tag field Tonnage(.*) and ProductionRate(.*) details and Place order")
    public void fill_Material_tag_field_details(String Tonnage,String ProductionRate) throws Exception{
   	assertTrue(serenityordersteps.FillMaterialtagfieldDetails(Tonnage,ProductionRate));
	}
    
    @And("I fill Material tag field Tonnage(.*) and ProductionRate(.*) towards truckform")
    public void fill_Material_tag_field_details_truckform(String Tonnage,String ProductionRate) throws Exception{
   	assertTrue(serenityordersteps.FillTruckform(Tonnage,ProductionRate));
	}
    
    @And("I fill the details Acceptedtrucktypes(.*) and Trucksrequired(.*) and truckbillingperson(.*) and place order")
    public void fill_truckdetails(String trucktypes,String trucksrequired,String truckbillingperson) throws Exception{
   	assertTrue(serenityordersteps.truckdetail(trucktypes,trucksrequired,truckbillingperson));
	}
    
    @And("I select WorkType(.*) and Trucktype(.*) and TrucksRequired(.*) and Truckbilling(.*) details")
    public void fill_truckform(String WorkType,String trucktypes,String trucksrequired,String Truckbillingplace) throws Exception{
   	assertTrue(serenityordersteps.fill_truckform(WorkType,trucktypes,trucksrequired,Truckbillingplace));
	}
    
    
    @And("I click SceduleTrucks and see User navigated to TruckScedulePage")
    public void SceduletrucksandviewTrucksceduleOrder() throws Exception{
   	assertTrue(serenityordersteps.viewtrucksceduleorderdetail());
	}
    
    @And("I select the Worktype(.*) dropdown")
    public void select_Worktype_dropdown(String Worktype) throws Exception{
   	assertTrue(serenityordersteps.Selectworktype(Worktype));
	}
    
    
   @When("I click Cancel button in Book new Material Order form")
     public void click_Cancelbutton_BookNewMaterialOrder() throws Exception{
    	assertTrue(serenityordersteps.clickCancelRebookbtn());
	}
   
   @When("I click MaterialsTrucks button in the New Order dialog box")
   public void click_MaterialsTrucksbtn() throws Exception{
  	assertTrue(serenityordersteps.clickMaterialsTrucksbtn());
	}
   
   
   
   
   
   
    
  }
