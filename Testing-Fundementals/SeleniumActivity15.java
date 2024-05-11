import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class SeleniumActivity15 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        WebElement emailInput=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/div[1]/input"));
        emailInput.clear();
        //Enter Text
        String email="admin";
        emailInput.sendKeys(email);
        WebElement pwInput=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/div[2]/input"));
        pwInput.clear();
        //Enter Text
        String password="password";
        pwInput.sendKeys(password);

        WebElement button =driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/button"));
        button.click();

        WebElement message =driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]"));
        String message1=message.getText();
        System.out.println(message1);

        driver.close();

    }

}
