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
	
	@Then("I search by supplier in Feed page(.*)")
	public void searchSupplier(String supplier) throws Exception {
		serenityfeed.searchSupplier(supplier);
	}
	
	@Then("I search by Start date (.*) and End date (.*) in Feed page")
	public void searchDate(String sDate, String eDate) throws Exception {
		serenityfeed.searchDate(sDate, eDate);
	}
	
	@Then("I search by project in Feed page(.*)")
	public void searchProject(String project) throws Exception {
		serenityfeed.searchProject(project);
	}
	
	@Then("I search by truck in Feed page(.*)")
	public void searchTruck(String truck) throws Exception {
		serenityfeed.searchTruck(truck);
	}
	
	@Then("I search by plant in Feed page(.*)")
	public void searchPlant(String plant) throws Exception {
		serenityfeed.searchPlant(plant);
	}
	
	@Then("I search by product in Feed page(.*)")
	public void searchProduct(String product) throws Exception {
		serenityfeed.searchProduct(product);
	}
	
	@Then("I search by quantity in Feed page(.*)")
	public void searchQuantity(String quantity) throws Exception {
		serenityfeed.searchQuantity(quantity);
	}
	
	@Then("I search by ticket no in Feed page(.*)")
	public void searchTicket(String ticket) throws Exception {
		serenityfeed.searchTicket(ticket);
	}
	
	@Then("I search by UOM in Feed page(.*)")
	public void searchUOM(String uom) throws Exception {
		serenityfeed.searchUOM(uom);
	}
	
	@Then("I search by ticket status in Feed page(.*)")
	public void searchTicketStatus(String ticketStatus) throws Exception {
		serenityfeed.searchTicketStatus(ticketStatus);
	}

}
