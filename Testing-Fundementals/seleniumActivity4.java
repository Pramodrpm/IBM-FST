import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumActivity4 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        WebElement thirdHead= driver.findElement(By.xpath("//*[@id=\"third-header\"]"));
        String thirdtext = thirdHead.getText();
        System.out.println(thirdtext);

        WebElement fifthHead= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5"));
        String fifthtext = fifthHead.getText();
        System.out.println(fifthtext);

        WebElement button =driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/button[3]"));
        String buttonClass = button.getAttribute("class");
        System.out.println(buttonClass);

        WebElement graybutton =driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
        String graybuttonClass = graybutton.getAttribute("class");
        System.out.println(graybuttonClass);

        driver.close();

    }
}
