package StepDef;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import Pages.CheckBox;
import Pages.ExitIntent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class ExitIntentStepDef {

	ExitIntent exitIntent;
	WebDriver driver;
	
	 @Given ("User is on the heroku webpage for exit intent")
	 public void user_is_on_the_heroku_page()
	    {
	        driver= DriverFactory.getDriver();
	        exitIntent=new ExitIntent(driver);
	        driver.get("https://the-internet.herokuapp.com/");

	    }
	 
	 @When ("User navigates to exit intent page")
	 public void user_navigates_to_checkboxes_page()
	    {
		    exitIntent.navigateToExitIntent();
	    }
	 
	 @And ("User Mouse out of the viewport pane")
	 public void user_mouse_out_of_viewport_pane() throws InterruptedException
	    {
		    exitIntent.userMouseOut();
	    }
	 
	    @Then ("User should see a modal window appear")
	    public void user_should_see_modal()
	    {
		    assertTrue("Modal window should be visible",exitIntent.isModalDisplayed() );
	    }
	    
}
