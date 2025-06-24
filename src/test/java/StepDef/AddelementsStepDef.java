package StepDef;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;

import Pages.AddElement;
import Pages.IndexPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.DriverFactory;

public class AddelementsStepDef {
	
	WebDriver driver;
	AddElement addElementPage;
	IndexPage indexPage;

    @Given("user is on the index page")
    public void user_is_on_the_index_page() {
    driver= DriverFactory.getDriver();
    indexPage = new IndexPage(driver);
    driver.get("https://the-internet.herokuapp.com/");
   
    }
    
    @When("users clicks the addElements Link")
    public void users_clicks_the_addElements_Link() {
    	  indexPage.clickAddElement();
    	  addElementPage = new AddElement(driver);
    }
    
    @And("user clicks AddElementButton")
    public void user_clicks_AddElementButton() {
    	addElementPage.clickAddElement();
    }
    
    @Then("element is visible")
    public void element_is_visible() {
        Assert.assertTrue("Add Element is not visible", addElementPage.isElementAdded());
    }

    @And("user clicks the delete button")
    public void user_clicks_the_delete_button() {
    	addElementPage.clickDeleteElement();
    }
    
    @Then("element is invisible")
    public void element_is_invisible() {
    	Assert.assertTrue("delete is not visible", addElementPage.isElementInvisible());
    }
    
    
    
}
