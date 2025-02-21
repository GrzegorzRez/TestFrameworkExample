package com.demoqa.tests.widgets;

import com.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AccordianTest extends BaseTest {

    @Test
    public void closeAndOpenAccordian() {
        var accordianPage = homePage.goToWidgets().clickAccordian();
        Boolean isSectionVisible = accordianPage.closeFirstSection();
        Assert.assertFalse(isSectionVisible, "\n Section did not close correctly \n");

        isSectionVisible = accordianPage.openSecondSection();
        Assert.assertTrue(isSectionVisible,
                "\n Section did not open correctly \n");
    }


}
