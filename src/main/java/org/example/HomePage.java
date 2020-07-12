package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class HomePage extends util {


    private  By _regesterButton = By.linkText("Register");
    private By _searchInputBox = By.id("small-searchterms");
    private  By _WelcomeTitleText = By.xpath("//h2[contains(text(),\"Welcome to our store\")]");
    String expectedTitleOfThePage = "Welcome to our store";
    private By _computer=By.linkText("Computers");
    private By _books =By.linkText("Books");



    public void veryfyUserIsOnHomePage(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        getTextFromElement(_WelcomeTitleText);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert .assertEquals(_WelcomeTitleText,expectedTitleOfThePage);

    }

    public void clickOnRegesterButton(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        clickOnElement(_regesterButton,20);
    }
    public void ClickOnComputer(){
        clickOnElement(_computer,30);



    }
    public void clickOnBooks(){
        clickOnElement(_books,40);


    }










}

