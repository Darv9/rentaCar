package com.rentaCar.service;

import com.rentaCar.entity.Cliente;
import com.rentaCar.repository.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    
@Service
public class ClienteService implements IClienteService{
    
    @Autowired
    private ClienteRepository ClienteRepository;

    @Override
    public List<Cliente> getAllCliente() {
        return (List<Cliente>)ClienteRepository.findAll();
    }

    @Override
    public Cliente getClienteById(long id) {
        return ClienteRepository.findById(id).orElse(null);
    }

    @Override
    public void saveCliente(Cliente cliente) {
        ClienteRepository.save(cliente);
    }

    @Override
    public void deleteCliente(long idcliente) {
        ClienteRepository.deleteById(idcliente);
    }
   
    @Override
    public Cliente findByNombre(String nombre) {
           return ClienteRepository.findByCorreo(nombre);
    }

    @Override
    public Cliente findBycorreo(String correo) {
      return ClienteRepository.findByCorreo(correo);
    }
}