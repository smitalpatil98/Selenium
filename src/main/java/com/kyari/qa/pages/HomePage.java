package com.kyari.qa.pages;

import com.kyari.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase
{

    @FindBy(xpath = "//*[@id=\"menu-item-home-classic\"]/a/span/span")
    WebElement homeLink;

    @FindBy(xpath = "//*[@id=\"menu-item-corporate-gifting-classic\"]/a/span/span")
    WebElement corporateGifting;

    @FindBy(id = "menu-item-plant-consultation-classic")
    WebElement plantConsultation;

    @FindBy(xpath = "//span[text()='Lucky Jade Plant']")
    WebElement jadePlant;

    public HomePage()
    {
        PageFactory.initElements(driver,this);
        homeLink.click();
    }

    public CorporateGifting clickCorporateGifting(){
        corporateGifting.click();
        return new CorporateGifting();
    }

    public PlantConsultation clickPlantConsultation(){
        plantConsultation.click();
        return new PlantConsultation();
    }

    public String clickJadePlant(){
        jadePlant.click();
        return driver.findElement(By.xpath("//h1[contains(text(),\"Lucky Jade Plant\")]")).getText();

    }

    public String greenDelightText(){
        return driver.findElement(By.xpath("//h2[contains(text(), \"Shop Our Green Delights\")]")).getText();
    }
}


















