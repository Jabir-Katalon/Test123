import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//import customKeywords.CustomWebUI as CustomWebUI
//import Keywords.CustomWebUI

CustomWebUI.waitForElementToDisappear(findTestObject('Object Repository/iFrame/Page_W3Schools Tryit Editor/h2_Log In'), 0)


WebUI.closeBrowser()
