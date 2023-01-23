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

WebUI.navigateToUrl('https://wwwst.riksbyggen.se/bostad/')

WebUI.click(findTestObject('Object Repository/Page_TWEB01-IIS  Bostadsrtter, hyresrtter, _02941f/button_Acceptera cookies'))

WebUI.doubleClick(findTestObject('Object Repository/Page_TWEB01-IIS  Bostadsrtter, hyresrtter, _02941f/div_Rum_image-inner lazy-load  lazy-loaded'))

WebUI.click(findTestObject('Object Repository/Page_TWEB01-IIS  Bostadsrtter, hyresrtter, _02941f/input_Sk_accommodation-searchblock-autocomp_945b91'))

WebUI.setText(findTestObject('Object Repository/Page_TWEB01-IIS  Bostadsrtter, hyresrtter, _02941f/input_Sk_accommodation-searchblock-autocomp_945b91'), 
    'stock')

WebUI.click(findTestObject('Object Repository/Page_TWEB01-IIS  Bostadsrtter, hyresrtter, _02941f/div_Stockholms ln'))

WebUI.click(findTestObject('Object Repository/Page_TWEB01-IIS  Bostadsrtter, hyreslgenhet_47ed01/div_Filtrera_project-link-1'))

WebUI.click(findTestObject('Object Repository/Page_TWEB01-IIS  Inflyttningsklara bostadsr_6ff452/a_Visningar'))

WebUI.click(findTestObject('Object Repository/Page_TWEB01-IIS  Inflyttningsklara bostadsr_6ff452/div_Planering pgr                          _42b76e'))

WebUI.click(findTestObject('Object Repository/Page_TWEB01-IIS  Inflyttningsklara bostadsr_6ff452/a_Bilder'))

WebUI.click(findTestObject('Object Repository/Page_TWEB01-IIS  Inflyttningsklara bostadsr_6ff452/a_Om bostderna'))

WebUI.click(findTestObject('Object Repository/Page_TWEB01-IIS  Inflyttningsklara bostadsr_6ff452/a_Bostadsvljare'))

WebUI.click(findTestObject('Object Repository/Page_TWEB01-IIS  Inflyttningsklara bostadsr_6ff452/a_Kontakt'))

