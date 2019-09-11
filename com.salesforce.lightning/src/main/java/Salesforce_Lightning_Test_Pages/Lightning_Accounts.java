package Salesforce_Lightning_Test_Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lightning_Accounts {
    private WebDriver driver;

    public Lightning_Accounts(WebDriver driver) {this.driver = driver;}

    public String List_Accounts(){
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Home'])[1]/following::a[1]")));
// driver.findElement(STORE_ADMINISTRATION_LOCATOR).click(); <== this line returns
// WebDriverException: unknown error: Cannot read property 'defaultView' of undefined

// replaced with
        WebElement element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Home'])[1]/following::a[1]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);


//        WebElement Accounts_link = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Home'])[1]/following::a[1]"));
//        Accounts_link.click();
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Home'])[1]/following::a[1]")).click();
        return driver.getTitle();
    }

    public void Open_Created_Account (){
        WebElement TEST0906 = driver.findElement(By.xpath("(//a[contains(text(),'TEST0906')])[2]"));
        TEST0906.click();
    }
    public void edit_created_account() throws InterruptedException{
        WebElement iframe = driver.findElement(By.xpath("//div[@id='brandBand_1']/div/div/div[4]/div/force-aloha-page/div/iframe"));
        driver.switchTo().frame(iframe);
        Thread.sleep(2000);

        WebElement edit = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Business Account Detail'])[1]/following::input[1]"));
        edit.click();
        WebElement Office_ID = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Home'])[1]/following::a[1]"));
        Office_ID.sendKeys(Keys.TAB, "Active");
    }
}
