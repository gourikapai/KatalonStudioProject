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

response1 = WS.sendRequestAndVerify(findTestObject('CountryInfoService/SOAP/ListOfCountryNamesByCode'))

String xmlvalue = response1.responseBodyContent

def datavalue = new XmlSlurper().parseText(xmlvalue)

def countrycode = datavalue.ListOfCountryNamesByCodeResult.tCountryCodeAndName[0].sISOCode.text()

println("-----------------------Extracted country code------- :"+countrycode)

GlobalVariable.CountryISOCode = countrycode

WS.sendRequestAndVerify(findTestObject('CountryInfoService/SOAP/CapitalCity'))

response2 = WS.sendRequestAndVerify(findTestObject('CountryInfoService/SOAP/CountryCurrency', [('CountryISOCode') : GlobalVariable.CountryISOCode]))

WS.verifyElementText(response2, 'CountryCurrencyResponse.CountryCurrencyResult.sISOCode', 'EUR')

def xmlcurrencyvalue=response2.responseBodyContent

def currency=new XmlSlurper().parseText(xmlcurrencyvalue)

def currencycode=currency.CountryCurrencyResult.sISOCode.text()

println("-------------------Extracted currency code----------- :"+currencycode)

GlobalVariable.CurrencyISOCode=currencycode

response3=WS.sendRequestAndVerify(findTestObject('CountryInfoService/SOAP/CurrencyName'))

WS.verifyElementText(response3, 'CurrencyNameResponse.CurrencyNameResult', 'Euro')

/*
 * For REST API Chaining : Refer Udemy Course 
 * 
 * https://www.udemy.com/api-testing-with-katalon-studio-step-by-step-for-beginners/learn/v4/content
 * 
 * 
 * 
 * 
 */
/*jsonresponse = WS.sendRequestAndVerify(findTestObject('RESTAPI/CreateCoupon'))
def slurper=new groovy.json.JsonSlurper()
def result=slurper.parseText(jsonresponse.getResponseBodyContent())
def value=result.data[0].firstName*/
