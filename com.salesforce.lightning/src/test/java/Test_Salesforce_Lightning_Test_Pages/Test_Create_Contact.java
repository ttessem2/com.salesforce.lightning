package Test_Salesforce_Lightning_Test_Pages;

import Salesforce_Lightning_Test_Pages.Lightning_Home_Page;
import Salesforce_Lightning_Test_Pages.Salesforce_Create_Contact;
import Salesforce_Lightning_Test_Pages.Salesforce_Login_Page;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class Test_Create_Contact {
    private WebDriver driver;
    private Salesforce_Login_Page Login_Page;
    private Lightning_Home_Page New_Business_Account;
    private Salesforce_Create_Contact create_Contact;

    @Before
    public void setUp() throws Exception {
        driver = Test_Utils_Class.getDriver("https://mris--builddemo.lightning.force.com/lightning/o/Account/new?nooverride=1&useRecordTypeCheck=1&navigationLocation=LIST_VIEW&backgroundContext=%2Flightning%2Fpage%2Fhome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Login_Page = new Salesforce_Login_Page(driver);
        Login_Page.Login();
        create_Contact = new Salesforce_Create_Contact(driver);
        New_Business_Account = new Lightning_Home_Page(driver);
    }
    @Test
    public void Test_Create_Business_Account_title(){
        assertEquals("TEST0907 | Salesforce", create_Contact.Get_Business_Account_Title_Page());
    }
}
