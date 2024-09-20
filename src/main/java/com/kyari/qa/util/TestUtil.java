package com.kyari.qa.util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestUtil
{
    public static long PAGE_LOAD_TIMEOUT = 10;
    public static long  IMPLICIT_WAIT = 10;


    public byte[] takescreenshotFaliure(WebDriver driver)
    {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}
