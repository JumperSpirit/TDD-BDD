package fr.jumperspirit.it.sayhello.step;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/it/resources/cucumber/features/sayhello",
        
        //Optionalwhen the runner is in the same package with the steps glue code
        glue = "fr/jumperspirit/it/sayhello/step"
)
public class SayHelloStepRunner {

	
}
