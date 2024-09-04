import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox')

WebUI.switchToWindowTitle('Google')

WebUI.doubleClick(findTestObject('Object Repository/Test12345/Page_Google/button_Stay signed out'))

WebUI.doubleClick(findTestObject('Object Repository/Test12345/Page_Google/a_Gmail'))

WebUI.click(findTestObject('Object Repository/Test12345/Page_Gmail Private and secure email at no c_d3ebd8/a_For work'))

WebUI.doubleClick(findTestObject('Object Repository/Test12345/Page_Gmail Private and secure email at no c_d3ebd8/a_For work'))

WebUI.doubleClick(findTestObject('Object Repository/Test12345/Page_Gmail Private and secure email for per_c4e4fc/summary_Solutions'))

WebUI.doubleClick(findTestObject('Object Repository/Test12345/Page_Gmail Private and secure email for per_c4e4fc/summary_Products'))

WebUI.closeBrowser()

