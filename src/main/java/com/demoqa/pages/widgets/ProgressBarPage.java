package com.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static utilities.GetUtility.getText;
import static utilities.WaitUtility.fluentWaitUntilVisible;

public class ProgressBarPage extends WidgetsPage {

    private final By startButton = By.id("startStopButton");
    private final By progressValue = By.xpath("//div[@id='progressBar']/div[@aria-valuenow='100']");


    public String getProgressValue() {
        fluentWaitUntilVisible(20, progressValue);
        return getText(progressValue);
    }

    public void clickStartButton(){
        click(startButton);
    }
}
