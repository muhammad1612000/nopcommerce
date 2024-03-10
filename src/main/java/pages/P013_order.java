package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P013_order {
    WebDriver driver;
    public P013_order(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//span)[@class=\"cart-label\"]")
    WebElement addcart;
    public  void add_to_cartbuttonn(){
        this.addcart.click();
    }
    @FindBy(id="termsofservice")
    WebElement terms;
    public  void press_on_terms(){
        this.terms.click();
    }
    @FindBy(id="checkout")
    WebElement checkoutbutton;
    public void  press_on_checkout(){
        this.checkoutbutton.click();
    }
    // checkout extra data
    @FindBy(xpath = "(//select)[@id=\"BillingNewAddress_CountryId\"]")
    WebElement country;
    public void addrandomcountry (int index){
        Select country1 = new Select(country);
        country1.selectByIndex(index);
    }
    @FindBy(id="BillingNewAddress_City")
    WebElement citybutton;
    public void addcity(String name){
        this.citybutton.sendKeys(name);
    }
    @FindBy(id="BillingNewAddress_Address1")
    WebElement address1;
    public void addadress1(String name){
        this.address1.sendKeys(name);
    }
    @FindBy(id="BillingNewAddress_Address2")
    WebElement address2;
    public void addadress2(String name){
        this.address2.sendKeys(name);
    }
    @FindBy(id="BillingNewAddress_ZipPostalCode")
    WebElement zipcode;
    public void  addzipcode (String num)
    {
        this.zipcode.sendKeys(num);
    }
    @FindBy(id="BillingNewAddress_PhoneNumber")
    WebElement phone;
    public void addphone(String num){
        this.phone.sendKeys(num);
    }
    @FindBy(id="BillingNewAddress_FaxNumber")
    WebElement fax_num ;
    public void addfax(String num){
        this.fax_num.sendKeys(num);
    }
    @FindBy(xpath = "(//button)[@class=\"button-1 new-address-next-step-button\"]")
    WebElement clickbutton;
    public void click_button(){
        this.clickbutton.click();
    }
// ToDo : choose ship method;
    @FindBy (xpath = "(//input)[@id=\"shippingoption_1\"]")
    WebElement pressonbutton;// choice for ship
    public void shipmethod_button(){
        pressonbutton.click();
    }
    @FindBy(xpath = "(//button)[@class=\"button-1 shipping-method-next-step-button\"]")
    WebElement shipclickbutton; // for ship
    public void  pressonclickfor_ship(){
        this.shipclickbutton.click();
    }
 // ToDo : payment method page
    @FindBy(xpath = "(//input)[@id=\"paymentmethod_1\"]")
    WebElement visa_button;
    public void choosevisa(){
        this.visa_button.click();
    }

    // payment click button
    @FindBy (xpath = "(//button)[@class=\"button-1 payment-method-next-step-button\"]")
    WebElement paymentclickbutton;
    public  void presson_paymentclick(){
        this.paymentclickbutton.click();
    }
    // ToDo payment page:
    @FindBy (id="CardholderName")
    WebElement cardholderbox;
    public  void fill_cardholder(String name){
        this.cardholderbox.sendKeys(name);
    }
    @FindBy (id="CardNumber")
    WebElement cardnumberbox;
    public void fill_cardnumber(String num){
        this.cardnumberbox.sendKeys(num);
    }
    @FindBy(xpath = "(//select)[@id=\"ExpireMonth\"]")
    WebElement expirymonth;
    public void add_expirymonth(int index){
        Select month = new Select(expirymonth);
        month.selectByIndex(index);

    }

    @FindBy(xpath = "(//select)[@id=\"ExpireYear\"]")
    WebElement expiryyear;
    public void add_expiryyear(int index){
        Select year = new Select(expiryyear);
        year.selectByIndex(index);
    }
    @FindBy(xpath = "(//input)[@id=\"CardCode\"]")
    WebElement cardcode;
    public void fill_cardcode(String code){
        this.cardcode.sendKeys(code);
    }

    @FindBy(xpath = "(//button)[@class=\"button-1 payment-info-next-step-button\"]")
    WebElement card_click;
    public void press_on_card_button(){
        this.card_click.click();
    }
    // ToDo conifrm page
    @FindBy(xpath = "(//button)[@class=\"button-1 confirm-order-next-step-button\"]")
    WebElement confirmbuuton;

    public void press_confirmbutton(){
        this.confirmbuuton.click();
    }
    // TODo details page
    @FindBy(xpath = "(//a)[@href=\"/orderdetails/1031\"]")
    WebElement detail_button;

    public void press_detailbutton(){
        this.detail_button.click();
    }

}

