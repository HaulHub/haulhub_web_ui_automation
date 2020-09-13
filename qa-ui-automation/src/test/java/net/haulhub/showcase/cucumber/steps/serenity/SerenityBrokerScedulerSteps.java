package net.haulhub.showcase.cucumber.steps.serenity;

import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import net.haulhub.showcase.cucumber.pages.BrokerScedulerPage;
import net.haulhub.showcase.cucumber.utils.LearningPlatformConstants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class SerenityBrokerScedulerSteps extends ScenarioSteps {

	 public BrokerScedulerPage brokerscedulepage;

    @Step
	public boolean click_sceduler_assignshifts() throws Exception {
		return brokerscedulepage.click_sceduler_assignshifts();
	 }
    
   
}
    
    