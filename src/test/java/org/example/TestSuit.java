package org.example;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSuit extends BaseTest {
    HomePage homePage = new HomePage();
    RegesterPage regesterPage = new RegesterPage();
    RegesterSuccessPage regesterSuccessPage = new RegesterSuccessPage();
    continueOnHomePage continueOnHomePage=new continueOnHomePage();
    computer computer= new computer();
    desktop desktop = new desktop();
    EmailAFriend emailAFriend = new EmailAFriend();
    EmailAFriendInformation emailAFriendInformation =new EmailAFriendInformation();
    Book book = new Book();










    @Test              //usershould be ableto register succsccesfully;
    public void UserShoudAbleToRegisterSuccSeccfully(){
  //clickon regesterbutton;
        homePage.clickOnRegesterButton();
        // enter detail step;
        regesterPage.userEnterREgistrationDetails();
        // click on regester
        regesterPage.userClickOnRegester();
        //user regester susccesfully;
        regesterSuccessPage.userIsOnRegesterPage();}





@Test(priority = 1)      // user able to send email a friend successfully;
public void EmailAFriendSuccseccfully(){
      // click on regesterbutton;
    homePage.clickOnRegesterButton();
    //enter detail
    regesterPage.userEnterREgistrationDetails();
    //clickonn regester;
    regesterPage.userClickOnRegester();
    //click n computer
    homePage.ClickOnComputer();
    //click on desktop;
    computer.ClickOnDesktop();
    //click on digitalstorm
    desktop.UserClickOnDigitalStorm();
    //enter friend email id
    emailAFriend.UserEnterEmailAFriend();
    //send email
    emailAFriendInformation.informationToFriend();





}
@Test(priority = 2)     // user able to add two books in add to cart
public void userAbleAddToCart(){
        //click on books
        homePage.clickOnBooks();
        // user able toadd books ;
        book.UserAddTwoBooks();







}













































}

