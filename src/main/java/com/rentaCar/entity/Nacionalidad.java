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
    private long idNacionalidad;
    private String nom_Nacionalidad;

    public long getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(long idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public String getNom_Nacionalidad() {
        return nom_Nacionalidad;
    }

    public void setNom_Nacionalidad(String nom_Nacionalidad) {
        this.nom_Nacionalidad = nom_Nacionalidad;
    }
   
}
