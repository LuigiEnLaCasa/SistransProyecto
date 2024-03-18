package uniandes.edu.co.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;

import uniandes.edu.co.proyecto.modelo.Producto;

import uniandes.edu.co.proyecto.repositorio.ProductoRepository;


@Controller

public class ProductoController {

    @Autowired
    ProductoRepository productoRepository;

    @PostMapping("/productos/new/save")
    public String productoGuardar(@ModelAttribute Producto producto) {
        productoRepository.insertarProducto(producto.getId(),producto.getFechaDeCreacion(),producto.getId_cliente().getId(),
        producto.getId_oficina().getId());
        return "redirect:/prestamos";
    }  
}
