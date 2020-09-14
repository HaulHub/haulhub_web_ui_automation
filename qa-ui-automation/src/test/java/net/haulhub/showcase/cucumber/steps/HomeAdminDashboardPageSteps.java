package net.haulhub.showcase.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityHomeDashboardSteps;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityAdminHomeDashboardSteps;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityOrderSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;

@SuppressWarnings("unused")
public class HomeAdminDashboardPageSteps {

	@Steps
	SerenityAdminHomeDashboardSteps serenityadminHomeDashboardSteps;
	
    @Given("I search for customer(.*) and login to the customers portal")
     public void search_customer(String Customername) throws Exception {
     assertTrue(serenityadminHomeDashboardSteps.searchcustomer(Customername));
     }
    
    @Given("I search for firstbroker(.*) and login to the firstbroker portal")
    public void search_firstbroker(String firstbrokername) throws Exception {
    assertTrue(serenityadminHomeDashboardSteps.searchfirstbroker(firstbrokername));
    }
    
    @Given("I search for fleetname(.*) and login to the fleetcompany portal")
    public void search_fleetname(String fleetname) throws Exception {
    assertTrue(serenityadminHomeDashboardSteps.searchfleetname(fleetname));
    }
    
    @Given("I search for secondbroker(.*) and login to the secondbroker portal")
    public void search_secondbroker(String secondbrokername) throws Exception {
    assertTrue(serenityadminHomeDashboardSteps.searchsecondbroker(secondbrokername));
    }
    
    




    
   
  }
