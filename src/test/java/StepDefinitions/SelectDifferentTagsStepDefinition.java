package StepDefinitions;

import Pages.BillingAddress;
import Pages.LoginPage1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectDifferentTagsStepDefinition {
    public static WebDriver driver = Hooks.driver;

    @Given("user go to categories page")
    public void navigation()
    {
        driver.navigate().to("https://demo.nopcommerce.com/computers");
    }

    @When("user click on a tag")
    public void choose_tag()
    {
        driver.findElement(By.cssSelector("a[href=\"/shirt\"]")).click();
    }

    @Then("a list of products of the selected tag displayed")
    public void products_displayed()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/shirt"));
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/h1")).getText().contains("Products tagged with 'shirt'"));
    }

    @When("user click on another tag")
    public void choose_new_tag()
    {
        driver.findElement(By.cssSelector("a[href=\"/shoes-2\"]")).click();
    }

    @Then("a list of products of the new selected tag displayed")
    public void new_products_displayed()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/shoes-2"));
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/h1")).getText().contains("Products tagged with 'shoes'"));
    }
}
