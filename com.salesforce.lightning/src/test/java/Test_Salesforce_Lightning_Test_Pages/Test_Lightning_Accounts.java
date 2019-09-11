package Test_Salesforce_Lightning_Test_Pages;

import Salesforce_Lightning_Test_Pages.Lightning_Accounts;
import Salesforce_Lightning_Test_Pages.Lightning_Home_Page;
import Salesforce_Lightning_Test_Pages.Salesforce_Login_Page;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class Test_Lightning_Accounts {
    private WebDriver driver;
    private Salesforce_Login_Page Login_Page;
    private Lightning_Home_Page New_Business_Account;
    private Lightning_Accounts lightning_Accounts;

    @Before
    public void setUp() throws Exception {
        driver = Test_Utils_Class.getDriver("https://mris--builddemo.lightning.force.com/lightning/o/Account/new?nooverride=1&useRecordTypeCheck=1&navigationLocation=LIST_VIEW&backgroundContext=%2Flightning%2Fpage%2Fhome");
        // driver = Test_Utils_Class.getDriver( "https://test.salesforce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Login_Page = new Salesforce_Login_Page(driver);
        Login_Page.Login();
        New_Business_Account = new Lightning_Home_Page(driver);
        New_Business_Account.Populate_New_Business_Account_Form();
        lightning_Accounts = new Lightning_Accounts(driver);
    }
    @Test
    public void test_Accounts_Page_title(){
        assertEquals("", lightning_Accounts.List_Accounts());
    }
    @Test
    public void test_Edit_created_account() throws Exception{
        lightning_Accounts.edit_created_account();
    }

}
