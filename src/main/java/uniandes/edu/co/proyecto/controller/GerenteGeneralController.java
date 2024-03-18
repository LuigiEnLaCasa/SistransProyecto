package uniandes.edu.co.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import uniandes.edu.co.proyecto.modelo.GerenteGeneral;

import uniandes.edu.co.proyecto.repositorio.GerenteGeneralRepository;

@Controller
public class GerenteGeneralController {

    @Autowired
    private GerenteGeneralRepository gerenteGeneralRepository;

    @PostMapping("/gerentesGenerales/new/save")
    public String gerenteGeneralGuardar(@ModelAttribute GerenteGeneral gerenteGeneral) {
        gerenteGeneralRepository.insertarGerente(gerenteGeneral.getUsuario().getLogin());
        return "redirect:/gerentesGenerales";
    }
}
