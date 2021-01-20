package net.haulhub.showcase.cucumber.steps;


import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityJobBoardPageSteps;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityLoginSteps;
import net.thucydides.core.annotations.Steps;




public class ReadOnlyUserTestSteps {

    @Steps
    SerenityLoginSteps serenityloginsteps;
    @Steps
    SerenityJobBoardPageSteps serenityjobboardpagesteps;


    @When("I Check Im navigated to Job Board page")
    public void i_Check_Im_navigated_to_Job_Board_page() throws Throwable {

        serenityjobboardpagesteps.checkNavigationToJobBoardPage();
    }

    @Then("I check available access to the Read-only user$")
    public void i_check_available_access_to_the_Read_only_user() throws Throwable {

        assertTrue(serenityjobboardpagesteps.checkAccessAvailability());
    }



}