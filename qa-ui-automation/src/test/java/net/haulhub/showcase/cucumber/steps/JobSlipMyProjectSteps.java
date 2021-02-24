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
	
	@Given("I navigate to view projects in My projects")
	public void navigateToViewProjects() throws Exception {
		serenitymyprojects.navigateToViewProjects();
	}
	
	@Then("I search in view project by project name(.*)")
	public void viewSearchByProjectName(String projectName) throws Exception {
		serenitymyprojects.viewSearchByProjectName(projectName);
	}
	
	@Then("I search in view project by producer(.*)")
	public void ViewProjectSearchByProducer(String producer) throws Exception {
		serenitymyprojects.ViewProjectSearchByProducer(producer);
	}
	
	@Then("I search in view project by startDate(.*)")
	public void viewProjectSearchByProjectStartDate(String startDate) throws Exception {
		serenitymyprojects.viewProjectSearchByProjectStartDate(startDate);
	}
	
	@Then("I search in view project by truck(.*)")
	public void viewProjectSearchByTruck(String truck) throws Exception {
		serenitymyprojects.viewProjectSearchByTruck(truck);
	}
	
	@Then("I search in view project by ticket number(.*)")
	public void searchByTicketNo(String ticketNo) throws Exception {
		serenitymyprojects.searchByTicketNo(ticketNo);
	}
	
	@Then("I search in view project by product(.*)")
	public void viewProjectSearchByProduct(String product) throws Exception {
		serenitymyprojects.viewProjectSearchByProduct(product);
	}
	
	@Then("I search by plant (.*)and verify with(.*)")
	public void searchByPlant(String plant, String projNum) throws Exception {
		serenitymyprojects.searchByPlant(plant, projNum);
	}
	
}
