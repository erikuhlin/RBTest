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

WebUI.navigateToUrl('https://wwwst.riksbyggen.se/')

WebUI.click(findTestObject('Object Repository/Page_TWEB03-IIS  Vi bygger och frvaltar fas_44b630/button_Acceptera cookies'))

WebUI.click(findTestObject('Object Repository/Page_TWEB03-IIS  Vi bygger och frvaltar fas_44b630/a_Sk bostad'))

WebUI.setText(findTestObject('Object Repository/Page_TWEB03-IIS  Bostadsrtter, hyresrtter, _35bbd9/input_Sk_accommodation-searchblock-autocomp_945b91'), 
    'stockholm')

WebUI.click(findTestObject('Object Repository/Page_TWEB03-IIS  Bostadsrtter, hyresrtter, _35bbd9/div_Stockholms ln'))

WebUI.click(findTestObject('Object Repository/Page_TWEB03-IIS  Bostadsrtter, hyreslgenhet_2e18bf/a_Bostder (33)'))

WebUI.click(findTestObject('Object Repository/Page_TWEB03-IIS  Bostadsrtter, hyreslgenhet_2e18bf/a_Projekt (9)'))

WebUI.closeBrowser()

