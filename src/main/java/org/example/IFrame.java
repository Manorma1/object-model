package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class IFrame  extends util{
    private By _TypeTopicName = By.xpath("//input[@type=\"text\"]");
    private By _CheckBox = By.xpath("//input[@type=\"checkbox\"]");
    String Expected = "Not a Friendly Topic";
    private By _AnimalName = By.xpath("//select[@id=\"animals\"]");



    public void SwichIframe(){ // assert for driver is on currant URL
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

        String URL = driver.getCurrentUrl();
        String Expected = "https://chercher.tech/practice/frames-example-selenium-webdriver";
        Assert.assertEquals(URL, Expected);

    }


public void animalName(){   //select user able to type name and click in ifream;
        WebElement _iframe1 = driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
        driver.switchTo().frame(_iframe1);
        TypeText(_TypeTopicName, "Animal Name");

        WebElement _iframe3 = driver.findElement(By.xpath("//iframe[@id=\"frame3\"]"));
        driver.switchTo().frame(_iframe3);
        clickOnElement(_CheckBox, 20);
    driver.switchTo().defaultContent();

    }


public void animal(){   // userable toselect avtar;
    ChromeOptions options = new ChromeOptions();
    options.setExperimentalOption("excludeSwitches",new String[]{"enable-autpmation"});

    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.switchTo().frame("frame2");
        selectFromDropDownByVisibleText(_AnimalName,"Avatar");
    driver.switchTo().defaultContent();}



        }








































