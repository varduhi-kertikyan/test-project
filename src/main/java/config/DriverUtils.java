package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverUtils {

    public static WebDriver driver;
    public static String path = "/Users/varduhikertikyan/Desktop/chromedriver";

    public static void initDriver(){
        System.setProperty("webdriver.chrome.driver",path);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void killDriver(){
        driver.close();
        driver.quit();
    }
}
