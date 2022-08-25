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
@Table(name = "vehiculo")
public class Vehiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idvehiculo;
    private String modelo;
    private int annio;
    private String color;
    private String marca;
    private String descripcionvehiculo;
    private String material;
    private String tipomotor;
    private int kilometraje;
    private int numpuertas;
    private int numasientos;
    private int preciorenta;

    public long getIdvehiculo() {
        return idvehiculo;
    }

    public void setIdvehiculo(long idvehiculo) {
        this.idvehiculo = idvehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcionvehiculo() {
        return descripcionvehiculo;
    }

    public void setDescripcionvehiculo(String descripcionvehiculo) {
        this.descripcionvehiculo = descripcionvehiculo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipomotor() {
        return tipomotor;
    }

    public void setTipomotor(String tipomotor) {
        this.tipomotor = tipomotor;
    }
    

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }


    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getNumpuertas() {
        return numpuertas;
    }

    public void setNumpuertas(int numpuertas) {
        this.numpuertas = numpuertas;
    }

    public int getNumasientos() {
        return numasientos;
    }

    public void setNumasientos(int numasientos) {
        this.numasientos = numasientos;
    }

    public long getPreciorenta() {
        return preciorenta;
    }

    public void setPreciorenta(int preciorenta) {
        this.preciorenta = preciorenta;
    }
    
   
}
    