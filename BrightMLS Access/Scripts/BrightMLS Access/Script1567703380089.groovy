import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Initializing server
System.setProperty("webdriver.chrome.driver", "C:/Users/TessemaT/Downloads/chromedriver1/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//navigate to login page
driver.get("https://www.tst.brightmls.com/#/home");
driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='JOIN'])[1]/following::a[1]")).click();
//populate login and password fields
WebDriverWait wait = new WebDriverWait(driver, 10);
new WebDriverWait (driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("idToken1")));
Thread.sleep(2000);
driver.findElement(By.id("idToken1")).clear();
driver.findElement(By.id("idToken1")).sendKeys("3204428");
driver.findElement(By.id("idToken2")).clear();
driver.findElement(By.id("idToken2")).sendKeys("TSt112233!!");
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS) ;
driver.findElement(By.id("loginButton_0")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//click wrapper/warning
driver.findElement(By.xpath("//*[@id=\"notification-pop-header\"]/div/button")).click();
//driver.findElement(By.xpath("//form[@id='form']/div[1]/paper-input/paper-input-container/div[2]/div/input")).clear();
Thread.sleep(2000);
WebElement Support_Profile = driver.findElement(By.xpath("//*[@id=\"HTMLRoot\"]/div/div[3]/div[2]/nav/ul[1]")); //*[@id="HTMLRoot"]/div/div[3]/div[2]/nav/ul[1]
Point pt = Support_Profile.getLocation();
int NumberX = pt.getX();
int NumberY = pt.getY();
Actions act = new Actions(driver);
act.moveByOffset(NumberX + 100, NumberY + 0).click().build().perform();
Thread.sleep(2000);
driver.findElement(By.xpath("(//a[contains(text(),'Logout')])[2]")).click();
driver.getTitle();
driver.quit();

//wd.findElement(By.xpath("//form[@id='form']/div[1]/paper-input/paper-input-container/div[2]/div/input")).sendKeys("<USERNAME>");
//wd.findElement(By.xpath("//form[@id='form']/div[2]/paper-input/paper-input-container/div[2]/div/input")).click();
//wd.findElement(By.xpath("//form[@id='form']/div[2]/paper-input/paper-input-container/div[2]/div/input")).clear();
//wd.findElement(By.xpath("//form[@id='form']/div[2]/paper-input/paper-input-container/div[2]/div/input")).sendKeys("<PASSWORD>");
//wd.findElement(By.xpath("//form[@id='form']//paper-button[.='login']")).click();
//try { Thread.sleep(3000l); } catch (Exception e) { throw new RuntimeException(e); }
//if(wd.findElement(By.tagName("html")).getText().contains("please login")){
//	System.out.println("Login failed");
//throw ioe;
//}//End of login
//System.out.println("Login was executed successfully!");
//System.out.println("Testcase finished successfully!");
//wd.quit();
