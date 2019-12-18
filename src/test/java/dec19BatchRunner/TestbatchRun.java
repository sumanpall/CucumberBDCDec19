package dec19BatchRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber .class)
@CucumberOptions(features="demodec13.feature",glue= {"stepDef13Dec19"},
tags= {"@Data"},plugin= {"json:target\\cucumber-report.json"})
public class TestbatchRun {
	

}
