package com.rentaCar.service;

import com.rentaCar.entity.Nacionalidad;
import java.util.List;

/**
 *
 * @author Dayanna Rojas
 */
public interface INacionalidadService {
    public List<Nacionalidad> listNacionalidad();
    public List<Nacionalidad> getAllNacionalidad();
    public Nacionalidad getNacionalidadById(long idnacionalidad);
    public void saveNacionalidad(Nacionalidad nacionalidad);
    public void deleteNacionalidad(long id);
}
