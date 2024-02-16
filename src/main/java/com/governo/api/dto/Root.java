package com.governo.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor  
@AllArgsConstructor
public class Root{
    private String codigoEstacao;
    private String tipoEstacao;
    private String tema;
    private String nomeEstacao;
    private String codigoEstacaoMaterializada;
    private String inscricaoChapa;
    private String dataVisita;
    private String situacao;
    private String descricaoEstacao;
    private double latitude;
    private double longitude;
    private String latitudeGMS;
    private String longitudeGMS;
    private String sigmaLatitude;
    private String sigmaLongitude;
    private String fonteCoordenada;
    private String dataMedicaoCoordenada;
    private String dataCalculoCoordenada;
    private String sistemaReferenciaCoordenada;
    private String altitudeGeometrica;
    private String sigmaAltitudeGeometrica;
    private String fonteAltitudeGeometrica;
    private String altitudeOrtometrica;
    private String altitudeNormal;
    private String fonteAltitude;
    private String dataMedicaoAltitude;
    private String dataCalculoAltitude;
    private String datumAltitude;
    private String sigmaAltitude;
    private String numeroGeopotencial;
    private String valorGravidade;
    private String datumGravidade;
    private String dataMedicaoGravidade;
    private String dataCalculoGravidade;
    private String idAjusteRN;
    private String notaAjusteRN;
    private String localizacao;
    private String itinerario;
    private String observacao;
    private String tipoLocal;
    private Municipio municipio;
}
