package Pages;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicContent extends ElementUtils {

	WebDriver driver;
	String firstContent = "";
    String secondContent = "";
    public DynamicContent(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//a[@href=\"/dynamic_content\"]")
    private WebElement dynamicContentLink;
    
    public void clickDynamicContentElement() {
    	clickWebElement(dynamicContentLink);
    }
    @FindBy(xpath="(//div[@id='content'])[1]")
    private WebElement initialContent;
    
    public List<String> getContent() {
    	String firstContent = driver.findElement(By.xpath("(//div[@class='row']//div[@class='row'])[4]")).getText().trim();
        driver.navigate().refresh();
        waitForElementVisible(By.xpath("(//div[@class='row']//div[@class='row'])[4]"), 10);
        String secondContent = driver.findElement(By.xpath("(//div[@class='row']//div[@class='row'])[4]")).getText().trim();
        return Arrays.asList(firstContent, secondContent);
    } 
}
