package com.rentaCar.service;

import com.rentaCar.entity.DetalleRenta;
import java.util.List;

/**
 *
 * @author Dayanna Rojas
 */
public interface IDetalleRentaService {
    public List<DetalleRenta> getAllDetalleRenta();
    public DetalleRenta getDetalleRentaById(long idrenta);
    public void saveDetalleRenta(DetalleRenta detalleRenta);
    public void delete(long idrenta);
}
