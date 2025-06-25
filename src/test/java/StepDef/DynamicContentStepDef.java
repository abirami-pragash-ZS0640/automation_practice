package StepDef;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Pages.DragAndDrop;
import Pages.DynamicContent;
import Pages.IndexPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class DynamicContentStepDef {

	WebDriver driver;
	DynamicContent dynamicContentPage;
	
	@Given("user open the dynamic content page")
	public void user_open_the_dynamic_conteent_page() {
		driver= DriverFactory.getDriver();
		dynamicContentPage = new DynamicContent(driver);
		 driver.get("https://the-internet.herokuapp.com/");
		 dynamicContentPage.clickDynamicContentElement();
	}
	List<String> data;
	 @When("capture the content and refresh the page")
	 public void capture_the_content_and_refresh_the_page() {
		  data=dynamicContentPage.getContent();
	 }
	 
	 @Then("the content should be different")
	 public void the_content_should_be_different() {
		 Assert.assertNotEquals("Content did not change after refresh", data.get(0), data.get(1));
	 }
	
	
}
