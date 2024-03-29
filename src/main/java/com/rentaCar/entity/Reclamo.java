/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rentaCar.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Jason Quiros
 */

@Entity
@Table(name = "reclamo")
public class Reclamo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idreclamo;
    private long idcliente;
    private int idvehiculo;
    private String fechareclamo;
    private String descripcionreclamo;

    public long getIdreclamo() {
        return idreclamo;
    }

    public void setIdreclamo(long idreclamo) {
        this.idreclamo = idreclamo;
    }

    public long getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(long idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdvehiculo() {
        return idvehiculo;
    }

    public void setIdvehiculo(int idvehiculo) {
        this.idvehiculo = idvehiculo;
    }

    public String getFechareclamo() {
        return fechareclamo;
    }

    public void setFechareclamo(String fechareclamo) {
        this.fechareclamo = fechareclamo;
    }
    
    public String getDescripcionreclamo() {
        return descripcionreclamo;
    }

    public void setDescripcionreclamo(String descripcionreclamo) {
        this.descripcionreclamo = descripcionreclamo;
    }

    

}