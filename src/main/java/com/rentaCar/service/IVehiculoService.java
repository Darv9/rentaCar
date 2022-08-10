package com.rentaCar.service;

import com.rentaCar.entity.Vehiculo;
import java.util.List;

/**
 *
 * @author Jason Quiros
 */
public interface IVehiculoService {
    public List<Vehiculo> getAllVehiculo();
    public Vehiculo getVehiculoById(long idvehiculo);
    public void saveVehiculo(Vehiculo vehiculo);
    public void deletevehiculo(long idvehiculo);
    public List<Vehiculo> getSelectedVehiculoById(long idvehiculo);
}
