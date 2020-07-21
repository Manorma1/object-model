package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends util {


    private  By _regesterButton = By.linkText("Register");
    private By _searchInputBox = By.id("small-searchterms");
    private  By _WelcomeTitleText = By.xpath("//h2[contains(text(),\"Welcome to our store\")]");
    String expectedTitleOfThePage = "Welcome to our store";
    private By _computer=By.linkText("Computers");
    private By _books =By.linkText("Books");
    private By _search= By.xpath("//input[@class=\"button-1 search-box-button\"]");
    private By _Facebook = By.linkText("Facebook");
    private By _detail = By.xpath("//div[@class=\"news-list-homepage\"]//div[1]/div[3]/a[1]");
    private By _currency = By.xpath("//select[@id=\"customerCurrency\"]");



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

    public void clickOnsearch(){
        clickOnElement(_search,30);



    }
    public void Alert (){

// alert text from alert massege;
        String alertMessage= driver.switchTo().alert().getText();
        //expected result
        String Expected = "Please enter some search keyword";
        // match actual&Expected massege
        Assert.assertEquals(alertMessage,Expected);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.switchTo().alert().accept();







    }
    public void clickOnFacebook(){
        clickOnElement(_Facebook,30);





    }
    public void detailMassege(){
        clickOnElement(_detail,30);







    }
    public void currency(){
        //clickon currency
        clickOnElement(_currency,30);
        //select currency
        Select currency=new Select(driver.findElement(By.id("customerCurrency")));
        currency.selectByVisibleText("US Dollar");
        //select doller sighn;
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // use for each looop;
        List<WebElement> ProductName = driver.findElements(By.className("prices"));
        for (WebElement Product : ProductName)
            System.out.println(Product.getText());





    }
    public void assertForcurrency(){// assrt for currency;
        String expectedTitle = "$21.50";
        String actualText1 =
                getTextFromElement(By.xpath("//span[text()='$21.50']"));
        Assert.assertEquals(actualText1, expectedTitle);









    }



















}

