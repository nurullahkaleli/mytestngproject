package myapp.tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class day17_DependsOnMethods {

    @Test
    public void homePage(){
        assertTrue(false); //Fails on purpose --> If this method fails searchPage() methods will be ignored
        System.out.println("GoingHomePage...");
    }

    @Test(dependsOnMethods = "homePage")
    public void searchPage(){
        System.out.println("Searching...");
    }

    @Test
    public void checkOutPage(){
        System.out.println("Checking...");
    }

}
