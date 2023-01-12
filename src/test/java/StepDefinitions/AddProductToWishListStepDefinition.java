package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProductToWishListStepDefinition {
    public static WebDriver driver = Hooks.driver;
    @Given("user open the home page")
    public void navigation()
    {
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("user choose the product")
    public void choose_product()
    {
        driver.findElement(By.cssSelector("a[href=\"/htc-one-m8-android-l-50-lollipop\"]")).click();
    }

    @And("user add the product to the wishlist")
    public void add_product_to_wishlist()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/htc-one-m8-android-l-50-lollipop"));
        driver.findElement(By.id("add-to-wishlist-button-18")).click();
    }

    @And("user choose another product and add it to wishlist")
    public void add_another_product()
    {
        driver.findElement(By.cssSelector("a[href=\"/books\"]")).click();
        driver.findElement(By.cssSelector("a[href=\"/fahrenheit-451-by-ray-bradbury\"]")).click();
        driver.findElement(By.id("add-to-wishlist-button-37")).click();
    }

    @Then("the selected products are found in the wishlist")
    public void check_products()
    {
        driver.findElement(By.className("wishlist-label")).click();
        Assert.assertTrue(driver.findElement(By.xpath(
                "//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000068_fahrenheit-451-by-ray-bradbury_80.jpeg\"]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath(
                "//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000041_htc-one-m8-android-l-50-lollipop_80.jpeg\"]")).isDisplayed());

    }
}
