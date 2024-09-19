package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register extends TestBase
{
    Logger logger= Logger.getLogger(Register.class);
@FindBy(id="first_name")
    WebElement firstName;

@FindBy(id="last_name")
    WebElement lastName;

@FindBy(id="email")
    WebElement Email;

@FindBy(id="create_password")
    WebElement Password;

@FindBy(xpath = "//*[@id=\"create_customer\"]/div[5]/input")
    WebElement createAcc;

    public Register()
    {
        PageFactory.initElements(driver, this);
        logger.info("SignupPage elements initialized.");
    }

    public void signup()
    {
        firstName.sendKeys("Samira");
        lastName.sendKeys("Sethi");
        Email.sendKeys("smitalpatil98@gmail.com");
        Password.sendKeys("Pass@123");
        createAcc.click();
    }





    }



