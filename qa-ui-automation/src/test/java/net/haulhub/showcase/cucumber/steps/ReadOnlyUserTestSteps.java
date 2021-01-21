package net.haulhub.showcase.cucumber.steps;

import static org.junit.Assert.assertTrue;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityJobBoardPageSteps;
import net.thucydides.core.annotations.Steps;

public class ReadOnlyUserTestSteps {

	@Steps
	SerenityJobBoardPageSteps serenityjobboardpagesteps;
	

	@When("I Check Im navigated to Job Board page") 
	public void i_Check_Im_navigated_to_Job_Board_page() throws Throwable {

		serenityjobboardpagesteps.checkNavigationToJobBoardPage();
	}

	@Then("I check available access to the Read-only user$")
	public void i_check_available_access_to_the_Read_only_user() throws Throwable {

		assertTrue(serenityjobboardpagesteps.checkAccessAvailability());
	}
	
	@Then("I check accessibility of file export function")
	public void I_check_accessibility_of_file_export_function() throws Throwable {

		assertTrue(serenityjobboardpagesteps.CheckDisability_of_FileExportButton()); 
	}
	
	@Then("I navigate back to Jobboard page")
	public void I_navigate_back_to_Jobboard_page() throws Throwable {

		assertTrue(serenityjobboardpagesteps.navigateToJobboard());
	}
	
	@Then("I check accessibility of Main link")
	public void I_check_accessibility_of_Main_link() throws Throwable {

		assertTrue(serenityjobboardpagesteps.checkAccessibilityOfMainLink());
	}
	
	
	
	
	
	
	
	
	
//	@When("I select status as (.*)")
//	public void I_select_status_as(String UpcomingJobs) throws Throwable {
//		assertTrue(serenityjobboardpagesteps.select_status(UpcomingJobs));
//	}
	
//	@Then ("I check available access in Job Board page for the Read-only user")
//	public void I_check_available_access_in_Job_Boar_page_for_the_Read_only_user() throws Throwable {
//		
//	}

}
