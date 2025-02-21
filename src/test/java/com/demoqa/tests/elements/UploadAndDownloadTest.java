package com.demoqa.tests.elements;

import com.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadAndDownloadTest extends BaseTest {

    @Test
    public void downloadTest() {
        var uploadAndDownloadPage = homePage.goToElements().clickUploadAndDownload();
        String actualLink = uploadAndDownloadPage.downloadSampleFile();
        String expectedLink = "sampleFile.jpeg";
        Assert.assertEquals(actualLink, expectedLink,
                "\n Expected and actual file does not match \n");
    }

    @Test
    public void uploadTest() {
        var uploadAndDownloadPage = homePage.goToElements().clickUploadAndDownload();
        String actualUploadPath = uploadAndDownloadPage.uploadFile();
        String expectedUploadPath = "C:\\fakepath\\sampleFile.jpeg";
        Assert.assertEquals(actualUploadPath, expectedUploadPath,
                "\n Expected and actual file path does not match \n");
    }
}
