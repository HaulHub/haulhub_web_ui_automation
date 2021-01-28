package net.haulhub.showcase.cucumber.steps.serenity;

import net.haulhub.showcase.cucumber.pages.DailyLiniupPage_ROUser;
import net.haulhub.showcase.cucumber.pages.JobBoardPage_ROUser;
import net.haulhub.showcase.cucumber.pages.OrderDashboardPage_ROUser;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class SerenityJobBoardPageSteps extends ScenarioSteps  {
	
	JobBoardPage_ROUser jobboardpage;
	DailyLiniupPage_ROUser dailyLineuppage;
	OrderDashboardPage_ROUser orderdashboardpage;
	
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
	

	
	
}