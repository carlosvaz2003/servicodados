package com.governo.api.util;

import java.io.StringReader;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Util {
	
	
	public static String motaXmlRenovacao(String numeroApolice, String susep) {
		
        StringBuilder xmlRenovacao = new StringBuilder();
        xmlRenovacao.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        xmlRenovacao.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:v1=\"http://www.portoseguro.com.br/ramoselementares/comum/renovacaointegrationservice/v1_0\">\n");
        xmlRenovacao.append("   <soapenv:Header />\n");
        xmlRenovacao.append("   <soapenv:Body>\n");
        xmlRenovacao.append("      <v1:obterDadosRenovacaoRequest>\n");
        xmlRenovacao.append("         <v1:numeroApoliceAnterior>").append(numeroApolice).append("</v1:numeroApoliceAnterior>\n");
        xmlRenovacao.append("         <v1:susep>").append(susep).append("</v1:susep>\n");
        xmlRenovacao.append("         <v1:flagRenovacaoComTransferenciaCorretagem>N</v1:flagRenovacaoComTransferenciaCorretagem>\n");
        xmlRenovacao.append("      </v1:obterDadosRenovacaoRequest>\n");
        xmlRenovacao.append("   </soapenv:Body>\n");
        xmlRenovacao.append("</soapenv:Envelope>\n");
        
        return xmlRenovacao.toString();
		
	}
	public static String montaXmlApolice(String apolice) {
		StringBuilder xmlApolice = new StringBuilder();
		xmlApolice.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		xmlApolice.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:v1=\"http://www.portoseguro.com.br/ramoselementares/emissao/documentoemissaoservice/v1_0\">\n");
		xmlApolice.append("   <soapenv:Header />\n");
		xmlApolice.append("   <soapenv:Body>\n");
		xmlApolice.append("      <v1:listarDocumentoEmissaoPorIdRequest Skip=\"0\" Top=\"10\">\n");
		xmlApolice.append("         <v1:numeroApolice>").append(apolice.substring(0, 16)).append("</v1:numeroApolice>\n");
		xmlApolice.append("         <v1:codigoTipoDocumento>A</v1:codigoTipoDocumento>\n");
		xmlApolice.append("         <v1:indicadorRetornaOrcamento>N</v1:indicadorRetornaOrcamento>\n");
		xmlApolice.append("         <v1:indicadorRetornaProposta>S</v1:indicadorRetornaProposta>\n");
		xmlApolice.append("         <v1:indicadorRetornaApolice>S</v1:indicadorRetornaApolice>\n");
		xmlApolice.append("      </v1:listarDocumentoEmissaoPorIdRequest>\n");
		xmlApolice.append("   </soapenv:Body>\n");
		xmlApolice.append("</soapenv:Envelope>\n");
		
		return xmlApolice.toString();
		
	}
	public static String montaXmlOrcamento(String orcamento) {
		
	       StringBuilder xmlOrcamento = new StringBuilder();
	       xmlOrcamento.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
	       xmlOrcamento.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:v1=\"http://www.portoseguro.com.br/ramoselementares/emissao/documentoemissaoservice/v1_0\">\n");
	       xmlOrcamento.append("   <soapenv:Header />\n");; 
	       xmlOrcamento.append("   <soapenv:Body>\n");
	       xmlOrcamento.append("      <v1:buscarDocumentoEmissaoPorIdRequest>\n");
	       xmlOrcamento.append("         <v1:numeroOrcamento>").append(orcamento).append("</v1:numeroOrcamento>\n");
	       xmlOrcamento.append("         <v1:codigoTipoDocumento>O</v1:codigoTipoDocumento>\n");
	       xmlOrcamento.append("         <v1:indicadorRetornaOrcamento>S</v1:indicadorRetornaOrcamento>\n");
	       xmlOrcamento.append("         <v1:indicadorRetornaProposta>S</v1:indicadorRetornaProposta>\n");
	       xmlOrcamento.append("         <v1:indicadorRetornaApolice>S</v1:indicadorRetornaApolice>\n");
	       xmlOrcamento.append("      </v1:buscarDocumentoEmissaoPorIdRequest>\n");
	       xmlOrcamento.append("   </soapenv:Body>\n");
	       xmlOrcamento.append("</soapenv:Envelope>\n");
	       
	       return xmlOrcamento.toString();
	}
	public static String montaXmlProposta(String numeroProposta) {
		
        StringBuilder xmlProposta = new StringBuilder();
        xmlProposta.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        xmlProposta.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:v1=\"http://www.portoseguro.com.br/ramoselementares/emissao/documentoemissaoservice/v1_0\">\n");
        xmlProposta.append("   <soapenv:Header />\n");
        xmlProposta.append("   <soapenv:Body>\n");
        xmlProposta.append("      <v1:buscarDocumentoEmissaoPorIdRequest>\n");
        xmlProposta.append("         <v1:numeroProposta>").append(numeroProposta).append("</v1:numeroProposta>\n");
        xmlProposta.append("         <v1:codigoTipoDocumento>O</v1:codigoTipoDocumento>\n");
        xmlProposta.append("         <v1:indicadorRetornaOrcamento>S</v1:indicadorRetornaOrcamento>\n");
        xmlProposta.append("         <v1:indicadorRetornaProposta>S</v1:indicadorRetornaProposta>\n");
        xmlProposta.append("         <v1:indicadorRetornaApolice>S</v1:indicadorRetornaApolice>\n");
        xmlProposta.append("      </v1:buscarDocumentoEmissaoPorIdRequest>\n");
        xmlProposta.append("   </soapenv:Body>\n");
        xmlProposta.append("</soapenv:Envelope>\n");
        
        return xmlProposta.toString();
	}
	
    public static <T> T unmarshalXml(String xml, Class<T> clazz) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        return clazz.cast(jaxbUnmarshaller.unmarshal(new StringReader(xml)));
    }
}
