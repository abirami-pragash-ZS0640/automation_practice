package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;

public class DragAndDrop extends ElementUtils {
	
	WebDriver driver;
    public DragAndDrop(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//div[@id='column-a']")
    private WebElement sourceElement;
    
    @FindBy(xpath="//div[@id='column-b']")
    private WebElement targetElement;
    
    
    
    public void DragAndDropElement() {
    	
    	Actions actions = new Actions(driver);
    	actions.dragAndDrop(sourceElement, targetElement).build().perform();
    }
    
    public String getTextAfterSwap() {
    	return sourceElement.getText();
    }

}
