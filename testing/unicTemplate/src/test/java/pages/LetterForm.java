package pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class LetterForm extends BasePage {


    @FindBy(xpath = "//span[text()=\"Написать письмо\"]") //ideally it should be in a separate class
    private WebElement writeLetterBtn;

    @FindBy(xpath = "//textarea[@data-original-name=\"To\"]")
    private WebElement toInput;

    @FindBy(xpath = "//input[@name=\"Subject\"]")
    private WebElement subject;


    @FindBy(xpath = "//span[text()=\"Отправить\"]")
    private WebElement sendBtn;

    public void clickOnWriteLetterBtn(){
        writeLetterBtn.click();
    }

    public void clickToInput(){
        toInput.click();
    }

    public void setToInput(String text){
        toInput.sendKeys(text);
    }

    public void setSubject(String text){
        subject.sendKeys(text);
    }


    public WebElement getBodyElement(){
        subject.click();
        subject.sendKeys(Keys.TAB);
        //Selenide.getFocusedElement().click();
        return Selenide.getFocusedElement();
    }

    public void setBody(String text){

        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable transferable = new StringSelection(text);
        clipboard.setContents(transferable, null);

        getBodyElement().sendKeys(Keys.chord(Keys.CONTROL,"v"));

    }

    public void clickSendBtn(){
        sendBtn.click();
    }
}
