package testcases;

import com.github.javafaker.CreditCardType;
import org.testng.annotations.Test;
import pages.P013_order;
import pages.P01_home;
import pages.P03_login;

import static testcases.T01_register.email;
import static testcases.T01_register.password;
import static util.Utility.randomintnumber;

public class T012_order extends Testbase{
    P01_home home ;
    P03_login login;
    P013_order order ;
    int country = randomintnumber(20);
    String city = faker.address().city();
    String address1 = faker.address().fullAddress();
    String addresssecond = faker.address().secondaryAddress();
    String zipcode = faker.address().zipCode();
    String phone = faker.phoneNumber().phoneNumber();
    String fax = faker.phoneNumber().phoneNumber();
    String cardholder = faker.name().fullName();
    String cardnum = faker.finance().creditCard(CreditCardType.VISA);
    int expiry_month = randomintnumber(12);
    int expiry_year = randomintnumber(5) ;
    String cardcode = "1234";
   // double cardcode = faker.number().randomDouble(4,1,9);

    @Test(priority =  1 )
    public  void complete_order() throws InterruptedException {
        home = new P01_home(driver);
        login = new P03_login(driver);
        order = new P013_order(driver);
        home.clicklogin();
        login.enter_email(email);
        login.enter_password(password);
        login.presson_remeber_button();
        login.press_login();
        order.add_to_cartbuttonn();
        order.press_on_terms();
        Thread.sleep(3000);
        order.press_on_checkout();
        Thread.sleep(1500);
        order.addrandomcountry(country);
        order.addcity(city);
        order.addadress1(address1);
        order.addadress2(addresssecond);
        order.addzipcode(zipcode);
        order.addphone(phone);
        order.addfax(fax);
        Thread.sleep(5000);
        order.click_button();
        Thread.sleep(5000);
        order.shipmethod_button();
        order.pressonclickfor_ship();
        Thread.sleep(2000);
        order.choosevisa();
        Thread.sleep(1500);
        order.presson_paymentclick();
        Thread.sleep(1500);
        order.fill_cardholder(cardholder);
        order.fill_cardnumber(cardnum);
        order.add_expirymonth(expiry_month);
        order.add_expiryyear(expiry_year);
        order.fill_cardcode(cardcode);
        Thread.sleep(3000);
        order.press_on_card_button();
        Thread.sleep(2000);
        order.press_confirmbutton();
        Thread.sleep(2000);
        //order.press_detailbutton();
        //Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);


    }
}
