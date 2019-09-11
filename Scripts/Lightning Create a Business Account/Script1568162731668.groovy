import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Point;
import java.util.concurrent.TimeUnit;import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeOptions;

//1) Goto Login Page
ChromeOptions options = new ChromeOptions();
options.addArguments("--disable-notifications");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\TessemaT\\git\\Tsemre_KatalonTests\\Salesforce Create Business Account\\Drivers\\chromedriver");
WebDriver driver= new ChromeDriver();
driver.get("https://mris--builddemo.lightning.force.com/lightning/o/Account/new?nooverride=1&useRecordTypeCheck=1&navigationLocation=LIST_VIEW&backgroundContext=%2Flightning%2Fpage%2Fhome");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebDriverWait wait = new WebDriverWait(driver, 10);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;



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

////		SELECT BUSINESS ACCOUNT

		WebElement Next_Button_New_Account = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::span[1]"));
		 Next_Button_New_Account.click();
		 Thread.sleep(1000);

		 WebElement Office_ID = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[1]/following::input[1]"));
		 Office_ID.clear();
		 Office_ID.sendKeys("TEST0907");

		 WebElement Account_Name = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[3]/following::input[1]"));
		 Account_Name.clear();
		 Account_Name.sendKeys("TEST0907");
		 
		 WebElement Status_drpdwn = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Status'])[1]/following::a[1]"));
		 Status_drpdwn.sendKeys("ACTIVE", Keys.ENTER);
		 Thread.sleep(1000);

		 WebElement Account_Type = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[5]/following::a[1]"));
		 Account_Type.sendKeys("Residential", Keys.ENTER);

		 Point Account_Type_pt = Account_Type.getLocation();
		 int NumberX = Account_Type_pt.getX();
		 int NumberY = Account_Type_pt.getY();
		 Actions act = new Actions(driver);
		 act.moveByOffset(NumberX+0, NumberY+100).click().build().perform();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[contains(text(),'Broker Office')]")).click();

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

		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 Thread.sleep(5000);
 
		 WebElement iframe = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Help'])[1]/following::iframe[1]"));
		 driver.switchTo().frame(iframe);
		 Thread.sleep(2000);
		 WebElement MailingAddress = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Mailing Address'])[1]/following::input[1]"));
		 MailingAddress.sendKeys(Keys.TAB, Keys.TAB, Keys.ENTER);
		 
		 wait.until(ExpectedConditions.titleIs("TEST0907 | Salesforce"));
		 
		 driver.close();
		 
		// new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::iframe[2]")));
		  