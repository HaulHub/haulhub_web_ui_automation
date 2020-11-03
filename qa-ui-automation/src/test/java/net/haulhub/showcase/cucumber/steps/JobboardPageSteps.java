package net.haulhub.showcase.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import static org.junit.Assert.*;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityJobboardSteps;
import org.openqa.selenium.WebDriver;

@SuppressWarnings("unused")
public class JobboardPageSteps{

	@Steps
	SerenityJobboardSteps serenityJobboardSteps;
	
	@Given("I click the tripcostmodal window against jobnumber within JobBoard")
	public void click_tripcostmodal() throws Exception {
		 assertTrue(serenityJobboardSteps.clicktripcostmodal());
	}

    
  
  }
