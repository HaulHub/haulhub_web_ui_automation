package net.haulhub.showcase.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityJobSlipMyProjectSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.WebDriver;

@SuppressWarnings("unused")

public class JobSlipMyProjectSteps {
	
	@Steps
	SerenityJobSlipMyProjectSteps serenitymyprojects;

	@Given("I search by project name(.*)")
	public void searchByProjectName(String projectName) throws Exception {
		serenitymyprojects.searchByProjectName(projectName);
	}
	
	@Then("I search by project number(.*)")
	public void searchByProjectNumber(String projectNumber) throws Exception {
		serenitymyprojects.searchByProjectNumber(projectNumber);
	}
	
	@Then("I search by project material(.*)")
	public void searchByProjectMaterial(String projectMaterial) throws Exception {
		serenitymyprojects.searchByProjectMaterial(projectMaterial);
	}
	
	@Then("I search by producer(.*)")
	public void searchByProducer(String producer) throws Exception {
		serenitymyprojects.searchByProducer(producer);
	}
	
	@Then("I search by start date(.*)")
	public void searchByProjectStartDate(String startDate) throws Exception {
		serenitymyprojects.searchByProjectStartDate(startDate);
	}
	
	@Then("I search by truck number(.*)")
	public void searchTruck(String truckNo) throws Exception {
		serenitymyprojects.searchTruck(truckNo);
	}
	
}
