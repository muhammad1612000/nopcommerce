package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P08_add_product {

    WebDriver driver;
    public P08_add_product(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

@FindBy (xpath = "(//button)[@class=\"button-2 product-box-add-to-cart-button\"]")
    WebElement addbutton;
    public void presson_button(){
        this.addbutton.click();
    }
    @FindBy(xpath = "(//select)[@id =\"product_attribute_1\"]")
    WebElement button1; // related to the product
    public void presson_button1(int index){

            Select option1 = new Select(button1);
            option1.selectByIndex(index);

    }
    @FindBy(xpath = "(//select)[@id=\"product_attribute_2\"]")
    WebElement button2; // related to the product
    public void presson_button2(int index2){
        Select option2 = new Select(button2);
        option2.selectByIndex(index2);
    }
    @FindBy (xpath = "(//input)[@id=\"product_attribute_3_6\"]")
    WebElement button3; // related to the product
    public void presson_button3(){
       this.button3.click();
    }

    @FindBy(xpath = "(//button)[@id=\"add-to-cart-button-1\"]")//on_button1
    WebElement button4 ;// related to the product
    public void presson_button4(){
        this.button4.click();
    }

}
