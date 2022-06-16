package com.project2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertModule {

    WebDriver driver;

    AlertModule(WebDriver driver)
    {
        this.driver=driver;
    }
    
    By dialog=By.xpath("//a[@href='/alert']");
    By simplealert=By.xpath("//button[@id='accept']");
    By confirmalert=By.xpath("//button[@id='confirm']");
    By promptalert=By.xpath("//button[@id='prompt']");
    By modernalert=By.xpath("//button[@id='modern']");



    public void genricAlert(String mesg)
    {
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(10));
        Alert alert=wait.until(ExpectedConditions.alertIsPresent());

        if(mesg.equals("accept"))
        {
            alert.accept();
        }
        else if(mesg.equals("dismiss"))
        {
            String s=alert.getText();
            alert.dismiss();
            System.out.println(s);
        }
        else if(mesg.equals("name"))
        {
            alert.sendKeys("Bibhu Prasad Sahu");
            alert.accept();
        }
    }

}
