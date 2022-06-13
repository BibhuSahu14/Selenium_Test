package com.project2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestInputModule {
    WebDriver driver=Config.comfiguration();
    @Test
    public void input()
    {

        InputModule inputModule=new InputModule();
        driver.findElement(inputModule.el1).click();
        WebElement ele0=driver.findElement(By.xpath("//input[@id='fullName']"));
        ele0.sendKeys("Bibhu Prasad Sahu");
        inputModule.enterTab(ele0);
        WebElement ele1=driver.findElement(By.xpath("//input[@id='join']"));
        ele1.sendKeys(" String added");
        inputModule.enterTab(ele1);
        String st=driver.findElement(By.xpath("//input[@id='getMe']")).getAttribute("value");
        System.out.println("What is inside the text box : "+st);
        driver.findElement(By.xpath("//input[@id='clearMe']")).clear();
        System.out.println(driver.findElement(By.xpath("//input[@id='noEdit']")).isEnabled()+" Confirm edit field is disabled");
        WebElement ele2=driver.findElement(By.xpath("//input[@id='dontwrite']"));
        //String readonly=ele2.getAttribute("value");
        ele2.sendKeys("This text is not readonly");
        if(ele2.getAttribute("value").equalsIgnoreCase("This text is readonly"))
        {
            System.out.println("This text is readonly");
        }
        else{
            System.out.println("This text is not readonly");
        }
        
       

       
    }
    
}
