package com.project2;

import org.testng.annotations.Test;
import org.openqa.selenium.Rectangle;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class TestButtonModule extends AppTest {

    @Test
    public void button()
    {
        ButtonModule buttonmodule=new ButtonModule(driver);
        driver.findElement(buttonmodule.buttonclick).click();
        driver.findElement(buttonmodule.gotohome).click();
        driver.navigate().back();
        WebElement coordinate=driver.findElement(buttonmodule.coordinate);
        System.out.println("X Coordinate: "+coordinate.getLocation().getX());
        System.out.println("Y coordinate: "+coordinate.getLocation().getY());
        System.out.println("The button color:");
        String backgroundcolor=driver.findElement(buttonmodule.buttoncolor).getCssValue("background-color");
        System.out.println(backgroundcolor);
        String hexcolor=Color.fromString(backgroundcolor).asHex();
        System.out.println(hexcolor);
        Rectangle size=driver.findElement(buttonmodule.heightwidthbutton).getRect();
        System.out.println("Height :"+size.getHeight());
        System.out.println("Width :"+size.getWidth());
        Boolean disable=driver.findElement(buttonmodule.buttondisabled).isEnabled();
        String message=buttonmodule.isEnabled(disable);
        System.out.println(message);
        WebElement clickandhold=driver.findElement(buttonmodule.clickandhold);
        buttonmodule.clickAndHoldButton(clickandhold);

    }
    
}
