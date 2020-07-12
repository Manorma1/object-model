package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest  extends util{

BrowserManager browserManager = new BrowserManager();

@BeforeMethod
public void openBrowser(){
    browserManager.initialiseMethode();



}


//@AfterMethod

    //public void closeBrowser(){
    //browserManager.CloseBrowser();



}



//}
