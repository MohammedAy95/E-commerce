package org.example.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
//import Manager.DriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void setup()
    {
      //  driver = null;

        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
//        // System.getProperty("user.dir") used to fix the location for any user
        System.setProperty("webdriver.chrome.driver", chromePath);
//        // 2- New object or webDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();


    }

    @After
    public void close_browser()
    {
        driver.quit();
      //  driver = null;
    }
}
