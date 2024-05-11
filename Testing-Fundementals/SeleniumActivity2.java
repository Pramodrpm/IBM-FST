import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumActivity2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/login-form");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        // Clear field to empty it from any previous data
        WebElement emailInput=driver.findElement(By.id("username"));
        emailInput.clear();
        //Enter Text
        String email="admin";
        emailInput.sendKeys(email);
        WebElement pwInput=driver.findElement(By.id("password"));
        pwInput.clear();
        //Enter Text
        String password="password";
        pwInput.sendKeys(password);

        WebElement button =driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/button"));
        button.click();
        System.out.println(driver.getTitle());


        driver.close();






    }
}
