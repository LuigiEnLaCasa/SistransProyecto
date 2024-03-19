package uniandes.edu.co.proyecto.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import uniandes.edu.co.proyecto.modelo.PortalWeb;
import uniandes.edu.co.proyecto.modelo.PuntoFisico;
import uniandes.edu.co.proyecto.repositorio.PortalWebRepository;


@Controller
public class PortalWebController {

    @Autowired
    PortalWebRepository portalWebRepository;

    @GetMapping("/portalesWeb/new")
    public String portalWebForm(Model model) {
        model.addAttribute("portalWeb", new PortalWeb());
        return "portalWebNuevo";
    }
    

    @PostMapping("/portalesWeb/new/save")
    public String portalWebGuardar(@ModelAttribute PuntoFisico puntoFisico) {
        portalWebRepository.insertarPortalWeb(puntoFisico.getId(),puntoFisico.getTipo());
        return "redirect:/portalesWeb";
    }   
}
