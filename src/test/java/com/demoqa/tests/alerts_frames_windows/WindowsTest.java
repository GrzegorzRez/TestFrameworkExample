package com.demoqa.tests.alerts_frames_windows;

import com.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.GetUtility.getURL;

public class WindowsTest extends BaseTest {

    @Test
    public void newWindowTest(){
        var windowsPage = homePage.goToAlertsFramesWindows().clickBrowserWindws();
        windowsPage.clickNewWindowButton();
        windowsPage.switchToNewWindow();
        String actualURL = getURL();
        String expectedURL = "https://demoqa.com/sample";

        Assert.assertEquals(actualURL, expectedURL,
                "\n Actual and Expected urls do not match \n");
    }
}
