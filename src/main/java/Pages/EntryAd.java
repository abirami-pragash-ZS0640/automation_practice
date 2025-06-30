package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;

public class EntryAd extends ElementUtils{
	WebDriver driver;
	public EntryAd(WebDriver driver) {
		 super(driver);
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href=\"/entry_ad\"]")
	private WebElement entryAdLink;
	
	@FindBy(css=".modal")
	private WebElement modelElement;
	
	@FindBy(className="modal-title")
	private WebElement modelMessage;
	
	@FindBy(xpath="//p[text()='Close']")
	private WebElement closeElement;
	
	@FindBy(id="restart-ad")
	private WebElement clickHere;
	
	public void clickEntryAdElement() {
		clickWebElement(entryAdLink);
	}
	
	public boolean modalShouldBeDisplayed() {
		waitForWebElement(modelElement);
		boolean model=modelElement.isDisplayed();
		return model;
	}
	
	public String getModelMessage() {
		return getText(modelMessage);
	}
	
	public void clickClose() {
		clickWebElement(closeElement);
	}
	
	public boolean checkVisisbility() {
		return isNotVisible(modelElement);
	}
	
	public void clickHere() {
		clickWebElement(clickHere);
	}

}
