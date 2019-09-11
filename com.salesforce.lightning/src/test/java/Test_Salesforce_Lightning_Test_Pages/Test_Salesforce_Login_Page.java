package Test_Salesforce_Lightning_Test_Pages;

import Salesforce_Lightning_Test_Pages.Salesforce_Login_Page;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class Test_Salesforce_Login_Page {
    private WebDriver driver;
    private Salesforce_Login_Page Login_Page;

    @Before
    public void setUp() throws Exception{
        driver = Test_Utils_Class.getDriver("https://mris--builddemo.lightning.force.com/lightning/o/Account/new?nooverride=1&useRecordTypeCheck=1&navigationLocation=LIST_VIEW&backgroundContext=%2Flightning%2Fpage%2Fhome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Login_Page = new Salesforce_Login_Page(driver);
    }
    @Test
    public void test_Login_Page_Title() throws Exception {
        assertEquals("Login | Salesforce", Login_Page.Get_Login_Page_Title());
    }
    @Test
    public void test_Login() throws Exception {
        assertEquals("Lightning Experience", Login_Page.Login());
    }

    @After
    public void tear_Down() throws Exception{
        driver.quit();
    }
}
