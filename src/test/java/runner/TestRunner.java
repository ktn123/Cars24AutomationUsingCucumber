package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/resources/features"},
		glue= "steps",
		tags = "@Search-Cars",
		monochrome = true,
		plugin = {"pretty" ,"html:target/htmlReports"}
		)
public class TestRunner{
	
}
