package uniandes.edu.co.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import uniandes.edu.co.proyecto.modelo.PuntoDeAtencion;

import uniandes.edu.co.proyecto.repositorio.PuntoDeAtencionRepository;

@Controller
public class PuntoDeAtencionController {

    @Autowired
    PuntoDeAtencionRepository puntoDeAtencionRepository;

    @PostMapping("/puntosDeAtencion/new/save")
    public String puntoDeAtencionGuardar(@ModelAttribute PuntoDeAtencion puntoDeAtencion) {
        puntoDeAtencionRepository.insertarPuntoDeAtencion(puntoDeAtencion.getId());
        return "redirect:/puntosDeAtencion";
    }   
}
