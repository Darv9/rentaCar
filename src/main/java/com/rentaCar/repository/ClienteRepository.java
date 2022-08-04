package com.rentaCar.repository;

import com.rentaCar.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{

    public Cliente findByCorreo(String correo);
}
