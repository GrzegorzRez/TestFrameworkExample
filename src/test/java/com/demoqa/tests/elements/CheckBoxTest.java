package com.demoqa.tests.elements;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {

    @Test
    public void testCheckbox() {
        var checkBoxPage = homePage.goToElements().clickCheckBox();
        checkBoxPage.expandHomeDirectory();
        String actualResponse = checkBoxPage.selectDocumentsCheckBox();
        Assert.assertTrue(actualResponse.contains("documents"),
                "\n Actual response = " + actualResponse + "\n and does not contain required text");

    }
}
