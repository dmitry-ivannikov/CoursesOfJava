package pages;

import com.codeborne.selenide.Selectors;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginForm extends BasePage {

    @FindBy(id = "mailbox:login")
    private WebElement logunInput;


    @FindBy(id = "mailbox:password")
    private WebElement passInput;


    @FindBy(id = "mailbox:domain")
    private WebElement domain;


    @FindBy(id = "mailbox:submit")
    private WebElement submit;

    public void setLogin(String login){
        logunInput.sendKeys(login);
    }

    public void setPassInput(String pass){
        passInput.sendKeys(pass);
    }

    public void openDomainList(){
        domain.click();
    }
    public void getBkDomain(){
        domain.findElement(new Selectors.ByText("@bk.ru")).click();
    }
    public void clickOnSubmit(){
        submit.click();
    }

}
