package myapp.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {

    @DataProvider
    public Object [][] customerCredentials(){

        //This is the data source
        Object [][] customerInfo = { {"customer1", "12345"},{"customer2","67890"},{"customer3","54321"},{"customer4", "045678"}  };

        return customerInfo;
    }

    @DataProvider
    public Object[][] cities(){

        Object[][] cities = {
                {"California", "LA", "39,029,342"},
                {"Texas", "AU", "30,029,572" },
                {"Florida", "MIA", "22,244,823"}
        };

        return cities;
    }
//      DATA FOR LOGIN TEST
    @DataProvider
    public Object[][] customerDataProvider(){

        Object[][] customerInfo = {
                {"sam.walker@bluerentalcars.com", "c!fas_art"},
                {"kate.brown@bluerentalcars.com", "tad1$Fas"},
                {"raj.khan@bluerentalcars.com", "v7Hg_va ^"},
                {"pam.raymond@bluerentalcars.com", "Nga ^ g6!"}
        };
        return customerInfo;
    }


}
