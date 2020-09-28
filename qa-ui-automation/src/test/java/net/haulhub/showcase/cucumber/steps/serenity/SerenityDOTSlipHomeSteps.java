package net.haulhub.showcase.cucumber.steps.serenity;

import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import net.haulhub.showcase.cucumber.pages.DOTSlipHomePage;
import net.haulhub.showcase.cucumber.utils.LearningPlatformConstants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class SerenityDOTSlipHomeSteps extends ScenarioSteps {

	 public DOTSlipHomePage dotsliphomedpage;
  
    @Step
	public boolean Validateheaders() throws Exception {
		return dotsliphomedpage.Validateheaders();
	 }
    
    @Step
   	public boolean  Validatetodaylinkpageload() throws Exception {
   		return dotsliphomedpage.Validatetodaylinkpageload();
   	 }
    
    @Step
   	public boolean  ValidateFEEDlinkpageload() throws Exception {
   		return dotsliphomedpage.ValidateFEEDlinkpageload();
   	 }
    
    @Step
   	public boolean ValidateMYPROJECTSlinkpageload() throws Exception {
   		return dotsliphomedpage.ValidateMYPROJECTSlinkpageload();
   	 }
    
    @Step
   	public boolean Searchwithticketnumber(String ticketnumber) throws Exception {
   		return dotsliphomedpage.Searchwithticketnumber(ticketnumber);
   	 }
    
    @Step
   	public boolean selectbycontractname_filterresults(String Contractorname) throws Exception {
   		return dotsliphomedpage.selectbycontractname_filterresults(Contractorname);
   	 }
    
    @Step
   	public boolean clickandviewbuttons(String ticketnumber) throws Exception {
   		return dotsliphomedpage.clickandviewbuttons(ticketnumber);
   	 }
    
    @Step
   	public boolean  viewinvitebutton(String contractorname) throws Exception {
   		return dotsliphomedpage.clickandviewinvitebuttons(contractorname);
   	 }
    
    @Step
   	public boolean enterdetailsclickbutton() throws Exception {
   		return dotsliphomedpage.enterdetailsclickbutton();
   	 }
 
 
    
 
}
    
    