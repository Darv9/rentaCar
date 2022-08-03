
package com.rentaCar.repository;

import com.rentaCar.entity.DetalleVenta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Diego Segura Vega
 */

@Repository
public interface DetalleVentaRepository extends CrudRepository<DetalleVenta,Long> {
    
}
