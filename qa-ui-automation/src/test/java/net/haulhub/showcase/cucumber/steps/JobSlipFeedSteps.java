package net.haulhub.showcase.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityJobSlipFeedSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.WebDriver;

@SuppressWarnings("unused")

public class JobSlipFeedSteps {
	
	@Steps
	SerenityJobSlipFeedSteps serenityfeed;

	@Given("I navigate to My Projects page")
	public void navigateToMyProjects() throws Exception {
		serenityfeed.navigateToMyProjects();
	}

}
