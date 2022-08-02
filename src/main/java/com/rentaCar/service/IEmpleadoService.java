/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rentaCar.service;

import com.rentaCar.entity.Empleado;
import java.util.List;

/**
 *
 * @author Diego Segura Vega
 */
public interface IEmpleadoService {

    public List<Empleado> getAllEmpleado();
    public Empleado getEmpleadoById(long idEmpleado);
    public void saveEmpleado(Empleado empleado);
    public void delete(long idEmpleado);
    public Empleado findByNombre(String nombre);
}
