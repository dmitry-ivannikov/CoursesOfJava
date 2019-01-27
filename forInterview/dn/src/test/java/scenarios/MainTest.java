package scenarios;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import pages.*;

import java.util.concurrent.TimeUnit;



public class MainTest {

    public static WebDriver driver;


    static YandexPage yandexPage;
    static MarketPage marketPage;
    static ComputersPage computersPage;
    static LaptopsPage laptopsPage;

    MainTest(){
        yandexPage = new YandexPage();
        marketPage = new MarketPage();
        computersPage = new ComputersPage();
        laptopsPage = new LaptopsPage();
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
//        driver.get("https://mail.ru/");
        driver.get("https://yandex.ru/");

    }

    @AfterClass
    public static void after(){
        driver.close();
    }

}
