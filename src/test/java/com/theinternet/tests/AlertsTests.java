package com.theinternet.tests;

import com.theinternet.pages.AlertsPage;
import com.theinternet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getJSAlerts();

    }

    @Test
    public void acceptAlertTest() {
        new AlertsPage(driver).acceptAlert();
    }

}
