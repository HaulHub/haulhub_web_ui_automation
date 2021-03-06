package net.haulhub.showcase.cucumber.steps.serenity;

import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import net.haulhub.showcase.cucumber.pages.BrokerDashboardPage;
import net.haulhub.showcase.cucumber.pages.FleetJobOffersPage;
import net.haulhub.showcase.cucumber.utils.LearningPlatformConstants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class SerenityFleetJobOffersSteps extends ScenarioSteps {

	 public FleetJobOffersPage fleetjobofferspage;
  
    @Step
	public boolean fleet_assigndrivers() throws Exception {
		return fleetjobofferspage.fleet_assigndrivers();
	 }
    
    @Step
	public boolean certified_payrolldocument() throws Exception {
		return fleetjobofferspage.certified_payrolldocument();
	 }
    
    @Step
   	public boolean Trucks_Drivers() throws Exception {
   		return fleetjobofferspage.Trucks_Drivers();
   	 }
    
    @Step
   	public boolean  Addinsurnace_agentdetails() throws Exception {
   		return fleetjobofferspage.Addinsurnace_agentdetails();
   	 }
   

 
    
}
    
    