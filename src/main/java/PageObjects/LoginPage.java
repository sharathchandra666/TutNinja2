package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "#input-email")
    WebElement emailfield;
    @FindBy(css = "#input-password")
    WebElement passwordField;
    @FindBy(xpath = "//input[@value='Login']")
    WebElement submitBtn;

//    **********************//  ACTIONS  //********************

    public void enterEmail(String email) {
        emailfield.sendKeys(email);
    }

    public void enterPassowrd(String password) {
        passwordField.sendKeys(password);
    }

    public void LoginBTN() {
        submitBtn.click();
    }


}
