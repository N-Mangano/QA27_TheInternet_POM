package com.theinternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class NewWindowPage extends BasePage{
    public NewWindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Click Here')]")
    WebElement clickHere;

    public NewWindowPage switchToNextTab(int index) {
        click(clickHere);
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));

        return this;
    }

    @FindBy(xpath = "//h3[contains(text(),'New Window')]")
    WebElement newWindow;

    public NewWindowPage verifyTextFromNewTab(String text) {

        Assert.assertTrue(shouldHaveText(newWindow, text, 10));

        return this;
    }

}
