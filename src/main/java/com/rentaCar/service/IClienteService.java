package com.rentaCar.service;

import com.rentaCar.entity.Cliente;
import java.util.List;

public interface IClienteService {
    public List<Cliente> getAllCliente();
    public Cliente getClienteById(long idCliente);
    public void saveCliente(Cliente cliente);
    public void deleteCliente(long id);
    public Cliente findByNombre (String correo);
}
