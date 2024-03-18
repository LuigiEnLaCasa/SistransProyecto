package uniandes.edu.co.proyecto.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import uniandes.edu.co.proyecto.modelo.Cuenta;
import uniandes.edu.co.proyecto.modelo.DireccionFisica;
import uniandes.edu.co.proyecto.repositorio.DireccionFisicaRepository;
import org.springframework.web.bind.annotation.PostMapping;


public class DireccionFisicaController {
    
    DireccionFisicaRepository dfr;

    @GetMapping("/direccionesfisicas/new")
    public String direccionFisicaForm(Model model) {
        model.addAttribute("DireccionFisica", new DireccionFisica());
        return "direccionFisicaNueva";
    }

//     @PostMapping("/cuentas/new/save")
//     public String cuentaGuardar(@ModelAttribute DireccionFisica direccionFisica) {
//         dfr.insertarDireccionFisica(direccionFisica.get, null, null, null);
//         return "redirect:/cuentas";
//     }
// }
//insertarCuenta(cuenta.getId(), cuenta.getTipo(), cuenta.getSaldo(), cuenta.getEstado());

}