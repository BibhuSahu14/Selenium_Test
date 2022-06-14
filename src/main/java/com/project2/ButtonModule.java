package com.project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonModule {

    private WebDriver driver;
    ButtonModule(WebDriver driver)
    {
        this.driver=driver;
    }
    
    By buttonclick=By.xpath("//a[@href='/buttons']");
    By gotohome=By.xpath("//button[@id='home']");
    By coordinate=By.xpath("//button[@id='position']");
    By buttoncolor=By.xpath("//button[@id='color']");
    By heightwidthbutton=By.xpath("//button[@id='property']");
    By buttondisabled=By.xpath("//button[@title='Disabled button']");
    By clickandhold=By.xpath("//button[@id='isDisabled']//h2");



    public String isEnabled(Boolean disable)
    {
        if(disable==true)
        {
           return "The button is enabled";
        }
        else{
           return "the button is disabled";
        }
    }
    public void clickAndHoldButton(WebElement target)
    {
        Actions action=new Actions(driver);
        action.clickAndHold(target).build().perform();
    }
}
