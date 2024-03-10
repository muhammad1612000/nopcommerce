package testcases;

import org.testng.annotations.Test;
import pages.P01_home;
import pages.P03_login;
import pages.P09_add_to_wishlist;

import static testcases.T01_register.email;
import static testcases.T01_register.password;

public class T08_add_wishlist extends Testbase{
    P01_home home ;
    P03_login login ;
    P09_add_to_wishlist wishlist;
    @Test(priority = 1)
    public void add_to_wishlist() throws InterruptedException {
        home = new P01_home(driver);
        login = new P03_login(driver);
        wishlist = new P09_add_to_wishlist(driver);
        home.clicklogin();
        login.enter_email(email);
        login.enter_password(password);
        login.press_login();
        wishlist.press_on_category();
        Thread.sleep(3000);
        wishlist.press_on_add_wishlist();
        Thread.sleep(5000);
    }
}
