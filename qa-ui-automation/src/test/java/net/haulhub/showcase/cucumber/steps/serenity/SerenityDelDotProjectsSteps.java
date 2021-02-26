package net.haulhub.showcase.cucumber.steps.serenity;

import net.haulhub.showcase.cucumber.pages.DelDotProjectsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")

public class SerenityDelDotProjectsSteps extends ScenarioSteps {
	
	DelDotProjectsPage deldotprojectssteps;
	 
	@Step
   	public boolean validateAssignProjects(String projName) throws Exception {
   		return deldotprojectssteps.validateAssignProjects(projName);
	}
	
	@Step
   	public boolean validateArchiveProjects(String projectName) throws Exception {
   		return deldotprojectssteps.validateArchiveProjects(projectName);
	}

}
