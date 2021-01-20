package net.haulhub.showcase.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/StagingSmokeSuite/ReadOnlyUserTest.feature"},monochrome=true)


public class ReadOnlyUserTestRunner {

}
