package Salesforce_Lightning_Test_Pages;

import org.openqa.selenium.WebDriver;

public class Salesforce_Create_Contact {
    private WebDriver driver;

    public Salesforce_Create_Contact (WebDriver driver) {this.driver = driver;}

    public String Get_Business_Account_Title_Page (){
        return driver.getTitle();
    }
}
