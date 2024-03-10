package testcases;

import org.testng.annotations.Test;
import pages.P010_add_to_comparelist;
import pages.P01_home;
import pages.P03_login;

import static testcases.T01_register.email;
import static testcases.T01_register.password;

public class T09_add_to_comparelist extends Testbase{
    P01_home home ;
    P03_login login;
    P010_add_to_comparelist compare;
    @Test(priority = 1)
    public void add_to_compare_list() throws InterruptedException {
            home = new P01_home(driver);
            login = new P03_login(driver);
            compare =  new P010_add_to_comparelist(driver);
            home.clicklogin();
            login.enter_email(email);
            login.enter_password(password);
            login.press_login();
            Thread.sleep(2500);
            compare.press_jewelry();
            Thread.sleep(2500);
            compare.press_on_viewmode();
            Thread.sleep(2500);
            compare.press_on_compare();
            Thread.sleep(2500);
        }

}
