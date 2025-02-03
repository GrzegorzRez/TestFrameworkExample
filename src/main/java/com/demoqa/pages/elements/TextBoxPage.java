package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static utilities.ActionsUtility.sendKeys;
import static utilities.GetUtility.getText;
import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.WaitUtility.explicitWait;

public class TextBoxPage extends ElementsPage {

    private final By fullNameInput = By.id("userName");
    private final By currentAddressInput = By.id("currentAddress");
    private final By submitButton = By.id("submit");
    private final By currentAddressResult = By.xpath("//p[@id='currentAddress']");

    public void setFullName(String name) {
        explicitWait(5, fullNameInput);
        scrollToElementJS(fullNameInput);
        sendKeys(find(fullNameInput), Keys.chord(name));
    }

    public void setEmail(String email) {
        setFullName(Keys.chord(Keys.TAB, email));
    }

    public void setCurrentAddress(String address) {
        //setFullName(Keys.chord(Keys.TAB, address));
        find(currentAddressInput).sendKeys(address + Keys.ENTER);
    }

    public void setPermanentAddress(String address) {
        setFullName(Keys.chord(Keys.TAB, address));
    }

    public void clickSubmit() {
        scrollToElementJS(submitButton);
        click(submitButton);
    }

    public String getCurrentAddress() {
        explicitWait(5, currentAddressResult);
        return getText(currentAddressResult);
    }
}
