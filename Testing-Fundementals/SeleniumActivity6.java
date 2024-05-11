import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class SeleniumActivity6 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/input-events");

        // Perform testing and assertions
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
//give the input of my first letter
        new Actions(driver)
                .sendKeys("P")
                .perform();
        // selecting all the text
        new Actions(driver)
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .perform();
        //coping the selected text
        new Actions(driver)
                .keyDown(Keys.CONTROL)
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .perform();



    }
}
