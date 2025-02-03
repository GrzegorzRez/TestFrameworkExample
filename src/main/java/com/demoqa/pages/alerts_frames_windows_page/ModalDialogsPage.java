package com.demoqa.pages.alerts_frames_windows_page;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ModalDialogsPage extends AlertsFramesWindowsPage {

    private final By smallModalButton = By.id("showSmallModal");
    private final By textSmallModal = By.xpath("//div[contains(text(),'This is a small modal')]");
    private final By closeSmallModalButton = By.id("closeSmallModal");

    public void openSmallModal() {
        scrollToElementJS(smallModalButton);
        click(smallModalButton);
    }

    public String getSmallModalText() {
        return find(textSmallModal).getText();
    }

    public void closeSmallModal() {
        click(closeSmallModalButton);
    }

}
