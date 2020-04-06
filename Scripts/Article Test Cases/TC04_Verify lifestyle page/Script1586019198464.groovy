import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Open browser and navigate to a site'
WebUI.openBrowser(GlobalVariable.Prod_SiteURL)

'Maximize the window'
WebUI.maximizeWindow()

'Select Artikel menu'
WebUI.mouseOver(findTestObject('Article Pages/gs-button-article'))

'Select Lifestyle sub menu'
WebUI.mouseOver(findTestObject('Article Pages/gs-button-lifestyle'))

WebUI.click(findTestObject('Article Pages/gs-button-lifestyle'))

WebUI.delay(10)

'Scroll to text Lainnya'
CustomKeywords.'mypack.loopBtnLainnya.getLoopBtnLainnya'()

'Close browser'
WebUI.closeBrowser()