package scenarios;

import org.junit.Test;

public class OpenLaptopsTest extends MainTest{

    @Test
    public void openLaptops() {
        yandexPage.clickMarket();
        marketPage.clickComputers();
        computersPage.clickLaptop();
    }
}
