package com.rentaCar.controller;

import com.rentaCar.entity.DetalleRenta;
import com.rentaCar.service.IDetalleRentaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Dayanna Rojas
 */
@Controller
public class DetalleRentaController {
   
    @Autowired
    private IDetalleRentaService detalleRentaService;

    @GetMapping("/detalleRenta")
    public String index(Model model) {
        List<DetalleRenta> listaDetalleRenta = detalleRentaService.getAllDetalleRenta();
        model.addAttribute("titulo", "Tabla Detalle Renta");
        model.addAttribute("detalleRenta", listaDetalleRenta);
        return "detalleRenta";
    }
    
    @GetMapping("/detalleRentaN")
    public String agregarDetalleRenta (Model model){
        model.addAttribute("detalleRenta",new DetalleRenta());
        return "crearDetalleRenta";
    }

    @GetMapping("/editdetalleRenta/{idrenta}")
    public String editarDetalleRenta(@PathVariable("idrenta") Long idrenta, Model model) {
        DetalleRenta detalleRenta = detalleRentaService.getDetalleRentaById(idrenta);
        model.addAttribute("detalleRenta", detalleRenta);
        return "crearDetalleRenta";
    }

    @GetMapping("/delete/{idrenta}")
    public String delete(@PathVariable("idrenta") Long idrenta) {
        detalleRentaService.delete(idrenta);
        return "redirect:/detalleRenta";
    }

    @PostMapping("/saveDetalleRenta")
    public String guardarDetalleRenta(@ModelAttribute DetalleRenta detalleRenta) {
        detalleRentaService.saveDetalleRenta(detalleRenta);
        return "redirect:/detalleRenta";
    }
}


