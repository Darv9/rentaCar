package com.rentaCar.repository;

import com.rentaCar.entity.DetalleRenta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dayanna Rojas
 */
@Repository
public interface DetalleRentaRepository extends CrudRepository<DetalleRenta,Long>{
    
}
