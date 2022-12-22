package orange.usa.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin= {"pretty","json:target/cucumber.json" }, //To generate the report by html 
		features={".//Features/"},
		glue={"orange.usa.stepdefinations","orange.usa.hooks"},
		dryRun = false,   //If dryRun is true then check all the steps of Step Definition class
		monochrome = true, 
		//strict= true,  //default is false, true:will fail execution if there are undefined 
		                 // or pending steps
		tags = "@Sanity"   
		
		
		
		)
public class MyRunner extends AbstractTestNGCucumberTests {

}
