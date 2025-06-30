package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ElementUtils;

public class ExitIntent extends ElementUtils {
	
	private final WebDriver driver;
	
	@FindBy(xpath = "//a[@href=\"/exit_intent\"]")
    private WebElement exitIntentLink;
	
	@FindBy(xpath = "//h3[text()=\"This is a modal window\"]")
    private WebElement modal;
	
	public ExitIntent(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToExitIntent()
	{
		clickWebElement(exitIntentLink);
	}
	
	public void userMouseOut() throws InterruptedException{

		Robot robot = null;
		try {
			robot = new Robot();
			robot.mouseMove(1000, 500); 
			Thread.sleep(500);
			robot.mouseMove(1000, 2); 
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

    }
	
	public boolean isModalDisplayed() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOf(modal));
        return modal.isDisplayed();
    }

}
