package net.haulhub.showcase.cucumber.steps.serenity;

import net.haulhub.showcase.cucumber.pages.JobSlipMyProjectPage;
import net.thucydides.core.annotations.Step;

@SuppressWarnings("serial")

public class SerenityJobSlipMyProjectSteps {

	JobSlipMyProjectPage jobslipmyprojectpage;
	 
	
	@Step
   	public boolean searchByProjectName(String projectName) throws Exception {
   		return jobslipmyprojectpage.searchByProjectName(projectName);
	}
	
	@Step
   	public boolean viewSearchByProjectName(String projectName) throws Exception {
   		return jobslipmyprojectpage.viewProjectSearchByProjectName(projectName);
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
   	public boolean ViewProjectSearchByProducer(String producer) throws Exception {
   		return jobslipmyprojectpage.ViewProjectSearchByProducer(producer);
	}
	
	@Step
   	public boolean searchByProjectStartDate(String startDate) throws Exception {
   		return jobslipmyprojectpage.searchByProjectStartDate(startDate);
	}
	
	@Step
   	public boolean viewProjectSearchByProjectStartDate(String startDate) throws Exception {
   		return jobslipmyprojectpage.viewProjectSearchByProjectStartDate(startDate);
	}
	
	@Step
   	public boolean searchTruck(String truckNo) throws Exception {
   		return jobslipmyprojectpage.searchTruck(truckNo);
	}
	
	@Step
   	public boolean navigateToViewProjects() throws Exception {
   		return jobslipmyprojectpage.navigateToViewProjects();
	}
	
	@Step
   	public boolean viewProjectSearchByTruck(String truck) throws Exception {
   		return jobslipmyprojectpage.viewProjectSearchByTruck(truck);
	}
	
}
