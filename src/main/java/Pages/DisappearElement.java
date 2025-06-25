package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ElementUtils;

public class DisappearElement extends ElementUtils{
private final WebDriver driver;
	
	@FindBy(xpath = "//a[@href=\"/disappearing_elements\"]")
    private WebElement disappearingElementsLink;


	public DisappearElement(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToDisappearElement()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		disappearingElementsLink.click();
	}
	public void refreshPage() {
	    for (int i = 0; i < 5; i++) {
	        List<WebElement> gallery = driver.findElements(By.linkText("Gallery"));
	        if (gallery.isEmpty()) break;
	        driver.navigate().refresh();
	    }
	}

	public int userChecksGallery() {
	    List<WebElement> gallery = driver.findElements(By.linkText("Gallery"));
	    return gallery.size();
	}

}
