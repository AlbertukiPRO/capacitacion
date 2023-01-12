package com.example.capacitacion.services;

import java.util.Map;

public interface ClienteServices {

    Map<String, Object> getListClients();
    Map<String, Object> insertcliente(Map<String, Object> datos);

}
