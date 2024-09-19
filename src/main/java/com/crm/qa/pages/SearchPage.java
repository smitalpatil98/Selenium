package com.crm.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.crm.qa.base.TestBase.driver;

public class SearchPage
{
    public SearchPage()
    {
        super();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//span[@class=\"small-hide\"])[3]")
    WebElement webLogo;

    @FindBy(name = "customer[email]")
    WebElement email_Input;

    @FindBy(name = "customer[password]")
    WebElement pass_Input;

    @FindBy(xpath = "(//button)[12]")
    WebElement loginButton;

    @FindBy(xpath = "(//input[@id='Search-In-Modal'])[1]") WebElement searchInput;

    @FindBy(xpath = "(//*[name()='svg'][@class='icon icon-search'])[1]") WebElement searchIcon;

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
}
