<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>CurrencyName</name>
   <tag></tag>
   <elementGuidId>2a02a419-3777-487f-bb2f-115e305c67f5</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <restRequestMethod></restRequestMethod>
   <restUrl></restUrl>
   <serviceType>SOAP</serviceType>
   <soapBody>&lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot;?>&lt;SOAP-ENV:Envelope xmlns:SOAP-ENV=&quot;http://schemas.xmlsoap.org/soap/envelope/&quot; xmlns:tns=&quot;http://www.oorsprong.org/websamples.countryinfo&quot;>
  &lt;SOAP-ENV:Header/>
  &lt;SOAP-ENV:Body>
    &lt;tns:CurrencyName>
      &lt;tns:sCurrencyISOCode>${CurrencyISOCode}&lt;/tns:sCurrencyISOCode>
    &lt;/tns:CurrencyName>
  &lt;/SOAP-ENV:Body>
&lt;/SOAP-ENV:Envelope>
</soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod>SOAP</soapRequestMethod>
   <soapServiceFunction>CurrencyName</soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.CurrencyISOCode</defaultValue>
      <description></description>
      <id>5154e9aa-a31a-450a-ac58-45052a5e1e73</id>
      <masked>false</masked>
      <name>CurrencyISOCode</name>
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

WS.verifyElementText(response, 'CurrencyNameResponse.CurrencyNameResult', 'Euro')</verificationScript>
   <wsdlAddress>http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?WSDL</wsdlAddress>
</WebServiceRequestEntity>
