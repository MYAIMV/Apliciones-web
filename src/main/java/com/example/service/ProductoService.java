package com.example.demo.service;

import com.example.demo.model.Producto;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoService {

    private List<Producto> productos = List.of(
            new Producto(1,"Cuadro de fotos"),
            new Producto(2,"Harry Potter"),
            new Producto(3,"Casco de moto"),
            new Producto(4,"Cubo Rubik")
    );

    public List<Producto> obtenerProductos(){
        return productos;
    }

    public Producto obtenerProductoPorId(int id){
        return productos.stream()
                .filter(p -> p.getId()==id)
                .findFirst()
                .orElse(null);
    }
}