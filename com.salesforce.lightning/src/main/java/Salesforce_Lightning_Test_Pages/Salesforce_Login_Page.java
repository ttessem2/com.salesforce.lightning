package Salesforce_Lightning_Test_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
public class Salesforce_Login_Page {
    WebDriver driver;

    public Salesforce_Login_Page(WebDriver driver) {
        this.driver = driver;
    }

    //@FindBy(how= How.ID, using = "username")
//    WebElement Login_Text_Box = driver.findElement(By.id("username"));

//    @FindBy(how= How.ID, using = "password")
//    WebElement Password_Text_Box;
//
//    @FindBy(how= How.ID, using = "Login")
//    WebElement Login_Button;


    public String Get_Login_Page_Title(){
        return driver.getTitle();
    }

    public String Login() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Login")));
        Thread.sleep(2000);

        WebElement Login_Text_Box = driver.findElement(By.id("username"));
        Login_Text_Box.clear();
        Login_Text_Box.sendKeys("level.3@mris.net.builddemo");

        WebElement Password_Text_Box = driver.findElement(By.id("password"));
        Password_Text_Box.clear();
        Password_Text_Box.sendKeys("!9Getvercode!9");

        WebElement Login_Button = driver.findElement(By.id("Login"));
        Login_Button.click();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS) ;

        //driver.switchTo().alert().accept();

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"oneHeader\"]/div[3]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[2]/a/span")));
       // wait.until(ExpectedConditions.titleIs("Home | Salesforce"));
        return driver.getTitle();

    }}

