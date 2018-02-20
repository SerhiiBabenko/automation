package ua.com.stolkacha.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import ua.com.stolkacha.BaseTest;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/",
        glue = "ua.com.stolkacha.cucumber.steps",
        tags = {"@regression"},
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"
        }
)
public class CucumberSuite extends BaseTest {


}
