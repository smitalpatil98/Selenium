package org.example.testcases;

import com.kyari.qa.Listener.CustomListener;
import com.kyari.qa.base.TestBase;
import com.kyari.qa.pages.HomePage;
import com.kyari.qa.pages.LoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
@Listeners(CustomListener.class)
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
    @Description //Allure
    @Step //Allure
    //@Story()
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
