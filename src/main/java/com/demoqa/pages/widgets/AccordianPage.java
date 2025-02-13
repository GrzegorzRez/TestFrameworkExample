package com.demoqa.pages.widgets;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.GetUtility.getText;

public class AccordianPage extends BasePage {

    private final By firstHeading = By.id("section1Heading");
    private final By secondHeading = By.id("section2Heading");
    private final By firstSectionClosed = By.xpath("//div[@class='collapse']/div[@id='section1Content']/p[1]");
    private final By secondSectionOpened = By.xpath("//div[@class='collapse show']/div[@id='section2Content']/p[1]");


    public Boolean closeFirstSection() {
        scrollToElementJS(firstHeading);
        click(firstHeading);
        try {
            driver.findElement(firstSectionClosed);
            return true; // Element znaleziony
        } catch (NoSuchElementException e) {
            return false; // Element nie istnieje
        }
    }

    public Boolean openSecondSection() {
        scrollToElementJS(secondHeading);
        click(secondHeading);
        try {
            driver.findElement(secondSectionOpened);
            return true; // Element znaleziony
        } catch (NoSuchElementException e) {
            return false; // Element nie istnieje
        }
    }


}
