package com.perfulandia.cl.perfulandia.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.perfulandia.cl.perfulandia.Model.Envio;
import com.perfulandia.cl.perfulandia.Service.EnvioService;

@RestController
@RequestMapping("/envios")
public class EnvioController {
    @Autowired
    private EnvioService envioService;

    @GetMapping
    public List<Envio> getAllEnvios() {
        return envioService.getAllEnvios();
    }

    @GetMapping ("/{id}")
    public Optional<Envio> getEnvioById(@PathVariable Long id) {
        return envioService.getEnvioById(id);
    }

    @PostMapping
    public Envio createEnvio(@RequestBody Envio envio) {
        return envioService.createEnvio(envio);
    }
    
    @PutMapping ("/{id}")
    public Envio updateEnvio(@PathVariable Long id, @RequestBody Envio envio) {
        return envioService.updateEnvio(id, envio);
    }

    @DeleteMapping ("/{id}")
    public void deleteEnvio(@PathVariable Long id) {
        envioService.deleteEnvio(id);
    }

    @DeleteMapping
    public void deleteAllEnvios() {
        envioService.deleteAllEnvios();
    }
}
