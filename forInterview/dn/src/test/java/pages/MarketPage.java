package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketPage extends BasePage {

    @FindBy(xpath = "//span[text() = 'Компьютерная техника']")
    private WebElement computersBnt;

    public void clickComputers(){
        computersBnt.click();
    }
}
