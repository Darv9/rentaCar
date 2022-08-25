/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rentaCar.service;

import com.rentaCar.entity.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dayanna Rojas
 */
@Service
public class UserServiceEmpleado implements UserDetailsService{
    

    @Autowired
    public IEmpleadoService empleadoService;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Empleado empleado=this.empleadoService.findByCorreo(username);
        UserPrincipalEmpleado userPrincipalEmpleado= new UserPrincipalEmpleado(empleado);
        return userPrincipalEmpleado;
    }
    
}



