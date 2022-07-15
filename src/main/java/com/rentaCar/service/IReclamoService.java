package com.rentaCar.service;

import com.rentaCar.entity.Reclamo;
import java.util.List;

/**
 *
 * @author Jason Quiros
 */
public interface IReclamoService {
    public List<Reclamo> getAllReclamo();
    public Reclamo getReclamoById(long idreclamo);
    public void saveReclamo(Reclamo reclamo);
    public void deletereclamo(long idreclamo);
}
