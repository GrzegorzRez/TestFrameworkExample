package com.demoqa.pages.alerts_frames_windows_page;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class AlertsPage extends AlertsFramesWindowsPage{

    private final By alertInformationButton = By.id("alertButton");
    private final By alertTimerButton = By.id("timerAlertButton");
    private final By alertConfirmationButton = By.id("confirmButton");
    private final By confirmationResult = By.id("confirmResult");
    private final By alertPromptButton = By.id("promtButton");
    private final By promptResult = By.id("promptResult");

    public void clickInformationAlertButton() {
        scrollToElementJS(alertInformationButton);
        click(alertInformationButton);
    }

    public void clickConfirmationAlertButton() {
        click(alertConfirmationButton);
    }

    public String getConfirmationResult() {
        return find(confirmationResult).getText();
    }

    public void clickPromptAlertButton() {
        click(alertPromptButton);
    }

    public String getPromptAlertResult() {
        return find(promptResult).getText();
    }


}
