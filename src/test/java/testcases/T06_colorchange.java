package testcases;

import org.testng.annotations.Test;
import pages.P01_home;
import pages.P02_registeration;
import pages.P03_login;
import pages.P07_change_color;

import static testcases.T01_register.email;
import static testcases.T01_register.password;

public class T06_colorchange extends Testbase{
    P01_home home;
    P02_registeration register;
    P03_login login;

    P07_change_color color;
    @Test(priority = 1)
    public void choose_color_p() throws InterruptedException {
        home = new P01_home(driver);
       // register = new P02_registeration(driver);
        login = new P03_login(driver);
        color = new P07_change_color(driver);
        home.clicklogin();
        login.enter_email(email);
        login.enter_password(password);
        login.press_login();
        Thread.sleep(2000);
        color.press_on_category();
        Thread.sleep(2000);
        color.presson_shoe();
        Thread.sleep(2000);
        color.pressoncolors();
        Thread.sleep(2000);
    }
}
