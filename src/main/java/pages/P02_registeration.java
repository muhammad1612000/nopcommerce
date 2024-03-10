package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static util.Utility.randomintnumber;

public class P02_registeration {
    WebDriver driver ;
    public P02_registeration(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="(//input)[@type=\"radio\"][1]")
    WebElement gender;
    public void choosegender()
    {
        driver.findElement(By.xpath("(//input)[@type=\"radio\"]["+randomintnumber(2)+"]")).click();

    }
    @FindBy(id = ("FirstName"))
    WebElement first_name ;
    public void addfirstname(String name){
        this.first_name.sendKeys( name);
    }

    @FindBy(id = ("LastName"))
      WebElement last_name;
    public void  addlastname(String name ){
        this.last_name.sendKeys(name);
    }

    @FindBy(xpath = "(//select)[@name=\"DateOfBirthDay\"]")
    WebElement dayofbirth;

    public void addrandomday (int index){
        Select day = new Select(dayofbirth);
        day.selectByIndex(index);
    }
    @FindBy(xpath = "(//Select)[@name=\"DateOfBirthMonth\"]")
    WebElement monthofbirth;
    public void addrandommonth (int index){
        Select month = new Select(monthofbirth);
        month.selectByIndex(index);
    }
    @FindBy(xpath = "(//Select)[@name=\"DateOfBirthYear\"]")
    WebElement yearofbirth;
    public void addrandomyear (int index){
        Select year = new Select(yearofbirth);
        year.selectByIndex(index);
    }
    @FindBy(id = "Email")
    WebElement email;
    public void  addemail(String name ){
        this.email.sendKeys(name);

    }
    @FindBy( id="Company")
    WebElement companyname;
    public void  addecompanyname(String name ){
        this.companyname.sendKeys(name);

    }
    @FindBy(id="Newsletter")
    WebElement newsettlerbutton;
    public void press_on_newsettler(){
        this.newsettlerbutton.click();
    }
    @FindBy(id="Password")
    WebElement password;
    public void type_password(String pw){
        this.password.sendKeys(pw);
    }
    @FindBy(id="ConfirmPassword")
    WebElement password2;
    public void type_password2(String pw){
        this.password2.sendKeys(pw);
    }
    @FindBy(id="register-button")
    WebElement registerbutton;
    public void pressonregister(){
        this.registerbutton.click();
    }








}
