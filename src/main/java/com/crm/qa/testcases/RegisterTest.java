package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.Register;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegisterTest extends TestBase
{
    LoginPage loginPage;
    Register register;

    public RegisterTest()
    {
        super();
    }
    @BeforeMethod
    public void setup() throws IOException
    {
        initialization();
        loginPage = new LoginPage();
        register = loginPage.signupPage();
    }
    @Test
    void signupTest()
    {
        register.signup();
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
