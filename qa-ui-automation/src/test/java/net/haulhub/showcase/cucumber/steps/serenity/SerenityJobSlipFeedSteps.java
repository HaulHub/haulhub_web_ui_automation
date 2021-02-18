package net.haulhub.showcase.cucumber.steps.serenity;

import net.haulhub.showcase.cucumber.pages.JobSlipFeedPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")

public class SerenityJobSlipFeedSteps extends ScenarioSteps  {
	
	JobSlipFeedPage jobslipfeedpage;
	 
	@Step
   	public boolean navigateToMyProjects() throws Exception {
   		return jobslipfeedpage.navigateToMyProjects();
	}
	
	@Step
   	public boolean searchDate(String sDate, String eDate) throws Exception {
   		return jobslipfeedpage.searchDate(sDate, eDate);
	}
	
}
