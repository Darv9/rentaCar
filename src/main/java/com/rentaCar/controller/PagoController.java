/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rentaCar.controller;

import com.rentaCar.entity.Pago;
import com.rentaCar.service.IPagoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Jason Quiros
 */
public class PagoController {
 

    
    @Autowired
    private IPagoService pagoService;

    @GetMapping("/detallePago")
    public String index(Model model) {
        List<Pago> listaPago = pagoService.getAllPago();
        model.addAttribute("titulo", "Tabla Pago");
        model.addAttribute("pago", listaPago);
        return "pago";
    }
    
    @GetMapping("/pagoN")
    public String agregarPago (Model model){
        List<Pago> listPago = pagoService.listPago();
        model.addAttribute("pago",new Pago());
        model.addAttribute("pagos", listPago);
        return "crearPago";
    }

    @GetMapping("/editpago/{idPago}")
    public String editarPago(@PathVariable("idpago") Long idpago, Model model) {
        List<Pago> listPago = pagoService.listPago();
        Pago pago = pagoService.getPagoById(idpago);
        model.addAttribute("pago", pago);
        model.addAttribute("pagos", listPago);
        return "crearPago";
    }

    @GetMapping("/deletePago/{idPago}")
    public String delete(@PathVariable("idPago") Long idpago) {
        pagoService.delete(idpago);
        return "redirect:/detallePago";
    }

    @PostMapping("/savePago")
    public String guardarPago(@ModelAttribute Pago pago) {
        pagoService.savePago(pago);
        return "redirect:/detallepago";
    }
}
