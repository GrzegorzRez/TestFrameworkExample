package com.demoqa.tests.elements;

import com.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickableButtonsTest extends BaseTest {

    @Test
    public void doubleClickButtonTest() {
        String expectedMessage = "You have done a double click";
        var clickableButtonsPage = homePage.goToElements().clickButtons();
        String actualMessage = clickableButtonsPage.performDoubleClick();
        Assert.assertEquals(actualMessage, expectedMessage,
                "\n Actual and Expected message do not match");
    }

    @Test
    public void rightClickButtonTest() {
        String expectedMessage = "You have done a right click";
        var clickableButtonsPage = homePage.goToElements().clickButtons();
        String actualMessage = clickableButtonsPage.performRightClick();
        Assert.assertEquals(actualMessage, expectedMessage,
                "\n Actual and Expected message do not match");
    }

    @Test
    public void dynamicButtonClickTest() {
        String expectedMessage = "You have done a dynamic click";
        var clickableButtonsPage = homePage.goToElements().clickButtons();
        String actualMessage = clickableButtonsPage.performClickOnDynamicButton();
        Assert.assertEquals(actualMessage, expectedMessage,
                "\n Actual and Expected message do not match");
    }
}
