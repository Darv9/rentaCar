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
    public Reclamo getReclamoById(long id) {
        return reclamoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveReclamo(Reclamo reclamo) {
        reclamoRepository.save(reclamo);
    }

    public void deleteReclamo(long id) {
        reclamoRepository.deleteById(id);
    }

    @Override
    public void delete(long idreclamo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
