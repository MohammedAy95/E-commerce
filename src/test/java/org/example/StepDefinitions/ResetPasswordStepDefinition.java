package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ResetPasswordStepDefinition {
    public static WebDriver driver = Hooks.driver;
    @Given("user navigates to the login page")
    public void navigation()
    {
        //login = new LoginPage1();
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }

    @When("user click on forget password")
    public void ForgetPassword()
    {
        driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]")).click();
    }
    @And("user go to reset password page")
    public void ResetPage()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/passwordrecovery"));
    }

    @And("user  enter his email and click recover button")
    public void EnterEMail()
    {
        driver.findElement(By.id("Email")).sendKeys("mohammed56@yahoo.com");
        driver.findElement(By.className("password-recovery-button")).click();
    }

    @Then("user get a recover mail successfully")
    public void emailRecovered()
    {
        String actualResult = driver.findElement(By.className("content")).getText();
        String expectedResult = "Email with instructions has been sent to you.";
        Assert.assertEquals(expectedResult,actualResult);
    }
}
