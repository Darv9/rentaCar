/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rentaCar.service;


import com.rentaCar.entity.DetalleVenta;
import com.rentaCar.repository.DetalleVentaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Diego Segura Vega
 */
 @Service
public class DetalleVentaService implements IDetalleVentaService {
     
     @Autowired
      private DetalleVentaRepository detalleVentaRepository;

     @Override
    public List<DetalleVenta> getAllDetalleVenta() {
        return (List<DetalleVenta>)detalleVentaRepository.findAll();
    }

     @Override
    public DetalleVenta getDetalleVentaById(long idventa) {
         return detalleVentaRepository.findById(idventa).orElse(null);
    }

     @Override
    public void saveDetalleVenta(DetalleVenta detalleVenta) {
        detalleVentaRepository.save(detalleVenta); 
    }

    @Override
    public void delete(long idventa) {
         detalleVentaRepository.deleteById(idventa);
    }

     
}
