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

WebUI.navigateToUrl('https://www.mitsuilease.co.id/')

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP04_MLCIWEB_RP_Layanan Konsumen/MLCIWEB_01_LAYANAN KONSUMEN'))

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP04_MLCIWEB_RP_Layanan Konsumen/MLCIWEB_02_KomentarSaran'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Ryan/Katalon/Web MLCI/4.Layanan Konsumen/1.Komentar Saran.jpg')

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP04_MLCIWEB_RP_Layanan Konsumen/MLCIWEB_01_LAYANAN KONSUMEN'))

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP04_MLCIWEB_RP_Layanan Konsumen/MLCIWEB_03_Contact Us'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Ryan/Katalon/Web MLCI/4.Layanan Konsumen/2.Contact Us.jpg')

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP04_MLCIWEB_RP_Layanan Konsumen/MLCIWEB_01_LAYANAN KONSUMEN'))

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP04_MLCIWEB_RP_Layanan Konsumen/MLCIWEB_04_Prosedur Pengaduan Konsumen'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Ryan/Katalon/Web MLCI/4.Layanan Konsumen/3.Prosedur Pengaduan Konsumen.jpg')

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP04_MLCIWEB_RP_Layanan Konsumen/MLCIWEB_01_LAYANAN KONSUMEN'))

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP04_MLCIWEB_RP_Layanan Konsumen/MLCIWEB_05_Lembaga Alternatif Penyelesaian Sengketa (LAPS)'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Ryan/Katalon/Web MLCI/4.Layanan Konsumen/4.LAPS.jpg')

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP04_MLCIWEB_RP_Layanan Konsumen/MLCIWEB_01_LAYANAN KONSUMEN'))

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP04_MLCIWEB_RP_Layanan Konsumen/MLCIWEB_06_Ringkasan Informasi Produk dan Layanan Versi Umun'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Ryan/Katalon/Web MLCI/4.Layanan Konsumen/5.Layanan Informasi.jpg')

WebUI.closeBrowser()

