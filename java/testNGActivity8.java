import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Sub8.SubActivity8;

import java.time.Duration;

public class testNGActivity8 {
    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/simple-form");

        }

        @Test(dataProvider = "Authentication",dataProviderClass =SubActivity8.class )

    public void test(String firstname, String lastname,String email, String number,String message)
    {
        WebElement fname=driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
        new Actions(driver)
                .click(fname)
                .sendKeys(firstname)
                .sendKeys(Keys.TAB)
                .sendKeys(lastname)
                .sendKeys(Keys.TAB)
                .sendKeys(email)
                .sendKeys(Keys.TAB)
                .sendKeys(number)
                .sendKeys(Keys.TAB)
                .sendKeys(message)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        Alert alert=driver.switchTo().alert();
        alert.accept();

    }
}