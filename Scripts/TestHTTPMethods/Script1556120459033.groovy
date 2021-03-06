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

createresponse = WS.sendRequestAndVerify(findTestObject('RESTAPI/CreateCoupon'))

updateresponse = WS.sendRequestAndVerify(findTestObject('RESTAPI/UpdateCoupon'))

deleteresponse = WS.sendRequestAndVerify(findTestObject('RESTAPI/DeleteCoupon'))

response = WS.sendRequestAndVerify(findTestObject('RESTAPI/ListCoupons'))

retreiveresponse = WS.sendRequestAndVerify(findTestObject('RESTAPI/RetrieveCoupon'))

WS.verifyElementPropertyValue(response, 'data[0].object', 'coupon')


WS.verifyElementPropertyValue(deleteresponse, 'deleted', 'true')

WS.verifyElementPropertyValue(updateresponse, 'name', 'updatedcoupon')

WS.verifyResponseStatusCode(createresponse, 200)

WS.verifyResponseStatusCode(updateresponse, 200)

WS.verifyResponseStatusCode(deleteresponse, 200)

WS.verifyResponseStatusCode(response, 200)

