package Managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    public static WebDriver driver;
    public static WebDriver getDriver()
    {
        if(driver == null)
        {
            String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
//        // System.getProperty("user.dir") used to fix the location for any user
            System.setProperty("webdriver.chrome.driver", chromePath);
//        // 2- New object or webDriver
            driver = new ChromeDriver();
            driver.manage().window().maximize();

        }
        return driver;
    }
}
