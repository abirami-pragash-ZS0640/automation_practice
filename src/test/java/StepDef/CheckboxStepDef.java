package StepDef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Pages.CheckBox;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class CheckboxStepDef {
	CheckBox checkbox;
	WebDriver driver;
	
	 @Given ("User is on the heroku webpage for checkbox")
	 public void user_is_on_the_heroku_page()
	    {
	        driver= DriverFactory.getDriver();
	        checkbox=new CheckBox(driver);
	        driver.get("https://the-internet.herokuapp.com/");

	    }
	 
	 @When ("User navigates to checkboxes page")
	 public void user_navigates_to_checkboxes_page()
	    {
	        checkbox.navigateToCheckBox();
	    }
	 
	 @And("User clicks on the check box")
	 public void user_clicks_checkbox()
	    {
	        checkbox.clickCheckBox();
	    }
	 
	 @Then ("User should see the check box got ticked")
	 public void user_sees_checkbox_ticked()
	    {
		 Assert.assertTrue("Checkbox selection is failed", checkbox.isCheckboxSelected());
	    }
	 
}
