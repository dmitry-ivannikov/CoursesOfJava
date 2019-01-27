package scenarios;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import pages.LetterForm;
import pages.LoginForm;

import java.util.concurrent.TimeUnit;



public class MainTest {

    public static WebDriver driver;


    static LoginForm loginForm;
    static LetterForm letterForm;

    MainTest(){
        loginForm = new LoginForm();
        letterForm = new LetterForm();

    }

    public static WebDriver getDriver(){
            return driver;
    }


    @BeforeClass
    public static void before(){
        System.setProperty("webdriver.chrome.driver" ,"chromedriver");
        driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://mail.ru/");

    }

    @AfterClass
    public static void after(){
        driver.close();
    }

}
