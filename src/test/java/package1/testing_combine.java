package package1;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = "use_case",
plugin = {"html:target/cucmber/wikipidia.html"},
snippets = SnippetType.CAMELCASE ,
glue= {"package1"},
strict=true)
public class testing_combine {

}