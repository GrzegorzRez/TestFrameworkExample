package com.base;

import com.demoqa.pages.HomePage;
import com.base.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static utilities.Utility.setUtilityDriver;

public class BaseTest {

    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private final String demoqa_url = "https://demoqa.com/";

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        //driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication() {
        driver.get(demoqa_url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @AfterMethod
    public void takeFailedResultScreenshot(ITestResult result){
        if (ITestResult.FAILURE == result.getStatus()) {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File(System.getProperty("user.dir") + "/resources/screenshots/(" + LocalDate.now() + result.getName() + ".png");
            try {
                FileHandler.copy(source, destination);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Screenshot Located at: " + destination);
        }
    }

}
