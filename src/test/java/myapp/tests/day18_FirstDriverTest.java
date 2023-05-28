package myapp.tests;

import myapp.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class day18_FirstDriverTest {

//    Create FirstDriverTest class
//    Go to amazon page
//    Verify the title includes amazon
    @Test
    public void firstDriverTest(){
//        Go to amazon page
//        driver.get("https://www.amazon.com");
//        driver ->>>>> Driver.getDriver()

        Driver.getDriver().get("https://www.amazon.com");

//        Verify the title includes amazon
//        driver.getTitle();

        String actualTitle = Driver.getDriver().getTitle();

//        assert actualTitle.contains("amazon");

        Assert.assertTrue(actualTitle.contains("Amazon"));

//        closing the driver
//        driver.quit();

        Driver.closeDriver();

    }
}
