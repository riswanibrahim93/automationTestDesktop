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

Windows.startApplicationWithTitle('C:\\Program Files (x86)\\Microsoft Office\\Office14\\WINWORD.EXE', '')

Windows.delay(5)

Windows.click(findWindowsObject('msWordObject/Button'))

Windows.setText(findWindowsObject('Object Repository/msWordObject/Pane'), strInput1)

Windows.click(findWindowsObject('Object Repository/msWordObject/Button(1)'))

Windows.setText(findWindowsObject('Object Repository/msWordObject/Pane'), strInput2)

Windows.click(findWindowsObject('Object Repository/msWordObject/Button'))

Windows.click(findWindowsObject('Object Repository/msWordObject/Button(1)'))

Windows.click(findWindowsObject('Object Repository/msWordObject/Button(2)'))

Windows.setText(findWindowsObject('Object Repository/msWordObject/Pane'), strInput3)

Windows.click(findWindowsObject('Object Repository/msWordObject/Button(3)'))

Windows.click(findWindowsObject('Object Repository/msWordObject/MenuItem(1)'))

Windows.click(findWindowsObject('Object Repository/msWordObject/Button(4)'))

Windows.closeApplication()

