package net.haulhub.showcase.cucumber.steps.serenity;

import cucumber.api.java.en.Given;
import net.haulhub.showcase.cucumber.pages.JobSlipFeedPage;
import net.haulhub.showcase.cucumber.pages.JobSlipMyProjectPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")

public class SerenityJobSlipMyProjectSteps {

	JobSlipMyProjectPage jobslipmyprojectpage;
	 
	
	@Step
   	public boolean searchByProjectName(String projectName) throws Exception {
   		return jobslipmyprojectpage.searchByProjectName(projectName);
	}
	
	@Step
   	public boolean searchByProjectNumber(String projectNumber) throws Exception {
   		return jobslipmyprojectpage.searchByProjectNumber(projectNumber);
	}
	
	@Step
   	public boolean searchByProjectMaterial(String projectMaterial) throws Exception {
   		return jobslipmyprojectpage.searchByProjectMaterial(projectMaterial);
	}
	
	@Step
   	public boolean searchByProducer(String producer) throws Exception {
   		return jobslipmyprojectpage.searchByProducer(producer);
	}
	
	@Step
   	public boolean searchByProjectStartDate(String startDate) throws Exception {
   		return jobslipmyprojectpage.searchByProjectStartDate(startDate);
	}
	
	@Step
   	public boolean searchTruck(String truckNo) throws Exception {
   		return jobslipmyprojectpage.searchTruck(truckNo);
	}
	
}
