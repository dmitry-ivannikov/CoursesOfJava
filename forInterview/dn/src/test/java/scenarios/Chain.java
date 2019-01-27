package scenarios;

import org.junit.Test;

public class Chain extends MainTest {

    @Test
    public void openLaptops(){
        new OpenLaptopsTest().openLaptops();
    }

    @Test
    public void searchLaptop(){
        new SearchLaptopsTest().searchLaptop();
    }

    @Test
    public void checkResult(){
        new CheckResultTest().checkResult();
    }



}
