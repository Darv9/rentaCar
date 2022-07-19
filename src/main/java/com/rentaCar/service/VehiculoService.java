package com.rentaCar.service;

import com.rentaCar.entity.Vehiculo;
import com.rentaCar.repository.VehiculoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





    
@Service
public class VehiculoService implements IVehiculoService{
    
    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public List<Vehiculo> getAllVehiculo() {
        return (List<Vehiculo>)vehiculoRepository.findAll();
    }

    @Override
    public Vehiculo getVehiculoById(long idvehiculo) {
        return vehiculoRepository.findById(idvehiculo).orElse(null);
    }

    @Override
    public void saveVehiculo(Vehiculo vehiculo) {
        vehiculoRepository.save(vehiculo);
    }

    @Override
    public void deletevehiculo(long idvehiculo) {
        vehiculoRepository.deleteById(idvehiculo);
    }

    
}
