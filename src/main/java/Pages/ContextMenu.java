package Pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ElementUtils;

public class ContextMenu extends ElementUtils{
	
	private final WebDriver driver;
	
	@FindBy(xpath = "//a[@href=\"/context_menu\"]")
    private WebElement contextMenuLink;
	
	@FindBy(id = "hot-spot")
    private WebElement contextBox;
	
	public ContextMenu(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToContextMenu()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		contextMenuLink.click();
	}

	public void rightClickContextBox() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(contextBox));

	    Actions actions = new Actions(driver);
	    actions.moveToElement(contextBox).pause(Duration.ofSeconds(1)).contextClick().perform();
    }
	
	public String handleAlertAndGetText() {
        Alert alert = driver.switchTo().alert();
        
        String alertText = alert.getText();
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        alert.accept(); // Accept the alert
        return alertText;
    }
}
