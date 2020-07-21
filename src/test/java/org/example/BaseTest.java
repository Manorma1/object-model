package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest  extends util {

    BrowserManager browserManager = new BrowserManager();

    @BeforeMethod
    public void openBrowser() {
        browserManager.initialiseMethode();


    }

    @AfterMethod
    public void CloseBrowser(ITestResult result) { //Method to close browser
    if (ITestResult.FAILURE == result.getStatus()) {
        ScreenShotCapture(result.getName()+timestamp());

    }



        browserManager.CloseBrowser();


    }
}




