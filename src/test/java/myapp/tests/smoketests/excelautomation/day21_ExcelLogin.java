package myapp.tests.smoketests.excelautomation;


import myapp.pages.RentalHomePage;
import myapp.pages.RentalLoginPage;
import myapp.utilities.*;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class day21_ExcelLogin {

    ExcelUtils excelUtils;
    List<Map<String, String>> dataList;
    RentalHomePage rentalHomePage;
    RentalLoginPage rentalLoginPage;


    @Test
    public void customerLoginTest() {
        String path = "./src/test/java/resources/mysmoketestdata.xlsx";
        String sheetName = "customer_info";

        excelUtils = new ExcelUtils(path, sheetName);
        dataList = excelUtils.getDataList();
        System.out.println("dataList = " + dataList);


        for (Map<String, String> w : dataList) {
            rentalHomePage = new RentalHomePage();
            rentalLoginPage = new RentalLoginPage();
            //[{password=c!fas_art, username=sam.walker@bluerentalcars.com}, {password=tad1$Fas, username=kate.brown@bluerentalcars.com}, {password=v7Hg_va^, username=raj.khan@bluerentalcars.com}, {password=Nga^g6!, username=pam.raymond@bluerentalcars.com}]

//        Go to homepage
            Driver.getDriver().get(ConfigReader.getProperty("rental_home_url"));

            //Sign In
//        Click on Login
            WaitUtils.waitFor(1);
            rentalHomePage.loginLink.click();

//        Enter email
            WaitUtils.waitFor(1);
            rentalLoginPage.userEmail.sendKeys(w.get("username")); //Get data from data excel

//        Enter password
            WaitUtils.waitFor(1);
            rentalLoginPage.userPassword.sendKeys(w.get("password")); //Get data from data excel

//        Click on login
            WaitUtils.waitFor(1);
            rentalLoginPage.loginButton.click();

//        Verify login
            WaitUtils.waitFor(1);
            ReusableMethods.verifyElementDisplayed(rentalHomePage.userID);

            //Sign Out
//        Click on id
            WaitUtils.waitFor(1);
            rentalHomePage.userID.click();

//        Click on logout
            WaitUtils.waitFor(1);
            rentalHomePage.logOut.click();

//        Click on OK
            WaitUtils.waitFor(1);
            rentalHomePage.OK.click();
        }

        Driver.closeDriver();
    }

    /*
    Loop This Steps:

    Go to homepage
    Click on Login
    Enter email
    Enter password
    Click on login
    Verify login
    Click on id
    Click on logout
    Click on OK
     */

    /*
    pseudo code:
    Go to homepage
    Click on Login
    Enter email
    Enter password
    Click on login
    Verify login
    Click on id
    Click on logout
    Click on OK

    Click on Login
    Enter email
    Enter password
    Click on login
    Verify login
    Click on id
    Click on logout
    Click on OK

    Click on Login
    Enter email
    Enter password
    Click on login
    Verify login
    Click on id
    Click on logout
    Click on OK

    Click on Login
    Enter email
    Enter password
    Click on login
    Verify login
    Click on id
    Click on logout
    Click on OK

     */


}
