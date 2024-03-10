package testcases;

import org.testng.annotations.Test;
import pages.P01_home;
import pages.P02_registeration;
import pages.P03_login;
import pages.P05_searchafterlogin;

import static testcases.T01_register.email;
import static testcases.T01_register.password;

public class T04_search extends Testbase{
    P01_home home;
    P02_registeration register ;
    P03_login login;
    P05_searchafterlogin search;
    String word = "book";
    @Test(priority = 1)
    public void search_p() throws InterruptedException {
        home = new P01_home(driver);
        register = new P02_registeration(driver);
        login = new P03_login(driver);
        search = new P05_searchafterlogin(driver);
        home.clicklogin();
        login.enter_email(email);
        login.enter_password(password);
        login.press_login();
        Thread.sleep(3000);
        search.search_item(word);
        Thread.sleep(2000);

    }
}
