package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputersPage extends BasePage {

    @FindBy(xpath = "(//a[text() = 'Ноутбуки'])")
    protected WebElement laptopBtn;

    public void clickLaptop(){
        laptopBtn.click();
    }
}
