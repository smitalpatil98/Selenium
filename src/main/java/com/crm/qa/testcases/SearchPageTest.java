package com.crm.qa.testcases;

import com.crm.qa.pages.SearchPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static com.crm.qa.base.TestBase.initialization;

public class SearchPageTest extends SearchPage
{
    SearchPage searchPage;

    @BeforeMethod
    public void setUp()
    {
        initialization();

        searchPage = new SearchPage();
    }

    @Test(priority = 1)
    //, dataProvider = "SearchData", dataProviderClass = ExelFile.class)
    public void searchTest(String emailID, String password, String search)
    {
        searchPage.searchTest(emailID, password, search);
    }
}
