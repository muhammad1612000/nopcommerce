package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P06_change_currency {
    WebDriver driver;
    public P06_change_currency(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id ="customerCurrency")
    WebElement currecny;

    public void change_currecnyy (String index){
        Select option = new Select(currecny);
        option.selectByVisibleText(index);
    }
}
