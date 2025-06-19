package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;

public class AddElement extends ElementUtils {
	WebDriver driver;
    public AddElement(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//button[@onclick=\"addElement()\"]")
    private WebElement AddElementButton;
    
    @FindBy(xpath="//button[@onclick=\"deleteElement()\"]")
    private WebElement DeleteElementButton;
    
    @FindBy(id="elements")
    private WebElement AddedElement;
    
    public void clickAddElement() {
    	clickWebElement(AddElementButton);
//    	AddElementButton.click();
    }

    public void clickDeleteElement() {
    	clickWebElement(DeleteElementButton);
    }
    
    public boolean isElementInvisible() {
    	return isNotVisible(DeleteElementButton);
    }

    
    public boolean isElementAdded() {
        return isVisible(AddedElement, 15);
    }

    

}
