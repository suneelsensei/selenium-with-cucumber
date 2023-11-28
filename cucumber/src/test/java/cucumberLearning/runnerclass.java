package cucumberLearning;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "cucumberLearning" }, monochrome = true, 
plugin = {"pretty", "json:target/JSONReports/report.json" },tags = "@f_test")
public class runnerclass {

}
