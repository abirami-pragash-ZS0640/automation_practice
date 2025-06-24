package StepDef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Pages.DragAndDrop;
import Pages.IndexPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class DragAndDropStepDef {
	WebDriver driver;
	IndexPage indexPage;
	DragAndDrop dragAndDropPage;
	
	@Given("user open the Drag and Drop page")
	public void user_open_the_Drag_and_Drop_page() {
		 driver= DriverFactory.getDriver();
		 indexPage = new IndexPage(driver);
		 driver.get("https://the-internet.herokuapp.com/");
		 indexPage.clickDragAndDropElement();
	}
	
	@When("user drag the source element and drop it onto the target")
	public void user_drag_the_source_element_and_drop_it_onto_the_target() {
		dragAndDropPage=new DragAndDrop(driver);
		dragAndDropPage.DragAndDropElement();
	}
	
	@Then("the source element should be dropped successfully")
	public void source_element_should_be_dropped_successfully() {
		String text=dragAndDropPage.getTextAfterSwap();
		   Assert.assertTrue("Drag and drop failed", text.contains("B"));
	}

}
