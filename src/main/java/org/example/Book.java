package org.example;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Book extends util {
private By _book1=By.xpath("//div[@class=\"item-grid\"]/div[1]/div/div[2]/div[3]/div[2]/input[1]");
private By _image =By.xpath("//div[@class='page-body']//div[2]//div[1]//div[1]//a[1]//img[1]");
private By _book2 =By.id("add-to-cart-button-38");
private  By _shoppingCart = By.xpath("//span[@class=\"cart-label\"]");

public void UserAddTwoBooks(){

    waitUntilElementToClickble(_book1);

    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    clickOnElement(_image,30);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    clickOnElement(_book2,30);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    clickOnElement(_shoppingCart,30);






}












}
