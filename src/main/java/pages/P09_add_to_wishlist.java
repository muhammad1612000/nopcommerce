package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P09_add_to_wishlist {
    WebDriver driver;
    public P09_add_to_wishlist(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//a)[@href=\"/books\"]")
    WebElement books; // categories
    public void press_on_category(){
        this.books.click();
    }
    @FindBy(xpath = "(//button)[@class=\"button-2 add-to-wishlist-button\"]")
    WebElement heart;// heart button
    public void press_on_add_wishlist(){
        this.heart.click();
    }
}
