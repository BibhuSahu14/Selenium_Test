package com.project2;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestAlertModule {
    
    WebDriver driver=Config.configuration();
    @Test
    public void alert()
    {
        AlertModule alertmodule=new AlertModule(driver);
        driver.findElement(alertmodule.dialog).click();
        driver.findElement(alertmodule.simplealert).click();
        alertmodule.genricAlert("accept");
        driver.findElement(alertmodule.confirmalert).click();
        alertmodule.genricAlert("dismiss");
        driver.findElement(alertmodule.promptalert).click();
        alertmodule.genricAlert("name");
        driver.findElement(alertmodule.modernalert).click();
    
        
            
        
    }




    }




