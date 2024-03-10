package testcases;

import org.testng.annotations.Test;
import pages.P01_home;
import pages.P02_registeration;
import pages.P03_login;
import pages.P06_change_currency;

import static java.lang.Thread.*;
import static testcases.T01_register.email;
import static testcases.T01_register.password;

public class T05_change_currency extends Testbase{
    P01_home home;
    P02_registeration register;
    P03_login login;
    P06_change_currency currency;
    String word = "Euro";
    String word2 = "US Dollar";

    @Test(priority = 1)
        public void currency_change() throws InterruptedException {
            home = new P01_home(driver);
            register = new P02_registeration(driver);
            login = new P03_login(driver);
            currency = new P06_change_currency(driver);
            home.clicklogin();
            login.enter_email(email);
            login.enter_password(password);
            login.press_login();
            Thread.sleep(2000);
            currency.change_currecnyy(word);
            Thread.sleep(2000);
           currency.change_currecnyy(word2);
            Thread.sleep(2000);



        }

}
