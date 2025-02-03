package com.demoqa.pages.alerts_frames_windows_page;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.*;
import static utilities.GetUtility.*;
import static utilities.SwitchToUtility.*;

public class WindowsPage extends AlertsFramesWindowsPage {

    private final By newTabButton = By.id("tabButton");
    private final By newWindowButton = By.id("windowButton");
    private final By newWindowMessageButton = By.id("messageWindowButton");

    public void clickNewTabButton() {
        scrollToElementJS(newTabButton);
        click(newTabButton);
    }

    public void clickNewWindowButton() {
        scrollToElementJS(newWindowButton);
        click(newWindowButton);
    }

    public void clickNewWindowMessageButton() {
        scrollToElementJS(newWindowMessageButton);
        click(newWindowMessageButton);
    }

    public void switchToNewWindow() {
        String handle = getCurrentWindowHandle();
        switchToWindow();

    }


}
