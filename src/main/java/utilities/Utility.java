package utilities;

import com.base.BasePage;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Utility {

    public static WebDriver driver;

    public static void setUtilityDriver() {
        driver = BasePage.driver;
    }

    public static void delay(int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    //Generate a random number

    //Return strings to uppercase
}
