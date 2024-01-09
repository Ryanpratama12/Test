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

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_01_Profile'))

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_02_Tentang Mitsui Leasing'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Ryan/Katalon/Web MLCI/1.Profil/1.Tentang Mitsui Leasing.jpg')

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_01_Profile'))

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_03_Misi, Visi dan Nilai'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Ryan/Katalon/Web MLCI/1.Profil/2.Visi Misi.jpg')

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_01_Profile'))

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_04_Struktur Organisasi'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Ryan/Katalon/Web MLCI/1.Profil/3.Struktur Organisasi.jpg')

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_01_Profile'))

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_05_Manajemen'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Ryan/Katalon/Web MLCI/1.Profil/4.Manajemen.jpg')

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_01_Profile'))

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_06_Laporan Tahunan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Ryan/Katalon/Web MLCI/1.Profil/4.Laporan Tahunan.jpg')

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_01_Profile'))

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_07_Tata Kelola'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Ryan/Katalon/Web MLCI/1.Profil/5.Tata Kelola.jpg')

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_01_Profile'))

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_08_Kegiatan Perusahaan'))

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_09_Tanggung Jawab Sosial Lingkungan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Ryan/Katalon/Web MLCI/1.Profil/6.Tanggung Jawab Sosial.jpg')

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_01_Profile'))

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_08_Kegiatan Perusahaan'))

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_10_Berita dan Acara'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Ryan/Katalon/Web MLCI/1.Profil/7.Berita Acara.jpg')

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_01_Profile'))

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_11_Kantor Mitsui Leasing'))

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_12_Kantor Pusat'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Ryan/Katalon/Web MLCI/1.Profil/8.Kantor Pusat.jpg')

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_01_Profile'))

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_11_Kantor Mitsui Leasing'))

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_13_Kantor Cabang'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Ryan/Katalon/Web MLCI/1.Profil/9.Kantor Cabang.jpg')

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_01_Profile'))

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_11_Kantor Mitsui Leasing'))

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_14_Kantor Selain Kantor Cabang (KSKC)'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Ryan/Katalon/Web MLCI/1.Profil/10.Selain Kantor Cabang.jpg')

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_01_Profile'))

WebUI.click(findTestObject('Object Repository/REP_MLCIWEB_RP/REP01_MLCIWEB_RP_Profile/MLCIWEB_15_Laporan Keberlanjutan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Ryan/Katalon/Web MLCI/1.Profil/11.Laporan Keberlanjutan.jpg')

WebUI.closeBrowser()

