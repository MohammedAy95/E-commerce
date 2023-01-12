package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchProductStepDefinition {
    public static WebDriver driver = Hooks.driver;
    @Given("user navigates to the home page")
    public void navigation()
    {
        //login = new LoginPage1();
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("user enter a product name in search box")
    public void search_product()
    {
        driver.findElement(By.className("search-box-text")).sendKeys("Samsung Series 9 NP900X4C Premium Ultrabook");
    }

    @And("user click on search button")
    public void click_search()
    {
        driver.findElement(By.className("search-box-button")).click();
    }

//    @Then("user go to search page")
//    public void search_page()
//    {
//        Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=samsung"));
//    }

    @Then("user find the product")
    public void find_product()
    {
        driver.findElement(By.cssSelector("a[href=\"/samsung-series-9-np900x4c-premium-ultrabook\"]")).isDisplayed();
    }

}
