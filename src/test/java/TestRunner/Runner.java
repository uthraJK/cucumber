package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featurefiles", glue="/Cucumber/src/main/java/stepDefinition/stepsDefinition.java")

public class Runner {

}
