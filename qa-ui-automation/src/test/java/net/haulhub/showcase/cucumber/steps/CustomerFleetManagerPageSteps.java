package net.haulhub.showcase.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityCustomerFleetManagerSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;

@SuppressWarnings("unused")
public class CustomerFleetManagerPageSteps {

	@Steps
	SerenityCustomerFleetManagerSteps serenitycustomerfleetmanagerSteps;
	
    @Given("I click Fleetdetails (.*) tab and validate p.no, address ,contact number,USDOT Details are displayed correctly")
    public void fleet_assigndrivers(String customername) throws Exception {
    assertTrue(serenitycustomerfleetmanagerSteps.Validate_complianceFleetdetails(customername));
	}


}   