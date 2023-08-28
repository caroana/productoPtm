package com.Ptm.productoapirest.Controller;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import com.Ptm.productoapirest.Entity.Producto;
import com.Ptm.productoapirest.Service.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin(origins="http://localhost:3000/")
@RestController
@RequestMapping("/producto")
@RequiredArgsConstructor
public class ProductoController {
    private final ProductoService productoService;

    @PostMapping("/add")
    @ResponseBody
    public Producto createProducto(@RequestBody Producto producto){
       return productoService.createProducto(producto);
    }
      
    @GetMapping("/getProductos")
    @ResponseBody
    public List<Producto> getProductos(){
       return productoService.getProductos();
    }

    @GetMapping("/getProducto/{id}")
    @ResponseBody
    public Producto getProducto(@PathVariable Integer id){
       return productoService.getProducto(id);
    }

   @PutMapping("/updateProducto/{id}")
   @ResponseBody
    public Producto updateProducto(@PathVariable Integer id,@RequestBody Producto producto){
       return productoService.updateProducto(id,producto);
    }
 
    @DeleteMapping("/deleteProducto/{id}")
    public void deleteProducto(@PathVariable Integer id){
       productoService.deleteProducto(id);
    }
    
}
