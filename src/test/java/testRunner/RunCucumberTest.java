package testRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="../CucumberWithSelenium/src/test/resources/", glue = "stepDefinitions",plugin = {"pretty","html:target/cucumber-reports"},dryRun=true)
public class RunCucumberTest{
}
