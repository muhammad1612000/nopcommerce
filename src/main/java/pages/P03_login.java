package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P03_login {
WebDriver driver;

    public P03_login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="Email")
    WebElement email;
    public void enter_email(String name ){
        this.email.sendKeys(name);
    }
    @FindBy(id="Password")
    WebElement password;
    public void enter_password(String pw){
        this.password.sendKeys(pw);
    }
    @FindBy(id="RememberMe")
    WebElement remember;
    public void presson_remeber_button(){
        this.remember.click();
    }
    @FindBy(xpath = "(//button)[@class=\"button-1 login-button\"]")
    WebElement login_button;
    public void  press_login(){
        this.login_button.click();
    }
    @FindBy(xpath = "(//a)[@href=\"/passwordrecovery\"]")
    WebElement forget_password;
    public void press_on_forget(){
        this.forget_password.click();
    }

}
