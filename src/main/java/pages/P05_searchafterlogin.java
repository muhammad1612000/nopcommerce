package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P05_searchafterlogin {
    WebDriver driver;
    public P05_searchafterlogin(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="small-searchterms")
    WebElement searchbox;
    public void search_item(String word){
        WebElement searchelement = driver.findElement(By.id("small-searchterms"));
        searchbox.sendKeys(word);
        searchbox.sendKeys(Keys.ENTER);
    }

}
