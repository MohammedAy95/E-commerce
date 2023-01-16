package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1 {
    public WebElement emailPOM(WebDriver driver)
    {
        return driver.findElement(By.id("Email"));
    }

    public WebElement passwordPOM(WebDriver driver)
    {
        return driver.findElement(By.id("Password"));
    }
    public void loginSteps(WebDriver driver, String email, String password)
    {
        emailPOM(driver).clear();
        emailPOM(driver).sendKeys(email);
        passwordPOM(driver).clear();
        passwordPOM(driver).sendKeys(password);
    }
}
