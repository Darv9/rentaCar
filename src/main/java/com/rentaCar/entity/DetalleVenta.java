/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rentaCar.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Diego Segura Vega
 */
@Entity
@Table(name = "DetalleVenta")
public class DetalleVenta implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idventa;
    private int cantvehiculosvendidos;
    private int precioventa ;

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public int getCantvehiculosvendidos() {
        return cantvehiculosvendidos;
    }

    public void setCantvehiculosvendidos(int cantvehiculosvendidos) {
        this.cantvehiculosvendidos = cantvehiculosvendidos;
    }

    public int getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(int precioventa) {
        this.precioventa = precioventa;
    }
    
    
}
