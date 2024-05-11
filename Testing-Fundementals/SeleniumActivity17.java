import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class SeleniumActivity17 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();


        // Open the browser
        driver.get("https://v1.training-support.net/selenium/selects");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        WebElement selectElement = driver.findElement(By.id("single-select"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Option 2");
        select.selectByIndex(3);
        select.selectByValue("4");

        List<WebElement> options =select.getOptions();

        System.out.println("options:");
        for (WebElement option: options ){
            System.out.println(option.getText());
        }
}
}