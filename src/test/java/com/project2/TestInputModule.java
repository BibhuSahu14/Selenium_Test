package com.project2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestInputModule {
    WebDriver driver=Config.configuration();
    @Test
    public void input()
    {

        InputModule inputModule=new InputModule();
        driver.findElement(inputModule.el1).click();
        WebElement ele0=driver.findElement(inputModule.fullName);
        ele0.sendKeys("Bibhu Prasad Sahu");
        inputModule.enterTab(ele0);
        WebElement ele1=driver.findElement(inputModule.append);
        ele1.sendKeys(" String added");
        inputModule.enterTab(ele1);
        String st=driver.findElement(inputModule.insideTheTextBox).getAttribute("value");
        System.out.println("What is inside the text box : "+st);
        driver.findElement(inputModule.clearTheText).clear();
        System.out.println(driver.findElement(inputModule.editFieldIsDisabled).isEnabled()+" Confirm edit field is disabled");
        WebElement ele2=driver.findElement(inputModule.confirmReadonly);
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
