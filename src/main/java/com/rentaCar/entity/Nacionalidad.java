package com.rentaCar.entity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Dayanna Rojas
 */

@Entity
@Table (name = "nacionalidad")
public class Nacionalidad implements Serializable{
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idnacionalidad;
    private String nacionalidad;

    public long getIdnacionalidad() {
        return idnacionalidad;
    }

    public void setIdnacionalidad(long idnacionalidad) {
        this.idnacionalidad = idnacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
   
    
}
