package StepDefinitions;

import Pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class RegistrationStepDefinition {
   // WebDriver driver = null;
    public static WebDriver driver = Hooks.driver;
    RegistrationPage register;
    @Given("user navigates to registration page")
    public void navigation()
    {
        register = new RegistrationPage();
        driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");
    }

    @When("user choose his gender")
    public void chooseGender()
    {
        driver.findElement(By.id("gender-male")).click();
    }
    @And("user  enter his First name, Last name and email")
    public void userFullName()
    {
        register.registerSteps(driver, "Mohammed", "Aly", "mohammed54@yahoo.com");
    }

    @And("user enter his Date of birth")
    public void userDate()
    {

    }

    @And("user enter his company name")
    public void userCompanyName()
    {
        register.companyNamePOM(driver).clear();
        register.companyNamePOM(driver).sendKeys("expleo");
    }
    @And("user enter a password and confirm password")
    public void userPassword()
    {
        register.password(driver, "123456", "123456");
    }

    @And("user click on register button")
    public void registerButton() throws InterruptedException {
        register.confirmPasswordPOM(driver).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    @Then("user registration completed successfully")
    public void registrationCompleted()
    {
        String actualResult = driver.findElement(By.className("result")).getText();
        String expectedResult = "Your registration completed";
        Assert.assertEquals(expectedResult,actualResult);
        Assert.assertTrue(driver.findElement(By.className("register-continue-button")).isDisplayed());


    }




}
