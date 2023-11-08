package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement Myaccount;
    @FindBy(linkText = "Login")
    WebElement LoginOption;
    @FindBy(linkText = "Register")
    WebElement registerOption;

    //    **********************Action****************
    public void Click_Myaccount() {
        Myaccount.click();
    }

    public void Click_Login() {
        LoginOption.click();
    }
    public void Click_register()
    {
        registerOption.click();
    }

}
