package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProductToCompareListStepDefinition {
    public static WebDriver driver = Hooks.driver;
    @Given("user visit home page")
    public void navigation()
    {
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("user choose product")
    public void choose_product()
    {
        driver.findElement(By.cssSelector("a[href=\"/htc-one-m8-android-l-50-lollipop\"]")).click();
    }

    @And("user add the product to the compare list")
    public void add_product_to_compare_list() throws InterruptedException {
        Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/htc-one-m8-android-l-50-lollipop"));
        driver.findElement(By.className("add-to-compare-list-button")).click();
        Thread.sleep(1000);
    }

    @And("user choose another product and add it to compare list")
    public void add_another_product() throws InterruptedException {
        driver.findElement(By.cssSelector("a[href=\"/nokia-lumia-1020\"]")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/nokia-lumia-1020"));
        driver.findElement(By.className("add-to-compare-list-button")).click();
        Thread.sleep(1000);
    }

    @Then("the selected products are found in the compare list")
    public void check_products()
    {
        driver.findElement(By.cssSelector("a[href=\"/compareproducts\"]")).click();
        Assert.assertTrue(driver.findElement(By.xpath(
                "//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000044_nokia-lumia-1020_415.jpeg\"]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath(
                "//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000041_htc-one-m8-android-l-50-lollipop_415.jpeg\"]")).isDisplayed());

    }
}
