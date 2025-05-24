package com.perfulandia.cl.perfulandia.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perfulandia.cl.perfulandia.Model.Sucursal;
import com.perfulandia.cl.perfulandia.Repository.SucursalRepository;

@Service
public class SucursalService {

    @Autowired
    private SucursalRepository sucursalRepository;

    public List<Sucursal> getAllSucursales() {
        return sucursalRepository.findAll();
    }

    public Optional<Sucursal> getSucursalById(Long id) {
        return sucursalRepository.findById(id);
    }

    public Sucursal createSucursal(Sucursal sucursal) {
        return sucursalRepository.save(sucursal);
    }

    public Sucursal updateSucursal(Long id, Sucursal sucursal) {
        if (sucursalRepository.existsById(id)) {
            sucursal.setId(id);
            return sucursalRepository.save(sucursal);
        } else {
            throw new RuntimeException("No existe la sucursal con el id: " + id);
        }
    }

    public void deleteSucursal(Long id) {
        sucursalRepository.deleteById(id);
    }

    public void deleteAllSucursales() {
        sucursalRepository.deleteAll();
    }
}
