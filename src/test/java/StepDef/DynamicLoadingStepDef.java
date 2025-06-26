package StepDef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Pages.Dropdown;
import Pages.DynamicLoading;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class DynamicLoadingStepDef {
	DynamicLoading dynamicLoading;
	WebDriver driver;
	
	 @Given ("User is on the heroku webpage for dynamic loading")
	 public void user_is_on_the_heroku_page()
	    {
	        driver= DriverFactory.getDriver();
	        dynamicLoading=new DynamicLoading(driver);
	        driver.get("https://the-internet.herokuapp.com/");

	    }
	 
	 @When ("User navigates to dynamic loading page")
	 public void user_navigates_to_disappearing_elements_page()
	    {
		 dynamicLoading.navigateToDynamicLoading();
	    }
	 
	 @And ("User clicks on element on page that is hidden")
	 public void user_clicks_hidden_element()
	    {
		 dynamicLoading.navigateToHiddenElement();;
	    }
	 
	 @And ("User clicks on element rendered after the fact")
	 public void user_clicks_new_element()
	    {
		 dynamicLoading.navigateToNewElement();;
	    }
	 
	 @Then ("User should see the hello world element")
	 public void user_sees_hello_world_message()
	    {
		 String result=dynamicLoading.locateHelloWorld();
		 Assert.assertTrue("Drag and drop failed", result.contains("Hello World!"));
	    }
}
