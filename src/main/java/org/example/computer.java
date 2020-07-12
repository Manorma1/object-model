package org.example;

import org.openqa.selenium.By;

public class computer extends util {

private By _desktop=By.linkText("Desktops");
private By _desktopPicture= By.xpath("//img[@alt=\"Picture for category Desktops\"]");

    public void ClickOnDesktop(){
        waitUntilElementToClickble(_desktop);
        clickOnElement(_desktopPicture,30);









    }









}
