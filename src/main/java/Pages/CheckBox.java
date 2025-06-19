package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import utils.ElementUtils;

public class CheckBox extends ElementUtils{
	
	private final WebDriver driver;
	
	@FindBy(xpath = "//a[@href=\"/checkboxes\"]")
    private WebElement checkboxLink;
	
	@FindBy(xpath = "//form[@id='checkboxes']/input[1]")
    private WebElement firstCheckbox;

	public CheckBox(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToCheckBox()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        checkboxLink.click();
	}

	public void clickCheckBox() 
	{
        firstCheckbox.click();
	}
	public boolean isCheckboxSelected() {
        return firstCheckbox.isSelected();
    }
	

}
