package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;

public class util extends BasePage {
    public static void TypeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static void clickOnElement(By by, int time) {
        driver.findElement(by).click();
    }

    public static void selectFromDropDownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public static void selectFromDropDownByValue(By by, String n) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(n);
    }

    public static void selectFromDropDownByindex(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }


    public static String getTextFromElement(By by) {
        driver.findElement(by).getText();
        return null;
    }


    public static String getTextFrompage(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        return driver.findElement(by).getText();
    }

    public static void waitUntilElementToClickble(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(by));

    }

    public static long timestamp() {
        return (System.currentTimeMillis());
    }

//    public static void takeAScreenShort(String NameofScreenshot){
//
//            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//            //The below method will save the screen shot in d drive with test method name
//            try {
//                //String Screenshotename = new String();
//                FileUtils.copyFile(scrFile, new File(("src\\screensort"+NameofScreenshot+".png")));
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

    public static void ScreenShotCapture(String NameofScreenshot) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with test method name
        try {
            // String Screenshotname = new String();
            FileUtils.copyFile(scrFile, new File(("src\\ScreenShot" + NameofScreenshot + ".png")));

        } catch (IOException e) {
            e.printStackTrace();

        }


    }
}







