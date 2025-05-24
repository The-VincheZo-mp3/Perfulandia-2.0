package com.perfulandia.cl.perfulandia.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.perfulandia.cl.perfulandia.Model.Sucursal;
@Repository
public interface SucursalRepository extends JpaRepository<Sucursal,Long> {

    static void deleteById() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

}
