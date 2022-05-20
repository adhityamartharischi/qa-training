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

//buka web
WebUI.openBrowser("")

//navigate to url
WebUI.navigateToUrl("https://www.shopee.com")

//pilih negara
WebUI.click(findTestObject('Object Repository/Shopee/li_Indonesia'))

//ketik item yang diinginkan
WebUI.setText(findTestObject('Object Repository/Shopee/input_Log In_shopee-searchbar-input__input'), "Gomuda")

//klik search
WebUI.click(findTestObject('Object Repository/Shopee/button_Log In_btn btn-solid-primary btn--s btn--inline shopee-searchbar__search-button'))

//pilih item
WebUI.click(findTestObject('Object Repository/Shopee/img'))

//pilih ukuran
WebUI.click(findTestObject('Object Repository/Shopee/button_S'))

//masukkan kedalam keranjang
WebUI.click(findTestObject('Object Repository/Shopee/button_masukkan keranjang'))


//close browser
WebUI.closeBrowser()