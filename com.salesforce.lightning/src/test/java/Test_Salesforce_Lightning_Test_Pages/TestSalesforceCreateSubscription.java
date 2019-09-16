package Test_Salesforce_Lightning_Test_Pages;

import Salesforce_Lightning_Test_Pages.Lightning_Home_Page;
import Salesforce_Lightning_Test_Pages.SalesforceCreateSubscription;
import Salesforce_Lightning_Test_Pages.Salesforce_Create_Contact;
import Salesforce_Lightning_Test_Pages.Salesforce_Login_Page;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TestSalesforceCreateSubscription {
    private WebDriver driver;
    private Salesforce_Login_Page Login_Page;
    private SalesforceCreateSubscription salesforceCreateSubscription;


    @Before
    public void setUp() throws Exception {
        driver = Test_Utils_Class.getDriver("https://mris--builddemo.my.salesforce.com/?ec=302&startURL=%2Fvisualforce%2Fsession%3Furl%3Dhttps%253A%252F%252Fmris--Builddemo.lightning.force.com%252Flightning%252Fo%252FSubscriptions__c%252Fnew%253Fnooverride%253D1%2526useRecordTypeCheck%253D1%2526navigationLocation%253DMRU_LIST%2526backgroundContext%253D%25252Flightning%25252Fo%25252FSubscriptions__c%25252Flist%25253FfilterName%25253DRecent");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Login_Page = new Salesforce_Login_Page(driver);
        Login_Page.Login();
        salesforceCreateSubscription = new SalesforceCreateSubscription(driver);
    }
    @Test
    public void testCreateSubscription() throws Exception{
        salesforceCreateSubscription.createNewSubscription();
    }
}