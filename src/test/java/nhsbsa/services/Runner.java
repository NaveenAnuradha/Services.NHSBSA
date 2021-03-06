package nhsbsa.services;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        plugin = {"pretty", "html:target/cucumber-reports"},
        tags = {"@smoke"},
        glue = {"nhsbsa.services", "steps"})

public class Runner {
}
