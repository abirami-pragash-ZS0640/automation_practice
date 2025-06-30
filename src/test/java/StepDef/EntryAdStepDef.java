package StepDef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Pages.EntryAd;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class EntryAdStepDef {
	EntryAd entryAdPage;
	WebDriver driver;
	
	 @Given ("user navigates to the Entry Ad page")
	 public void user_navigates_to_the_Entry_Ad_page()
	    {
	        driver= DriverFactory.getDriver();
	        entryAdPage=new EntryAd(driver);
	        driver.get("https://the-internet.herokuapp.com/");
	        entryAdPage.clickEntryAdElement();
	    }

	 @Then("the modal window should be displayed")
	 public void the_modal_window_should_be_displayed() {
		boolean modelVisibility= entryAdPage.modalShouldBeDisplayed();
		Assert.assertTrue(modelVisibility);
	 }
	 
	 @Then("the modal message should be {string}")
	 public void modelMessage(String expectedMessage) {
		String actualMessage= entryAdPage.getModelMessage();
        Assert.assertEquals(expectedMessage, actualMessage);

	 }
	 
	 @When("user clicks the Close button on the modal")
	 public void user_clicks_the_Close_button_on_modal() {
		 entryAdPage.clickClose();
	 }
	 
	 @Then("the modal window should not be displayed")
	 public void modal_window_should_not_be_displayed() {
		boolean isVisible= entryAdPage.checkVisisbility();
		Assert.assertTrue(isVisible);
	 }
	 
	 @And("user refreshes the page")
	 public void user_refreshes_the_page() {
		 driver.navigate().refresh();
	 }
	 
	 @When("user clicks the {string} link to re-enable the modal")
	 public void user_clicks_the_link_to_re_enable_the_modal(String string) {
		 entryAdPage.clickHere();
	    
	 }
}
