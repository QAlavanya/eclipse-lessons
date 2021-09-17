package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\madhu\\workspace\\FreeCrmBddFramework\\src\\main\\java\\Features\\login.feature", 
		glue = {"stepDefinition"},
		plugin = {"pretty", "html:test-outout"}
		)


public class TestRunner {

}
