package testcases;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.P01_home;
import pages.P02_registeration;

import static util.Utility.randomintnumber;

public class T01_register extends Testbase{
    P01_home home;
    P02_registeration register;

    String firstname = faker.name().firstName();
    String lastname = faker.name().lastName();
    int day = randomintnumber(28);
    int month = randomintnumber(12);
    int year = randomintnumber(50) ;
    static String email ;
    String company_name = faker.company().name();
     static String password = "123456";
    String password2 = "123456";


    @Test(priority = 1 )
    public void registernew_p() throws InterruptedException {
        home = new P01_home(driver);
        register = new P02_registeration(driver);
        email = faker.internet().emailAddress();
        home.clickregister();
        Thread.sleep(2000);
        register.choosegender();
        register.addfirstname(firstname);
        register.addlastname(lastname);
        register.addrandomday(day);
        register.addrandommonth(month);
        register.addrandomyear(year);
        register.addemail(email);
        register.addecompanyname(company_name);
        register.press_on_newsettler();
        register.type_password(password);
        register.type_password2(password2);
        register.pressonregister();
        Thread.sleep(3000);


    }

}
