package utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtility extends Utility {

    private static Actions act() {
        return new Actions(driver);
    }

    public static void dragAndDropBy(WebElement source, int x, int y) {
        act().dragAndDropBy(source,x ,y).perform();
    }

    public static void sendKeys(WebElement element, CharSequence text) {
        act().sendKeys(element, Keys.chord(text)).perform();
    }

    public static void doubleClick(WebElement element) {
        act().doubleClick(element).perform();
    }

    public static void rightClick(WebElement element) {
        act().contextClick(element).perform();
    }
}
