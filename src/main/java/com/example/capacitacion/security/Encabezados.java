package com.example.capacitacion.security;

import jakarta.servlet.http.HttpServletResponse;

public enum Encabezados {

    ACAO("Access-Control-Allow-Origin" ),
    ACAM("Access-Control-Allow-Methods"),
    ACAH("Access-Control-Allow-Headers");
    String valor;

    Encabezados(String value){
        this.valor = value;
    }
}
