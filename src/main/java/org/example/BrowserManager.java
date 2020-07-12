package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BrowserManager  extends util{
    public  void initialiseMethode(){
        System.setProperty("webdriver.chrome.driver", "src\\test\\BrowserDrivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");}



        public void CloseBrowser(){
        driver.close();
        }





}
