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

WebUI.navigateToUrl('https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp')

WebUI.setText(findTestObject('Page_Buat Akun Google/input_Buat Akun Google_firstName'), firstname)

WebUI.setText(findTestObject('Page_Buat Akun Google/input_Buat Akun Google_lastName'), lastname)

WebUI.setText(findTestObject('Page_Buat Akun Google/input_Buat Akun Google_Username'), username)

WebUI.setEncryptedText(findTestObject('Page_Buat Akun Google/input_Gunakan alamat email saya saat ini sebagai gantinya_Passwd'), 
    password)

WebUI.setEncryptedText(findTestObject('Page_Buat Akun Google/input_Gunakan alamat email saya saat ini sebagai gantinya_ConfirmPasswd'), 
    confirmpassword)

WebUI.click(findTestObject('Page_Buat Akun Google/div_Tampilkan sandi_VfPpkd-RLmnJb'))

