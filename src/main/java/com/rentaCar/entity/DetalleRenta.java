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
    private long idrenta;
    private long idvehiculo;
    private int cantvehiculos;
    private int diasrenta;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecharenta;
    private long idseguro;
    private int preciovehiculo;
    private int preciorenta ;

    public long getIdrenta() {
        return idrenta;
    }

    public void setIdrenta(long idrenta) {
        this.idrenta = idrenta;
    }

    public long getIdvehiculo() {
        return idvehiculo;
    }

    public void setIdvehiculo(long idvehiculo) {
        this.idvehiculo = idvehiculo;
    }

    public int getCantvehiculos() {
        return cantvehiculos;
    }

    public void setCantvehiculos(int cantvehiculos) {
        this.cantvehiculos = cantvehiculos;
    }

    public int getDiasrenta() {
        return diasrenta;
    }

    public void setDiasrenta(int diasrenta) {
        this.diasrenta = diasrenta;
    }

    public Date getFecharenta() {
        return fecharenta;
    }

    public void setFecharenta(Date fecharenta) {
        this.fecharenta = fecharenta;
    }

    public long getIdseguro() {
        return idseguro;
    }

    public void setIdseguro(long idseguro) {
        this.idseguro = idseguro;
    }

    public int getPreciovehiculo() {
        return preciovehiculo;
    }

    public void setPreciovehiculo(int preciovehiculo) {
        this.preciovehiculo = preciovehiculo;
    }

    public int getPreciorenta() {
        return preciorenta;
    }

    public void setPreciorenta(int preciorenta) {
        this.preciorenta = preciorenta;
    }
    



  
    
}
