import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGActivity6 {


    // Declare the WebDriver object
    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

//    @Test
//    public void Title() {
//        // Check the title of the page
//        String title = driver.getTitle();
//
//        //Print the title of the page
//        System.out.println("Page title is: " + title);
//        Assert.assertEquals("Login Form", title);
//
//
//        //Print title of new page
//        System.out.println("New page title is: " + driver.getTitle());
//
//        Assert.assertEquals(driver.getTitle(), "Login Form");
//    }

    @Test
    @Parameters({ "sUsername", "sPassword" })
    public void test(String sUsername, String sPassword)
    {
        WebElement emailInput=driver.findElement(By.id("username"));
        emailInput.sendKeys(sUsername);


        WebElement pwInput=driver.findElement(By.id("password"));
        pwInput.sendKeys(sPassword);

        WebElement button =driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/button"));
        button.click();
//Statements that use sUsername and sPassword.
    }
//    @Test
//    public void Input(){
//
//
//
//
//    }

//    @Test
//    public void Message(){
//        WebElement welcome =driver.findElement(By.id("action-confirmation"));
//        Assert.assertEquals("Welcome Back, admin",welcome.getText());
//    }
    @Test
    public void close(){
//        driver.close();
    }
}
