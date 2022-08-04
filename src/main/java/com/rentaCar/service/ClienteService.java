package com.rentaCar.service;

import com.rentaCar.entity.Cliente;
import com.rentaCar.repository.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    
@Service
public class ClienteService implements IClienteService{
    
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> getAllCliente() {
        return (List<Cliente>)clienteRepository.findAll();
    }

    @Override
    public Cliente getClienteById(long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public void saveCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public void deleteCliente(long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public Cliente findByNombre(String correo) {
        return clienteRepository.findByNombre(correo);
    }
}