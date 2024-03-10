package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.P01_home;
import pages.P02_registeration;
import pages.P03_login;

import java.util.List;
import java.util.Random;

import static testcases.T01_register.email;
import static testcases.T01_register.password;

public class T02_login extends Testbase{
    P01_home home;
    P02_registeration register ;
    P03_login login;

   // String email = "muhammad2022@gmail.com";
   // String password = "123456" ;

    @Test (priority =  1 )
    public  void login_p() throws InterruptedException {

        home = new P01_home(driver);
       register = new P02_registeration(driver);
        login = new P03_login(driver);
        home.clicklogin();
        login.enter_email(email);
        login.enter_password(password);
        login.presson_remeber_button();
        Thread.sleep(2000);
        login.press_login();
        Thread.sleep(3000);
       /** List<WebElement> categoryElements = driver.findElements(By.xpath("(//ul)[@class=\"top-menu notmobile\"]"));
        Random random = new Random();
        int randomIndex = random.nextInt(categoryElements.size());
        Actions actions = new Actions(driver);
        actions.moveToElement(categoryElements.get(randomIndex)).perform();
        Thread.sleep(1500);
        **/
     /**  WebElement ele = driver.findElement(By.xpath("(//a)[@href=\"/apparel\"]"));
       Actions act = new Actions(driver);
       act.moveToElement(ele).perform();
       Thread.sleep(1500);
       driver.findElement(By.xpath("(//a)[@href=\"/shoes\"]"))
       Thread.sleep(1500);
**/





    }
}
