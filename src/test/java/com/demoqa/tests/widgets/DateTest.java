package com.demoqa.tests.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.demoqa.base.BaseTest;

public class DateTest extends BaseTest {

    @Test
    public void testSelectingDate() {
        String month = "December";
        String monthNumber = "12";
        String day = "24";
        String year = "2025";

        var datePickerPage = homePage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickSelectDate();
        datePickerPage.selectDay(day);

        String actualDate = datePickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;
        Assert.assertEquals(actualDate, expectedDate, "\n Actual & Expected Dates Do Not Match \n " +
                "\n Actual Date: " + actualDate +
                "\n Expected Date: " + expectedDate);

    }
}
