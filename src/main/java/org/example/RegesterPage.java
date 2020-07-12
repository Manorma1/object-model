package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class RegesterPage extends util {




    private By _firstName =By.id("FirstName");
    private By _lastName = By.xpath("//input[@name=\"LastName\"]");
    private  By _dateOfBirthDay = By.xpath("//select[@name=\"DateOfBirthDay\"]");
    private  By _dateOfMonth = By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    private  By _dateOfYear = By.xpath("//select[@name=\"DateOfBirthYear\"]");
    private  By _emailId =By.id("Email");
    private By _companyName = By .id("Company");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _clickOnRegester = By.id("register-button");





    public void userEnterREgistrationDetails(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        TypeText(_firstName,"par");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        TypeText(_lastName,"matel");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        selectFromDropDownByVisibleText(_dateOfBirthDay,"12");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        selectFromDropDownByValue(_dateOfMonth,"February");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        selectFromDropDownByindex(_dateOfYear,"1912");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        TypeText(_emailId,"Manorma+"+timestamp()+"@gmail.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        TypeText(_companyName,"Mnahi");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        TypeText(_password,"123456");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        TypeText(_confirmPassword,"123456");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);






    }
public  void userClickOnRegester(){
        clickOnElement(_clickOnRegester,20);
}













}
