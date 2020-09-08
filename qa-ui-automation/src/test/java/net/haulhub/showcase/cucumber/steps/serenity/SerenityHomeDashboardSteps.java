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
	public boolean clickTruckScedulepage() throws Exception {
		return homedashboardpage.clickTruckScedulepage();
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
   	public boolean checkjobboardlnk() throws Exception {
   		return homedashboardpage.jobboardlnk();
   	 }
    
    @Step
   	public boolean checkbookjobpageapperence() throws Exception {
   		return homedashboardpage.checkbookjobappearence();
   	 }
    
    @Step
   	public boolean checkDailyLineuppage() throws Exception {
   		return homedashboardpage.checkdailylineuppage();
    }
    
    @Step
   	public boolean checkJobBoardpage() throws Exception {
   		return homedashboardpage.checkJobBoardpage();
    }
    
    @Step
   	public boolean checktimesheetpage() throws Exception {
   		return homedashboardpage.checktimesheetpage();
    }
    
    @Step
   	public boolean checkticketspage() throws Exception {
   		return homedashboardpage.checkticketspage();
    }
    
    @Step
   	public boolean checkplantspage() throws Exception {
   		return homedashboardpage.checkplantspage();
    }
    
    @Step
   	public boolean micsistespage() throws Exception {
   		return homedashboardpage.checkmicsistespage();
    }
    
    @Step
   	public boolean PaymentsTransactionspage() throws Exception {
   		return homedashboardpage.checkTransactionspage();
    }
    
    @Step
   	public boolean invoiceslnkpage() throws Exception {
   		return homedashboardpage.checkinvoicespage();
    }
    
    @Step
   	public boolean certifiedlnkpage() throws Exception {
   		return homedashboardpage.checkcertifiedlnkpage();
    }
    
    @Step
   	public boolean DOTManagementpage() throws Exception {
   		return homedashboardpage.checkDOTManagementpage();
    }
    
    @Step
   	public boolean FleetManagerpage() throws Exception {
   		return homedashboardpage.checkfleetManagerpage();
    }
    
    @Step
   	public boolean Contractorpage_appearence() throws Exception {
   		return homedashboardpage.checkContractorpage();
    }
    
    @Step
   	public boolean whatnewpage_appearence() throws Exception {
   		return homedashboardpage.checkwhatnewpage();
    }

    @Step
   	public boolean  reportingpage_appearence() throws Exception {
   		return homedashboardpage.checkreportingpage();
    }
   
    @Step
   	public boolean clickOrderDashboarlnk() throws Exception {
   		return homedashboardpage.Clickorderdashboardlnk();
   	 }
    
    
   
}