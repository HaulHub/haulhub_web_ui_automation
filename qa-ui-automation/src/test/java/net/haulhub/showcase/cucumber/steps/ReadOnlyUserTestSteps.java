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
	
	@Then("I check visibility of Notify Reserved button in Jobboard page")
	public void I_check_visibility_of_Notify_Reserved_button() throws Throwable {
		assertTrue(serenityjobboardpagesteps.check_visibility_of_Notify_Reserved_button() ); 
	}
	
	@Then("I filterd by Upcoming status")
	public void I_filterd_by_Upcoming_status() throws Throwable {
		assertTrue(serenityjobboardpagesteps.filterd_by_Upcoming_status() );
	}
	
	@Then("I check visibility of Cancel EditShiftSchedule EditShift AddShift CancelShift buttons")
	public void I_check_vsibility_of_buttons() throws Throwable {
		assertTrue(serenityjobboardpagesteps.check_vsibility_of_buttons() );
	}
	
	@Then("I click on a job number")
	public void I_click_on_a_job_number() throws Throwable {
		assertTrue(serenityjobboardpagesteps.clickOnJobNumber() );  
	}
	
	@Then("I check visibility of Cancel Finish Update Save buttons")
	public void I_check_vsibility_of_buttons_In_Shifts() throws Throwable {
		assertTrue(serenityjobboardpagesteps.check_vsibility_of_buttons_In_Shifts() ); 
	}
	
	@Then("I filterd by Draft status")
	public void I_filterd_by_Draft_status() throws Throwable {
		assertTrue(serenityjobboardpagesteps.filterd_by_Draft_status() );
	}
	
	@Then("I check visibility of Cancel Rebook EditShiftSchedule EditShift AddShift CancelShift buttons")
	public void I_check_vsibility_of_buttons_In_Draft_Page() throws Throwable {
		assertTrue(serenityjobboardpagesteps.check_vsibility_of_buttons_in_Draft_page() );
	}
	
	@Then("I filterd by Started status")
	public void I_filterd_by_Started_status() throws Throwable {
		assertTrue(serenityjobboardpagesteps.filterd_by_Started_status() );
	}
	
	@Then("I check visibility of Cancel EditJob Rebook EditShiftSchedule EditShift AddShift CancelShift buttons")
	public void I_check_vsibility_of_buttons_In_Started_Page() throws Throwable {
		assertTrue(serenityjobboardpagesteps.check_vsibility_of_buttons_in_Started_page() );
	}
	
	@Then("I check accessibility of Cancel Finish Update Save buttons and Plant Job links")
	public void I_checkVsibility_of_buttons_In_Shifts_Of_Started() throws Throwable {
		assertTrue(serenityjobboardpagesteps.check_vsibility_of_buttons_In_Shifts_In_Started() ); 
	}
	
}
