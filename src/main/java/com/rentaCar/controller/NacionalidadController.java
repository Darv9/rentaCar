package com.rentaCar.controller;
import com.rentaCar.entity.Nacionalidad;
import com.rentaCar.service.INacionalidadService;
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
public class NacionalidadController {
    
    @Autowired
    private INacionalidadService nacionalidadService;

    @GetMapping("/nacionalidad")
    public String indexNacionalidad(Model model) {
        List<Nacionalidad> listaNacionalidad = nacionalidadService.getAllNacionalidad();
        model.addAttribute("titulo", "Tabla Nacionalidad");
        model.addAttribute("nacionalidad", listaNacionalidad);
        return "nacionalidad";
    }

    @GetMapping("/nacionalidadN")
    public String crearNacionalidad(Model model) {
        model.addAttribute("nacionalidad", new Nacionalidad());
        return "crearNacionalidad";
    }

    @PostMapping("/saveNacionalidad")
    public String guardarNacionalidad(@ModelAttribute Nacionalidad nacionalidad) {
        nacionalidadService.saveNacionalidad(nacionalidad);
        return "redirect:/nacionalidad";
    }

    @GetMapping("/editNacionalidad/{idnacionalidad}")
    public String editarNacionalidad(@PathVariable("idnacionalidad") Long idNacionalidad, Model model) {
        Nacionalidad nacionalidad = nacionalidadService.getNacionalidadById(idNacionalidad);
        model.addAttribute("nacionalidad", nacionalidad);
        return "crearNacionalidad";
    }
    
    @GetMapping("/deleteNacionalidad/{idnacionalidad}")
    public String deleteCliente(@PathVariable("idnacionalidad") Long idNacionalidad) {
        nacionalidadService.deleteNacionalidad(idNacionalidad);
        return "redirect:/nacionalidad";
    }
}


