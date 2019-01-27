package scenarios;

import org.junit.Test;

public class SearchLaptopsTest extends MainTest {

    @Test
    public void searchLaptop() {
        laptopsPage.clickDell();
        laptopsPage.setMinPrice("50000");
        laptopsPage.setMaxPrice("150000");
        laptopsPage.clickFilterByPrice();
    }
}
