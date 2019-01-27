package pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.LinkedHashMap;

import static com.codeborne.selenide.Selenide.$$;

public class LaptopsPage extends BasePage {

    @FindBy(xpath = "//span[text() = 'DELL']")
    private WebElement dellCheckbox;

    @FindBy(xpath = "//input[@type = 'text'][@name = 'Цена от']")
    private WebElement minPriceInput;

    @FindBy(xpath = "//input[@type = 'text'][@name = 'Цена до']")
    private WebElement maxPriceInput;

    @FindBy(xpath = "//a[text() = 'по цене']")
    private WebElement filterByPriceBtn;


    public void clickDell() {
        dellCheckbox.click();
    }

    public void setMinPrice(String minPrice){
        this.minPriceInput.sendKeys(minPrice);
    }

    public void setMaxPrice(String maxPrice){
        this.maxPriceInput.sendKeys(maxPrice);
    }

    public void clickFilterByPrice(){
        filterByPriceBtn.click();
    }

    public void checkResult(){


        LinkedHashMap<String, String> lmap = new LinkedHashMap();

        ElementsCollection titles = $$(By.xpath("//div[@class='n-snippet-card2__title']/*"));


        ElementsCollection prices = $$(By.xpath("//div[@class='price']"));
        for (int i = 0; i < titles.size(); i++) {
            lmap.put(
                    titles.get(i).getAttribute("title") ,
                    prices.get(i).getText()
            );
        }

        System.out.println(lmap);

    }

}
