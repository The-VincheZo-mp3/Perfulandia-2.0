package com.perfulandia.cl.perfulandia.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.perfulandia.cl.perfulandia.Model.Envio;

@Repository
public interface EnvioRepository extends JpaRepository<Envio,Long> {

}
