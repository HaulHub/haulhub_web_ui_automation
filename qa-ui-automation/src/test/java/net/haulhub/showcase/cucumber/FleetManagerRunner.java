package net.haulhub.showcase.cucumber;

import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/StagingSmokeSuite/FleetManagerSuite.feature"},monochrome=true)

public class FleetManagerRunner {

}
