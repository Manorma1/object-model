package org.example;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class EmailAFriendInformation extends util {
    private By _FriendEmail = By.id("FriendEmail");
    private By _PersonalMassege =By.xpath("//textarea[@id=\"PersonalMessage\"]");
    private By _sendButton = By.xpath("//input[@class=\"button-1 send-email-a-friend-button\"]");

    public void informationToFriend(){
        TypeText(_FriendEmail,"krta+"+timestamp()+"@gmail.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        TypeText(_PersonalMassege,"this is nice product");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        clickOnElement(_sendButton,40);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);




    }











}
