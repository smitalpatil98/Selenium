package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase
{
    public static Logger logger = Logger.getLogger(LoginPage.class); //Log4j
    //Page Factory -OR
   //web elements of login page
    @FindBy(css = ".area--account.icon-button.icon-button--text-tooltip")
    WebElement loginIcon;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[2]/div[3]/div/span[2]/a/span")
    WebElement signuplink;


    @FindBy(xpath = "//*[@id=\"customer_email\"]")
    WebElement customer_email;

    @FindBy(id="customer_password")
    WebElement customer_password;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[2]/div[3]/button")
    WebElement login;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[2]/div[3]/div/span[2]/a/span")
    WebElement signup;

    @FindBy(xpath = "//*[@id=\"logo\"]/a[2]/img")
    WebElement Kyarilogo;

    //Initialize the web elements using Page Factory
    public LoginPage()
    {
        //How will you initialize your page factory?
        PageFactory.initElements(driver,this);
        loginIcon.click();
    }
    //Actions:- features available on Login Page
    public String ValidateLoginPageTitle()
    {
        logger.info("LoginPage validated");
        return driver.getTitle();

    }
    //For Navigating to Signup Page
    public Register signupPage()
    {
        signuplink.click();
        return new Register();
    }
    public boolean ValidateKyariLogo()
    {
        logger.info("LoginPage validated");
       return Kyarilogo.isDisplayed(); //return true or false if the logo is present
    }
    public HomePage login(String un,String pass)
    {
        logger.info("LoginPage validated");
        customer_email.sendKeys(un);
        customer_password.sendKeys(pass);
        login.click();

        return new HomePage();
    }
}
