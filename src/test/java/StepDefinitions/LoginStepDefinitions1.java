package StepDefinitions;

import Pages.LoginPage1;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinitions1 {
    public static WebDriver driver = Hooks.driver;

    LoginPage1 login;
    @Given("user navigates to login page")
    public void navigation()
    {
        login = new LoginPage1();
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }

    @When("^user enter \"(.*)\" and \"(.*)\"$")
    public void enterData(String email, String password)
    {
        login.loginSteps(driver, email, password);
    }
    @And("user click on login button")
    public void loginButton() throws InterruptedException {
        login.passwordPOM(driver).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }
    @Then("user could login successfully and go to home page")
    public void userLOGINSuccessfully()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));
        Assert.assertTrue(driver.findElement(By.cssSelector("a[href=\"/logout\"]")).isDisplayed());
    }

//    @Then("user could not login")
//    public void wrong_login()
//    {
//        String actualResult = driver.findElement(By.className("message-error")).getText();
//        String expectedResult = "Login was unsuccessful. Please correct the errors and try again.";
//        Assert.assertTrue("Error message: Text is wrong!", actualResult.contains(expectedResult));


 //   }

//    @After
//    public void close_browser1()
//    {
//        driver.quit();
//    }




}
