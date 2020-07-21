package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class OnlineStore extends util{
    private By _title = By.xpath("//input[@id=\"AddNewComment_CommentTitle\"]");
    private By _comment = By.xpath("//textarea[@id=\"AddNewComment_CommentText\"]");
    private By _newcomment =By.xpath("//input[@class=\"button-1 news-item-add-comment-button\"]");
    String Expected = "News comment is successfully added.";
    String ExpectedText = "number2";






    public void assertOnlinePage(){  // check driver is on current URL
        String URL = driver.getCurrentUrl();
        String Expected = "https://demo.nopcommerce.com/new-online-store-is-open";
        Assert.assertEquals(URL, Expected);

    }
    public void typeTitleAndComment(){
        //user type title and comment
        TypeText(_title,"number2");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        TypeText(_comment,"this store is open" );
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        clickOnElement(_newcomment,30);





    }
    public void assertForComment(){  // verify commentb is visible
        String actual = getTextFrompage(By.xpath("//div[@class=\"result\"]"),30);
        Assert.assertEquals(actual,Expected);



    }
    public void assertForTitleText(){  // verify title will sew;

        String actual = getTextFrompage(By.xpath("//strong[text()=\"number2\"]"),30);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertEquals(actual,ExpectedText);





    }







}
