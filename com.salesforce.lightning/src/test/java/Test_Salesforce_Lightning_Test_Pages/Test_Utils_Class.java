package Test_Salesforce_Lightning_Test_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Test_Utils_Class {
     WebDriver driver;

    public static WebDriver getDriver(String url) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TessemaT\\git\\Tsemre_KatalonTests\\com.salesforce.lightning\\src\\main\\resources\\chromedriver");
        WebDriver driver= new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;

    }
}
