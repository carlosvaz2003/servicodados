package com.governo.api.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RotaIbge extends RouteBuilder{
	

    @Override
    public void configure() throws Exception {    
        
        // Definindo a rota para a chamada REST com Jetty
        from("jetty:http://localhost:8081/api/v1/bdg/estacoes")
        .routeId("restEndpointRoute")
        .process(exchange -> {
        	
            String codigo = exchange.getIn().getHeader("codigo", String.class);
            
            String ibgeResponse = exchange.getContext()
                    .createProducerTemplate()
                    .requestBody("direct:ibge", codigo, String.class);
            
            exchange.getMessage().setBody(ibgeResponse);
            exchange.getMessage().setHeader("Content-Type", "text/plain; charset=UTF-8");
        });

    from("direct:ibge")
        .routeId("ibgeEndpointRoute")
        .process(exchange -> {
            // Obter o código da estação
            String codigo = exchange.getIn().getBody(String.class);
            // Chamada ao serviço REST IBGE para obter informações sobre as estações
            String ibgeResponse = exchange.getContext()
                    .createProducerTemplate()
                    .requestBody("https://servicodados.ibge.gov.br/api/v1/bdg/estacoes/" + codigo, null, String.class);
            
            String toWords = exchange.getContext()
                    .createProducerTemplate()
                    .requestBody("direct:furada", 123, String.class);
            System.out.println("CEP   :" + toWords);
           
            // Definir a resposta da chamada ao IBGE
            exchange.getMessage().setBody(ibgeResponse);
        });

    }
}
