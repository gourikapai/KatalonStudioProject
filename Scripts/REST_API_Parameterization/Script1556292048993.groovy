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

createrespone = WS.sendRequestAndVerify(findTestObject('CreateCoupon', [('percent_off') : percent_off, ('duration') : duration, ('base_URL') : GlobalVariable.BASEURL
            , ('base_PATH') : GlobalVariable.BASEPATH]))

def Percent_OFF=Float.parseFloat(percent_off)
println("*********Float value of Percent_OFF**********"+Percent_OFF)

WS.verifyElementPropertyValue(createrespone, 'duration', duration)
WS.verifyElementPropertyValue(createrespone, 'percent_off', Percent_OFF)

def slurper = new groovy.json.JsonSlurper()

def result = slurper.parseText(createrespone.getResponseBodyContent())

def couponID = result.id

println('*****************Extracted Coupon ID is *****************' + couponID)

GlobalVariable.CouponID=couponID

WS.verifyElementPropertyValue(createrespone, 'id', couponID)

println('*****************Global Variable Coupon ID is *****************' +GlobalVariable.CouponID)

deleteresponse = WS.sendRequestAndVerify(findTestObject('DeleteCoupon', [('base_URL') : GlobalVariable.BASEURL, ('base_PATH') : GlobalVariable.BASEPATH
            , ('CouponID') : GlobalVariable.CouponID]))

WS.verifyElementPropertyValue(deleteresponse, 'deleted', 'true')
WS.verifyElementPropertyValue(deleteresponse, 'id', couponID)

