package net.haulhub.showcase.cucumber;

import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/StagingSmokeSuite/BrokerSmokePart1.feature"},monochrome=true)

public class BrokerSmoke1Runner {

}
