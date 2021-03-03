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
	
	@Given("I validate archived project is displayed in archived projects(.*)")
	public void validateArchiveProjects(String projectName) throws Exception {
		serenitydeldotprojectssteps.validateArchiveProjects(projectName);
	}
	
	@Given("I search by (.*) and validate staff (.*) and (.*) in projects")
	public void validateStaffSearch(String staffName, String staffRole, String staffPhone) throws Exception {
		serenitydeldotprojectssteps.validateStaffSearchF(staffName, staffRole, staffPhone);
	}
	
	@Given("I validate completed project functionality in projects(.*)")
	public void validateCompletedProjects(String projectName) throws Exception {
		serenitydeldotprojectssteps.validateCompletedProjects(projectName);
	}
	
	@Given("I validate displayed data in slip card")
	public void validateDataInSlipCard() throws Exception {
		serenitydeldotprojectssteps.validateDataInSlipCard();
	}
	
	@Given("I filter by ticket number in slip card(.*)")
	public void filterByTicketNo(String ticketNo) throws Exception {
		serenitydeldotprojectssteps.filterByTicketNo(ticketNo);
	}

}
