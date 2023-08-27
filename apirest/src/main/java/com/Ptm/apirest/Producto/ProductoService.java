package com.Ptm.apirest.Producto;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductoService {
    private final ProductoRepository productoRepo;

    public Producto createProducto(Producto producto){
       return productoRepo.save(producto);
    }
     public List<Producto> getProductos(){
       return productoRepo.findAll();
    }

    public Producto getProducto(Integer id){
        return productoRepo.findById(id).orElse(null);
     }

     public void deleteProducto(Integer id){
        productoRepo.deleteById(id);
     }
}
