package net.haulhub.showcase.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityDelDotProjectsSteps;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityJobSlipMyProjectSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.WebDriver;

@SuppressWarnings("unused")

public class DelDotProjectsSteps {
	
	@Steps
	SerenityDelDotProjectsSteps serenitydeldotprojectssteps;

	@Given("I validate assigned project is displayed in projects page(.*)")
	public void validateAssignProjects(String projName) throws Exception {
		serenitydeldotprojectssteps.validateAssignProjects(projName);
	}

}
