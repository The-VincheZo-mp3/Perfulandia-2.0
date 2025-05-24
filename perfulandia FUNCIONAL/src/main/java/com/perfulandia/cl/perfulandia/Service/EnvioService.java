package com.perfulandia.cl.perfulandia.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perfulandia.cl.perfulandia.Model.Envio;
import com.perfulandia.cl.perfulandia.Repository.EnvioRepository;

@Service
public class EnvioService {
    @Autowired
    private EnvioRepository envioRepository;

    public List<Envio> getAllEnvios() {
        return envioRepository.findAll();
    }

    public Optional<Envio> getEnvioById(Long id) {
        return envioRepository.findById(id);
    }

    public Envio createEnvio(Envio envio) {
        return envioRepository.save(envio);
    }

    public Envio updateEnvio(Long id, Envio envio) {
        if (envioRepository.existsById(id)){
            envio.setId(id);
            return envioRepository.save(envio);

        } else {
            return null;
        }
    }
    
    public void deleteEnvio(Long id) {
        envioRepository.deleteById(id);
    }

    public void deleteAllEnvios() {
        envioRepository.deleteAll();
    }


}
