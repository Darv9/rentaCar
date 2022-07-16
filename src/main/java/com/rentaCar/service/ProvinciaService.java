package com.rentaCar.service;

import com.rentaCar.entity.Provincia;
import com.rentaCar.repository.ProvinciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaService implements IProvinciaService{
    
    @Autowired
    private ProvinciaRepository provinciaRepository;

    @Override
    public List<Provincia> listProvincia() {
        return (List<Provincia>)provinciaRepository.findAll();
    }
    
    
}
