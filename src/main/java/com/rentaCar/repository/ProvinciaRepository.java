package com.rentaCar.repository;

import com.rentaCar.entity.Provincia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinciaRepository extends CrudRepository<Provincia,Long>{
    
}
