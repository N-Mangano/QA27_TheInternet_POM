package com.theinternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DDPage extends BasePage{
    public DDPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//select[@id='dropdown']")
    WebElement dropdown;

    public DDPage selectOptionFromDD() {
        click(dropdown);
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option 1");
        return this;
    }
}
