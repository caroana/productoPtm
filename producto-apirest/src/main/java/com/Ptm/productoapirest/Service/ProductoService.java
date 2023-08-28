package com.Ptm.productoapirest.Service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.Ptm.productoapirest.Entity.Producto;
import com.Ptm.productoapirest.Repository.ProductoRepository;
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
     public Producto updateProducto(Integer id,Producto producto){
         Producto productoRepositorio=productoRepo.findById(id).orElse(null);
         if (productoRepositorio !=null){
            productoRepositorio.setNombre(producto.getNombre());
            productoRepositorio.setDescripcion(producto.getDescripcion());
            productoRepositorio.setPrecio(producto.getPrecio());
            productoRepositorio.setCantidadStock(producto.getCantidadStock());
         }
         return  productoRepo.save(productoRepositorio);
         
     }

     public void deleteProducto(Integer id){
        productoRepo.deleteById(id);
     }
}
