import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.openBrowser('')

//WebUI.addArguments('allow-file-access-from-files')


WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Test1/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.click(findTestObject('Object Repository/Test1/Page_CURA Healthcare Service/div_Login                Please login to ma_c5c214'))

WebUI.doubleClick(findTestObject('Object Repository/Test1/Page_CURA Healthcare Service/p_Please login to make appointment'))

WebUI.click(findTestObject('Object Repository/Test1/Page_CURA Healthcare Service/p_Please login to make appointment'))

WebUI.verifyElementText(findTestObject('Object Repository/Test1/Page_CURA Healthcare Service/p_Please login to make appointment'), 
    'Please login to make appointment.')

WebUI.closeBrowser()

ChromeOptions options = new ChromeOptions()

def driverPath = System.getProperty("user.dir") + "/Include/drivers/chromedriver_mac64/chromedriver";


System.setProperty("webdriver.chrome.driver", driverPath);


 

// This option disables the Chrome security settings that prevent local file access

options.addArguments('allow-file-access-from-files')

 

DriverFactory.changeWebDriver(new ChromeDriver(options))