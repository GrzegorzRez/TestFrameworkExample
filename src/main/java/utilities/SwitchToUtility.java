package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;

import static utilities.GetUtility.getAllWindowHandles;
import static utilities.GetUtility.getCurrentWindowHandle;

public class SwitchToUtility extends Utility {

    private static WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }

    public static String getAlertText() {
        return switchTo().alert().getText();
    }

    public static void acceptAlert() {
        switchTo().alert().accept();
    }

    public static void dismissAlert() {
        switchTo().alert().dismiss();
    }

    public static void setAlertText(String text) {
        switchTo().alert().sendKeys(text);
    }

    public static void switchToFrame(String frame) {
        switchTo().frame(frame);
    }

    public static void switchToFrame(int index) {
        switchTo().frame(index);
    }

    public static void switchToDefaultContent() {
        switchTo().defaultContent();
    }

    public static void switchToFrame(WebElement element) {
        switchTo().frame(element);
    }

    public static void switchToWindow() {
        Set<String> allHandles = getAllWindowHandles();
        String currentHandle = getCurrentWindowHandle();

        for (String handle : allHandles) {
            if (currentHandle.equals(handle)) {
                System.out.println("You are already switched to this window: " + handle);
            } else {
                driver.switchTo().window(handle);
                System.out.println("Successfully switched to window id: " + handle);
            }
        }
    }
}
