package uniandes.edu.co.proyecto.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;


import uniandes.edu.co.proyecto.modelo.PuntoDeAtencion;

import uniandes.edu.co.proyecto.repositorio.PuntoDeAtencionRepository;

@Controller
public class PuntoDeAtencionController {

    @Autowired
    PuntoDeAtencionRepository puntoDeAtencionRepository;

    @GetMapping("/puntosDeAtencion/new")
    public String puntoDeAtencionForm(Model model) {
        model.addAttribute("puntoAtencion", new PuntoDeAtencion());
        return "puntoAtencionNuevo";
    }
    

    @PostMapping("/puntosDeAtencion/new/save")
    public String puntoDeAtencionGuardar(@ModelAttribute PuntoDeAtencion puntoDeAtencion) {
        puntoDeAtencionRepository.insertarPuntoDeAtencion(puntoDeAtencion.getId());
        return "redirect:/puntosDeAtencion";
    }   
}
