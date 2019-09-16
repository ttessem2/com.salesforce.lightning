package Test_Salesforce_Lightning_Test_Pages;
import org.junit.Test;
import org.junit.jupiter.api.*;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.*;


public class SauceLabs_Test {
    private WebDriver driver;

    @Test
    public void shouldOpenChrome() throws MalformedURLException {
        /** Here we set environment variables from your local machine, or IntelliJ run configuration,
         *  and store these values in the variables below. Doing this is a best practice in terms of test execution
         *  and security. If you're not sure how to use env variables, refer to this guide -
         * https://wiki.saucelabs.com/display/DOCS/Best+Practice%3A+Use+Environment+Variables+for+Authentication+Credentials
         * or check junit5-README.md */
        String sauceUserName = System.getenv("SAUCE_USERNAME");
        String sauceAccessKey = System.getenv("SAUCE_ACCESS_KEY");
        System.out.println(sauceAccessKey);//        String sauceURL = "https://ondemand.saucelabs.com/wd/hub";
        System.out.println(sauceUserName);
       // String sauceURL = "https://" + sauceUserName + ":" + sauceAccessKey +
         //       "@ondemand.eu-central-1.saucelabs.com/wd/hub\n";
        String sauceURL = "https://ondemand.saucelabs.com/wd/hub";
        System.out.println(sauceURL);


        //https://#{ENV['SAUCE_USERNAME']}:#{ENV['SAUCE_ACCESS_KEY']}@ondemand.eu-central-1.saucelabs.com/wd/hub
        /**
         * * Here we set the MutableCapabilities for "sauce:options", which is required for newer versions of Selenium
         * and the w3c protocol, for more info read the documentation:
         * https://wiki.saucelabs.com/display/DOCS/Selenium+W3C+Capabilities+Support+-+Beta */
        MutableCapabilities sauceOpts = new MutableCapabilities();
        sauceOpts.setCapability("username", sauceUserName);
        sauceOpts.setCapability("accessKey", sauceAccessKey);
        /** In order to use w3c you must set the seleniumVersion **/
       // sauceOpts.setCapability("seleniumVersion", "3.141.59");
        sauceOpts.setCapability("name", "4-best-practices");

        /**
         * in this exercise we set additional capabilities below that align with
         * testing best practices such as tags, timeouts, and build name/numbers.
         *
         * Tags are an excellent way to control and filter your test automation
         * in Sauce Analytics. Get a better view into your test automation.
         */
        List<String> tags = Arrays.asList("sauceDemo", "demoTest", "module4", "javaTest");
        sauceOpts.setCapability("tags", tags);
        /** Another of the most important things that you can do to get started
         * is to set timeout capabilities for Sauce based on your organizations needs. For example:
         * How long is the whole test allowed to run?*/
        sauceOpts.setCapability("maxDuration", 3600);
        /** A Selenium crash might cause a session to hang indefinitely.
         * Below is the max time allowed to wait for a Selenium command*/
        sauceOpts.setCapability("commandTimeout", 600);
        /** How long can the browser wait for a new command */
        sauceOpts.setCapability("idleTimeout", 1000);

        /** Setting a build name is one of the most fundamental pieces of running
         * successful test automation. Builds will gather all of your tests into a single
         * 'test suite' that you can analyze for results.
         * It's a best practice to always group your tests into builds. */
        sauceOpts.setCapability("build", "Onboarding Sample App - Java-Junit5");

        /** Required to set w3c protoccol **/
        ChromeOptions chromeOpts = new ChromeOptions();
        chromeOpts.setExperimentalOption("w3c", true);

        /** Set a second MutableCapabilities object to pass Sauce Options and Chrome Options **/
        MutableCapabilities capabilities = new MutableCapabilities();
        capabilities.setCapability("sauce:options", sauceOpts);
        capabilities.setCapability("goog:chromeOptions", chromeOpts);
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("platformVersion", "Windows 10");
        capabilities.setCapability("browserVersion", "latest");


        /** If you're accessing the EU data center, use the following endpoint:.
         * https://ondemand.eu-central-1.saucelabs.com/wd/hub
         * */
        driver = new RemoteWebDriver(new URL(sauceURL), capabilities);
        /** Don't forget to enter in your application's URL in place of 'https://www.saucedemo.com'. */
        driver.navigate().to("https://www.saucedemo.com");
        assertTrue(true);
    }

    /**
     * Below we are performing 2 critical actions. Quitting the driver and passing
     * the test result to Sauce Labs user interface.
     */
    @AfterEach
    public void cleanUpAfterTestMethod() {
        ((JavascriptExecutor) driver).executeScript("sauce:job-result=" + ("passed"));
        driver.quit();
    }
}