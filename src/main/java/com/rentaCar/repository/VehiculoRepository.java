package com.rentaCar.repository;

import com.rentaCar.entity.Vehiculo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jason Quiros
 */
@Repository
public interface VehiculoRepository extends CrudRepository<Vehiculo,Long>{
}