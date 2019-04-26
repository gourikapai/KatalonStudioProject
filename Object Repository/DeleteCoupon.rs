<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>DeleteCoupon</name>
   <tag></tag>
   <elementGuidId>917e2849-a32b-4e30-b62a-cf62059143ef</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic c2tfdGVzdF9uVW9DUHhnd2xDdExqMVkyREpGblMxZTk6</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>DELETE</restRequestMethod>
   <restUrl>${base_URL}${base_PATH}/${CouponID}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.BASEURL</defaultValue>
      <description></description>
      <id>b2eeecfe-5309-46a1-b14e-e477dd94e39a</id>
      <masked>false</masked>
      <name>base_URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.BASEPATH</defaultValue>
      <description></description>
      <id>0faca16a-56a5-4960-8960-924f9c4d13c5</id>
      <masked>false</masked>
      <name>base_PATH</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.CouponID</defaultValue>
      <description></description>
      <id>b3eb7a6b-8f88-4705-a68d-2f9897b212c6</id>
      <masked>false</masked>
      <name>CouponID</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()



WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)


</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
