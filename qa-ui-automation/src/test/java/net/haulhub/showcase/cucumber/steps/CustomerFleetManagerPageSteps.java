package net.haulhub.showcase.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.haulhub.showcase.cucumber.steps.serenity.SerenityCustomerFleetManagerSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;

@SuppressWarnings("unused")
public class CustomerFleetManagerPageSteps {

	@Steps
	SerenityCustomerFleetManagerSteps serenitycustomerfleetmanagerSteps;
	
    @Given("I click Fleetdetails (.*) tab and validate p.no, address ,contact number,USDOT Details are displayed correctly")
    public void fleet_assigndrivers(String customername) throws Exception {
    assertTrue(serenitycustomerfleetmanagerSteps.Validate_complianceFleetdetails(customername));
	}
    
    @Given("click Add insurance button displays types,coverages,agents and supporting document Compliance Details")
    public void add_insurance_displayfields() throws Exception {
    assertTrue(serenitycustomerfleetmanagerSteps.add_insurance_displayfields());
	}
    
    
    @Given("click insurance agent button and add insurance compliance details")
    public void insurance_agent_button() throws Exception {
    assertTrue(serenitycustomerfleetmanagerSteps.insurance_agent_button());
	}
    
    @Given("click add contract document btn displays Add Contract new modal window")
    public void add_insurance_agentbtn() throws Exception {
    assertTrue(serenitycustomerfleetmanagerSteps.add_contract_btn());
	}
    
    @Given("click monitoring header Add reports that launches New Monitoring report window")
    public void monitoringheader_newmonitorwindow() throws Exception {
    assertTrue(serenitycustomerfleetmanagerSteps.monitoringheader_newmonitorwindow());
	}
    
    @Given("click Documents header Add documents launches Add document window")
    public void documentheader() throws Exception {
    assertTrue(serenitycustomerfleetmanagerSteps.documentheader());
	}
    
    @Given("click Drivers header Add see Drivers Label loaded correctly")
    public void driverheaderlableload() throws Exception {
    assertTrue(serenitycustomerfleetmanagerSteps.driverheaderlableload());
	}
    
    @Given("click Trucks header and see Trucks label loaded correctly")
    public void Trucksheaderlableload() throws Exception {
    assertTrue(serenitycustomerfleetmanagerSteps.Trucksheaderlableload());
	}


    
  
   


}   