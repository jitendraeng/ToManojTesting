package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
features = ".\\src\\test\\resources\\Features\\HRDashBoard.feature", //path of the step features file
glue = {"StepDefinitions" },//path of the step definitions file
monochrome = true,
plugin = { "pretty", "json:target/JsonRecords/report.json","html:target/HTMLReports"},
dryRun=false
//tags="@smoke" 

)

public class TestRunner {

}
 