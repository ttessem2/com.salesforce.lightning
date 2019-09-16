package Salesforce_Lightning_Test_Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesforceCreateSubscription {
    private WebDriver driver;

    public SalesforceCreateSubscription (WebDriver driver) {this.driver = driver;}

    public void createNewSubscription() throws InterruptedException{

        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/div/div/div[2]/div/div/div/div/div/div/div/div/input")));
        WebElement Contact = driver.findElement(By.xpath("//div/div/div/div[2]/div/div/div/div/div/div/div/div/input"));
        Contact.sendKeys("TEST0907-LName", Keys.DOWN, Keys.ENTER);
        Thread.sleep(1000);
//Susbscription
        WebElement SubscriptionID = driver.findElement(By.xpath("//div/div/div/div/div/div/div/div/div/input"));
        SubscriptionID.sendKeys("TEST0907-Lname-Agent", Keys.ENTER);
//Type
        WebElement DrpDwnType = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[4]/following::a[1]"));
        DrpDwnType.sendKeys("Agent", Keys.ENTER);
        Thread.sleep(1000);

// Sub Type
        Point DrpDwnTypePt = DrpDwnType.getLocation();
        int NumberX = DrpDwnTypePt.getX();
        int NumberY = DrpDwnTypePt.getY();
        Actions act = new Actions(driver);
        act.moveByOffset(NumberX, NumberY+100).click().build().perform();
        Thread.sleep(1000);
        WebElement LicenseeOrNonRealtor = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='--None--'])[17]/following::a[1]"));
        LicenseeOrNonRealtor.click();
        Thread.sleep(1000);
//Related Location
        WebElement RelatedLocation = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[6]/following::input[1]"));
        RelatedLocation.sendKeys("TEST0907", Keys.DOWN, Keys.DOWN, Keys.ENTER);
        Thread.sleep(2000);

//Service Jurisdiction
        WebElement DrpDwnServiceJur = driver.findElement(By.xpath("//div[13]/div[2]/div/div/div/div/div/div/div/a"));
        DrpDwnServiceJur.sendKeys("BRIGHT", Keys.ENTER);

//Billing Jurisdication
        DrpDwnServiceJur.sendKeys(Keys.TAB, Keys.TAB, "BRIGHT", Keys.ENTER);
//Public Email
        WebElement PublicEmail = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[7]/following::input[1]"));
        PublicEmail.sendKeys("a@a.com");
//Primary Phone
        WebElement PrimaryPhone = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Primary Phone'])[1]/following::input[1]"));
        PrimaryPhone.sendKeys("111-111-1111");
//Mobile Phone
        WebElement MobilePhone = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Mobile Phone'])[1]/following::input[1]"));
        MobilePhone.sendKeys("111-111-1111");
//Street Number
        WebElement StreetNumber = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Street Number'])[1]/following::input[1]"));
        StreetNumber.sendKeys("9707");
//Street Name
        WebElement StreetName = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Street Name'])[1]/following::input[1]"));
        StreetName.sendKeys("Key West");
//Street Type
        WebElement StreetType = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Home Street Name'])[1]/following::input[2]"));
        StreetType.sendKeys("Ave");
//Zip
        WebElement Zip = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[10]/following::input[1]"));
        Zip.sendKeys("20850");
//Zip4
        WebElement Zip4 = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Zip+4'])[1]/following::input[1]"));
        Zip4.sendKeys("3992");
//State
        WebElement State = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[11]/following::a[1]"));
        State.sendKeys("MD", Keys.ENTER);
    }
//
}
