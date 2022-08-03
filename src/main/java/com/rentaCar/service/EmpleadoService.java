/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rentaCar.service;

import com.rentaCar.entity.Empleado;
import com.rentaCar.repository.EmpleadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Diego Segura Vega
 */
@Service
public class EmpleadoService implements IEmpleadoService {

    @Autowired
    private EmpleadoRepository EmpleadoRepository;

    @Override
    public List<Empleado> getAllEmpleado() {
        return (List<Empleado>) EmpleadoRepository.findAll();
    }

    @Override
    public Empleado getEmpleadoById(long idEmpleado) {
        return EmpleadoRepository.findById(idEmpleado).orElse(null);
    }

    @Override
    public void saveEmpleado(Empleado empleado) {
        EmpleadoRepository.save(empleado);
    }

    @Override
    public void delete(long idEmpleado) {
        EmpleadoRepository.deleteById(idEmpleado);
    }

    @Override
    public Empleado findByCorreo(String correo) {
        return EmpleadoRepository.findByCorreo(correo);
    }

}
