package com.demoqa.pages;

import com.demoqa.pages.alerts_frames_windows_page.AlertsFramesWindowsPage;
import com.demoqa.pages.bookstore.BookstorePage;
import com.base.BasePage;
import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.forms.FormsPage;
import com.demoqa.pages.widgets.WidgetsPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private final By bookstoreCard = By.xpath("//div[@id='app']//h5[text()='Book Store Application']");
    private final By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private final By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
    private final By widgetsCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");
    private final By alertsFramesWindowsCard = By.xpath("//div[@id='app']//h5[contains(text(),'Alerts,')]");

    public BookstorePage goToBookstore() {
        scrollToElementJS(bookstoreCard);
        click(bookstoreCard);
        return new BookstorePage();
    }

    public FormsPage goToForms() {
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

    public ElementsPage goToElements() {
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }

    public WidgetsPage goToWidgets() {
        scrollToElementJS(widgetsCard);
        click(widgetsCard);
        return new WidgetsPage();
    }

    public AlertsFramesWindowsPage goToAlertsFramesWindows() {
        scrollToElementJS(alertsFramesWindowsCard);
        click(alertsFramesWindowsCard);
        return new AlertsFramesWindowsPage();
    }
}
