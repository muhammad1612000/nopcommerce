package testcases;

import org.testng.annotations.Test;
import pages.P01_home;
import pages.P03_login;
import pages.P07_change_color;
import pages.P08_add_product;

import static testcases.T01_register.email;
import static testcases.T01_register.password;
import static util.Utility.randomintnumber;

public class T07_add_product extends  Testbase{
    P01_home home ;
    P03_login login ;
    P08_add_product prodcut;
    int button1 = randomintnumber(2);
    int button2 = randomintnumber(2);

    @Test (priority  =1 )
        public void add_produc_to_cart() throws InterruptedException {
            home = new P01_home(driver);
            login = new P03_login(driver);
            prodcut = new P08_add_product(driver);
            home.clicklogin();
            login.enter_email(email);
            login.enter_password(password);
            login.press_login();
            // add to cart in home page
            prodcut.presson_button();
            Thread.sleep(4000);
            prodcut.presson_button1(button1);
            prodcut.presson_button2(button2);
            prodcut.presson_button3();
            Thread.sleep(3000);
            prodcut.presson_button4();
            Thread.sleep(2000);

        }


}
