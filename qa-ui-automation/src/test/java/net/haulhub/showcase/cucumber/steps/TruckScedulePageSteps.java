package net.haulhub.showcase.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityTruckSceduleSteps;
import net.thucydides.core.annotations.Steps;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;

@SuppressWarnings("unused")
public class TruckScedulePageSteps {

	@Steps
	
    SerenityTruckSceduleSteps serenitytruckscedulesteps;

    @When("I click Truck Scedule page and click Add Trucks against my created order")
     public void click_TruckScedulepage_Addtrucks() throws Exception{
    	assertTrue(serenitytruckscedulesteps.ClickTrucksceduleAddtrucks());
    	
	}
    
    @And("I enter FleetPriority (.*) and Fleet(.*) and click sendinvites button")
    public void fill_Fleetdetails(String fleetpriority,String fleet) throws Exception{
        assertTrue(serenitytruckscedulesteps.fill_fleetdetails(fleetpriority,fleet));
        
	}
    
    @When("I see a message notification sent to Driver for acceptance")
    public void sms_confirmation() throws Exception{
   	assertTrue(serenitytruckscedulesteps.SMSConfirmation());
	}
    
    @When("I click Truck report in truck scedule page")
    public void click_truckreportbtn() throws Exception{
   	assertTrue(serenitytruckscedulesteps.clicktruckreport());
	}
    
    @When("I click truck scedule page")
    public void click_truckscedule_page() throws Exception{
   	assertTrue(serenitytruckscedulesteps.clicktruckscedule());
	}
 
    @When("I select add a receipient or select an existing recepient and send truck report to the recepient")
    public void selectrecepient_sendtruckreport() throws Exception{
   	assertTrue(serenitytruckscedulesteps.sendtruckreport());
	}
    
    @When("I reset the truckreport to original status")
    public void reset_truckreport() throws Exception{
   	assertTrue(serenitytruckscedulesteps.resettruckreport());
	}
      
  }
