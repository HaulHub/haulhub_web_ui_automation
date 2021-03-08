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
	
	@When("I check accessibility of file export function")
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
	
	@Then("I click on a shiftID")
	public void I_click_on_a_shiftID() throws Throwable {
		assertTrue(serenityjobboardpagesteps.clickOnShiftID() );  
	}
	
	@Then("I click on a job number")
	public void I_click_on_a_JobNumber() throws Throwable {
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
	
	@Then("I navigate to Tickets page")
	public void I_navigate_to_tickets_page() throws Throwable {
		assertTrue(serenityjobboardpagesteps.navigateToTicketsPage());
	}

	@Then("I check Export ticket buttons")
	public void I_check_Export_ticket_buttons() throws Throwable {
		assertTrue(serenityjobboardpagesteps.checkExportTicketButton());
	}
	
	@Then("I navigate to OrderDashboard page")
	public void I_navigate_to_OrderDashboard_page() throws Throwable {
		assertTrue(serenityjobboardpagesteps.navigateToDashboardPage());
	}
	
	@Then("I set the date(.*) in OrderDashboard page")
	public void I_set_the_date_in_OrderDashboard_page(String OrderDate) throws Throwable { 
		assertTrue(serenityjobboardpagesteps.setDateInOrderDashboardPage(OrderDate));
	}
	
	@Then("I check accessibility of New order and Will call toggle") 
	public void I_check_accessibility_of_New_order_and_Will_call_toggle() throws Throwable {
		assertTrue(serenityjobboardpagesteps.checkAccessibilityOfNewOrderAndToggle());
	}
	
	@Then("I open a order in New Status and check accessibility of Save and SMS buttons")
	public void I_open_a_order_in_New_Status() throws Throwable {
		assertTrue(serenityjobboardpagesteps.openNewOrder());
	}
	
	@Then("I open a order in Cancelled Status and check accessibility of Rebook and SMS buttons")
	public void I_open_a_order_in_Canceled_Status() throws Throwable {
		assertTrue(serenityjobboardpagesteps.openCanceledOrder());
	}
	
	@Then("I open a order in Accepted Status and check accessibility of Save Accept Cancel and SMS buttons")
	public void I_open_a_order_in_Accepted_Status() throws Throwable {
		assertTrue(serenityjobboardpagesteps.openAcceptedOrder());
	}
	
	@Then("I open a order in Accepted w/changes Status and check accessibility of Save Request changes Cancel and SMS buttons")
	public void I_open_a_order_in_AcceptedWchanges_Status() throws Throwable {
		assertTrue(serenityjobboardpagesteps.openAcceptedWchangesOrder());
	}
	
}