package com.theinternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'JavaScript Alerts')]")
    WebElement JSAlert;

    public AlertsPage getJSAlerts() {
        click(JSAlert);
        return new AlertsPage(driver);
    }
    @FindBy(xpath = "//a[contains(text(),'Dropdown')]")
    WebElement selectDD;
    public DDPage getDD() {
        click(selectDD);
        return new DDPage(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Multiple Windows')]")
    WebElement multipleWindows;

    public NewWindowPage getNewWindowPage() {
        click(multipleWindows);
        return new NewWindowPage(driver);

    }
}
