package net.haulhub.showcase.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityHomeDashboardSteps;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityBrokerDashboardSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;

@SuppressWarnings("unused")
public class BrokerDashboardPageSteps {

	@Steps
	SerenityBrokerDashboardSteps serenitybrokerDashboardSteps;
	
    @Given("I click the Dashboard link in Firstbroker home page and validate assigned shifts displays under review section of Customer Jobs section")
    public void click_dashboardlink_firstbroker() throws Exception {
    assertTrue(serenitybrokerDashboardSteps.clickbrokerDashboardlink());
	}
    
    @Given("I click the Dashboard link in Firstbroker home page and validate shift declined by second broker within the Not sourced section of First Broker Dashboard")
    public void validate_firstbrokerdashboard_declinedsection() throws Exception {
    assertTrue(serenitybrokerDashboardSteps.firstbrokerdashboard_declinedsectionvalidation());
	}
   
    @Given("I click the Dashboard link in Secondbroker home page and validate assigned shifts displays under review section of Customer Jobs section")
    public void click_dashboardlink_secondbroker() throws Exception {
    assertTrue(serenitybrokerDashboardSteps.clickbrokerDashboardlink());
	}

    @Given("as first broker I click the assigned shifts view customer truck rate and  select all the 5 shifts and Accept to assign drivers")
    public void selectallshifts_assigndrivers() throws Exception {
    assertTrue(serenitybrokerDashboardSteps.selectallshifts_assigndrivers());
	}
    
    @Given("as second broker I view the first broker rate then click the assigned shifts and select all the 3 shifts and click accept")
    public void selectallshifts_assigndriverssecondbroker() throws Exception {
    assertTrue(serenitybrokerDashboardSteps.selectallshifts_assigndriverssecondbroker());
	}
    
    @Given("as second broker I click Accept later button under Customer jobs Section")
    public void clickacceptlaterbutton_CustomerJobs() throws Exception {
    assertTrue(serenitybrokerDashboardSteps.clickacceptlaterbutton());
	}
    
    @Given("as first broker I assign 1 shift to Internal truck and 3 shifts to secondbroker and then declines the last shift")
    public void firstbroker_assignstodifferent_entities() throws Exception {
    assertTrue(serenitybrokerDashboardSteps.firstbroker_assignstodifferent_entities());
	}
    
    @Given("as first broker I view the declined and generalpool shift appearing under the MarketPlace section of MarketPlace Jobs Header")
    public void declinedshift_appearing_undermarketplace() throws Exception {
    assertTrue(serenitybrokerDashboardSteps.declinedshift_appearing_undermarketplace());
	}

}   