package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ElementUtils;

public class Dropdown extends ElementUtils{
private final WebDriver driver;
	
	@FindBy(xpath = "//a[@href=\"/dropdown\"]")
    private WebElement dropdownLink;
	
	@FindBy(id = "dropdown")
    private WebElement dropdownElement;
	


	public Dropdown(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToDropdown()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		dropdownLink.click();
	}
	
	public void selectFirstOption()
	{
		dropdownElement.click();
		Select select = new Select(dropdownElement);
	    select.selectByIndex(1);
	}
	public boolean isDropdownSelected() {
		Select select = new Select(dropdownElement);
	    String selectedText = select.getFirstSelectedOption().getText();
	    return !selectedText.equals("Please select an option"); 
        
    }
	
}
