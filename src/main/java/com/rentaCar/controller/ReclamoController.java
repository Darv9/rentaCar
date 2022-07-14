/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rentaCar.controller;

import com.rentaCar.entity.Reclamo;
import com.rentaCar.service.IReclamoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class ReclamoController {
   
    @Autowired
    private IReclamoService reclamoService;

    @GetMapping("/reclamo")
    public String index(Model model) {
        List<Reclamo> listaReclamo = reclamoService.getAllReclamo();
        model.addAttribute("titulo", "Tabla Reclamo");
        model.addAttribute("reclamo", listaReclamo);
        return "reclamo";
    }
    
    @GetMapping("/reclamoN")
    public String agregarReclamo (Model model){
        model.addAttribute("reclamo",new Reclamo());
        return "crearReclamo";
    }

    @GetMapping("/editreclamo/{idreclamo}")
    public String editarReclamo(@PathVariable("idreclamo") Long idreclamo, Model model) {
        Reclamo reclamo = reclamoService.getReclamoById(idreclamo);
        model.addAttribute("reclamo", reclamo);
        return "crearReclamo";
    }

    @GetMapping("/delete/{idreclamo}")
    public String delete(@PathVariable("idreclamo") Long idreclamo) {
        reclamoService.delete(idreclamo);
        return "redirect:/reclamo";
    }

    @PostMapping("/saveReclamo")
    public String guardarReclamo(@ModelAttribute Reclamo reclamo) {
        reclamoService.saveReclamo(reclamo);
        return "redirect:/reclamo";
    }
}

