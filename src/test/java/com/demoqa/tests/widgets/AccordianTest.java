package com.demoqa.tests.widgets;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.Utility.delay;

public class AccordianTest extends BaseTest {

    @Test
    public void closeAndOpenAccordian() {
        var accordianPage = homePage.goToWidgets().clickAccordian();
        Boolean isSectionVisible = accordianPage.closeFirstSection();
        Assert.assertFalse(isSectionVisible, "\n Actual text do not match the expected \n");

        delay(5000);


        isSectionVisible = accordianPage.openSecondSection();
        Assert.assertTrue(isSectionVisible,
                "\n Actual text does not contain expected string \n");
    }


}
