package net.haulhub.showcase.cucumber.steps.serenity;

import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import net.haulhub.showcase.cucumber.pages.HomeDashboardPage;
import net.haulhub.showcase.cucumber.pages.HomeAdminDashboardPage;
import net.haulhub.showcase.cucumber.utils.LearningPlatformConstants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class SerenityAdminHomeDashboardSteps extends ScenarioSteps {

	 public HomeAdminDashboardPage homeadmindashboardpage;
  
    @Step
	public boolean searchcustomer(String customername) throws Exception {
		return homeadmindashboardpage.searchcustomer(customername);
	 }
    
    @Step
   	public boolean  searchfirstbroker(String firstbrokername) throws Exception {
   		return homeadmindashboardpage.searchfirstbrokername(firstbrokername);
   	 }
    
    @Step
   	public boolean  searchfleetname(String fleetnamename) throws Exception {
   		return homeadmindashboardpage.searchfleetname(fleetnamename);
   	 }
   
    @Step
   	public boolean searchsecondbroker(String secondbrokername) throws Exception {
   		return homeadmindashboardpage.searchsecondbrokername(secondbrokername);
   	 }
    

      
} 