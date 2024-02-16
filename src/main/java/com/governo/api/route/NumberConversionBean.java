package com.governo.api.route;

import java.math.BigInteger;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import com.governo.api.wsdl.NumberConversion;
import com.governo.api.wsdl.NumberConversionSoapType;
import java.net.URL;

@Component
public class NumberConversionBean implements Processor{
    @Override
    public void process(Exchange exchange) throws Exception {
    	String endpointUrl = "https://www.dataaccess.com/webservicesserver/numberconversion.wso?WSDL";

        Integer number = exchange.getIn().getBody(Integer.class);
        

        NumberConversion service = new NumberConversion(new URL(endpointUrl));

        NumberConversionSoapType port = service.getNumberConversionSoap();
 
        String result = port.numberToWords(BigInteger.valueOf(number));
        
        exchange.getIn().setBody(result);
    }
}
