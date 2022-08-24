/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rentaCar.service;

import com.rentaCar.entity.Empleado;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author Dayanna Rojas
 */
public class UserPrincipalEmpleado implements UserDetails{
   private Empleado empleado;
    
    public UserPrincipalEmpleado(Empleado empleado){
        this.empleado=empleado;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
       List<GrantedAuthority> authorities= new ArrayList<>();
       
       // Extract list of permissions(name)
      this.empleado.getPermissionList().forEach(p -> {
        GrantedAuthority authority= new SimpleGrantedAuthority(p);
        authorities.add(authority);
    });
    
    this.empleado.getRoleList().forEach(r -> {
        GrantedAuthority authority= new SimpleGrantedAuthority("ROLE_" + r);
        authorities.add(authority);
    });
    return authorities;
    }

    @Override
    public String getPassword() {
      return this.empleado.getPassword();
    }

    @Override
    public String getUsername() {
      return this.empleado.getCorreo();
    }

    @Override
    public boolean isAccountNonExpired() {
       return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
       return this.empleado.getActive()== 1;
    }
}

   

