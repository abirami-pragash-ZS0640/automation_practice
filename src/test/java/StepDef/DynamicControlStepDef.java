package StepDef;

import org.openqa.selenium.WebDriver;


import Pages.DynamicContent;
import Pages.DynamicControl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import utils.DriverFactory;

public class DynamicControlStepDef {

	
	WebDriver driver;
	DynamicControl dynamicControlPage;
	
	@Given("user is on the Dynamic Controls page")
	public void user_is_on_the_Dynamic_Controls_page() {
		driver= DriverFactory.getDriver();
		dynamicControlPage = new DynamicControl(driver);
		 driver.get("https://the-internet.herokuapp.com/");
		 dynamicControlPage.clickDynamicControlElement();
	}
	
	@When("user clicks the Remove button")
	public void user_clicks_the_Remove_button() {
		dynamicControlPage.clicksRemoveButton();
	}
	
	@Then("user should see the message \"It's gone!\"")
	public void user_should_see_the_message() {
	    String actualMessage = dynamicControlPage.getMessage();
	    Assert.assertEquals("It's gone!", actualMessage);
	}
	
	@Then("the checkbox should no longer be present")
	public void the_checkbox_should_no_longer_be_present() {
	    boolean isNotVisible=dynamicControlPage.visibilityOfCheckBox();
	    Assert.assertTrue("checkbox is visible",isNotVisible);
	    }
	@When("user click the Enable button")
	public void click_the_Enable_button() {
		dynamicControlPage.clicksEnableButton();
	}
	
	@Then("the input field should be enabled")
	public void the_input_field_should_be_enabled() {
		
	    Assert.assertTrue(dynamicControlPage.isInputEnabled());
	}
	
	@And("the message \"It's enabled!\" should be displayed")
	public void message_displayed() {
		 String enabledMessage = dynamicControlPage.getEnabledMessage();
		    Assert.assertEquals("It's enabled!", enabledMessage);
	}
	
	@When("user clicks the Disable button")
	public void user_clicks_the_Disable_button() {
		dynamicControlPage.clicksDisableButton();
	}
	
	@Then("the input field should be disabled")
	public void input_field_should_be_disabled() {
		  dynamicControlPage.isElementDisabled(); 
	}
	
	@And("the message \"It's disabled!\" should be displayed")
	public void disable_should_be_visible() {
		 String disabledMessage = dynamicControlPage.getDisabledMessage();
		    Assert.assertEquals("It's disabled!", disabledMessage);
	}
	
}
