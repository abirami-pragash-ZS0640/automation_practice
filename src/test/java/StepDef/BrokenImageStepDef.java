package StepDef;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.BrokenImage;
import Pages.IndexPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.DriverFactory;

public class BrokenImageStepDef {
	
	WebDriver driver;
	BrokenImage brokenImagePage;
	IndexPage indexPage;
	
	@When("user is on Broken Image page")
	public void user_is_on_Broken_Image_page() {
		driver= DriverFactory.getDriver();
	    indexPage = new IndexPage(driver);
	    driver.get("https://the-internet.herokuapp.com/");
	    indexPage.clickBrokenImage();
	    brokenImagePage = new BrokenImage(driver);
	}
	
	List<String> imageURLs = new ArrayList<>();
	
	@When ("I get all image elements on the page")
	public void user_get_all_image_elements_on_the_page() {
		imageURLs = brokenImagePage.getAllImageTags();  
	
	}
	
	@And("each image should return a 200 status code")
	public void each_image_should_return_200_status_code() {
		for (String url : imageURLs) {
			try {
				HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
				connection.setRequestMethod("GET");
				connection.connect();
				int statusCode = connection.getResponseCode();
				Assert.assertEquals("Broken image at: " + url, 200, statusCode);
			} catch (Exception e) {
				Assert.fail("Exception checking URL: " + url + " | Error: " + e.getMessage());
			}
		}
	}

}



	