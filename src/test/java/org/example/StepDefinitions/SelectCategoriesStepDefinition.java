package org.example.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SelectCategoriesStepDefinition {

    public static WebDriver driver = Hooks.driver;
    @Given("user opens home page")
    public void navigation()
    {
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("user click on a category")
    public void select_category()
    {
        driver.findElement(By.cssSelector("a[href=\"/electronics\"]")).click();
    }

    @Then("Electronics page opened")
    public void electronics_page()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/electronics"));
    }

    @And("a list of sub-categories is displayed")
    public void sub_categories_list()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//img[@alt=\"Picture for category Camera & photo\"]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//img[@alt=\"Picture for category Cell phones\"]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//img[@alt=\"Picture for category Others\"]")).isDisplayed());
    }

    @When("user click on a sub-category")
    public void select_sub_category()
    {
        driver.findElement(By.xpath("//img[@alt=\"Picture for category Camera & photo\"]")).click();
    }

    @Then("the page of this sub-category is opened")
    public void open_sub_category()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/camera-photo"));
    }

    @And("sub-category components ar displayed")
    public void sub_category_components()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//img[@alt=\"Picture of Nikon D5500 DSLR\"]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//img[@alt=\"Picture of Apple iCam\"]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//img[@alt=\"Picture of Leica T Mirrorless Digital Camera\"]")).isDisplayed());
    }

}
