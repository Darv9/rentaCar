/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rentaCar.controller;

import com.rentaCar.entity.Empleado;
import com.rentaCar.entity.Nacionalidad;
import com.rentaCar.service.IEmpleadoService;
import com.rentaCar.service.INacionalidadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class EmpleadoController {
  
   
    @Autowired
    private INacionalidadService nacionalidadService;
    
    @Autowired
    private IEmpleadoService empleadoService;

    @GetMapping("/empleado")
    public String indexEmpleado(Model model) {
        List<Empleado> listaEmpleado = empleadoService.getAllEmpleado();
        model.addAttribute("titulo", "Tabla Empleado");
        model.addAttribute("empleado", listaEmpleado);
        return "empleado";
    }
    
    @GetMapping("/empleadoN")
    public String agregarEmpleado (Model model){
        List<Nacionalidad> listaNacionalidades = nacionalidadService.listNacionalidad();
        model.addAttribute("nacionalidades", listaNacionalidades);
        model.addAttribute("empleado",new Empleado());
        return "crearEmpleado";
    }

    @GetMapping("/editEmpleado/{idempleado}")
    public String editarVehiculo(@PathVariable("idempleado") Long idempleado, Model model) {
        List<Nacionalidad> listaNacionalidades = nacionalidadService.listNacionalidad();
        Empleado empleado = empleadoService.getEmpleadoById(idempleado);
        model.addAttribute("nacionalidades", listaNacionalidades);
        model.addAttribute("empleado", empleado);
        return "crearEmpleado";
    }

    @GetMapping("/deleteEmpleado/{idempleado}")
    public String delete(@PathVariable("idempleado") Long idEmpleado) {
        empleadoService.delete(idEmpleado);
        return "redirect:/empleado";
    }

    @PostMapping("/saveEmpleado")
    public String guardarVehiculo(@ModelAttribute Empleado empleado) {
        empleadoService.saveEmpleado(empleado);
        return "redirect:/empleado";
    }
}


