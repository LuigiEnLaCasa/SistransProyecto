package uniandes.edu.co.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import uniandes.edu.co.proyecto.modelo.GerenteGeneral;

import uniandes.edu.co.proyecto.repositorio.GerenteGeneralRepository;

@Controller
public class GerenteGeneralController {

    @Autowired
    private GerenteGeneralRepository gerenteGeneralRepository;

    @GetMapping("/gerentesgenerales/new")
    public String gerenteForm(Model model) {
        model.addAttribute("gerenteGeneral", new GerenteGeneral());
        return "gerenteGeneralNuevo";
    }

    @PostMapping("/gerentesGenerales/new/save")
    public String gerenteGeneralGuardar(@ModelAttribute GerenteGeneral gerenteGeneral) {
        gerenteGeneralRepository.insertarGerente(gerenteGeneral.getUsuario().getLogin());
        return "redirect:/gerentesGenerales";
    }
}
