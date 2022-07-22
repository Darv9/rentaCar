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
    public List<Nacionalidad> getAllNacionalidad() {
     return (List<Nacionalidad>)nacionalidadRepository.findAll();
    }

    @Override
    public Nacionalidad getNacionalidadById(long idNacionalidad) {
        return nacionalidadRepository.findById(idNacionalidad).orElse(null);
    }

    @Override
    public void saveNacionalidad(Nacionalidad nacionalidad) {
      nacionalidadRepository.save(nacionalidad);
    }

    @Override
    public void deleteNacionalidad(long id) {
       nacionalidadRepository.deleteById(id);
    }

}
