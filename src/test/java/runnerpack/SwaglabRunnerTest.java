package runnerpack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
                 glue= {"stepdef","hookspack"},
                 publish =true,
                 //plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
                 //  plugin= {"pretty","html:target/cucumber.html"},
                   plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}
                 
                 )
public class SwaglabRunnerTest {

}

