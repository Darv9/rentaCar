/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rentaCar.controller;

import com.rentaCar.entity.Vehiculo;
import com.rentaCar.service.IVehiculoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class VehiculoController {
   
    @Autowired
    private IVehiculoService vehiculoService;

    @GetMapping("/vehiculo")
    public String index(Model model) {
        List<Vehiculo> listaVehiculo = vehiculoService.getAllVehiculo();
        model.addAttribute("titulo", "Tabla Vehiculo");
        model.addAttribute("vehiculo", listaVehiculo);
        return "vehiculo";
    }
    
    @GetMapping("/vehiculoN")
    public String agregarVehiculo (Model model){
        model.addAttribute("vehiculo",new Vehiculo());
        return "crearVehiculo";
    }

    @GetMapping("/editvehiculo/{idvehiculo}")
    public String editarVehiculo(@PathVariable("idvehiculo") Long idvehiculo, Model model) {
        Vehiculo vehiculo = vehiculoService.getVehiculoById(idvehiculo);
        model.addAttribute("vehiculo", vehiculo);
        return "crearVehiculo";
    }

    @PostMapping("/saveVehiculo")
    public String guardarVehiculo(@ModelAttribute Vehiculo vehiculo) {
        vehiculoService.saveVehiculo(vehiculo);
        return "redirect:/vehiculo";
    }
    
    @RequestMapping(value = "/deleteVehiculo/{idvehiculo}", method=RequestMethod.DELETE)
    public String deleteVehiculo(@PathVariable("idvehiculo") Long id ) {
        vehiculoService.deletevehiculo(id);
        return "redirect:/rentaIndex";
    }
    
    @GetMapping("/sparkIndex")
    public String Spark(){
        return "sparkIndex";
    }
    
    @GetMapping("/vitaraIndex")
    public String Vitara(){
        return "vitaraIndex";
    }
    
    @GetMapping("/amarokIndex")
    public String Amarok(){
        return "amarokIndex";
    }
    
    @GetMapping("/accentIndex")
    public String Accent(){
        return "accentIndex";
    }
    
    @GetMapping("/catalogoIndex")
    public String Catalogo(){
        return "catalogo";
    }
    
    @GetMapping("/rentaIndex")
    public String Renta(){
        return "renta";
    }
    
}

