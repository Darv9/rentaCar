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
 * @author Dayanna Rojas
 */
@Entity
@Table(name = "detallerenta")
public class DetalleRenta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long idDetalleRenta;
    private long idRenta;
    private long idVehiculo;
    private int cantVehiculos;
    private int diasRenta;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaRentaDev;
    private long idTipoSeguro;
    private int precioVehiculoUnit;
    private int precioRenta ;
    
  
   
 

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdDetalleRenta() {
        return idDetalleRenta;
    }

    public void setIdDetalleRenta(long idDetalleRenta) {
        this.idDetalleRenta = idDetalleRenta;
    }

    public long getIdRenta() {
        return idRenta;
    }

    public void setIdRenta(long idRenta) {
        this.idRenta = idRenta;
    }

    public long getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(long idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getCantVehiculos() {
        return cantVehiculos;
    }

    public void setCantVehiculos(int cantVehiculos) {
        this.cantVehiculos = cantVehiculos;
    }

    public int getDiasRenta() {
        return diasRenta;
    }

    public void setDiasRenta(int diasRenta) {
        this.diasRenta = diasRenta;
    }

    public Date getFechaRentaDev() {
        return fechaRentaDev;
    }

    public void setFechaRentaDev(Date fechaRentaDev) {
        this.fechaRentaDev = fechaRentaDev;
    }

    public long getIdTipoSeguro() {
        return idTipoSeguro;
    }

    public void setIdTipoSeguro(long idTipoSeguro) {
        this.idTipoSeguro = idTipoSeguro;
    }

    public int getPrecioVehiculoUnit() {
        return precioVehiculoUnit;
    }

    public void setPrecioVehiculoUnit(int precioVehiculoUnit) {
        this.precioVehiculoUnit = precioVehiculoUnit;
    }

    public int getPrecioRenta() {
        return precioRenta;
    }

    public void setPrecioRenta(int precioRenta) {
        this.precioRenta = precioRenta;
    }

  
    
}
