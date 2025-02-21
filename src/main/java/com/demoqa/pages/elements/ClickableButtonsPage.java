package com.demoqa.pages.elements;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

import static utilities.ActionsUtility.doubleClick;
import static utilities.ActionsUtility.rightClick;
import static utilities.GetUtility.getText;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class ClickableButtonsPage extends BasePage {

    private final By doubleClickButton = By.id("doubleClickBtn");
    private final By rightClickButton = By.id("rightClickBtn");
    private final By dynamicClickButton = By.xpath("//div/button[text()='Click Me']");

    public String performDoubleClick() {
        scrollToElementJS(doubleClickButton);
        doubleClick(find(doubleClickButton));
        return getClickMessage("double click");
    }

    public String performRightClick() {
        scrollToElementJS(rightClickButton);
        rightClick(find(rightClickButton));
        return getClickMessage("right click");
    }

    public String performClickOnDynamicButton() {
        scrollToElementJS(dynamicClickButton);
        click(dynamicClickButton);
        return getClickMessage("dynamic click");
    }

    private String getClickMessage(String message) {
        final By clickMessage = By.xpath("//div/button[text()='Click Me']/following::p[text()='You have done a "+ message +"']");
        return getText(clickMessage);
    }
}
