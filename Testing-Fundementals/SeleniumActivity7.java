import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActivity7 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/drag-drop");

        // Perform testing and assertions
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        while (true) {
            WebElement draggable = driver.findElement(By.id("draggable"));
            WebElement droppable = driver.findElement(By.id("droppable"));

            new Actions(driver)
                    .dragAndDrop(draggable, droppable)
                    .perform();

            WebElement draggable1 = driver.findElement(By.id("draggable"));
            WebElement droppable1 = driver.findElement(By.id("dropzone2"));
            new Actions(driver)
                    .dragAndDrop(draggable1, droppable1)
                    .perform();

        }

    }
}