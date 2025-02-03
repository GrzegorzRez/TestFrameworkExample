package com.demoqa.tests.interactions;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyboardTest extends BaseTest {

    @Test
    public void testKeyboardInput() {
        var textBoxPage = homePage.goToElements().clickTextBox();
        textBoxPage.setFullName("Grzeche");
        textBoxPage.setEmail("mail@mail.com");
        textBoxPage.setCurrentAddress("123 Testing Road");
        textBoxPage.setCurrentAddress("Apartment 456");
        textBoxPage.setCurrentAddress("Big City, Big State");
        textBoxPage.clickSubmit();
        String actualAddress = textBoxPage.getCurrentAddress();
        System.out.println("actual addres: " +actualAddress);
        Assert.assertTrue(actualAddress.contains("123 Testing Road"),
                "\n Address does not contain 123 Testing Road \n");
    }
}
