package com.project2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputModule {
    private WebDriver driver;

    public void InputModule(WebDriver driver)
    {
        this.driver=driver;
    }
  
    By el1 = By.xpath("//a[@href='/edit']");
    By fullName=By.xpath("//input[@id='fullName']");
    

    public void enterTab(WebElement el)
    {
        el.sendKeys(Keys.TAB);
  
    }
    
}
