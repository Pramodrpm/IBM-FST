import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class SeleniumActivity20 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        driver.get("https://v1.training-support.net/selenium/tab-opener");
        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());
        driver.findElement(By.id("launcher")).click();
        wait.until(numberOfWindowsToBe(2));
        System.out.println(driver.getWindowHandles());
        for(String handle:driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        wait.until(ExpectedConditions.elementToBeClickable(By.id("actionButton")));
        System.out.println("Current tab:"+driver.getWindowHandle());
        System.out.println("Current tab:"+driver.getTitle());
        String pageHeading=driver.findElement(By.className("content")).getText();
        System.out.println("Page heading:"+pageHeading);
        driver.findElement(By.id("actionButton")).click();
        wait.until(numberOfWindowsToBe(3));
        for(String handle:driver.getWindowHandles()){
            driver.switchTo().window(handle);
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("content")));
        System.out.println("Current tab:"+driver.getWindowHandle());
        System.out.println("Page title:"+driver.getTitle());
        pageHeading=driver.findElement(By.className("content")).getText();
        System.out.println("Page Heading:"+pageHeading);
        driver.quit();
    }
}