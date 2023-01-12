package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillingAddress {
    public WebElement firstNamePOM(WebDriver driver)
    {
        return driver.findElement(By.id("BillingNewAddress_FirstName"));
    }
    public WebElement lastNamePOM(WebDriver driver)
    {
        return driver.findElement(By.id("BillingNewAddress_LastName"));
    }
    public WebElement emailPOM(WebDriver driver)
    {
        return driver.findElement(By.id("BillingNewAddress_Email"));
    }
    public WebElement companyNamePOM(WebDriver driver)
    {
        return driver.findElement(By.id("BillingNewAddress_Company"));
    }
    public WebElement cityPOM(WebDriver driver)
    {
        return driver.findElement(By.id("BillingNewAddress_City"));
    }
    public WebElement addressPOM(WebDriver driver)
    {
        return driver.findElement(By.id("BillingNewAddress_Address1"));
    }
    public WebElement postalCodePOM(WebDriver driver)
    {
        return driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
    }
    public WebElement phoneNumberPOM(WebDriver driver)
    {
        return driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
    }




    public void billingSteps(WebDriver driver, String firstName, String lastName, String email, String company)
    {
        firstNamePOM(driver).clear();
        firstNamePOM(driver).sendKeys(firstName);
        lastNamePOM(driver).clear();
        lastNamePOM(driver).sendKeys(lastName);
        emailPOM(driver).clear();
        emailPOM(driver).sendKeys(email);
        companyNamePOM(driver).clear();
        companyNamePOM(driver).sendKeys(company);
    }
    public void billingSteps1(WebDriver driver, String city, String address, String postalCode, String phoneNumber)
    {
        cityPOM(driver).clear();
        cityPOM(driver).sendKeys(city);
        addressPOM(driver).clear();
        addressPOM(driver).sendKeys(address);
        postalCodePOM(driver).clear();
        postalCodePOM(driver).sendKeys(postalCode);
        phoneNumberPOM(driver).clear();
        phoneNumberPOM(driver).sendKeys(phoneNumber);
    }
}
