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

//inport excel keywors
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords

def fileexcel = ExcelKeywords.getExcelSheetByName("Data Files/userlogin.xlsx", "Sheet1")
String user = ExcelKeywords.getCellByAddress(fileexcel, "A4")
String pwd = ExcelKeywords.getCellByAddress(fileexcel, "B4")

WebUI.comment(user)
WebUI.comment(pwd)


String name = GlobalVariable.username2

String password = GlobalVariable.password2

int angka1 = 123

WebUI.comment(name)
WebUI.comment(password)
WebUI.comment(GlobalVariable.username2)
WebUI.comment(GlobalVariable.password2)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/'	)

WebUI.click(findTestObject('Object Repository/Object Spy/button_a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Object Spy/input_Username_username'), user)

WebUI.setText(findTestObject('Object Repository/Object Spy/input_Password_password'), pwd)

WebUI.click(findTestObject('Object Repository/Object Spy/button_Login'))
