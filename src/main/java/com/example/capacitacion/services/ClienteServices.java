package com.example.capacitacion.services;

import com.example.capacitacion.model.ClienteDTO;
import mx.softitlan.utils.ResponseBody;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface ClienteServices {

    ResponseBody<List<ClienteDTO>> getListClients();
    boolean insertcliente(Map<String, Object> datos);

}
