package com.Ptm.productoapirest.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Ptm.productoapirest.Entity.Producto;


@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer>  {
    
}
