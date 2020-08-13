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
    
    @Step
	public boolean new_order_truckscedule() throws Exception  {
		return truckscedulepage.new_order_truckscedule();
    }
    
    @Step
	public boolean new_materialorder_window() throws Exception  {
		return truckscedulepage.new_materialorder_window();
    }
    
    @Step
   	public boolean clicktruckreport() throws Exception  {
   		return truckscedulepage.clicktruckreportbtn();
       }
    
    @Step
   	public boolean clicktruckscedule() throws Exception  {
   		return truckscedulepage.clicktruckscedule();
       }

    @Step
   	public boolean  sendtruckreport() throws Exception  {
   		return truckscedulepage.sendtruckreport();
       }
    
    @Step
   	public boolean  resettruckreport() throws Exception  {
   		return truckscedulepage.resettruckreport();
       }
}