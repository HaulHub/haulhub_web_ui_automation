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
   	public boolean clickOnJobNumber() throws Exception {
   		return jobboardpage.clickOnJobNumber();   	
   	}
	
	//Currently working on this - Kaveendra
//	@Step
//   	public boolean check_vsibility_of_buttons() throws Exception {
//   		return jobboardpage.checkAccessibilityOfButtons();   	
//   	}
	
	
	

}