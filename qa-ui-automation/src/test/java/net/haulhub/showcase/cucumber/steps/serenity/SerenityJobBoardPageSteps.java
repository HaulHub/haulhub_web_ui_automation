package net.haulhub.showcase.cucumber.steps.serenity;

import net.haulhub.showcase.cucumber.pages.JobBoardPage_ROUser;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class SerenityJobBoardPageSteps extends ScenarioSteps  {

    JobBoardPage_ROUser jobboardpage;

    @Step
    public boolean checkNavigationToJobBoardPage() throws Exception {
        return jobboardpage.CheckNavigationToJobBoardPage();
    }


    @Step
    public boolean checkAccessAvailability() throws Exception {
        return jobboardpage.checkAccessAvailability();
    }


}
