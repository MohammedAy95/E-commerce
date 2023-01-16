package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SwitchCurrenciesStepDefinition {
    WebElement itemsPerPageDropdown;
    public static WebDriver driver = Hooks.driver;
    @Given("user navigates to home page")
    public void navigation()
    {
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("user click on currencies section")
    public void currencies_button()
    {
        itemsPerPageDropdown = driver.findElement(By.xpath("html/body/div/div/div/div/div/select"));
    }

    @And("user choose the US Dollar currency")
    public void choose_dollar() throws InterruptedException {
        Select select = new Select(itemsPerPageDropdown);
        select.selectByVisibleText("US Dollar");
        Thread.sleep(1000);
    }

    @Then("the Dollar currency applied to the products")
    public void dollar_applied()
    {
        Assert.assertTrue(driver.findElement(By.className("actual-price")).getText().contains("$"));
    }

    @When("user click on currencies section1")
    public void currencies_button1()
    {
        itemsPerPageDropdown = driver.findElement(By.xpath("html/body/div/div/div/div/div/select"));
    }

    @And("user choose the Euro currency")
    public void choose_euro() throws InterruptedException {
        Select select = new Select(itemsPerPageDropdown);
        select.selectByVisibleText("Euro");
        Thread.sleep(1000);
    }

    @Then("the Euro currency applied to the products")
    public void euro_applied()
    {
        Assert.assertTrue(driver.findElement(By.className("actual-price")).getText().contains("€"));
    }
}
