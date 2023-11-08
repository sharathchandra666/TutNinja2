package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //    **************  Elelment  ************
    @FindBy(id = "input-firstname")
    WebElement firstnameField;
    @FindBy(id = "input-lastname")
    WebElement lastnameField;
    @FindBy(id = "input-email")
    WebElement EmailField;
    @FindBy(id = "input-telephone")
    WebElement telephoneField;
    @FindBy(id = "input-password")
    WebElement passowrdField;
    @FindBy(id = "input-confirm")
    WebElement confirm_passowrdField;

@FindBy(xpath = "//input[@name='agree']")
    WebElement agreeCheckbox;
@FindBy(css = "input[value='Continue']")
    WebElement submitBtn;

// ********************// ACTION  //**********************************
    public void enterFirstname(String firstName)
    {
        firstnameField.sendKeys(firstName);
    }
    public void enterLastName(String lastname)
    {
        lastnameField.sendKeys(lastname);
    }

    public void enterEmail(String email)
    {
        EmailField.sendKeys(email);
    }
     public void enterTelephone(String telephone)
    {
        telephoneField.sendKeys(telephone);
    }
    public void enterPassword(String password)
    {
      passowrdField.sendKeys(password);
    }
     public void enterCNF_Password(String CNF_password)
    {
      confirm_passowrdField.sendKeys(CNF_password);
    }

      public void clickAgreeCheckbox()
    {
     agreeCheckbox.click();
    }

    public void clickSubmit()
    {
     submitBtn.click();
    }






}
