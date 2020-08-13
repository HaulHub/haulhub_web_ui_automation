package net.haulhub.showcase.cucumber.steps.serenity;

import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import net.haulhub.showcase.cucumber.pages.HomeDashboardPage;
import net.haulhub.showcase.cucumber.pages.HomeAdminDashboardPage;
import net.haulhub.showcase.cucumber.pages.LoginPage;
import net.haulhub.showcase.cucumber.pages.LoginadminPage;
import net.haulhub.showcase.cucumber.utils.LearningPlatformConstants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class SerenityLoginSteps extends ScenarioSteps {

public LoginPage loginpage;
public LoginadminPage loginadminpage;
  
      
        @Step("Login to the customerLogin Application")
        public HomeDashboardPage Userlogin(String userName, String password) {
            WebDriver driver = loginpage.getDriver();
         //   getDriver().manage().window().setSize(new Dimension(1280,800));
            getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            loginpage.open();
            String envURL = getDriver().getCurrentUrl();
        	LearningPlatformConstants.environmentURL.set(envURL);
            return loginpage.customerLogin(userName, password);
    }
        
       @Step("Login to the adminlogin Application")
       public HomeAdminDashboardPage adminlogin(String userName, String password) {
            WebDriver driver = loginadminpage.getDriver();
            getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            getDriver().navigate().to("https://testing.haulhub.com/admin/login");
            String envURL = getDriver().getCurrentUrl();
        	LearningPlatformConstants.environmentURL.set(envURL);
        	return loginadminpage.adminLogin(userName, password);
    }
}