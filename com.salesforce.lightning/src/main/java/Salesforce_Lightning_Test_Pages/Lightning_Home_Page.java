package Salesforce_Lightning_Test_Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

public class Lightning_Home_Page {
    private WebDriver driver;

    public Lightning_Home_Page(WebDriver driver) {this.driver = driver;}


    public String Select_New_Business_Account (){
//    WebElement Next_Button_New_Account = driver.findElement(By.xpath("//*[(text() = 'Next' or . = 'Next')]"));
//    Next_Button_New_Account.click();
    //return driver.getWindowHandle();
       // Set<String> winHandles = driver.getWindowHandles();
        return driver.getTitle();
    }

    public void Populate_New_Business_Account_Form() throws InterruptedException{
        WebElement Next_Button_New_Account = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::span[1]"));
        Next_Button_New_Account.click();
        Thread.sleep(1000);

        WebElement Office_ID = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[1]/following::input[1]"));
        Office_ID.clear();
        Office_ID.sendKeys("TEST0906");

        WebElement Account_Name = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[3]/following::input[1]"));
        Account_Name.clear();
        Account_Name.sendKeys("TEST0906");

        WebElement Account_Type = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[5]/following::a[1]"));
        Account_Type.sendKeys("Residential", Keys.ENTER);

        Point Account_Type_pt = Account_Type.getLocation();
        int NumberX = Account_Type_pt.getX();
        int NumberY = Account_Type_pt.getY();
        Actions act = new Actions(driver);
        act.moveByOffset(NumberX+0, NumberY+100).click().build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='--None--'])[15]/following::a[1]")).click();

        WebElement Office_Phone = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[4]/following::input[1]"));
        Office_Phone.sendKeys("111-111-1111");

        WebElement Street_Number = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Street Number'])[1]/following::input[1]"));
        Street_Number.sendKeys("9707");

        WebElement Street_Name = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Street Number'])[1]/following::input[2]"));
        Street_Name.sendKeys("Key West");

        WebElement Street_Type = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Street Type'])[1]/following::input[1]"));
        Street_Type.sendKeys("Ave");

        WebElement Zip_Code = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[6]/following::input[1]"));
        Zip_Code.sendKeys("20850");

        WebElement Zip_Code_4 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Zip+4'])[1]/following::input[1]"));
        Zip_Code_4.sendKeys("3992");

        WebElement City = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[7]/following::input[1]"));
        City.sendKeys("Rockville");

        WebElement State = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[6]/following::a[1]"));
        State.sendKeys("MD", Keys.ENTER);

        WebElement County0 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='County'])[1]/following::input[1]"));
        County0.sendKeys("Montgomery");

        WebElement County1 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='CS_County'])[1]/following::input[1]"));
        County1.sendKeys("Montgomery", Keys.TAB, Keys.TAB, Keys.TAB, "AVENUE, AVE", Keys. ENTER);

        Thread.sleep(3000);

        WebElement Primary_Jurisdiction = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Primary Service Jurisdiction'])[1]/following::a[1]"));
        Primary_Jurisdiction.sendKeys("BRIGHT", Keys.ENTER, Keys.TAB, Keys.TAB, "BRIGHT", Keys.ENTER);

        WebElement Save = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save & New'])[1]/following::button[1]"));
        Save.click();

        //new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Mailing Address'])[1]/following::input[1]")));

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(5000);

        WebElement iframe = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Help'])[1]/following::iframe[1]"));
        driver.switchTo().frame(iframe);
        Thread.sleep(2000);
        WebElement MailingAddress = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Mailing Address'])[1]/following::input[1]"));
        MailingAddress.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
       // new WebDriverWait(driver, 10).until(ExpectedConditions.titleIs("Lightning Experience"));
        new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::iframe[2]")));


        }

        public void troubleshoot_Company_Name () throws InterruptedException{
            WebElement Next_Button_New_Account = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::span[1]"));
            Next_Button_New_Account.click();
            Thread.sleep(1000);

            WebElement Account_Type = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[5]/following::a[1]"));
            Account_Type.sendKeys("Residential", Keys.ENTER);

            Point pt = Account_Type.getLocation();
        int NumberX = pt.getX();
        int NumberY = pt.getY();
        Actions act = new Actions(driver);
        act.moveByOffset(NumberX+0, NumberY+100).click().build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='--None--'])[15]/following::a[1]")).click();
        }

    public void troubleshoot_Street_Name () throws InterruptedException{
        WebElement Next_Button_New_Account = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::span[1]"));
        Next_Button_New_Account.click();
        Thread.sleep(1000);

        WebElement County1 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='CS_County'])[1]/following::input[1]"));
        County1.sendKeys("Montgomery", Keys.TAB, Keys.TAB, Keys.TAB, "AVENUE, AVE", Keys. ENTER);
    }
    public void troubleshoot_Primary_Serivce () throws InterruptedException{
        WebElement Next_Button_New_Account = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::span[1]"));
        Next_Button_New_Account.click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Primary Service Jurisdiction'])[1]/following::a[1]")).sendKeys("BRIGHT", Keys.ENTER, Keys.TAB, Keys.TAB, "BRIGHT", Keys.ENTER);

//        WebElement Prim_Jur_Text = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Other Server Access Tools'])[1]/following::span[5]"));
//        Point pjt = Prim_Jur_Text.getLocation();
//        int NumberX = pjt.getX();
//        int NumberY = pjt.getY();
//        System.out.println(NumberX );
//        System.out.println(NumberY );
//        Actions act = new Actions(driver);
//        act.moveByOffset(NumberX+0, NumberY+10).click().build().perform();
//        Thread.sleep(2000);
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='--None--'])[15]/following::a[1]")).click();


    }}


