package net.haulhub.showcase.cucumber.steps.serenity;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import net.haulhub.showcase.cucumber.pages.OrderPage;
import net.haulhub.showcase.cucumber.pages.TruckScedulePage;
import net.haulhub.showcase.cucumber.utils.LearningPlatformConstants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class SerenityTruckSceduleSteps extends ScenarioSteps {

	 public TruckScedulePage truckscedulepage;
	 
    @Step
	public boolean ClickTrucksceduleAddtrucks() throws Exception  {
		return truckscedulepage.ValidateTruckmissingmessageAddtrucks();
	 }
    
    @Step
	public boolean fill_fleetdetails(String fleet,String fleetpriority) throws Exception  {
		return truckscedulepage.Fillfleetdetails(fleet,fleetpriority);
    }
    
    @Step
	public boolean SMSConfirmation() throws Exception  {
		return truckscedulepage.SMSConfirmation();
    }
   
  
}