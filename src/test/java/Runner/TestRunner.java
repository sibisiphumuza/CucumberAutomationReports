package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "", features = "src/test/resources/features/LoginPage.feature", glue = "StepsDefinition",
                 plugin = {})
    
public class TestRunner {
    
}
