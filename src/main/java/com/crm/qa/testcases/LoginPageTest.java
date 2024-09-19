package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest extends TestBase
{
    LoginPage loginpage;
    HomePage homepage;
    public LoginPageTest()
            //it will define all the properties of the testbase method
    {
        super();
    }
    @BeforeMethod
    public void setup() throws IOException
{
    initialization();
    //create object of loginpageclass
     loginpage = new LoginPage();
}
@Test (priority = 1)
public void LoginPageTitleTest()
{
    String Title = loginpage.ValidateLoginPageTitle();
    Assert.assertEquals(Title,"Account – Kyari.co");
}
@Test (priority = 2)
public void kyariLogoImageTest()
{
   boolean flag = loginpage.ValidateKyariLogo();
   Assert.assertTrue(flag);
}

@Test (priority = 3)
public void loginTest()
{
    homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
}

@AfterMethod
    public void tearDown()
{
    driver.quit();
}
}
