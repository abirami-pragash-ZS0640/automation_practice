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

public class DynamicLoading extends ElementUtils{
private final WebDriver driver;
	
	@FindBy(xpath = "//a[@href=\"/dynamic_loading\"]")
    private WebElement dynamicLoadingLink;
	
	@FindBy(xpath = "//a[@href=\"/dynamic_loading/1\"]")
    private WebElement hiddenElementLink;
	
	@FindBy(xpath = "//a[@href=\"/dynamic_loading/2\"]")
    private WebElement newElementLink;
	
	@FindBy(xpath = "//div[@id='start']//button[1]")
    private WebElement startLink;


	public DynamicLoading(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToDynamicLoading()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		dynamicLoadingLink.click();
	}
	
	public void navigateToHiddenElement()
	{
		clickWebElement(hiddenElementLink);
	}
	
	public void navigateToNewElement()
	{
		clickWebElement(newElementLink);
	}
	public String locateHelloWorld()
	{
		
		clickWebElement(startLink);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement result = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
        String text = result.getText();
        return text;

	}
	
}
