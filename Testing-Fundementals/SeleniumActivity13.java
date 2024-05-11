import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class SeleniumActivity13 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/tables");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);


        WebElement table = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/table"));

        List<WebElement> rowCount = table.findElements(By.xpath(".//tr"));
        int row= rowCount.size();
        System.out.println("Number of rows: " + row);


        List<WebElement> columnCount = table.findElements(By.xpath("/html/body/div/div[2]/div/div[2]/td"));

        // Print the number of rows and columns

        //System.out.println("Number of columns: " + columnCount);

    }
}
