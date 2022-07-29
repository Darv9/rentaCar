package com.rentaCar.service;


import com.rentaCar.entity.DetalleRenta;
import com.rentaCar.repository.DetalleRentaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Dayanna Rojas
 */
@Service
 public class DetalleRentaService implements IDetalleRentaService{
    
     @Autowired
      private DetalleRentaRepository detalleRentaRepository;

    @Override
    public List<DetalleRenta> getAllDetalleRenta() {
        return (List<DetalleRenta>)detalleRentaRepository.findAll();
    }

    @Override
    public DetalleRenta getDetalleRentaById(long idrenta) {
         return detalleRentaRepository.findById(idrenta).orElse(null);
    }

    @Override
    public void saveDetalleRenta(DetalleRenta detalleRenta) {
        detalleRentaRepository.save(detalleRenta); 
    }

    @Override
    public void delete(long idrenta) {
         detalleRentaRepository.deleteById(idrenta);
    }
   
}
