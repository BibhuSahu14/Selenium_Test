package com.project2;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class Test2{
    WebDriver driver=Config.comfiguration();
    @Test
    public void input()
    {

        //driver.get("https://letcode.in/test");
        //driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@href='/edit']")).click();
        driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("Bibhu Prasad Sahu");
        WebElement ele1=driver.findElement(By.xpath("//input[@id='join']"));
        ele1.sendKeys(" String added");
        ele1.sendKeys(Keys.TAB);
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
        //Assert.assertTrue(ele2.getAttribute("class").equalsIgnoreCase("input"));

       
    }
    @Test
    public void button()
    {
        driver.findElement(By.xpath("//a[@href='/buttons']")).click();
        driver.findElement(By.xpath("//button[@id='home']")).click();
        driver.navigate().back();
        WebElement ele3=driver.findElement(By.xpath("//button[@id='position']"));
        System.out.println("X Co-ordinate = "+ele3.getLocation().getX());
        System.out.println("y Co-ordinate = "+ele3.getLocation().getY());
        WebElement ele4=driver.findElement(By.xpath("//button[@id='color']"));
        String color=ele4.getCssValue("color");
        String hex= Color.fromString(color).asHex();
        System.out.println("The color of the button = "+hex);


    }
    
}
