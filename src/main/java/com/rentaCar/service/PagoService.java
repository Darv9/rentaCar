/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rentaCar.service;

import com.rentaCar.entity.Pago;
import com.rentaCar.repository.PagoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jason Quiros
 */

    
@Service
public class PagoService implements IPagoService{
    
    @Autowired
    private PagoRepository pagoRepository;

    @Override
    public List<Pago> listPago() {
        return (List<Pago>)pagoRepository.findAll();
    }

    @Override
    public void savePago(Pago pago) {
        pagoRepository.save(pago);
    }

    @Override
    public void delete(Long idpago) {
        pagoRepository.deleteById(idpago);
    }

    @Override
    public Pago getPagoById(Long idpago) {
        return pagoRepository.findById(idpago).orElse(null);
    }

    @Override
    public List<Pago> getAllPago() {
        return (List<Pago>)pagoRepository.findAll(); }
    
    
}