package com.rentaCar.controller;

import com.rentaCar.entity.Cliente;
import com.rentaCar.service.IClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ClienteController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes")
    public String indexCliente(Model model) {
        List<Cliente> listaCliente = clienteService.getAllCliente();
        model.addAttribute("titulo", "Tabla Clientes");
        model.addAttribute("clientes", listaCliente);
        return "clientes";
    }

    @GetMapping("/clienteN")
    public String crearCliente(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "crear";
    }

    @PostMapping("/saveCliente")
    public String guardarCliente(@ModelAttribute Cliente cliente) {
        clienteService.saveCliente(cliente);
        return "redirect:/clientes";
    }

    @GetMapping("/editCliente/{id}")
    public String editarCliente(@PathVariable("id") Long id, Model model) {
        Cliente cliente = clienteService.getClienteById(id);
        model.addAttribute("cliente", cliente);
        return "crear";
    }
    
    @GetMapping("/deleteCliente/{id}")
    public String deleteCliente(@PathVariable("id") Long id) {
        clienteService.deleteCliente(id);
        return "redirect:/clientes";
    }
}
