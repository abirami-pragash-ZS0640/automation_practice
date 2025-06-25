package StepDef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Pages.CheckBox;
import Pages.DisappearElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class DisappearElementStepDef {
	DisappearElement disappearElement;
	WebDriver driver;
	
	 @Given ("User is on the heroku webpage for disappearing elements")
	 public void user_is_on_the_heroku_page()
	    {
	        driver= DriverFactory.getDriver();
	        disappearElement=new DisappearElement(driver);
	        driver.get("https://the-internet.herokuapp.com/");

	    }
	 
	 @When ("User navigates to disappearing elements page")
	 public void user_navigates_to_disappearing_elements_page()
	    {
		 disappearElement.navigateToDisappearElement();
	    }
	 @When("User refreshes the page for atleast 5 times")
	 public void user_refreshes_page() {
		 disappearElement.refreshPage();
	 }

	 @Then("User should see that gallery element is disappeared")
	 public void user_should_see_gallery_disappear() {
		 int gallerySize = disappearElement.userChecksGallery();
		 Assert.assertEquals(0, gallerySize);
	 }
}
