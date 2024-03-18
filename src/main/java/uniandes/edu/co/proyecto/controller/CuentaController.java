package uniandes.edu.co.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import uniandes.edu.co.proyecto.modelo.Cuenta;
import uniandes.edu.co.proyecto.repositorio.CuentaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CuentaController {
    
    @Autowired
    private CuentaRepository cuentaRepository;
    
    
   @GetMapping("/cuentas/new")
    public String cuentaForm(Model model) {
        model.addAttribute("cuenta", new Cuenta());
        return "cuentadNueva";
    }

    @PostMapping("/cuentas/new/save")
    public String cuentaGuardar(@ModelAttribute Cuenta cuenta) {
        cuentaRepository.insertarCuenta(cuenta.getId(), cuenta.getTipo(), cuenta.getSaldo(), cuenta.getEstado());
        return "redirect:/cuentas";
    }
   
  


}
