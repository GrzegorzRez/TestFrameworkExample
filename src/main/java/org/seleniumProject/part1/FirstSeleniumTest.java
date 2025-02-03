package org.seleniumProject.part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class FirstSeleniumTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass
    public void tearDown() {
      //  driver.quit();
    }

    @Test
    public void testLoggingIntoApplication() throws InterruptedException {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement usernameInput = driver.findElement(By.name("username"));
        usernameInput.sendKeys("Admin");

        var passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("admin123");
        driver.findElement(By.tagName("button")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement dashboardTitle = driver.findElement(By.tagName("h6"));
        String actualResult = driver.findElement(By.tagName("h6")).getText();
        String expectedResult = "Dashboard";
        Assert.assertEquals(actualResult, expectedResult);

    }
}
