package com.project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
    
    public static WebDriver comfiguration()
    {
        System.setProperty("webdriver.chrome.driver", "E:\\Chrome Driver Testing\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://letcode.in/test");
        driver.manage().window().maximize();
        return driver;

    }
}
