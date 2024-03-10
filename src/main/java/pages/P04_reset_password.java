package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P04_reset_password {
    WebDriver driver;
    public P04_reset_password(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy ( id="Email")
    WebElement email;
    public void enter_email(String emailaddress){
        this.email.sendKeys(emailaddress);
    }
    @FindBy (name="send-email")
    WebElement send_email_button;
    public void press_on_send_button(){
        this.send_email_button.click();
    }

}
