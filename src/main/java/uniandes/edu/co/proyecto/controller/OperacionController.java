package uniandes.edu.co.proyecto.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;

import uniandes.edu.co.proyecto.modelo.Operacion;
import uniandes.edu.co.proyecto.repositorio.OperacionRepository;


@Controller
public class OperacionController {

    @Autowired
    OperacionRepository operacionRepository;

    @PostMapping("/operaciones/new/save")
    public String operacionGuardar(@ModelAttribute Operacion operacion) {
        operacionRepository.insertarOperacion(operacion.getId(), operacion.getFecha(),operacion.getMonto(),
        operacion.getSaldo_final_salida(),operacion.getSaldo_final_entrada(),operacion.getId_cuenta().getId(),
        operacion.getId_producto().getId(),operacion.getId_puntoDeAtencion() .getId());
        return "redirect:/puntosDeAtencion";
    }   
}
