package com.demoqa.pages.alerts_frames_windows_page;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.*;

public class FramesPage extends AlertsFramesWindowsPage {

    private final By textInFrame = By.id("sampleHeading");
    private final By headerFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");

    public String getHeaderFramesText() {
        return find(headerFramesText).getText();
    }

    public String getTextInBigFrame() {
        String iFrameBigBox = "frame1";

        switchToFrame(iFrameBigBox);
        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big Frame Text: " + bigFrameText);
        switchToDefaultContent();
        return bigFrameText;
    }

    public String getTextInSmallFrame() {
        //int iFrameSmallBoxIndex = 4;
        By smallBoxWebElement = By.xpath("//div[@id='frame2Wrapper']/iframe");

        switchToFrame(find(smallBoxWebElement));
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small Frame Text: " + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }
}
