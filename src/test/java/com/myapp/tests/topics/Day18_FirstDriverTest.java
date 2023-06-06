package com.myapp.tests.topics;

import com.myapputilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day18_FirstDriverTest {

    @Test
    public void firstDriverTest(){
//  Got to amazon page
//  driver.get("https://www.amaon.com");
//  driver ->>>>>>>Driver.getDriver()
        Driver.getDriver().get("https://www.amazon.com");


 // String actualTitle = Driver.getDriver().getTitle();
 //  assert actualTitle.contains("amazon");
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.toLowerCase().contains("amazon"));
//      closing the driver

//     driver.quit();
        Driver.closeDriver();  
    }
}
