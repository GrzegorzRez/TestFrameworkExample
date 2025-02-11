package com.demoqa.pages.elements;

import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.GetUtility.getText;
import static utilities.GetUtility.isSelected;
import static utilities.JavaScriptUtility.clickJS;

public class RadioButtonPage extends BasePage {

    private final By radioYes = By.id("yesRadio");
    private final By radioImpressive = By.id("impressiveRadio");
    private final By actualResponse = By.xpath("//p/span[@class='text-success']");

    public void selectRadioYes() {
        clickJS(radioYes); //clickJS used cause of div receiving the click
        System.out.println("Radio Yes selected: " + isSelected(radioYes));
    }

    public void selectRadioImpressive() {
        clickJS(radioImpressive); //clickJS used cause of div receiving the click
        System.out.println("Radio Impressive selected: " + isSelected(radioYes));
    }

    public String getRadioResponse() {
        return getText(actualResponse);
    }
}
