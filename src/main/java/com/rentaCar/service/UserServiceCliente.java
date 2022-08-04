/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rentaCar.service;

import com.rentaCar.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jason Quiros
 */


@Service
public class UserServiceCliente implements UserDetailsService{
    
    @Autowired
    public IClienteService clienteService;
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Cliente cliente = this.clienteService.findBycorreo(username);
        UserPrincipalCliente userPrincipalCliente = new UserPrincipalCliente(cliente);
        return userPrincipalCliente;
    }
    
}

