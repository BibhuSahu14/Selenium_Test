package com.project2;

import org.testng.annotations.Test;

public class TestAlertModule2 extends AppTest{
    
    
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




