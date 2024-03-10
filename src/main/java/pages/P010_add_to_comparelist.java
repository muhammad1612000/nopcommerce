package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P010_add_to_comparelist {
    WebDriver driver;
    public P010_add_to_comparelist(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "(//a)[@href=\"/jewelry\"]")
    WebElement jewelry_button; // choose category
    public  void press_jewelry(){
        this.jewelry_button.click();
    }
    @FindBy (xpath = "(//a)[@class=\"viewmode-icon list\"]")
    WebElement viewmode_button;
    public void  press_on_viewmode(){
        this.viewmode_button.click();
    }
    @FindBy(xpath = "(//button)[@class=\"button-2 add-to-compare-list-button\"][3]")
    WebElement compare_button;
    public void press_on_compare(){
        this.compare_button.click();
    }
}
