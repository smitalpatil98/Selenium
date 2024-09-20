package org.example.testcases;

import com.kyari.qa.base.TestBase;
import com.kyari.qa.pages.LoginPage;
import com.kyari.qa.pages.Register;
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
