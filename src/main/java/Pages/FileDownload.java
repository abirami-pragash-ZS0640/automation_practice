package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;

public class FileDownload extends ElementUtils {
	WebDriver driver;
	public FileDownload(WebDriver driver) {
		 super(driver);
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href=\"/download\"]")
	private WebElement fileDownloadLink;
	
	@FindBy(xpath="//a[@href=\"download/Sample.txt\"]")
	private WebElement downloadFile;
	
	public void clickFileDownloadLink() {
		clickWebElement(fileDownloadLink);
	}
	
	public void clickFileDownload() {
		clickWebElement(downloadFile);
	}
	
	
}
