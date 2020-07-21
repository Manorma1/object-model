package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class FacebookPage extends util {


    public void UserIsOnHomePage() {
        String MainWindow = driver.getWindowHandle();

        // To handle all new opened window.
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();

            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);

// assert for verify driver is on currentURL;

                String URL = driver.getCurrentUrl();
                String Expected = "https://www.facebook.com/nopCommerce";
                Assert.assertEquals(URL, Expected);

            }

        }
    }  // assertfor text;
    public void   creatAPageAssertText(){
        String actual = getTextFrompage(By.xpath("//button[@class=\"_4jy0 _4jy3 _4jy2 _51sy selected _42ft\"]"),20);
         String Expected ="Create a Page";
        Assert.assertEquals(actual,Expected);




    }  // asser by verify green color;
    public void assertByColour(){
        String expectedColour = "#42b72a";
        String ActualColour = driver. findElement(By.linkText("Create New Account")). getCssValue("background-color");
        String hexColour = Color.fromString(ActualColour).asHex();
        String Actulcolour = hexColour;
        Assert.assertEquals(Actulcolour,expectedColour);
        System. out. println("Button color: " + ActualColour);
    }  // driver go to parents class;
    public void backtoparent(){


        String MainWindow = driver.getWindowHandle();
        driver.switchTo().window(MainWindow);








    }










}