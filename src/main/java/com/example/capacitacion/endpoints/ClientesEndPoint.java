package com.example.capacitacion.endpoints;

import com.example.capacitacion.model.ClienteDTO;
import com.example.capacitacion.services.ClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("clientes")
@RestController()
public class ClientesEndPoint {

    @Autowired
    private ClienteServices clienteServices;

//    @GetMapping("/getClientes")
//    public List<String> getClientes(){
//        List<String> listClientes = new ArrayList<>();
//        listClientes.add("Juan");
//        listClientes.add("Pedro");
//        listClientes.add("Alberto");
//
//        return listClientes;
//    }
//
//    @GetMapping("getListClients")
//    public List<ClienteDTO> getClientesList(){
//        List<ClienteDTO> clienteDTOList = new ArrayList<>();
//
//        Date dateregistro = new Date();
//
//        clienteDTOList.add(
//                new ClienteDTO(
//                        1452,
//                        "nochebeto12@gmail.com",
//                        Utilidades.encryp(),
//                        dateregistro));
//
//        return clienteDTOList;
//    }
//
//
//    @GetMapping("insertarCliente")
//    public Map<String, Object> insertar(@RequestParam() String idcuenta){
//
//        List<ClienteDTO> clienteDTOList = new ArrayList<>();
//
//        ClienteDTO cliente = new ClienteDTO(Integer.parseInt(idcuenta)); //instancia del cliente
//
//        clienteDTOList.add(cliente);
//
//        Map<String, Object> response = new HashMap<>();
//
//        response.put("responsecode", "200");
//        response.put("message", "se inserto exitosamente");
//        response.put("values", cliente );
//
//        return response;
//
//    }
//
//    /*
//    GOOD
//     */
//    @PostMapping("insertarAll")
//    public Map<String, Object> insertarAll(@RequestParam() Map<String, Object> datosform){
//
//        Map<String , Object> response = new HashMap<>();
//
//        // if ( var instandof String )
//        //    return "no es valido el id"
//        // try {  //intento insertar  }
//        // catch (Exeception e) return " no es valido "+e.getCause()
//
//        List<ClienteDTO> listclientes = new ArrayList<>();
//
//        ClienteDTO nuevoCliente = new ClienteDTO(
//                Integer.parseInt(
//                        Objects.equals(
//                                datosform.get("idcuenta").toString(), "") ? "00000" : datosform.get("idcuenta").toString()
//                )
//        );
//
//        listclientes.add(nuevoCliente);
//
//        response.put("code","200");
//        response.put("message", "Datos insertados correctamente");
//        response.put("values", nuevoCliente);
//
//        return response;
//
//    }

    /* ------------- USO DE SERVICES ----------- */


    @PostMapping("getClientes")
    public List<ClienteDTO> getClientes(){

//        Map<String, Object> response =  clienteServices.getListClients();
//
//        return (List<ClienteDTO>) response.get("values");
        return null;
    }

    @PostMapping("insertCliente")
    public boolean insertar(@RequestParam() Map<String, Object> data ){

      return clienteServices.insertcliente(data);

    }

    @PostMapping("obtenerTodosClientes")
    @CrossOrigin //permitir acceso a externos.
    public List<ClienteDTO> getAllClients(){
        return clienteServices.getListClients();
    }

    @PostMapping("obtenerClientePorNombre")
    public List<ClienteDTO> getClientByName(@RequestParam() String nombre){
        return null;
    }

    @PostMapping("modificarCliente")
    public boolean updateClient(@RequestParam() Map<String, Object> datos){
        return false;
    }

    @PostMapping("eliminarCliente")
    public boolean deleteClient(@RequestParam() String id){
        return false;
    }



}