package sakancom;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="Use_Cases",
		plugin="html:target/cucumber/report.html",
		monochrome=true,
		snippets=SnippetType.CAMELCASE,
		glue="sakancom")


public class AcceptanceTest {

}
