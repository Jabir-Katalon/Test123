import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class CustomWebUI {

	/**
	 * Wait for an element to be not present on the page.
	 *
	 * @param testObject The TestObject to wait for
	 * @param timeout The maximum time to wait (in seconds)
	 * @param failureHandling How to handle failure (Optional)
	 */
	@Keyword
	def static waitForElementToDisappear(TestObject testObject, int timeout, FailureHandling failureHandling = FailureHandling.CONTINUE_ON_FAILURE) {
		try {
			boolean isNotPresent = WebUI.waitForElementNotPresent(testObject, timeout, failureHandling)
			if (isNotPresent) {
				WebUI.comment("The element '${testObject.getObjectId()}' is no longer present.")
			} else {
				WebUI.comment("Timed out waiting for the element '${testObject.getObjectId()}' to disappear.")
			}
			return isNotPresent
		} catch (Exception e) {
			WebUI.comment("An error occurred while waiting for the element to disappear: ${e.message}")
			return false
		}
	}
}
