package com.rentaCar.repository;
import com.rentaCar.entity.Nacionalidad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dayanna Rojas
 */
@Repository
public interface NacionalidadRepository extends CrudRepository<Nacionalidad, Long>{
   
}
