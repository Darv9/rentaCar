/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rentaCar.service;


import com.rentaCar.entity.DetalleVenta;
import java.util.List;

/**
 *
 * @author Diego Segura Vega
 */
public interface IDetalleVentaService {
    public List<DetalleVenta> getAllDetalleVenta();
    public DetalleVenta getDetalleVentaById(long idventa);
    public void saveDetalleVenta(DetalleVenta detalleVenta);
    public void delete(long idventa);
}
