package com.project2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public static WebDriver driver;
    @BeforeSuite
    public void initializedDriver()
    {
        driver=Config.configuration();

    }
    @AfterMethod
    public void afterClass()
    {
        driver.navigate().back();
    }
    @AfterSuite
    public void closeDriver()
    {
        if(driver!=null)
        {
            driver.close();
        }
        
    }
    
}
