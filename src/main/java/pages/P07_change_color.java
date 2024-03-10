package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P07_change_color {
    WebDriver driver;
    public P07_change_color(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    // ToDo : hoovering
    public  void press_on_category(){
        WebElement ele = driver.findElement(By.xpath("(//a)[@href=\"/apparel\"]"));
        Actions act = new Actions(driver);
        act.moveToElement(ele).perform();
    }
    // ToDo : choose shoes
    @FindBy(xpath="(//a)[@href=\"/shoes\"]")
    WebElement shoe_button;
    public void presson_shoe(){
        this.shoe_button.click();
    }
//how to make selenuim automate numvber[2]like the next line
    @FindBy(xpath = "(//input)[@type=\"checkbox\"][2]")
    WebElement color_button;
    public void pressoncolors(){
        this.color_button.click();
    }
}
