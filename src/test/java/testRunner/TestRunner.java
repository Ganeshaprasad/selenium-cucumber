package testRunner;
//This is my test runner class

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//Feature//Login.feature",
        glue = "stepDefinations",
        //dryRun = true,
        monochrome = true,
         tags= "@sanity",
        plugin = {"pretty", "html:test-output"}
)
public class TestRunner {

}
