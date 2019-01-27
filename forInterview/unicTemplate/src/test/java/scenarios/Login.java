package scenarios;
import org.junit.Test;

public class Login extends MainTest {

    @Test
    public void login() {
        loginForm.setLogin("ivanov-test-ivan");
        loginForm.setPassInput("123qwert");
        loginForm.openDomainList();
        loginForm.getBkDomain();
        loginForm.clickOnSubmit();
    }
}
