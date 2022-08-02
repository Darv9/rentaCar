/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rentaCar;

import com.rentaCar.service.UserServiceEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 *
 * @author Daniel
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserServiceEmpleado userDetailsService;
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public UserServiceEmpleado getUserService() {
        return new UserServiceEmpleado();
    }
    @Bean
    DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
        daoAuthenticationProvider.setUserDetailsService(getUserService());
        return daoAuthenticationProvider;
    }
    @Bean
    public AuthenticationSuccessHandler appAuthenticationSuccessHandler() {
        return new AppAuthenticationSuccessHandler();
    }
    public SecurityConfig(UserServiceEmpleado userPrincipalDetailsService) {
        this.userDetailsService = userPrincipalDetailsService;
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) {
        auth.authenticationProvider(authenticationProvider());
    }
    //El siguiente método funciona para hacer la autenticación del usuario
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /* http.authorizeRequests()
                .antMatchers("/persona","/login")
                .hasRole("ADMIN")
                .antMatchers("/personasN", "/persona", "/","/login")
                .hasAnyRole("USER", "VENDEDOR", "ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin();    
        */
        http.authorizeRequests()
                .antMatchers("/clientes","/login","/clienteN", "/detalleRenta", "/detalleRentaN", "/reclamo", "/detalleVentaN", "/empleado", "/empleadoN", "/nacionalidad", "/nacionalidadN")
                .hasRole("ADMIN")
                .antMatchers("/clientes", "/","/login")
                .hasAnyRole("USER", "EMPLEADO", "ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login").permitAll().defaultSuccessUrl("/clientes",true);
    }
    //El siguiente método funciona parsa realizar la autorización de accesos
    //i18n
}
