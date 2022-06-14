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
    By append=By.xpath("//input[@id='join']");
    By insideTheTextBox=By.xpath("//input[@id='getMe']");
    By clearTheText=By.xpath("//input[@id='clearMe']");
    By editFieldIsDisabled=By.xpath("//input[@id='noEdit']");
    By confirmReadonly=By.xpath("//input[@id='dontwrite']");
    

    public void enterTab(WebElement el)
    {
        el.sendKeys(Keys.TAB);
  
    }
    
}
