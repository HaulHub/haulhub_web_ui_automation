package net.haulhub.showcase.cucumber.steps.serenity;

import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import net.haulhub.showcase.cucumber.pages.HomeDashboardPage;
import net.haulhub.showcase.cucumber.pages.LoginPage;
import net.haulhub.showcase.cucumber.utils.LearningPlatformConstants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class SerenityLoginSteps extends ScenarioSteps {

public LoginPage loginpage;
  
      
        @Step("Login to the OrangeLogin Application")
        public HomeDashboardPage Userlogin(String userName, String password) {
            WebDriver driver = loginpage.getDriver();
         //   getDriver().manage().window().setSize(new Dimension(1280,800));
            getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            loginpage.open();
            String envURL = getDriver().getCurrentUrl();
        	LearningPlatformConstants.environmentURL.set(envURL);
            return loginpage.customerLogin(userName, password);
    }
}