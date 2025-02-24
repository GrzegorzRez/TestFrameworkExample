package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownUtility extends Utility {

    private static Select findDropdown(By locator) {
        return new Select(driver.findElement(locator));
    }

    public static void selectByVisibleText(By locator, String text) {
        findDropdown(locator).selectByVisibleText(text);
    }

    public static void selectByIndex(By locator, int number) {
        findDropdown(locator).selectByIndex(number);
    }

    public static void selectByValue(By locator, String val) {
        findDropdown(locator).selectByValue(val);
    }

    public static void deselectByValue(By locator, String val) {
       findDropdown(locator).deselectByValue(val);
    }

    public static List<String> getAllSelectedOptions(By locator) {
        List<WebElement> allSelectedOptions = findDropdown(locator).getAllSelectedOptions();
        return allSelectedOptions.stream().map(WebElement::getText).collect(Collectors.toList());
    }

}
