package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
    public WebElement firstNamePOM(WebDriver driver)
    {
        return driver.findElement(By.id("FirstName"));
    }

    public WebElement lastNamePOM(WebDriver driver)
    {
        return driver.findElement(By.id("LastName"));
    }
    public WebElement emailPOM(WebDriver driver)
    {
        return driver.findElement(By.id("Email"));
    }
    public WebElement companyNamePOM(WebDriver driver)
    {
        return driver.findElement(By.id("Company"));
    }
    public WebElement passwordPOM(WebDriver driver)
    {
        return driver.findElement(By.id("Password"));
    }
    public WebElement confirmPasswordPOM(WebDriver driver)
    {
        return driver.findElement(By.id("ConfirmPassword"));
    }
    public void registerSteps(WebDriver driver, String firstName, String lastName, String email)
    {
        firstNamePOM(driver).clear();
        firstNamePOM(driver).sendKeys(firstName);
        lastNamePOM(driver).clear();
        lastNamePOM(driver).sendKeys(lastName);
        emailPOM(driver).clear();
        emailPOM(driver).sendKeys(email);
    }
    public void password(WebDriver driver, String password,String confirmPassword)
    {
        passwordPOM(driver).clear();
        passwordPOM(driver).sendKeys(password);
        confirmPasswordPOM(driver).clear();
        confirmPasswordPOM(driver).sendKeys(confirmPassword);
    }

}
