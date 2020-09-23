package net.haulhub.showcase.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityDOTSlipHomeSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;

@SuppressWarnings("unused")
public class DOTSlipHomePageSteps {

	@Steps
	SerenityDOTSlipHomeSteps serenitydotsliphomeSteps;

	@Given("I validate the appearance of headers like Today and MyProjects Feed and click Gear Icon")
	public void click_dashboardlink_firstbroker() throws Exception {
		assertTrue(serenitydotsliphomeSteps.Validateheaders());
	}
	
	@Given("I click the Today link within DOTSlip page loads the associated TODAY page")
	public void click_today_link() throws Exception {
		assertTrue(serenitydotsliphomeSteps.Validatetodaylinkpageload());
	}
	
	@Given("I click the FEED link within DOTSlip page loads the associated FEED page")
	public void click_FEED_link() throws Exception {
		assertTrue(serenitydotsliphomeSteps.ValidateFEEDlinkpageload());
	}
	
	@Given("I click the MYPROJECTS link within MYPROJECTS page loads the associated MYPROJECTS page")
	public void click_MYPROJECTS_link() throws Exception {
		assertTrue(serenitydotsliphomeSteps.ValidateMYPROJECTSlinkpageload());
	}
	
	@Given("I search with ticketnumber (.*) click update results button and validate the results are filtered correctly")
	public void search_ticketnumber_updateresults(String ticketnumber) throws Exception {
		assertTrue(serenitydotsliphomeSteps.Searchwithticketnumber(ticketnumber));
	}
	
	@Given("I clicking the ticketnumber (.*) could view the reject delivered button associated to Feed Ticketnumber")
	public void clickticketnumber_viewbuttons(String ticketnumber) throws Exception {
		assertTrue(serenitydotsliphomeSteps.clickandviewbuttons(ticketnumber));
	}
	
	@Given("clicking the contractorname (.*) displayed and check invite button appears correctly")
	public void check_contractorname(String contractorname) throws Exception {
		assertTrue(serenitydotsliphomeSteps.viewinvitebutton(contractorname));
	}
	
	@Given("I select the contractorname (.*) click update results button and validate the results are filtered correctly")
	public void selectbycontractname_filterresults(String ticketnumber) throws Exception {
		assertTrue(serenitydotsliphomeSteps.selectbycontractname_filterresults(ticketnumber));
	}



}