package TestSuitActivity5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Header {// Declare the WebDriver object
    WebDriver driver;

    @BeforeClass

    public void beforeMethod() {
        // Set up the Firefox driver
        System.out.println("before class");
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test
    public void exampleTestCase() {
        System.out.println("test ");
        // Check the title of the page
        String title = driver.getTitle();

        //Print the title of the page
        System.out.println("Page title is: " + title);

        //Assertion for page title
        Assert.assertEquals("Target Practice", title);

        //Find the clickable link on the page and click it

        //Print title of new page
        System.out.println("New page title is: " + driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Target Practice");
    }

    @Test
    public void Third(){
        WebElement thirdH= driver.findElement(By.id("third-header"));
       thirdH.isDisplayed();
        Assert.assertEquals(thirdH.getText(),"Third header");
    }

    @Test
    public void Color(){
        WebElement colour= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5"));
        String colorValue=colour.getCssValue("color");
        System.out.println(colorValue);



    }

    @AfterClass
    public void afterMethod() {
        System.out.println("after method");
        //Close the browser
//        driver.quit();
    }

}

