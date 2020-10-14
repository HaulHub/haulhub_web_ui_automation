package net.haulhub.showcase.cucumber.steps.serenity;

import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import net.haulhub.showcase.cucumber.pages.BrokerJobManagementPage;
import net.haulhub.showcase.cucumber.utils.LearningPlatformConstants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class SerenityBrokerJobManagementSteps extends ScenarioSteps {

	 public BrokerJobManagementPage brokerjobmanagementscedulepage;

    @Step
	public boolean click_jobmanagment_booknewjobasdraft() throws Exception {
		return brokerjobmanagementscedulepage.click_jobmanagment_booknewjobasdraft();
	}
    
    @Step
   	public boolean click_jobmanagment_booknewjob() throws Exception {
   		return brokerjobmanagementscedulepage.click_jobmanagment_booknewjob();
   	} 
   
}
    
    