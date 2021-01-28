package net.haulhub.showcase.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.haulhub.showcase.cucumber.steps.serenity.SerenitySettingsSteps;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityCustomerSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.WebDriver;

@SuppressWarnings("unused")

public class CustomersPageSteps {

	@Steps
	SerenityCustomerSteps serenitycustomerSteps;
	
	
	@Given("I Go to Manage Customers page")
	public void go_to_manage_customer_page() throws Exception {
		assertTrue(serenitycustomerSteps.gotomanagecustomerpage());
	}
	
	@Given("I Add a new customer and validate the customer was added successfully")
	public void validate_newcustomerprofile() throws Exception {
		assertTrue(serenitycustomerSteps.validate_newcustomerprofile());
	}
	
	@Given("I Edit update the created customer and confirms customer is reflected with updatedname")
	public void validate_customernamereflected() throws Exception {
		assertTrue(serenitycustomerSteps.validate_customernamereflected());
	}
	
	@Given("I Delete the updated customer name from the list")
	public void delete_customernamereflected() throws Exception {
		assertTrue(serenitycustomerSteps.delete_customernamereflected());
	}
	
	@Given("I go to ETicket manage customers page")
	public void ETicket_manage_customers() throws Exception {
		assertTrue(serenitycustomerSteps.ETicket_manage_customers());
	}
	
	@Given("I invite a new ETicket customer by Typing in a new HaulHub Customer name")
	public void ETicket_typing_new_Haulhubcustomername() throws Exception {
		assertTrue(serenitycustomerSteps.ETicket_typing_new_Haulhubcustomername());
	}

	
	
	
}