package com.Ptm.apirest.Producto;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ptm.apirest.Producto.ProductoService;

import lombok.RequiredArgsConstructor;
@CrossOrigin(origins="http://localhost:3000/")
@RestController
@RequestMapping("/producto")
@RequiredArgsConstructor
public class ProductoController {

    private final ProductoService productoService;

    @PostMapping("/add")
    public Producto createProducto(@RequestBody Producto producto){
       return productoService.createProducto(producto);
    }
      
    @GetMapping("/getProductos")
    public List<Producto> getProductos(){
       return productoService.getProductos();
    }

    @GetMapping("/getProducto/{id}")
    public Producto getProducto(@PathVariable Integer id){
       return productoService.getProducto(id);
    }

    @DeleteMapping("/deleteProducto/{id}")
    public void deleteProducto(@PathVariable Integer id){
       productoService.deleteProducto(id);
    }
    
}
