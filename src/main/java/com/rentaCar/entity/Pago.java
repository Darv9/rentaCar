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
 * @author Jason Quiros
 */
@Entity
@Table(name = "pago")
public class Pago implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idPago;
    private int id;
    private char fecha;
    private int numeroTarjeta;
    private char fechaExp;
    private int monto;
    private int idrenta;

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getFecha() {
        return fecha;
    }

    public void setFecha(char fecha) {
        this.fecha = fecha;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public char getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(char fechaExp) {
        this.fechaExp = fechaExp;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getIdrenta() {
        return idrenta;
    }

    public void setIdrenta(int idrenta) {
        this.idrenta = idrenta;
    }

}
