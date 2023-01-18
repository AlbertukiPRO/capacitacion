package com.example.capacitacion.services.impl;

import com.example.capacitacion.model.ClienteDTO;
import com.example.capacitacion.model.ClienteVO;
import com.example.capacitacion.repository.ClienteRepository;
import com.example.capacitacion.services.ClienteServices;
import com.example.capacitacion.utils.Utilidades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ClienteServiceImpl implements ClienteServices {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<ClienteDTO> getListClients() {

        List<ClienteVO> clienteVOS = clienteRepository.findAll();
        List<ClienteDTO> clienteDTOList = new ArrayList<>();

        clienteVOS.forEach(e -> clienteDTOList.add(new ClienteDTO(e.getId(), e.getCorreo(), e.getNombre(), e.getContrasena(), e.getFecha(), e.getImagen())));

        return clienteDTOList;
    }

    @Override
    public boolean insertcliente(Map<String, Object> datos) {
        boolean flag = false;
        try {
            ClienteVO clienteVO = new ClienteVO();
            clienteVO.setId(null);
            clienteVO.setCorreo(datos.get("correo").toString());
            clienteVO.setContrasena(Utilidades.encryp(datos.get("contrasena").toString()));
            clienteVO.setFecha(new Date());
            clienteVO.setImagen(datos.get("img").toString());
            clienteVO.setNombre(datos.get("nombre").toString());


            flag = true;
            clienteRepository.save(clienteVO);
//            data = Utils.response200OK(flag);

        }catch (Exception e){
            System.out.println(e.getCause().toString());
        }

        return flag;
    }

    @Override
    public boolean updateCliente(String id, Map<String, Object> datostoUpdate) {
        boolean flag = false;

        try {
            Optional<ClienteVO> clienteVO = clienteRepository.findById(Integer.parseInt(id));

            if ( clienteVO.isPresent() ){
                clienteVO.get().setCorreo( datostoUpdate.get("correo").toString() );
                clienteRepository.save(clienteVO.get());
                flag = true;
            }else throw new Exception();

        }catch (Exception e){
            System.out.println(e.getCause() + e.getMessage());
        }

        return flag;
    }

    @Override
    public boolean deleteCliente(Integer id) {
        boolean flag = false;
        try {
            clienteRepository.deleteById(id);
            flag = true;
        }catch (Exception e){
            System.out.println(e.getCause() + e.getMessage());
        }
        return flag;
    }

    @Override
    public List<ClienteDTO> getClientesByName(String nombre) {

        List<ClienteDTO> clienteDTOList = new ArrayList<>();
        List<ClienteVO> clienteVOList = clienteRepository.findByName(nombre);

        clienteVOList.forEach(e -> {
            clienteDTOList.add(new ClienteDTO(e.getId(), e.getCorreo(), e.getNombre(), e.getContrasena(), e.getFecha(), e.getImagen()));
        });

        return clienteDTOList;
    }

    //1-> endpoint
    //2-> implementacion de los metodos
    //2.1 -> interface
    //2.2 -> implementación
    //3 -> interfaz repo
    //3.1 ≥ implementacion repo.

//    private List<ClienteDTO> listcliente;
//
//    @PostConstruct // depues de inyectar la clase ejecuta esto
//    public void initDB(){
//        listcliente = new ArrayList<>();
//    }
//
//    @Override
//    public Map<String, Object> getListClients() {
//
//        Map<String, Object> response = new HashMap<>();
//
//        response.put("responsecode", "200");
//        response.put("message", "lista encontrada");
//        response.put("values", listcliente );
//
//        return response;
//
//    }
//
//    @Override
//    public Map<String, Object> insertcliente(Map<String, Object> datos) {
//
//        Date fecha = new Date();
//
//        this.listcliente.add(new ClienteDTO(
//                Integer.parseInt(datos.get("idcliente").toString()),
//                datos.get("correo").toString(),
//                datos.get("contrasena").toString(),
//                fecha
//        ));
//
//        Map<String, Object> response = new HashMap<>();
//        response.put("code", "200");
//        return response;
//    }


}
