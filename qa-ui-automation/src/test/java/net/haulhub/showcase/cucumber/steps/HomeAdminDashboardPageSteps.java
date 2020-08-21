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


    
   
  }