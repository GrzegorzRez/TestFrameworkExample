package com.demoqa.pages.elements;

import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.GetUtility.getText;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class CheckBoxPage extends BasePage {

    private final By homeChevron = By.xpath("//li[1]/span/button");
    private final By documentsCheckBox = By.xpath("//li[2]/span/label/span[@class='rct-checkbox']");
    private final By currentSelectionResult = By.xpath("//div/span[contains(text(),'documents')]");

    public void expandHomeDirectory() {
        scrollToElementJS(homeChevron);
        click(homeChevron);
    }

    public String selectDocumentsCheckBox() {
        click(documentsCheckBox);
        return getText(currentSelectionResult);
    }
}
