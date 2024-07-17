import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def driverPath = System.getProperty("user.dir") + "/Include/drivers/chromedriver_mac64/chromedriver"; // Added missing slash before Include
System.setProperty("webdriver.chrome.driver", driverPath);
Thread.sleep(15000) // Adding a delay before initializing the driver
WebDriver driver = new ChromeDriver();
driver.navigate().to('https://google.com')
driver.close()


//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
//
//WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))
//
//WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')
//
//WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))
//
//WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Make Appointment'))
//
//WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Make Appointment'))
//
//WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Make Appointment'))
//
//WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Make Appointment'))
//
//WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Make Appointment'), 'Make Appointment')
//
//WebUI.closeBrowser()

//WebDriver driver = new ChromeDriver();
//DriverFactory.changeWebDriver(drive

