package com.rentaCar.service;

import com.rentaCar.entity.Reclamo;
import com.rentaCar.repository.ReclamoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





    
@Service
public class ReclamoService implements IReclamoService{
    
    @Autowired
    private ReclamoRepository reclamoRepository;

    @Override
    public List<Reclamo> getAllReclamo() {
        return (List<Reclamo>)reclamoRepository.findAll();
    }

    @Override
    public Reclamo getReclamoById(long idreclamo) {
        return reclamoRepository.findById(idreclamo).orElse(null);
    }

    @Override
    public void saveReclamo(Reclamo reclamo) {
        reclamoRepository.save(reclamo);
    }

    @Override
    public void deletereclamo(long idreclamo) {
        reclamoRepository.deleteById(idreclamo);
    }

    
}
