package net.haulhub.showcase.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityBrokerScedulerSteps;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityBrokerJobManagementSteps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;

@SuppressWarnings("unused")
public class BrokerJobManagementPageSteps {

	@Steps
	SerenityBrokerJobManagementSteps serenitybrokerjobmanagementSteps;
	
    @Given("I click Job Management and book a new job as draft")
    public void click_jobmanagment_draftjob() throws Exception {
    assertTrue(serenitybrokerjobmanagementSteps.click_jobmanagment_booknewjobasdraft());
	}
    
    @Given("I click Job Management and book the Job saved intially as draft job")
    public void click_jobmanagment_booknewjob() throws Exception {
    assertTrue(serenitybrokerjobmanagementSteps.click_jobmanagment_booknewjob());
	}

   


}   