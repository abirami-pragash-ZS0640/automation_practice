package Pages;

import java.net.HttpURLConnection;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;

public class BrokenImage extends ElementUtils {
	 WebDriver driver;
	 public BrokenImage(WebDriver driver) {
	        super(driver);
	        this.driver=driver;
	        PageFactory.initElements(driver, this);
	    }
	 List<WebElement> imageElements;
	 List<String> imageURLs;
	 
	public List<String> getAllImageTags() {
		 imageElements = driver.findElements(By.tagName("img"));
		 imageURLs = new ArrayList<>();

		    for (WebElement img : imageElements) {
		        String src = img.getAttribute("src");
		        if (src != null && !src.isEmpty()) {
		            imageURLs.add(src);
		        }
		    }
		    return imageURLs;
	}
	
}

