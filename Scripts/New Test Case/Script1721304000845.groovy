import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

import com.kms.katalon.core.webui.driver.DriverFactory

// Configure Chrome options

ChromeOptions options = new ChromeOptions()

def driverPath = System.getProperty("user.dir") + "/Include/drivers/chromedriver_mac64/chromedriver";

System.setProperty("webdriver.chrome.driver", driverPath);

 

// This option disables the Chrome security settings that prevent local file access

options.addArguments('allow-file-access-from-files')

 

DriverFactory.changeWebDriver(new ChromeDriver(options))
