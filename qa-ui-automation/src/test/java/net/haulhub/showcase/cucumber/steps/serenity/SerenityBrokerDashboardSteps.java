package net.haulhub.showcase.cucumber.steps.serenity;

import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import net.haulhub.showcase.cucumber.pages.BrokerDashboardPage;
import net.haulhub.showcase.cucumber.utils.LearningPlatformConstants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class SerenityBrokerDashboardSteps extends ScenarioSteps {

	 public BrokerDashboardPage brokerdashboardpage;
  
    @Step
	public boolean clickbrokerDashboardlink() throws Exception {
		return brokerdashboardpage.clickbrokerDashboardlink();
	 }
    
    @Step
	public boolean firstbrokerdashboard_declinedsectionvalidation() throws Exception {
		return brokerdashboardpage.firstbrokerdashboard_declinedsection();
	 }
    

    @Step
	public boolean selectallshifts_assigndrivers() throws Exception {
		return brokerdashboardpage.selectallshifts_assigndrivers();
	 }
    
    @Step
	public boolean clickacceptlaterbutton() throws Exception {
		return brokerdashboardpage.clickacceptlaterbutton();
	 }
 
    
    @Step
	public boolean firstbroker_assignstodifferent_entities() throws Exception {
		return brokerdashboardpage.firstbroker_assignstodifferent_entities();
	 }
    
    @Step
   	public boolean declinedshift_appearing_undermarketplace() throws Exception {
   		return brokerdashboardpage.declinedshift_appearing_undermarketplace();
   	 }
}
    
    