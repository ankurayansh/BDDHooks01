package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
//		features = "src//test//resources//features//tagsample.feature",
		features = "src//test//resources//features",
		glue ={"stepdefs"},
		monochrome=true
//		tags={"@SmokeTest"}
		//Other than smoke Test
//		tags={"not @SmokeTest"}
//		One to run other not
//				tags={"not @SmokeTest",  "@RegressionTest"}
//				tags={"@FunctionTest, @EndToEndTest"}
//				tags={"@SmokeTest"}
		)
		

public class TagRunner {

}
