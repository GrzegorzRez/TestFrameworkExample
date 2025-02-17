package com.demoqa.pages.elements;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.File;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class UploadAndDownloadPage extends BasePage {

    private final By downloadButton = By.id("downloadButton");
    private final By uploadButton = By.id("uploadFile");
    private final By uploadPath = By.id("uploadedFilePath");

    public String downloadSampleFile() {
        scrollToElementJS(downloadButton);
        click(downloadButton);
        return find(downloadButton).getDomAttribute("download");
    }

    public String uploadFile() {
        File uploadFile = new File("resources/files/sampleFile.jpeg");
        String expectedFilePath = "uploadedFilePath";
        scrollToElementJS(uploadButton);
        find(uploadButton).sendKeys(uploadFile.getAbsolutePath());

        return find(uploadPath).getText();
    }
}
