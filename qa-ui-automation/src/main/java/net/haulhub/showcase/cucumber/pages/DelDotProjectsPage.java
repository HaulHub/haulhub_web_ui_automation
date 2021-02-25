package net.haulhub.showcase.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import net.haulhub.showcase.cucumber.utils.ElementUtils;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DelDotProjectsPage extends PageObject {

	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	public DelDotProjectsPage(WebDriver driver) {
		super(driver);
	}

	public ElementUtils elementUtils = new ElementUtils(getDriver());

	@FindBy(how = How.XPATH, using = "//span[text()='My Projects']")
	public WebElementFacade lnkMyProjects; 
}