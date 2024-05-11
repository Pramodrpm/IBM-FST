import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.time.Instant;

public class SeleniumActivity18 {
    public static void main(String[] args) {
    WebDriver driver=new FirefoxDriver();
    driver.get("https://v1.training-support.net/selenium/javascript-alerts");
    String pagetitle= driver.getTitle();
    System.out.println(pagetitle);

        WebElement button =driver.findElement(By.xpath("//*[@id=\"confirm\"]"));
        button.click();


//Wait for the alert to be displayed and store it in a variable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

//Store the alert text in a variable
        String text = alert.getText();
        System.out.println(text);


        alert.dismiss();
        //alert.accept();


    }
}
