package net.haulhub.showcase.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityLoginSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


import org.openqa.selenium.WebDriver;

@SuppressWarnings("unused")

public class LoginPageSteps {

	@Steps
	SerenityLoginSteps serenityLoginSteps;

	@Given("Login to the application with valid (.*) and (.*)")
	public void Login_to_the_application(String userName, String password) throws Exception {
		serenityLoginSteps.Userlogin(userName, password);
	}
	
	@Given("admin Login to the application with valid (.*) and (.*)")
	public void admin_login(String userName, String password) throws Exception {
		serenityLoginSteps.adminlogin(userName, password);
	}
}