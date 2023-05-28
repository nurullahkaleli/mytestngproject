package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginPage {

    //ALL PAGE CLASSES MUST HAVE A CONSTRUCTOR TO USE PAGE FACTORY
    public OrangeHRMLoginPage (){
        // PageFactory is used to initiate the page objects
        //if we don't use this, we get null pointer exception
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // public WebElement username = driver.FindElement(By.name('username')); TRADITIONAL

    //POM
    //@FindBy : Used to locate the web elements.
    @FindBy(name = "username")
    public WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

}
