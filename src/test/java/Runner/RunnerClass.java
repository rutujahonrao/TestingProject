package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(features ="E:\\eclipse photon\\eclipse-jee-photon-R-win32-x86_64\\eclipse\\TestingProject\\Feature\\ScenarioLogin.feature",
	glue = { "StepDefinition" },
	dryRun = false
	)
	public class RunnerClass {

	}

