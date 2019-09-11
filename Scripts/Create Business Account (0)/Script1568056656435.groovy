import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mris--builddemo.cs11.my.salesforce.com/?ec=302&startURL=%2Fvisualforce%2Fsession%3Furl%3Dhttps%253A%252F%252Fmris--Builddemo.lightning.force.com%252Flightning%252Fo%252FAccount%252Fnew%253Fnooverride%253D1%2526useRecordTypeCheck%253D1%2526navigationLocation%253DLIST_VIEW%2526backgroundContext%253D%25252Flightning%25252Fpage%25252Fhome')

WebUI.setText(findTestObject('Page_Login Salesforce (0)/input_Username_username'), 'level.3@mris.net.builddemo')

WebUI.setEncryptedText(findTestObject('Page_Login Salesforce (0)/input_Password_pw'), 'IMHLkGjVN480cW9L+ET2KA==')

WebUI.click(findTestObject('Page_Login Salesforce (0)/input_Password_Login'))

WebUI.click(findTestObject('Page_New Account Salesforce (0)/span_Business Account'))

WebUI.click(findTestObject('Page_New Account Salesforce (0)/span_Next'))

WebUI.setText(findTestObject('Page_New Account Business Account Salesforce (0)/Office ID'), 'TEST0906')

WebUI.setText(findTestObject('Page_New Account Business Account Salesforce (0)/Account Name'), 'TEST0906')

WebUI.click(findTestObject('Page_New Account Business Account Salesforce (0)/Account Type'))

WebUI.click(findTestObject('Page_New Account Business Account Salesforce (0)/a_Residential'))

//WebUI.click(findTestObject('Page_New Account Business Account Salesforce (1)/span_Company Type'))

//WebUI.click(findTestObject('Page_New Account Business Account Salesforce (0)/a_BRIGHT'))

WebUI.setText(findTestObject('Page_New Account Business Account Salesforce (0)/Office Phone'), '111111111')

//WebUI.click(findTestObject('Page_New Account Business Account Salesforce (0)/Account Type'))
//WebUI.click(findTestObject('Page_New Account Business Account Salesforce (0)/a_BRIGHT'))
//WebUI.click(findTestObject('Page_New Account Business Account Salesforce (0)/Account Type'))
//WebUI.click(findTestObject('Page_New Account Business Account Salesforce (0)/a_BRIGHT'))
WebUI.setText(findTestObject('Page_New Account Business Account Salesforce (0)/input_Street Number_1880923a'), '9707')

WebUI.setText(findTestObject('Page_New Account Business Account Salesforce (0)/input_Street Name_1914923a'), 'Key West')

WebUI.setText(findTestObject('Page_New Account Business Account Salesforce (0)/input_Street Type_1950923a'), 'Avenue')

WebUI.setText(findTestObject('Page_New Account Business Account Salesforce (0)/input__2166923a'), '20850')

WebUI.setText(findTestObject('Page_New Account Business Account Salesforce (0)/input__2238923a'), 'Rockville')

WebUI.click(findTestObject('Page_New Account Business Account Salesforce (0)/State'))

WebUI.click(findTestObject('Page_New Account Business Account Salesforce (0)/a_MD'))

WebUI.setText(findTestObject('Page_New Account Business Account Salesforce (0)/input_County_2370923a'), 'Montgomery')

WebUI.setText(findTestObject('Page_New Account Business Account Salesforce (0)/input_CS_County_2797923a'), 'Montgomery')

//WebUI.click(findTestObject('Page_New Account Business Account Salesforce (0)/Account Type'))
//
//WebUI.click(findTestObject('Page_New Account Business Account Salesforce (0)/a_UNDEFINED UNDEF'))

WebUI.click(findTestObject('Page_New Account Business Account Salesforce (0)/button_Save'))

WebUI.closeBrowser()

