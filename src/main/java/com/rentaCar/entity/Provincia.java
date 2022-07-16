package com.rentaCar.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "provincias")
public class Provincia implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idprovincias;
    private String provincia;

    public long getIdprovincias() {
        return idprovincias;
    }

    public void setIdprovincias(long idprovincias) {
        this.idprovincias = idprovincias;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    
    
}
