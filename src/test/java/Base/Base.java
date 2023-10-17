package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Base {
    WebDriver driver;

    public WebDriver Broswer_ev_setup(String Broswer)
    {
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
        return driver;
    }

}
