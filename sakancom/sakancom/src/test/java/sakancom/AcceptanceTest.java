package sakancom;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
	//done	features="Use_Cases/provided",
		//done	features="Use_Cases/Owner",
//		done	
//		features="Use_Cases/Admin/Watching_reservations_via_the_system_ADMIN.feature",

		features="Use_Cases",
		plugin="html:target/cucumber/report.html",
		monochrome=true,
		snippets=SnippetType.CAMELCASE,
		glue="sakancom")


public class AcceptanceTest {

}
