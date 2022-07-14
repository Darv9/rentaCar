package com.rentaCar.repository;

import com.rentaCar.entity.Reclamo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jason Quiros
 */
@Repository
public interface ReclamoRepository extends CrudRepository<Reclamo,Long>{
    
}