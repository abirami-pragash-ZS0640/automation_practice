package StepDef;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import Pages.FileDownload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class FileDownloadStepDef {
	FileDownload fileDownloadPage;
	WebDriver driver;
	
	 @Given ("the user is on the file download page")
	 public void the_user_is_on_the_file_download_page()
	    {
	        driver= DriverFactory.getDriver();
	        fileDownloadPage=new FileDownload(driver);
	        driver.get("https://the-internet.herokuapp.com/");
	        fileDownloadPage.clickFileDownloadLink();
	    }
	 
	 @When("the user clicks on the sample.txt link")
	 public void user_clicks_on_sample_txt() {
		 fileDownloadPage.clickFileDownload();  
	 }
	 
	 @Then("the file {string} should be downloaded successfully")
	 public void file_should_be_downloaded(String fileName) throws InterruptedException {
	     String downloadPath = DriverFactory.DOWNLOAD_PATH;
	     File downloadedFile = new File(downloadPath + "\\" + fileName);

	     int waitTime = 0;
	     int timeout = 10000; 
	     while (!downloadedFile.exists() && waitTime < timeout) {
	         Thread.sleep(500); 
	         waitTime += 500;
	     }

	     Assert.assertTrue("File was not downloaded: " + downloadedFile.getAbsolutePath(), downloadedFile.exists());
	     if (downloadedFile.exists()) {
	    	 	downloadedFile.delete();
	     	}
	 }
	 
}
