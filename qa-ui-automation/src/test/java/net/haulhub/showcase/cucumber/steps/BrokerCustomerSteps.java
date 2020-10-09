package net.haulhub.showcase.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityBrokerCustomerSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;

@SuppressWarnings("unused")
public class BrokerCustomerSteps {

	@Steps
	SerenityBrokerCustomerSteps serenitybrokercustomerSteps;
	
    @Given("I enter customer details and create a customer and click to view the newly created customer profile")
    public void enter_brokercustomerdetails() throws Exception {
    assertTrue(serenitybrokercustomerSteps.enter_brokercustomerdetails());
	}
    
    @Given("I click the Jobsite link and create a new Jobsite")
    public void create_Jobsite() throws Exception {
    assertTrue(serenitybrokercustomerSteps.create_Jobsite());
	}
    
    @Given("I click the Material link and create a new Material")
    public void create_Material() throws Exception {
    assertTrue(serenitybrokercustomerSteps.create_Material());
	}
    
    @Given("I click the Job link within customer view and see the appearence of Book new jobs button and it is clickable")
    public void booknewjob_view() throws Exception {
    assertTrue(serenitybrokercustomerSteps.joblinkbooknewjob());
	}


    
}   