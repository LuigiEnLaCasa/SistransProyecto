package uniandes.edu.co.proyecto.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import uniandes.edu.co.proyecto.modelo.Prestamo;
import uniandes.edu.co.proyecto.repositorio.PrestamoRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class PrestamoController {

    @Autowired
    PrestamoRepository prestamoRepository;

     @GetMapping("/prestamos/new")
    public String prestamoForm(Model model) {
        model.addAttribute("prestamo", new Prestamo());
        return "prestamoNuevo";
    }

    @PostMapping("/prestamos/new/save")
    public String prestamoGuardar(@ModelAttribute Prestamo prestamo) {
        prestamoRepository.insertarPrestamo(prestamo.getId(),prestamo.getTipo(),prestamo.getValor_total(),
        prestamo.getSaldo_pendiente(),prestamo.getCuotas(),prestamo.getCuotas_pendientes(),prestamo.getValor_cuota(),
        prestamo.getDia_corte(),prestamo.getInteres());
        return "redirect:/prestamos";
    }  

    @GetMapping("/prestamos/{login}/edit")
    public String prestamoEditarForm(@PathVariable("login") String login, Model model) {
        Prestamo prestamo = prestamoRepository.darInformacionPrestamo(login);
        if (prestamo != null) {
            model.addAttribute("prestamo", prestamo);
            return "prestamoEditar";
        } else {
            return "redirect:/prestamos";
        }
    }

@GetMapping("/prestamos/{id}/delete")
public String borrarPrestamo(@PathVariable("id") int id) {

    prestamoRepository.eliminarPrestamo(id);
    return "redirect:/prestamos";
}




}
