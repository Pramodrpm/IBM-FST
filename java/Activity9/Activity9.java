package Activity9;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;
import java.util.List;

public class Activity9 {
        public static void main(String[] args) {

            // Initialize FirefoxDriver
            WebDriver driver = new FirefoxDriver();


            driver.get("https://alchemy.hguy.co/crm/index.php?action=Login&module=Users");


            driver.findElement(By.id("user_name")).sendKeys("admin");
            driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
            driver.findElement(By.id("bigbutton")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            // Navigate to Sales to Leads
            driver.findElement(By.id("grouptab_0")).click();
            driver.findElement(By.id("moduleTab_9_Leads")).click();


            WebElement table = driver.findElement(By.id("content"));

            // Find all rows in the table
            List<WebElement> rows = table.findElements(By.tagName("tr"));

            // Print the first 10 values in the Name and User columns
            System.out.println("First 10 values in the Name and User columns:");

            for (int i = 0; i <= 12 && i < rows.size(); i++) {
                    WebElement row = rows.get(i);
                    List<WebElement> cells = row.findElements(By.tagName("td"));
                    if (cells.size() >= 10) { // Check if the row contains any cells
                        String nameFirstColumn = cells.get(2).getText(); // Get the text from the first column
                        String nameSixthColumn = cells.get(7).getText();
                        System.out.println("user name = " + nameFirstColumn + " , " + "user = " + nameSixthColumn);
                }
            }

//
            driver.quit();
        }
    }


