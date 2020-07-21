package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
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
    FacebookPage facebookPage = new FacebookPage();
    OnlineStore onlineStore = new OnlineStore();
    IFrame iFrame=new IFrame();










    @Test              //usershould be ableto register succsccesfully;
    public void UserShoudAbleToRegisterSuccSeccfully(){
  //clickon regesterbutton;
        homePage.clickOnRegesterButton();
        // enter detail step;
        regesterPage.userEnterREgistrationDetails();
        // click on regester
        regesterPage.userClickOnRegester();
        //user regester susccesfully;
        //regesterSuccessPage.userIsOnRegesterPage();
    }
    @Test
    public void VeryFyEachProductHaveName(){


        List<WebElement> ProductName = driver.findElements(By.xpath("//div[contains(@class,'product')]/div[2]/div/div[1]/div[2]/h2/a"));
for (WebElement Product :ProductName)
        System.out.println(Product.getText());
    }





@Test(priority = 1)      // user able to send email a friend successfully;
public void EmailAFriendSuccseccfully(){
      // click on regesterbutton;
    homePage.clickOnRegesterButton();
    //enter detail
    regesterPage.userEnterREgistrationDetails();
    //click on regester;
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
@Test(priority = 3)
public void userClickOnSearch(){

        // click on search
    homePage.clickOnsearch();
    // Alert massege
    homePage.Alert();

}
@Test(priority = 4)
public void widowpopup(){
        homePage.clickOnFacebook();
        facebookPage.UserIsOnHomePage();
        facebookPage.creatAPageAssertText();
        facebookPage.assertByColour();
        facebookPage.backtoparent();
}
@Test(priority = 5)
public void UserverifyToComment(){
        homePage.detailMassege();
        onlineStore.assertOnlinePage();
        onlineStore.typeTitleAndComment();
        onlineStore.assertForComment();
        onlineStore.assertForTitleText();





}
@Test(priority = 6)
public void userAbleToSeeCurrentCurrancy(){
        homePage.currency();
        homePage.assertForcurrency();





}
@Test(priority = 7)
public void userPutInformationInIframe(){
       iFrame.SwichIframe();
      iFrame.animalName();

        iFrame.animal();







}
















































}

