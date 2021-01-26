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
	
}