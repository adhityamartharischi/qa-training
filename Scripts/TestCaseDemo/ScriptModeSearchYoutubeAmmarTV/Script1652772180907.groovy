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

//masuk web
WebUI.openBrowser("")

//navigate url
WebUI.navigateToUrl("https://www.youtube.com")

//masukkan teks
WebUI.setText(findTestObject('Object Repository/Page_ammar tv - YouTube/input_Skip navigation_search_query'), "Ammar TV")

//klik search
WebUI.click(findTestObject('Object Repository/Page_ammar tv - YouTube/button_Search'))

//buka channel
WebUI.click(findTestObject('Object Repository/Page_ammar tv - YouTube/yt-formatted-string_Ammar TV'))

//verify channel
WebUI.verifyTextPresent("Ammar TV", false)

//close browser
WebUI.closeBrowser()
