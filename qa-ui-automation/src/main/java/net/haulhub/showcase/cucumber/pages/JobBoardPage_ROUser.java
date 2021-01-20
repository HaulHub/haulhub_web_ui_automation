package net.haulhub.showcase.cucumber.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.haulhub.showcase.cucumber.utils.ElementUtils;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class JobBoardPage_ROUser extends PageObject {


    WebDriverWait wait = new WebDriverWait(getDriver(), 10);

    public JobBoardPage_ROUser(WebDriver driver) {
        super(driver);
    }

    public ElementUtils elementUtils = new ElementUtils(getDriver());

    @FindBy(how = How.XPATH, using = "//*[@class='page-header__content']//*[contains(text(),'Job Board')]")
    public WebElementFacade lblJobBoard;


    @FindBy(how = How.XPATH, using = "//*[@class='nav-sidebar']//*[contains(text(),'Job Management')]")
    public WebElementFacade lnkJobManagement;


    @FindBy(how = How.XPATH, using = "//*[@class='nav-sidebar']//*[contains(text(),'Daily Lineup')]")
    public WebElementFacade lnkDailyLineUp;


    @FindBy(how = How.XPATH, using = "//*[@class='nav-sidebar']//*[contains(text(),'Job Board')]")
    public WebElementFacade lnkJobBoard;


    @FindBy(how = How.XPATH, using = "//*[@class='nav-sidebar']//*[contains(text(),'Tickets')]")
    public WebElementFacade lnkTickets;


    @FindBy(how = How.XPATH, using = "//span[text()='Order Dashboard']")
    public WebElementFacade lnkOrderDashBoard;

    @FindBy(how = How.XPATH, using = "//*[@id='react-select-2--value']")
    public WebElementFacade selStatus;

    @FindBy(how = How.XPATH, using = "//*[@class='sub-nav__item']//*[contains(@href,'customer/jobs/')]")
    public WebElementFacade lnkJobnumber;

    @FindBy(how = How.XPATH, using = "//*[@id='react-select-2--value']")
    public WebElementFacade lnkUpcoming;



    public boolean CheckNavigationToJobBoardPage(){

        try {
            getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            elementUtils.fluentWaitForElement(getDriver(),lblJobBoard).isDisplayed();

            return true;
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return false;
    }


    public boolean checkAccessAvailability() {

        try {

            getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            elementUtils.fluentWaitForElement(getDriver(),lnkJobManagement).isEnabled();

            getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            elementUtils.fluentWaitForElement(getDriver(),lnkDailyLineUp).isEnabled();

            getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            elementUtils.fluentWaitForElement(getDriver(),lnkJobBoard).isEnabled();

            getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            elementUtils.fluentWaitForElement(getDriver(),lnkTickets).isEnabled();

            getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            elementUtils.fluentWaitForElement(getDriver(),lnkOrderDashBoard).isEnabled();

            return true;
        }catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return false;
    }


}
