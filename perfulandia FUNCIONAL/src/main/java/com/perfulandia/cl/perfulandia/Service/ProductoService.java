package com.perfulandia.cl.perfulandia.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.perfulandia.cl.perfulandia.Model.Producto;
import com.perfulandia.cl.perfulandia.Repository.ProductoRepository;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }


    public List<Producto> getAllProducts() {
        return productoRepository.findAll();
    }

    
    public Optional<Producto> getProductoById(Long id) {
        return productoRepository.findById(id);
    }

   
    public Producto createProducto(Producto producto) {
        return productoRepository.save(producto);
    }


    public Producto updateProducto(Long id, Producto producto) {
        return productoRepository.findById(id)
            .map(existingProducto -> {
                producto.setId(id);
                return productoRepository.save(producto);
            })
            .orElseThrow(() -> new RuntimeException("Producto no encontrado con id: " + id));
    }

 
    public void deleteProducto(Long id) {
        if (!productoRepository.existsById(id)) {
            throw new RuntimeException("Producto no encontrado con id: " + id);
        }
        productoRepository.deleteById(id);
    }

   
    public void deleteAllProducts() {
        productoRepository.deleteAll();
    }
}