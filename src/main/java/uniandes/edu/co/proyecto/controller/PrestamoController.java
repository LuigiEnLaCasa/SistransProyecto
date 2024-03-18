package uniandes.edu.co.proyecto.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;

import uniandes.edu.co.proyecto.modelo.Prestamo;
import uniandes.edu.co.proyecto.repositorio.PrestamoRepository;


@Controller
public class PrestamoController {

    @Autowired
    PrestamoRepository prestamoRepository;

    @PostMapping("/prestamos/new/save")
    public String prestamoGuardar(@ModelAttribute Prestamo prestamo) {
        prestamoRepository.insertarPrestamo(prestamo.getId(),prestamo.getTipo(),prestamo.getValor_total(),
        prestamo.getSaldo_pendiente(),prestamo.getCuotas(),prestamo.getCuotas_pendientes(),prestamo.getValor_cuota(),
        prestamo.getDia_corte(),prestamo.getInteres());
        return "redirect:/prestamos";
    }  
}
