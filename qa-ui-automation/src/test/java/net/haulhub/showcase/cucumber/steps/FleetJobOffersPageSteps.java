package net.haulhub.showcase.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityFleetJobOffersSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;

@SuppressWarnings("unused")
public class FleetJobOffersPageSteps {

	@Steps
	SerenityFleetJobOffersSteps serenityfleetjoboffersSteps;
	
    @Given("as fleetcompany I view the Second broker rate then click the assigned shifts by Second Broker and assign drivers")
    public void fleet_assigndrivers() throws Exception {
    assertTrue(serenityfleetjoboffersSteps.fleet_assigndrivers());
	}

    @Given("I am able to see the Certified Payroll documents button")
    public void certified_payrolldocuments() throws Exception {
    assertTrue(serenityfleetjoboffersSteps.certified_payrolldocument());
	}
    
    @Given("I am able to see the Trucks and Drivers details")
    public void Trucks_Drivers() throws Exception {
    assertTrue(serenityfleetjoboffersSteps.Trucks_Drivers());
	}
    
    @Given("I am able to add and see Insurance Agent details")
    public void add_insurance_agentdetails() throws Exception {
    assertTrue(serenityfleetjoboffersSteps.Addinsurnace_agentdetails());
	}

 

}   