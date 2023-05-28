package myapp.tests;

import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class day_18FirstConfigTest {

    @Test
    public void firstConfigTest(){

        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.toLowerCase().contains(ConfigReader.getProperty("amazon_title")));
        Driver.closeDriver();

    }
}
