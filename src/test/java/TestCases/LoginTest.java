package TestCases;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static Utilites.util.EmailTimestamp;


public class LoginTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        String Broswer = "chrome";

        if (Broswer.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (Broswer.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (Broswer.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test(priority = 1)
    public void Login_with_valid_details() {
        HomePage homePage = new HomePage(driver);
        homePage.Click_Myaccount();
        homePage.Click_Login();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("sharathchandra@gmail.com");
        loginPage.enterPassowrd("Security@#1");
        loginPage.LoginBTN();
        Assert.assertFalse(driver.findElement(By.linkText("Edit your account information")).isDisplayed(), "not login corretly");


    }
    @Test(priority = 2)
    public void Login_with_INvalid_details()
    {
        HomePage homePage = new HomePage(driver);
        homePage.Click_Myaccount();
        homePage.Click_Login();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail(EmailTimestamp());
        System.out.println(EmailTimestamp());
        loginPage.enterPassowrd("Security@#1");
        loginPage.LoginBTN();
    }

    @Test(priority = 3)
    public void Login_With_no_data()
    {
        HomePage homePage = new HomePage(driver);
        homePage.Click_Myaccount();
        homePage.Click_Login();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.LoginBTN();
    }



    @AfterMethod
    public void Teardown()
    {
        driver.quit();
    }

}
