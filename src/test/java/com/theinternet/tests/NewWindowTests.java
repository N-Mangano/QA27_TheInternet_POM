package com.theinternet.tests;


import com.theinternet.pages.HomePage;
import com.theinternet.pages.NewWindowPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewWindowTests extends TestBase{

    @BeforeMethod
    public void precondition() {

        new HomePage(driver).getNewWindowPage();

    }

    @Test
    public void testOpenNewWindow() {

        NewWindowPage windowPage = new NewWindowPage(driver);
        windowPage.switchToNextTab(1).verifyTextFromNewTab("New Window");
    }

}
