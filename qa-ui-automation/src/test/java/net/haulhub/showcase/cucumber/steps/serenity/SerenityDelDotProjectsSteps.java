package net.haulhub.showcase.cucumber.steps.serenity;

import net.haulhub.showcase.cucumber.pages.DelDotProjectsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")

public class SerenityDelDotProjectsSteps extends ScenarioSteps {
	
	DelDotProjectsPage deldotprojectssteps;
	 
	@Step
   	public boolean validateAssignProjects(String projName) throws Exception {
   		return deldotprojectssteps.validateAssignProjects(projName);
	}
	
	@Step
   	public boolean validateArchiveProjects() throws Exception {
   		return deldotprojectssteps.validateArchiveProjects();
	}
	
	@Step
   	public boolean validateStaffSearchF(String staffName, String staffRole, String staffPhone) throws Exception {
   		return deldotprojectssteps.validateStaffSearch(staffName, staffRole, staffPhone);
	}
	
	@Step
   	public boolean validateCompletedProjects(String projectName) throws Exception {
   		return deldotprojectssteps.validateCompletedProjects(projectName);
	}
	
	@Step
   	public boolean validateDataInSlipCard() throws Exception {
   		return deldotprojectssteps.validateDataInSlipCard();
	}
	
	@Step
   	public boolean filterByTicketNo(String ticketNo) throws Exception {
   		return deldotprojectssteps.filterByTicketNo(ticketNo);
	}
	
	@Step
   	public boolean filterByContractor(String contracter) throws Exception {
   		return deldotprojectssteps.filterByContractor(contracter);
	}
	
	@Step
   	public boolean filterBySupplier(String supplier) throws Exception {
   		return deldotprojectssteps.filterBySupplier(supplier);
	}
	
	@Step
   	public boolean filterByMateial(String material) throws Exception {
   		return deldotprojectssteps.filterByMateial(material);
	}
	
	@Step
   	public boolean validateLogoutFunctionality() throws Exception {
   		return deldotprojectssteps.validateLogoutFunctionality();
	}
	
	@Step
   	public boolean sortAscendingQuentityInSlipCard() throws Exception {
   		return deldotprojectssteps.sortAscendingQuentityInSlipCard();
	}
	
	@Step
   	public boolean sortDescendingQuentityInSlipCard() throws Exception {
   		return deldotprojectssteps.sortDescendingQuentityInSlipCard();
	}
	
	@Step
   	public boolean filterByStatus(String status) throws Exception {
   		return deldotprojectssteps.filterByStatus(status);
	}

	
}
