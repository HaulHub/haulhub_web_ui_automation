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
	
	@Step
   	public boolean searchSupplier(String supplier) throws Exception {
   		return jobslipfeedpage.searchSupplier(supplier);
	}
	
	@Step
   	public boolean searchProject(String project) throws Exception {
   		return jobslipfeedpage.searchProject(project);
	}
	
	@Step
   	public boolean searchTruck(String truck) throws Exception {
   		return jobslipfeedpage.searchTruck(truck);
	}
	
	@Step
   	public boolean searchPlant(String plant) throws Exception {
   		return jobslipfeedpage.searchPlant(plant);
	}
	
	@Step
   	public boolean searchProduct(String product) throws Exception {
   		return jobslipfeedpage.searchProduct(product);
	}
	
	@Step
   	public boolean searchQuantity(String quantity) throws Exception {
   		return jobslipfeedpage.searchQuantity(quantity);
	}
	
	@Step
   	public boolean searchTicket(String ticket) throws Exception {
   		return jobslipfeedpage.searchTicket(ticket);
	}
	
	@Step
   	public boolean searchTicketStatus(String ticketStatus) throws Exception {
   		return jobslipfeedpage.searchTicketStatus(ticketStatus);
	}
	
	@Step
   	public boolean searchUOM(String uom) throws Exception {
   		return jobslipfeedpage.searchUOM(uom);
	}
	
}