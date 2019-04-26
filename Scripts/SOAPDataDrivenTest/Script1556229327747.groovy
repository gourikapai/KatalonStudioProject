import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.poi.hssf.record.CountryRecord as CountryRecord
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

response1 = WS.sendRequestAndVerify(findTestObject('getCapital', [('CountryCode') : country]))

println('----------------Country Code is :' + country)

WS.verifyElementText(response1, 'CapitalCityResponse.CapitalCityResult', capital)

println('-------------------Capital is :' + capital)

response2 = WS.sendRequestAndVerify(findTestObject('getCurrency', [('CountryCode') : country]))
println('--------------------------currency code is :' + CurrencyCode)

println('-------------------------------currency name is :' + CurrencyName)


WS.verifyElementText(response2, 'CountryCurrencyResponse.CountryCurrencyResult.sISOCode', CurrencyCode)

WS.verifyElementText(response2, 'CountryCurrencyResponse.CountryCurrencyResult.sName', CurrencyName)


