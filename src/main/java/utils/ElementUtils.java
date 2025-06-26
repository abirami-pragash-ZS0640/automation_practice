package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementUtils {
    private final WebDriver driver;


    public ElementUtils(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isVisible(WebElement element,int seconds) {
    	new WebDriverWait(driver, Duration.ofSeconds(seconds))
        .until(ExpectedConditions.visibilityOf(element));
		return true;
    }
    
    public boolean isNotVisible(WebElement element) {
      
            new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.invisibilityOf(element));
            return true;
       
    }
    
    public void waitForElementVisible(By locator, int seconds) {
        new WebDriverWait(driver, Duration.ofSeconds(seconds))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    
    public void waitForWebElement(WebElement element) {
    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
          wait.until(ExpectedConditions.visibilityOf(element));
    }
    
   public void waitForElementDisable(WebElement element) {
	   new WebDriverWait(driver, Duration.ofSeconds(20))
       .until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(element)));
   }

    public void clickWebElement (WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void isWebElementEnabled (WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    
    public void clickElement(By locator) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(locator))
                .click();
    }

    public void setText(By locator,String textToBeEntered)
    {
        WebElement element=driver.findElement(locator);
        element.sendKeys(textToBeEntered);
    }
    
    public String getText(WebElement element) {
    	return element.getText();
    }

}
