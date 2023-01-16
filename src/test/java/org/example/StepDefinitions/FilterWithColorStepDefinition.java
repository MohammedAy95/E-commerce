package org.example.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FilterWithColorStepDefinition {
    public static WebDriver driver = Hooks.driver;
    @Given("user open shoes category page")
    public void navigation()
    {
        driver.navigate().to("https://demo.nopcommerce.com/shoes");
    }

    @When("user choose a color")
    public void choose_color() throws InterruptedException {
        driver.findElement(By.id("attribute-option-15")).click();
        Thread.sleep(3000);
    }

    @Then("categories with the choosen color displayed")
    public void color_displayed()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains
                ("https://demo.nopcommerce.com/shoes?viewmode=grid&orderby=0&pagesize=6&specs=15"));
        Assert.assertTrue(driver.findElement(By.xpath(
                "//img[@alt=\"Picture of adidas Consortium Campus 80s Running Shoes\"] ")).isDisplayed());

    }
}
