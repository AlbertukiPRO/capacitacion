package com.example.capacitacion.services;

import com.example.capacitacion.model.ClienteDTO;

import java.util.List;
import java.util.Map;

public interface ClienteServices {

    List<ClienteDTO> getListClients();
    boolean insertcliente(Map<String, Object> datos);
    boolean updateCliente(String id, Map<String, Object> datostoUpdate);
    boolean deleteCliente(Integer id);

}
