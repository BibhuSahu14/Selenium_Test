package com.project2;

import java.util.List;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestSelectModule
{
    WebDriver driver=Config.configuration();
    @Test
    public void select()
    {
        SelectModule selectmodule=new SelectModule();
        driver.findElement(selectmodule.dropdown).click();
        WebElement ddown=driver.findElement(selectmodule.selectfruit);
        Select select=new Select(ddown);
        select.selectByVisibleText("Apple");
        WebElement sh=driver.findElement(selectmodule.superhero);
        Select select1=new Select(sh);
        select1.selectByVisibleText("Ant-Man");
        select1.selectByVisibleText("Aquaman");
        select1.selectByVisibleText("Batman");
        List<WebElement> selectedoption=select.getAllSelectedOptions();
        for(WebElement favhero:selectedoption)
        {
            System.out.println(favhero.getText());
        }
        WebElement plang=driver.findElement(selectmodule.programminglanguage);
        Select select3=new Select(plang);
        List<WebElement> languages=select3.getOptions();
        select3.selectByIndex(languages.size()-1);
        for(WebElement lang:languages)
        {
            System.out.println("programming language :"+lang.getText());
        }
        WebElement count=driver.findElement(selectmodule.country);
        Select select4=new Select(count);
        select4.selectByValue("India");
        WebElement cntry=select4.getFirstSelectedOption();
        System.out.println(cntry.getText());


    }
    
    
}
