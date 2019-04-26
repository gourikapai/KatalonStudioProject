<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>CreateCoupon</name>
   <tag></tag>
   <elementGuidId>2c0768c4-dfb9-41e7-8c36-c43a340941ab</elementGuidId>
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
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${base_URL}${base_PATH}?percent_off=${percent_off}&amp;duration=${duration}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'88'</defaultValue>
      <description></description>
      <id>4c239741-f882-4971-aa3d-53574b93528f</id>
      <masked>false</masked>
      <name>percent_off</name>
   </variables>
   <variables>
      <defaultValue>'once'</defaultValue>
      <description></description>
      <id>d235fcba-045e-4bb4-917e-d16b2ec599a5</id>
      <masked>false</masked>
      <name>duration</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.BASEURL</defaultValue>
      <description></description>
      <id>959fde32-5226-4b99-bf4a-4ca4dc7a8255</id>
      <masked>false</masked>
      <name>base_URL</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.BASEPATH</defaultValue>
      <description></description>
      <id>648818d3-3ffd-4414-aef1-e50c67783327</id>
      <masked>false</masked>
      <name>base_PATH</name>
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
