package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;

public class IndexPage extends ElementUtils{
	WebDriver driver;
    public IndexPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//a[@href=\"/add_remove_elements/\"]")
    private WebElement AddElementLink;
    

    @FindBy(xpath="//a[@href=\"/drag_and_drop\"]")
    private WebElement dragAndDropLink; 
    
    @FindBy(xpath="//a[@href=\"/broken_images\"]")
    private WebElement BrokenImageLink;

    
    public void clickAddElement() {
    	AddElementLink.click();
    }
    
    @FindBy(xpath="//a[@href=\"/context_menu\"]")
    private WebElement contextMenuLink;
    
    public void clickContextMenu() {
    	contextMenuLink.click();
    }

    public void clickDragAndDropElement() {
    	dragAndDropLink.click();
    }
    

    public void clickBrokenImage() {
    	BrokenImageLink.click();
    }

}
