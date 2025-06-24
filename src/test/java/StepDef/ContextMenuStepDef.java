package StepDef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Pages.ContextMenu;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class ContextMenuStepDef {
	ContextMenu contextMenu;
	WebDriver driver;
	
	 @Given ("User is on the heroku webpage for context menu")
	 public void user_is_on_the_heroku_page()
	    {
	        driver= DriverFactory.getDriver();
	        contextMenu=new ContextMenu(driver);
	        driver.get("https://the-internet.herokuapp.com/");

	    }
	 
	 @When ("User navigates to contextmenu page")
	 public void user_navigates_to_contextmenu_page()
	    {
		 contextMenu.navigateToContextMenu();
	    }
	 
	 @When("User right clicks context menu")
	    public void user_right_clicks_context_menu() {
	        contextMenu.rightClickContextBox();
	    }
	 
	 @Then("User should see the alert and respond to it")
	    public void user_should_see_the_alert_and_respond_to_it() {
	        String alertText = contextMenu.handleAlertAndGetText();
	        System.out.println(alertText);
	        Assert.assertEquals("You selected a context menu", alertText);
	    }

}
