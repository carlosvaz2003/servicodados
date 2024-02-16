package com.governo.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor  
@AllArgsConstructor
public class Uf{
    private String sigla;
    private String nomeUF;
}
