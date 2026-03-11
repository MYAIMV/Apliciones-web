package com.example.demo.controller;

import com.example.demo.model.Producto;
import com.example.demo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService service;

    @GetMapping
    public List<Producto> obtenerProductos(){
        return service.obtenerProductos();
    }

    @GetMapping("/{id}")
    public Producto obtenerProducto(@PathVariable int id){
        return service.obtenerProductoPorId(id);
    }
}