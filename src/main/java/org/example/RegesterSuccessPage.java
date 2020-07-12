package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class RegesterSuccessPage  extends util{
    private By __regesterpage = By.xpath("//div[@class=\"result\"]");
    String expectedText = "Your registration completed";




    public  void userIsOnRegesterPage(){
        getTextFromElement(__regesterpage);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(__regesterpage,expectedText);





    }
}
