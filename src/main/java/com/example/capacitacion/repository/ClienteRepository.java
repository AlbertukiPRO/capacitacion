package com.example.capacitacion.repository;

import com.example.capacitacion.model.ClienteVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteVO, Integer> {

//    public boolean insertarCliente();
//    public List<ClienteVO> findAll();

}
