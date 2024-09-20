package com.kyari.qa.pages;
import com.kyari.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage
{
    public SearchPage()
    {
        super();
        PageFactory.initElements(TestBase.driver,this);
    }

    @FindBy(xpath = "xpath = \"//*[@id=\\\"logo\\\"]/a[2]/img\"")
    WebElement webLogo;

    @FindBy(xpath = "//*[@id=\"customer_email\"]")
    WebElement email_Input;

    @FindBy(id="customer_password")
    WebElement pass_Input;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[2]/div[3]/button")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"header-top\"]/a[1]/span[1]")
    WebElement searchIcon; //button

    @FindBy(xpath = "//*[@id=\"boost-sd__search-widget-init-input-0\"]")
    WebElement searchInput; //search bar



    public void clickAccountLogo()
    {
        webLogo.click();
    }

    public void enterEmail(String emailID)
    {
        email_Input.sendKeys(emailID);
    }

    public void enterPassword(String password)
    {
        pass_Input.sendKeys(password);
    }

    public void clickloginButton()
    {
        loginButton.click();
    }

    public void searchBar(String search)
    {
        searchInput.sendKeys(search);
    }

    public void clickOnSearch(){
        searchIcon.click();
    }

    public void searchTest(String emailID ,String password, String search)
    {
        clickAccountLogo();
        enterEmail(emailID );
        enterPassword(password);
        clickloginButton();
        searchBar(search);
        clickOnSearch();
    }
    //Actions a=new Actions(driver);
    ////        a.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
    //        WebElement move=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
    //        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
    //        a.moveToElement(move).contextClick().build().perform();
    //
    //    }
}
