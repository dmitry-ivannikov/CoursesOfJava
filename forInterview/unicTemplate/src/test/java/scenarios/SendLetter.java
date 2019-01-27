package scenarios;


import org.junit.Test;

public class SendLetter extends MainTest {

    @Test
    public void execute(){

        new Login().login();

        letterForm.clickOnWriteLetterBtn();
        letterForm.setToInput("test@test.com");
        letterForm.setSubject("newLetter");
        letterForm.clickToInput();
        letterForm.setBody("Hello World");
        letterForm.clickSendBtn();
    }
}
