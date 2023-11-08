package TestCases;

import Base.Base;
import PageObjects.HomePage;
import PageObjects.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Utilites.util.EmailTimestamp;

public class RegisterTest extends Base
{
    WebDriver driver;
    @BeforeMethod
    public void setup()
    {
        driver = Broswer_ev_setup("chrome");
    }
    @Test(priority = 1)
    public void enter_Only_mandatory()
    {
        HomePage homePage=new HomePage(driver);
        homePage.Click_Myaccount();
        homePage.Click_register();
        RegisterPage registerPage=new RegisterPage(driver);
        registerPage.enterFirstname("Sharath");
        registerPage.enterLastName("chandra");
        registerPage.enterEmail(EmailTimestamp());
        registerPage.enterTelephone("9381477596");
        registerPage.enterPassword("Security@#1");
        registerPage.enterCNF_Password("Security@#1");
        registerPage.clickAgreeCheckbox();
        registerPage.clickSubmit();
    }

}
