package com.demoqa.tests.elements;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @Test
    public void radioButtonsTest() {
        final String expectedYesResponse = "Yes";
        final String expectedImpressiveResponse = "Impressive";

        var radioButtonPage = homePage.goToElements().clickRadioButton();
        radioButtonPage.selectRadioYes();
        Assert.assertEquals(radioButtonPage.getRadioResponse(), expectedYesResponse,
                "\n Actual result and expected do not match \n");

        radioButtonPage.selectRadioImpressive();
        Assert.assertEquals(radioButtonPage.getRadioResponse(), expectedImpressiveResponse,
                "\n Actual result and expected do not match \n");
    }
}
