import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActivity9 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/ajax");

        // Perform testing and assertions
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        WebElement clickable = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/button"));
        new Actions(driver)
                .click(clickable)
                .perform();

        //GetText
        // Retrieves the text of the element




    }
}
