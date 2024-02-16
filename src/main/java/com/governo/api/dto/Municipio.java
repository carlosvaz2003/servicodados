package com.governo.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor  
@AllArgsConstructor
public class Municipio{
    private String nomeMunicipio;
    private String geocodigo;
    private Uf uf;
}
