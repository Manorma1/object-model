package org.example;

import org.openqa.selenium.By;

public class continueOnHomePage extends util {
    private By _Continue = By.xpath("//input[@class=\"button-1 register-continue-button\"]");


    public void Continue(){
        clickOnElement(_Continue,30);





    }



}
