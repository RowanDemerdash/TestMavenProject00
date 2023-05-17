package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class P01_Register {

    public WebElement reglink()
    {
        return driver.findElement(By.className("ico-register"));
    }



}
