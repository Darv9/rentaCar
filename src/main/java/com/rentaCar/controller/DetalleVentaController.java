/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rentaCar.controller;


import com.rentaCar.entity.DetalleVenta;
import com.rentaCar.service.IDetalleVentaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Diego Segura Vega
 */
public class DetalleVentaController {
    
   @Autowired
    private IDetalleVentaService detalleVentaService;

    @GetMapping("/reclamo")
    public String index(Model model) {
        List<DetalleVenta> listaDetalleVenta = detalleVentaService.getAllDetalleVenta();
        model.addAttribute("titulo", "Tabla Detalle Venta");
        model.addAttribute("detalle Venta", listaDetalleVenta);
        return "detalle venta";
    }
    
    @GetMapping("/detalleVentaN")
    public String agregarDetalleVenta (Model model){
        model.addAttribute("reclamo",new DetalleVenta());
        return "crearDetalleVenta";
    }

    @GetMapping("/editDetalleVenta/{idDetalleVenta}")
    public String editarReclamo(@PathVariable("idDetalleVenta") Long idDetalleVenta, Model model) {
        DetalleVenta detalleVenta = detalleVentaService.getDetalleVentaById(idDetalleVenta);
        model.addAttribute("detalle Venta", detalleVenta);
        return "crearDetalleVenta";
    }

    @GetMapping("/deleteDetalleVenta/{idDetalleVenta}")
    public String delete(@PathVariable("idDetalleVenta") Long idDetalleVenta) {
        detalleVentaService.delete(idDetalleVenta);
        return "redirect:/detalleVenta";
    }

    @PostMapping("/saveDetalleVenta")
    public String guardarDetalleVenta(@ModelAttribute DetalleVenta detalleVenta) {
        detalleVentaService.saveDetalleVenta(detalleVenta);
        return "redirect:/detalleVenta";
    }
}
