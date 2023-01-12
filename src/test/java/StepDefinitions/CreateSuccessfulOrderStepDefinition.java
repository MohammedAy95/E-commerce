package StepDefinitions;

import Pages.BillingAddress;
import Pages.LoginPage1;
import Pages.RegistrationPage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateSuccessfulOrderStepDefinition {
    public static WebDriver driver = Hooks.driver;
    BillingAddress billing;
    LoginPage1 login;
    @Given("user go to login page")
    public void navigation()
    {
        login = new LoginPage1();
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }

    @When("user could login successfully")
    public void login() throws InterruptedException {
        login.loginSteps(driver, "mohammed54@yahoo.com", "123456");
        login.passwordPOM(driver).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    @And("user add a product to the shopping cart")
    public void add_product()
    {
        driver.findElement(By.cssSelector("a[href=\"/htc-one-m8-android-l-50-lollipop\"]")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/htc-one-m8-android-l-50-lollipop"));
        driver.findElement(By.id("add-to-cart-button-18")).click();
    }

    @And("go to shopping cart")
    public void open_shopping_cart()
    {
        driver.findElement(By.className("ico-cart")).click();
    }

    @And("user accept terms of service and press checkout")
    public void checkout() throws InterruptedException {
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.className("checkout-button")).click();
        Thread.sleep(1000);
    }

    @And("user fill his data to address and continue")
    public void fill_address() throws InterruptedException {
        billing = new BillingAddress();
        billing.billingSteps(driver, "Mohammed", "Aly", "mohammed54@yahoo.com", "expleo");
        WebElement itemsPerPageDropdown = driver.findElement(By.id("BillingNewAddress_CountryId"));    // choose country
        Select select = new Select(itemsPerPageDropdown);
        select.selectByVisibleText("Egypt");
        billing.billingSteps1(driver, "Giza", "Zaghlool", "12456", "012345618");
        driver.findElement(By.className("new-address-next-step-button")).click();
        Thread.sleep(1000);
    }

    @And("user choose shipping method")
    public void shipping_method() throws InterruptedException {
        driver.findElement(By.id("shippingoption_0")).click();
        driver.findElement(By.className("shipping-method-next-step-button")).click();
        Thread.sleep(1000);
    }

    @And("user choose payment method and continue")
    public void payment_method() throws InterruptedException {
        driver.findElement(By.id("paymentmethod_0")).click();
        driver.findElement(By.className("payment-method-next-step-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("payment-info-next-step-button")).click();
        Thread.sleep(1000);
    }
    @And("user confirm order")
    public void confirm_order() throws InterruptedException {
        driver.findElement(By.className("confirm-order-next-step-button")).click();
        Thread.sleep(1000);
    }

    @Then("order completed")
    public void order_completed()
    {
       String actualResult =
               driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/strong")).getText();
       String expectedResult = "Your order has been successfully processed!";
       Assert.assertTrue(actualResult.contains(expectedResult));
    }



}
