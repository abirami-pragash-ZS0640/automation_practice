package Pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;

public class DynamicControl extends ElementUtils {
	
	WebDriver driver;
	
    public DynamicControl(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//a[@href=\"/dynamic_controls\"]")
    private WebElement dynamicControlLink;
    
    @FindBy(xpath="//button[@onclick=\"swapCheckbox()\"]")
    private WebElement RemoveButton;
    
    @FindBy(xpath="//p[@id=\"message\"]")
    private WebElement message;
    
    @FindBy(xpath="//p[@id=\"message\"]")
    private WebElement enabledMessage;
    
    @FindBy(xpath="//div[@id=\"checkbox\"]")
    private WebElement checkBoxElement;
    
    @FindBy(xpath="//button[@onclick=\"swapInput()\"]")
    private WebElement enableButton;
    
    @FindBy(xpath="//input[@type=\"text\"]")
    private WebElement inputField;
    
    @FindBy(xpath="//button[@onclick=\"swapInput()\"]")
    private WebElement disableButton;
    
    @FindBy(xpath="//p[@id=\"message\"]")
    private WebElement disabledMessage;
    
    public void clickDynamicControlElement() {
    	clickWebElement(dynamicControlLink);
    }
    
    public void clicksRemoveButton() {
    	clickWebElement(RemoveButton);
    }
    
    public String getMessage() {
    	waitForWebElement(message);
    	return getText(message);
    }
    
    public boolean visibilityOfCheckBox() {
    	return isNotVisible(checkBoxElement);
    }
    
    public void clicksEnableButton() {
    	clickWebElement(enableButton);
    }
    
    public boolean isInputEnabled() {
    	isWebElementEnabled(inputField);
    	return inputField.isEnabled();
    }
    
    public String getEnabledMessage() {
    	waitForWebElement(enabledMessage);
    	return getText(enabledMessage);
    }
    
    public void clicksDisableButton() {
    		clickWebElement(disableButton);
    }
    
    public void isElementDisabled() {
    	waitForElementDisable(inputField);
    }
	
   public String getDisabledMessage() {
	   waitForWebElement(enabledMessage);
   	   return getText(enabledMessage);
   }
}
