package net.haulhub.showcase.cucumber.steps.serenity;

import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import net.haulhub.showcase.cucumber.pages.BrokerCustomerPage;
import net.haulhub.showcase.cucumber.utils.LearningPlatformConstants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class SerenityBrokerCustomerSteps extends ScenarioSteps {

	 public BrokerCustomerPage brokercustomerpage;
  
    @Step
	public boolean enter_brokercustomerdetails() throws Exception {
		return brokercustomerpage.enter_brokercustomerdetails();
	 }
    
    @Step
   	public boolean update_brokercustomerdetails() throws Exception {
   		return brokercustomerpage.update_brokercustomerdetails();
   	 }
    
    @Step
   	public boolean create_Jobsite() throws Exception {
   		return brokercustomerpage.create_Jobsite();
   	 }
    
    @Step
   	public boolean edit_Jobsite() throws Exception {
   		return brokercustomerpage.edit_Jobsite();
   	 }

    @Step
   	public boolean create_Material() throws Exception {
   		return brokercustomerpage.create_Material();
   	 }
    
    @Step
   	public boolean joblinkbooknewjob() throws Exception {
   		return brokercustomerpage.joblinkbooknewjob();
   	 }

}
    
    