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
  
    
   
    
   
   
    
  }
