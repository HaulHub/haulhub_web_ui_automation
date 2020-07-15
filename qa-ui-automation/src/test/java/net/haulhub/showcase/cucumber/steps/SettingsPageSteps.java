package net.haulhub.showcase.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.haulhub.showcase.cucumber.steps.serenity.SerenitySettingsSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.WebDriver;

@SuppressWarnings("unused")

public class SettingsPageSteps {

	@Steps
	SerenitySettingsSteps serenitysettingsSteps;
	

	
	@Given("I Go to Equipments lists page")
	public void go_to_equipements_list_page() throws Exception {
		assertTrue(serenitysettingsSteps.gotoequipmentlistpage());
	}
	
	@Given("I Go to Materials lists page")
	public void go_to_Materials_list_page() throws Exception {
		assertTrue(serenitysettingsSteps.gotomaterialslistpage());
	}
	
	@Given("I Add material and see the material added successfully")
	public void material_added_successfully() throws Exception {
		assertTrue(serenitysettingsSteps.materialadddedsuccessfuly());
	}
	
	@Given("I Add an Equpment and see the Equpiment added successfully")
	public void equipment_added_successfully() throws Exception {
		assertTrue(serenitysettingsSteps.equipmentadddedsuccessfuly());
	}
	
	@Given("I Edit update the created equipment and confirms equipment is reflected with updatedname")
	public void edit_equipment() throws Exception {
		assertTrue(serenitysettingsSteps.edit_equipment());
	}
	
	@Given("I Edit update the created material and confirms material is reflected with updatedname")
	public void edit_material() throws Exception {
		assertTrue(serenitysettingsSteps.edit_material());
	}
	
	@Given("I delete the updated equipment")
	public void delete_updated_equipment() throws Exception {
		assertTrue(serenitysettingsSteps.delete_updated_equipment());
	}
	
	@Given("I delete the updated material")
	public void delete_updated_material() throws Exception {
		assertTrue(serenitysettingsSteps.delete_updated_material());
	}
	
}