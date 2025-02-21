package com.demoqa.tests.alerts_frames_windows;

import com.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsFramesWindowsTest extends BaseTest {

    @Test
    public void checkSmallModalText() {
        var afwPage = homePage.goToAlertsFramesWindows();
        var modalDialogsPage = afwPage.clickModalDialogs();
        modalDialogsPage.openSmallModal();
        String actualSmallModalText = modalDialogsPage.getSmallModalText();
        String expectedSmallModalText = "This is a small modal. It has very less content";
        Assert.assertTrue(actualSmallModalText.contains("small modal"),
                "\n Text in small modal is not as expected \n");
    }
}
