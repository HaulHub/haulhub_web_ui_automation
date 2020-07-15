package net.haulhub.showcase.cucumber.steps.serenity;

import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import net.haulhub.showcase.cucumber.pages.SettingsPage;
import net.haulhub.showcase.cucumber.utils.LearningPlatformConstants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class SerenitySettingsSteps extends ScenarioSteps {

public SettingsPage settingspage;
  
    @Step
	public boolean gotoequipmentlistpage() throws Exception  {
		return settingspage.gotoequipmentlistpage();
	 }
    
    @Step
   	public boolean  gotomaterialslistpage() throws Exception  {
   		return settingspage.gotomateriallistpage();
   	 }
    
    @Step
	public boolean equipmentadddedsuccessfuly() throws Exception  {
		return settingspage.equipmentadddedsuccessfuly();
	 }
    
    @Step
	public boolean materialadddedsuccessfuly() throws Exception  {
		return settingspage.materialadddedsuccessfuly();
	 }
    
    @Step
	public boolean  edit_equipment() throws Exception  {
		return settingspage.edit_equipment();
	 }
    
    @Step
	public boolean  edit_material() throws Exception  {
		return settingspage.edit_material();
	 }
   
    @Step
	public boolean  delete_updated_equipment() throws Exception  {
		return settingspage.delete_updated_equipment();
	 }
    
    @Step
	public boolean  delete_updated_material() throws Exception  {
		return settingspage.delete_updated_material();
	 }
   
 }


