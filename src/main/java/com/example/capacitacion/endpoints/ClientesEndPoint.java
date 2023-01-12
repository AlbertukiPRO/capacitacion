package com.example.capacitacion.endpoints;

import com.example.capacitacion.model.ClienteDTO;
import com.example.capacitacion.utils.Utilidades;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RequestMapping("clientes")
@RestController()
public class ClientesEndPoint {

    @GetMapping("/getClientes")
    public List<String> getClientes(){
        List<String> listClientes = new ArrayList<>();
        listClientes.add("Juan");
        listClientes.add("Pedro");
        listClientes.add("Alberto");

        return listClientes;
    }

    @GetMapping("getListClients")
    public List<ClienteDTO> getClientesList(){
        List<ClienteDTO> clienteDTOList = new ArrayList<>();

        Date dateregistro = new Date();

        clienteDTOList.add(
                new ClienteDTO(
                        1452,
                        "nochebeto12@gmail.com",
                        Utilidades.encryp(),
                        dateregistro));

        return clienteDTOList;
    }


    @GetMapping("insertarCliente")
    public Map<String, Object> insertar(@RequestParam() String idcuenta){

        List<ClienteDTO> clienteDTOList = new ArrayList<>();

        ClienteDTO cliente = new ClienteDTO(Integer.parseInt(idcuenta)); //instancia del cliente

        clienteDTOList.add(cliente);

        Map<String, Object> response = new HashMap<>();

        response.put("responsecode", "200");
        response.put("message", "se inserto exitosamente");
        response.put("values", cliente );

        return response;

    }

    @GetMapping("insertarAll")
    public Map<String, Object> insertarAll(@RequestParam() Map<String, Object> datosform){

        return datosform;

    }



}