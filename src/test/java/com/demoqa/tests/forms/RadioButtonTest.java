package com.demoqa.tests.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.demoqa.base.BaseTest;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        boolean isFemaleRadioSelected = formsPage.isFemaleRadioSelected();
        Assert.assertTrue(isFemaleRadioSelected, "\n Female Radio Button is not selected \n");
    }
}
