package orange.usa.stepdefinations;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orange.usa.basepage.BasePage;
import orange.usa.elementpage.LoginElementPage;
import orange.usa.generic.CommonUtility;
import orange.usa.generic.WaitHelper;



public class LoginTest extends BasePage {
	LoginElementPage pf;
	
	@Given("User able to open any browser")
	public void user_able_to_open_any_browser() {
		//logger.info("User able to open any browser");
		//BasePage.initialization();
		BasePage.startAutomation();
		//LoginElementPage pf =new LoginElementPage();
		 pf= new LoginElementPage();   
	   
	}
	@Given("User able to enter the url {string}")
	public void user_able_to_enter_the_url(String url) {
		logger.info("User able to enter the url");
		driver.get(url);  
	   
	}
	@Given("User able to enter the userName")
	public void user_able_to_enter_the_user_name() {
		logger.info("User able to enter the userName");
		 //pf.getUserName().sendKeys("Admin");
		//pf.getUserName("Admin");
		pf.getUserName(prop.getProperty("userName"));   
	   
	}
	@Given("User able to enter the password")
	public void user_able_to_enter_the_password() {
		logger.info("User able to enter the password");
		// pf.getPassword().sendKeys("admin123");
				// pf.getPassword("admin123");
			    pf.getPassword(prop.getProperty("pwd"));  
	   
	}
	@When("User able to click on the LOGIN button")
	public void user_able_to_click_on_the_login_button() {
		logger.info("User able to click on the LOGIN button");
		WaitHelper.waitUntilElementPresent(pf.getClickOnSignButton());
		CommonUtility.getActionClick(pf.getClickOnSignButton());  //Called from Common utility 
		//CommonUtility.getJSClick(pf.getClickOnSignButton());    //JS click
	   
	}
	@When("User able to click on the Paul Collings")
	public void user_able_to_click_on_the_paul_collings() {
		logger.info("User able to click on the Paul Collings");
		WaitHelper.waitUntilElementPresent(pf.getClickOnPaul());
		CommonUtility.getActionClick(pf.getClickOnPaul());  
	   
	}
	@When("User able to click on the Logout button")
	public void user_able_to_click_on_the_logout_button() {
		logger.info("User able to click on the Logout button");
		WaitHelper.waitUntilElementPresent(pf.getLogOut());
		CommonUtility.getActionClick(pf.getLogOut());    
	   
	}
	@Then("User can verify the user information {string} on the grid")
	public void user_can_verify_the_user_information_on_the_grid(String text) {
		logger.info("User can verify the user information");
		//WaitHelper.waitUntilElementPresent(pf.getVerifyText());
		CommonUtility.getVerifyTheResult(text,pf.getVerifyText().getText());
		
	    /* if(text.equals(pf.getVerifyText().getText())) {
	    	 System.out.println("Test is pass");
	     }
	     else {
	    	 System.out.println("Test is failed");
	     }*/
		
	 //String ActualResult="OrangeHRM";
	 //Assert.assertEquals(ActualResult, pf.getVerifyText().getText());
	//System.out.println(pf.getVerifyText().getText());  
	   
	}
}