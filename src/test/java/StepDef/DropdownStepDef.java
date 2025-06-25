package StepDef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Pages.DisappearElement;
import Pages.Dropdown;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class DropdownStepDef {
	Dropdown dropdown;
	WebDriver driver;
	
	 @Given ("User is on the heroku webpage for drop down")
	 public void user_is_on_the_heroku_page()
	    {
	        driver= DriverFactory.getDriver();
	        dropdown=new Dropdown(driver);
	        driver.get("https://the-internet.herokuapp.com/");

	    }
	 
	 @When ("User navigates to drop down page")
	 public void user_navigates_to_disappearing_elements_page()
	    {
		 dropdown.navigateToDropdown();
	    }
	 
	 @When ("User clicks on first option")
	 public void user_clicks_on_first_option()
	    {
		 dropdown.selectFirstOption();
	    }
	 
	 @Then ("User should see that option is selected")
	 public void user_sees_dropdown_selected()
	    {
		 Assert.assertTrue("Dropdown selection is failed", dropdown.isDropdownSelected());
	    }

}
