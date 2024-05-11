import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;


public class SeleniumActivity8 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        //isSelected
        //returns true if element is checked else returns false
        WebElement clickable = driver.findElement(By.id("toggleCheckbox"));
        new Actions(driver)
                .click(clickable)
                .perform();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement clickable2 = driver.findElement(By.id("toggleCheckbox"));
        new Actions(driver)
                .click(clickable2)
                .perform();


    }
}
