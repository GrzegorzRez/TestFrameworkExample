package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import java.util.List;

import static utilities.DropDownUtility.*;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class SelectMenuPage extends WidgetsPage {

    private By standardMultiselect = By.id("cars");

    public void selectStandardMulti(String text) {
        scrollToElementJS(standardMultiselect);
        selectByVisibleText(standardMultiselect, text);
    }

    public void selectStandardMulti(int index) {
        scrollToElementJS(standardMultiselect);
        selectByIndex(standardMultiselect, index);
    }

    public void deselectStandardMulti(String value) {
        scrollToElementJS(standardMultiselect);
        deselectByValue(standardMultiselect, value);
    }

    public List<String> getAllSelectedStandardMultiOptions() {
        return getAllSelectedOptions(standardMultiselect);
    }
}
