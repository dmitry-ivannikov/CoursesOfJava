package pages;


import org.openqa.selenium.support.PageFactory;
import scenarios.MainTest;

public class BasePage {

    BasePage() {
        PageFactory.initElements(MainTest.getDriver(), this);
    }
}
