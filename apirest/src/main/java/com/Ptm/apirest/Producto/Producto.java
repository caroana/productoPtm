package com.Ptm.apirest.Producto;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Producto {
    @Id
    @GeneratedValue
    private Integer id;
    @Basic
    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer cantidadStock;


    
}
