package com.example.capacitacion.repository;

import com.example.capacitacion.model.ClienteVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteVO, Integer> {

//    public boolean insertarCliente();
    List<ClienteVO> findAll();
    List<ClienteVO> findByName(@Param("name") String name);

}
