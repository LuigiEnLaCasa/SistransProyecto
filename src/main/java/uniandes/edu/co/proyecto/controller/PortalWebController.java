package uniandes.edu.co.proyecto.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;

import uniandes.edu.co.proyecto.modelo.PuntoFisico;
import uniandes.edu.co.proyecto.repositorio.PortalWebRepository;


@Controller
public class PortalWebController {

    @Autowired
    PortalWebRepository portalWebRepository;

    @PostMapping("/portalesWeb/new/save")
    public String portalWebGuardar(@ModelAttribute PuntoFisico puntoFisico) {
        portalWebRepository.insertarPortalWeb(puntoFisico.getId(),puntoFisico.getTipo());
        return "redirect:/portalesWeb";
    }   
}
