package cucumberLearning;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Tags", glue = { "cucumberLearning" },
tags = "(@tag1 or @tag2) and not @tag3"
)
public class runnerclasstags {

}
