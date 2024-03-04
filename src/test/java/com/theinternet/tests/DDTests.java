package com.theinternet.tests;

import com.theinternet.pages.DDPage;
import com.theinternet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DDTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getDD();

    }

    @Test
    public void testDDSelection() {
        new DDPage(driver).selectOptionFromDD();
    }
}
