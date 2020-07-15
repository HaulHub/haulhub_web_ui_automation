package net.haulhub.showcase.cucumber.steps.serenity;

import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import net.haulhub.showcase.cucumber.pages.CustomersPage;
import net.haulhub.showcase.cucumber.utils.LearningPlatformConstants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class SerenityCustomerSteps extends ScenarioSteps {

public CustomersPage customerpage;
  
    @Step
	public boolean  gotomanagecustomerpage() throws Exception  {
		return customerpage.gotomanagecustomerpage();
	 }
    
    @Step
   	public boolean  validate_newcustomerprofile() throws Exception  {
   		return customerpage.validate_newcustomerprofile();
   	 }
    
    @Step
   	public boolean  validate_customernamereflected() throws Exception  {
   		return customerpage.edit_customernamereflected();
   	 }
    
    @Step
   	public boolean  delete_customernamereflected() throws Exception  {
   		return customerpage.delete_customernamereflected();
   	 }
    
 }


