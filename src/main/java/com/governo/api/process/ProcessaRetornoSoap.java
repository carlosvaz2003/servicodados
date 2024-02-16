package com.governo.api.process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;


@Component
public class ProcessaRetornoSoap implements Processor {


	@Override
	public void process(Exchange exchange) throws Exception {
		/*		
		// TODO Auto-generated method stub
		SoapService soapService = new SoapService();
		String xmlResponse = exchange.getIn().getBody(String.class);
		
		if (xmlResponse != null && !xmlResponse.isEmpty()) {
			NumberToWordsResponse retorno = soapService.convertNumber(Integer.valueOf(xmlResponse));
			exchange.getIn().setBody(retorno);

		} else {
			throw new Exception("Resposta do serviço está vazia.");
		}
		*/	
	}

}
