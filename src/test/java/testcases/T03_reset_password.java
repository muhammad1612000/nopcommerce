package testcases;

import org.testng.annotations.Test;
import pages.P01_home;
import pages.P02_registeration;
import pages.P03_login;
import pages.P04_reset_password;

import static testcases.T01_register.email;

public class T03_reset_password extends Testbase {
    P01_home home;
    P02_registeration register ;
    P03_login login;
    P04_reset_password reset;
    //String email = "muhammad2022@gmail.com";


    @Test(priority = 1)
    public void reset_password_p() throws InterruptedException {

        home = new P01_home(driver);
        register = new P02_registeration(driver);
        login = new P03_login(driver);
        reset = new P04_reset_password(driver);
        home.clicklogin();
        login.press_on_forget();
        reset.enter_email(email);
        Thread.sleep(3000);
        reset.press_on_send_button();
        Thread.sleep(3000);

    }

}
