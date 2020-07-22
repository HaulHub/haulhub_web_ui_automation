package net.haulhub.showcase.cucumber.steps.serenity;

import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import net.haulhub.showcase.cucumber.pages.HomeDashboardPage;
import net.haulhub.showcase.cucumber.utils.LearningPlatformConstants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class SerenityHomeDashboardSteps extends ScenarioSteps {

	 public HomeDashboardPage homedashboardpage;
  
    @Step
	public boolean clickOrderDashboardlink() throws Exception {
		return homedashboardpage.clickOrderdashboardlink();
	 }
    
    @Step
   	public boolean clickFOBMateriallogo() throws Exception {
   		return homedashboardpage.clickFOBMateriallogo();
   	 }
    
    @Step
   	public boolean click_add_jobsite() throws Exception {
   		return homedashboardpage.clickaddjobsite();
   	 }
    
    @Step
   	public boolean clickHideCancelledchkbox() throws Exception {
   		return homedashboardpage.clickHideCancelchkbox();
   	 }
    
    @Step
   	public boolean checkclickorderreportbtn() throws Exception {
   		return homedashboardpage.checkclickorderreportbtn();
   	 }
    
    @Step
   	public boolean checkCancelPreviewDownloadlnks() throws Exception {
   		return homedashboardpage.checkCancelPreviewDownloadlnks();
   	 }
    
    @Step
   	public boolean filljobsitedetails(String jobsitename,String onsitecontactname,String phonenumber,String Address) throws Exception {
   		return homedashboardpage.filljobsitedetails(jobsitename,onsitecontactname,phonenumber,Address);
   	 }
    
    @Step
   	public boolean validate_jobsite_created() throws Exception {
   		return homedashboardpage.validatejobsitecreated();
   	 }
    
    @Step
   	public boolean clickCancelOrderreport() throws Exception {
   		return homedashboardpage.clickCancelOrderreport();
   	 }
    
    @Step
   	public boolean clickNewOrderbutton()  throws Exception{
   		return homedashboardpage.clickneworderbutton();
   	 }
    
    @Step
   	public boolean clickGotoTodayLink() throws Exception {
   		return homedashboardpage.gotodaylink();
   	 }
    
    @Step
   	public boolean viewCreatedOrderDetails() throws Exception {
   		return homedashboardpage.viewCreatedOrderDetails();
   	 }
    
    @Step
   	public boolean clickReBookOrder() throws Exception {
   		return homedashboardpage.clickRebookOrderbtn();
   	 }
    
    @Step
   	public boolean clickCancelOrderbtn() throws Exception {
   		return homedashboardpage.clickCancelOrderbtn();
   	 }
    
    @Step
   	public boolean OrderCancelledvalidation() throws Exception {
   		return homedashboardpage.OrderCancelledvalidation();
   	 }
    
    @Step
   	public boolean reject_order() throws Exception {
   		return homedashboardpage.RejectOrderDetails();
   	 }
    
    @Step
   	public boolean clickOrderDashboarlnk() throws Exception {
   		return homedashboardpage.Clickorderdashboardlnk();
   	 }
    
    
   
}