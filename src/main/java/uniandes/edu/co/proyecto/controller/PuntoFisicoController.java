package uniandes.edu.co.proyecto.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;

import uniandes.edu.co.proyecto.modelo.PuntoFisico;
import uniandes.edu.co.proyecto.repositorio.PuntoFisicoRepository;

@Controller
public class PuntoFisicoController {

    @Autowired
    PuntoFisicoRepository puntoFisicoRepository;

    @PostMapping("/puntosFisicos/new/save")
    public String puntoFisicoGuardar(@ModelAttribute PuntoFisico puntoFisico) {
        puntoFisicoRepository.insertarPuntoFisico(puntoFisico.getId(),puntoFisico.getTipo(),puntoFisico.getId_oficina().getId());
        return "redirect:/puntosDeAtencion";
    }   

}
