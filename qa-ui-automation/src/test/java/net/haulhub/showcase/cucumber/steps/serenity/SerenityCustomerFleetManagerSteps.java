package net.haulhub.showcase.cucumber.steps.serenity;

import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import net.haulhub.showcase.cucumber.pages.BrokerDashboardPage;
import net.haulhub.showcase.cucumber.pages.FleetJobOffersPage;
import net.haulhub.showcase.cucumber.pages.CustomerFleetManagerPage;
import net.haulhub.showcase.cucumber.utils.LearningPlatformConstants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class SerenityCustomerFleetManagerSteps extends ScenarioSteps {

	public CustomerFleetManagerPage customerfleetmanagerpage;
  
    @Step
	public boolean Validate_complianceFleetdetails(String customername) throws Exception {
		return customerfleetmanagerpage.Validate_complianceFleetdetails(customername);
	 }
    
    @Step
	public boolean  add_insurance_displayfields()throws Exception {
		return customerfleetmanagerpage.add_insurance_displayfields();
	 }

    @Step
   	public boolean  insurance_agent_button()throws Exception {
   		return customerfleetmanagerpage.add_insurance_agentbtn();
   	 }
    
    @Step
   	public boolean add_contract_btn()throws Exception {
   		return customerfleetmanagerpage.add_contract_btn();
   	 }
    
    @Step
   	public boolean monitoringheader_newmonitorwindow()throws Exception {
   		return customerfleetmanagerpage.monitoringheader_newmonitorwindow();
   	 }
    
    @Step
   	public boolean documentheader()throws Exception {
   		return customerfleetmanagerpage.documentheader();
   	 }
    
    @Step
   	public boolean driverheaderlableload()throws Exception {
   		return customerfleetmanagerpage.driverheaderlableload();
   	 }
    
    @Step
   	public boolean  Trucksheaderlableload()throws Exception {
   		return customerfleetmanagerpage.Trucksheaderlableload();
   	 }
    

    
}
    
    