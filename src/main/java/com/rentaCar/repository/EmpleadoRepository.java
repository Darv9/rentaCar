/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rentaCar.repository;

import com.rentaCar.entity.Empleado;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Diego Segura Vega
 */
public interface EmpleadoRepository extends CrudRepository<Empleado,Long>{
      Empleado findByCorreo(String correo);
}
