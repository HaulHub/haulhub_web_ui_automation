package net.haulhub.showcase.cucumber.steps.serenity;

import net.haulhub.showcase.cucumber.pages.DailyLiniupPage_ROUser;
import net.haulhub.showcase.cucumber.pages.JobBoardPage_ROUser;
import net.haulhub.showcase.cucumber.pages.OrderDashboardPage_ROUser;
import net.haulhub.showcase.cucumber.pages.TicketsPage_ROUser;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class SerenityJobBoardPageSteps extends ScenarioSteps  {
	
	JobBoardPage_ROUser jobboardpage;
	DailyLiniupPage_ROUser dailyLineuppage;
	OrderDashboardPage_ROUser orderdashboardpage;
	TicketsPage_ROUser ticketspage;
	
	@Step
   	public boolean checkNavigationToJobBoardPage() throws Exception {
   		return jobboardpage.CheckNavigationToJobBoardPage();
   	 }
	
	@Step
   	public boolean checkAccessAvailability() throws Exception {
   		return jobboardpage.checkAccessAvailability();
   	 }
	
	@Step
   	public boolean CheckDisability_of_FileExportButton() throws Exception { 
   		return dailyLineuppage.CheckDisabilityOfFileExportButton();
   	 }
	
	@Step
   	public boolean navigateToJobboard() throws Exception {   
   		return dailyLineuppage.navigateToJobboardPage();
   	 }
	
	@Step
   	public boolean checkAccessibilityOfMainLink() throws Exception {
   		return orderdashboardpage.CheckAccessibilityOfMainLink();   	
   	}
	
	@Step
   	public boolean check_visibility_of_Notify_Reserved_button() throws Exception { 
   		return jobboardpage.checkVisibilityOfNotifyReservedbutton();   	
   	}
	
	@Step
   	public boolean filterd_by_Upcoming_status() throws Exception {
   		return jobboardpage.filterByUpcomingStatus();   	
   	}
	
	@Step
   	public boolean check_vsibility_of_buttons() throws Exception {
   		return jobboardpage.checkAccessibilityOfButtonsInUpcoming();   	 
   	}
	
	@Step
   	public boolean clickOnJobNumber() throws Exception { 
   		return jobboardpage.clickOnJobNumber();   	
   	}
	
	@Step
   	public boolean clickOnShiftID() throws Exception { 
   		return jobboardpage.clickOnShiftID();   	
   	}
	
	@Step
   	public boolean check_vsibility_of_buttons_In_Shifts() throws Exception {
   		return jobboardpage.checkAccessibilityOfButtonsInShifts();   	
   	}
	
	@Step
   	public boolean check_vsibility_of_buttons_In_Shifts_In_Started() throws Exception {
   		return jobboardpage.checkAccessibilityOfButtonsInShiftsInStarted();   	
   	}
	
	@Step
   	public boolean filterd_by_Draft_status() throws Exception {
   		return jobboardpage.filterByDraftStatus();   	
   	}
	
	@Step
   	public boolean check_vsibility_of_buttons_in_Draft_page() throws Exception {
   		return jobboardpage.checkAccessibilityOfButtonsInDraft();   	
   	}
	
	@Step
   	public boolean filterd_by_Started_status() throws Exception {
   		return jobboardpage.filterByStartedStatus();   	
   	}
	
	@Step
   	public boolean check_vsibility_of_buttons_in_Started_page() throws Exception {   
   		return jobboardpage.checkAccessibilityOfButtonsInStarted();   	
   	}
	
	@Step
   	public boolean navigateToTicketsPage() throws Exception {
   		return jobboardpage.NavigateToTicketsPage();   	
   	}
	
	@Step
   	public boolean checkExportTicketButton() throws Exception {
   		return ticketspage.checkAccessibilityOfButtonsInTickets();   	
   	}
	
	@Step
   	public boolean navigateToDashboardPage() throws Exception {
   		return ticketspage.NavigateToOrderDashboard();   	
   	}
	
	@Step
   	public boolean setDateInOrderDashboardPage(String OrderDate) throws Exception {  
   		return orderdashboardpage.setDate(OrderDate);   	
   	}
	
	@Step
   	public boolean checkAccessibilityOfNewOrderAndToggle() throws Exception {
   		return orderdashboardpage.checkAccessibilityOfButtonsOrderdashboard();   	
   	}
	
	@Step
   	public boolean openNewOrder() throws Exception {
   		return orderdashboardpage.openNewOrder();   	
   	}
	
	@Step
   	public boolean openCanceledOrder() throws Exception {
   		return orderdashboardpage.openCanceledOrder();   	
   	}
	
	@Step
   	public boolean openAcceptedOrder() throws Exception {
   		return orderdashboardpage.openAcceptedOrder();   	
   	}
	
	@Step
   	public boolean openAcceptedWchangesOrder() throws Exception {
   		return orderdashboardpage.openAcceptedWchangesOrder();   	
   	}
	
}