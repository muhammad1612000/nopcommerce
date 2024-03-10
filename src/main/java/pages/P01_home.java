package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_home {
    public P01_home(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="(//a)[text()=\"Register\"]")
    WebElement registerbutton;

    public void clickregister(){
        this.registerbutton.click();
    }
    @FindBy(xpath = "(//a)[@href=\"/login?returnUrl=%2F\"]")
    WebElement loginbutton;
    public void  clicklogin(){
        this.loginbutton.click();
    }
}
