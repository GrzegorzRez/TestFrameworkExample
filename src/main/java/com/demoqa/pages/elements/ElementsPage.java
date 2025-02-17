package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends HomePage {

    private final By webTablesMenuItem = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");
    private final By linksMenuItem = By.xpath("//li[@id='item-5']//span[text()='Links']");
    private final By dynamicMenuItem = By.xpath("//li[@id='item-8']//span[text()='Dynamic Properties']");
    private final By textBoxMenuItem = By.xpath("//li[@id='item-0']//span[text()='Text Box']");
    private final By checkBoxMenuItem = By.xpath("//li[@id='item-1']//span[text()='Check Box']");
    private final By radioButtonMenuItem = By.xpath("//li[@id='item-2']//span[text()='Radio Button']");
    private final By clickableButtonsMenuItem = By.xpath("//li[@id='item-4']//span[text()='Buttons']");
    private final By uploadAndDownloadMenuItem = By.xpath("//li[@id='item-7']//span[text()='Upload and Download']");

    public WebTablesPage clickWebTables() {
        click(webTablesMenuItem);
        return new WebTablesPage();
    }

    public LinksPage clickLinks() {
        click(linksMenuItem);
        return new LinksPage();
    }

    public DynamicPropertiesPage clickDynamicProperties() {
        scrollToElementJS(dynamicMenuItem);
        click(dynamicMenuItem);
        return new DynamicPropertiesPage();
    }

    public TextBoxPage clickTextBox() {
        scrollToElementJS(textBoxMenuItem);
        click(textBoxMenuItem);
        return new TextBoxPage();
    }

    public CheckBoxPage clickCheckBox() {
        scrollToElementJS(checkBoxMenuItem);
        click(checkBoxMenuItem);
        return new CheckBoxPage();

    }

    public RadioButtonPage clickRadioButton() {
        scrollToElementJS(radioButtonMenuItem);
        click(radioButtonMenuItem);
        return new RadioButtonPage();
    }

    public ClickableButtonsPage clickButtons() {
        scrollToElementJS(clickableButtonsMenuItem);
        click(clickableButtonsMenuItem);
        return new ClickableButtonsPage();
    }

    public UploadAndDownloadPage clickUploadAndDownload() {
        scrollToElementJS(uploadAndDownloadMenuItem);
        click(uploadAndDownloadMenuItem);
        return new UploadAndDownloadPage();
    }
}
