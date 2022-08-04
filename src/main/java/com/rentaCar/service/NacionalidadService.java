package com.rentaCar.service;

import com.rentaCar.entity.Nacionalidad;
import com.rentaCar.repository.NacionalidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dayanna Rojas
 */
@Service
public class NacionalidadService implements INacionalidadService{
  
    @Autowired
    private NacionalidadRepository nacionalidadRepository;

    @Override
    public List<Nacionalidad> listNacionalidad() {
        return (List<Nacionalidad>)nacionalidadRepository.findAll();
    }

    

}
