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
    private char modelo;
    private int annio;
    private char color;
    private char marca;
    private char descripcionvehiculo;
    private char material;
    private char tipomotor;
    private int kilometraje;
    private int numpuertas;
    private int numasientos;
    private long preciorenta;

    public long getIdvehiculo() {
        return idvehiculo;
    }

    public void setIdvehiculo(long idvehiculo) {
        this.idvehiculo = idvehiculo;
    }

    public char getModelo() {
        return modelo;
    }

    public void setModelo(char modelo) {
        this.modelo = modelo;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public char getMarca() {
        return marca;
    }

    public void setMarca(char marca) {
        this.marca = marca;
    }

    public char getDescripcionvehiculo() {
        return descripcionvehiculo;
    }

    public void setDescripcionvehiculo(char descripcionvehiculo) {
        this.descripcionvehiculo = descripcionvehiculo;
    }

    public char getMaterial() {
        return material;
    }

    public void setMaterial(char material) {
        this.material = material;
    }

    public char getTipomotor() {
        return tipomotor;
    }

    public void setTipomotor(char tipomotor) {
        this.tipomotor = tipomotor;
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

    public void setPreciorenta(long preciorenta) {
        this.preciorenta = preciorenta;
    }
    
   
}
    