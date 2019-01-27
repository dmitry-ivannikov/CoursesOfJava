package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YandexPage extends BasePage {

    @FindBy(xpath = "//a[@data-id = 'market']")
    private WebElement marketBtn;

    public void clickMarket(){
        marketBtn.click();
    }

}
