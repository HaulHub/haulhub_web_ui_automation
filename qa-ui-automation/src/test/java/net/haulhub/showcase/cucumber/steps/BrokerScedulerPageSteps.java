package net.haulhub.showcase.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityBrokerScedulerSteps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;

@SuppressWarnings("unused")
public class BrokerScedulerPageSteps {

	@Steps
	SerenityBrokerScedulerSteps serenitybrokerScedulerSteps;
	
    @Given("as second broker within Job management  click the sceduler and assign 1 shift to internal truck  and one shift to fleet")
    public void click_sceduler_assignshifts() throws Exception {
    assertTrue(serenitybrokerScedulerSteps.click_sceduler_assignshifts());
	}
    


}   