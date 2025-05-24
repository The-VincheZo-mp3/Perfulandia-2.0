package com.perfulandia.cl.perfulandia.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.perfulandia.cl.perfulandia.Model.Venta;
@Repository
public interface VentaRepository extends JpaRepository<Venta,Long>{

}
