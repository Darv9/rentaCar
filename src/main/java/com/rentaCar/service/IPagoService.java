/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rentaCar.service;

import com.rentaCar.entity.Pago;
import java.util.List;

/**
 *
 * @author Reception - Cameras
 */
public interface IPagoService {
    public List<Pago> listPago();

    public void savePago(Pago pago);

    public void delete(Long idpago);

    public Pago getPagoById(Long idpago);

    public List<Pago> getAllPago();
    
}
