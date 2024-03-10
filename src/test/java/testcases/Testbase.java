package testcases;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Testbase {
    WebDriver driver;
    Faker  faker = new Faker();
    @BeforeTest
    public void setupdriver() throws InterruptedException {
        // ToDo: configurations' steps
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
    }
    @AfterTest
    public void teardown(){
        driver.close();
    }
}
