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

	@Then("I validate assigned project is displayed in projects page(.*)")
	public void validateAssignProjects(String projName) throws Exception {
		serenitydeldotprojectssteps.validateAssignProjects(projName);
	}
	
	@Then("I validate inactive project is displayed in archived projects")
	public void validateArchiveProjects() throws Exception {
		serenitydeldotprojectssteps.validateArchiveProjects();
	}
	
	@Then("I search by (.*) and validate staff (.*) and (.*) in projects")
	public void validateStaffSearch(String staffName, String staffRole, String staffPhone) throws Exception {
		serenitydeldotprojectssteps.validateStaffSearchF(staffName, staffRole, staffPhone);
	}
	
	@Then("I validate completed project functionality in projects(.*)")
	public void validateCompletedProjects(String projectName) throws Exception {
		serenitydeldotprojectssteps.validateCompletedProjects(projectName);
	}
	
	@Then("I validate displayed data in slip card")
	public void validateDataInSlipCard() throws Exception {
		serenitydeldotprojectssteps.validateDataInSlipCard();
	}
	
	@Then("I filter by ticket number in slip card(.*)")
	public void filterByTicketNo(String ticketNo) throws Exception {
		serenitydeldotprojectssteps.filterByTicketNo(ticketNo);
	}
	
	@Then("I filter by contractor in slip card(.*)")
	public void filterByContractor(String contracter) throws Exception {
		serenitydeldotprojectssteps.filterByContractor(contracter);
	}
	
	@Then("I filter by supplier in slip card(.*)")
	public void filterBySupplier(String supplier) throws Exception {
		serenitydeldotprojectssteps.filterBySupplier(supplier);
	}
	
	@Then("I filter by material in slip card(.*)")
	public void filterByMateial(String material) throws Exception {
		serenitydeldotprojectssteps.filterByMateial(material);
	}
	
	@Then("I logout from DelDOT")
	public void validateLogoutFunctionality() throws Exception {
		serenitydeldotprojectssteps.validateLogoutFunctionality();
	}
	
}
