package uniandes.edu.co.proyecto.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;




import uniandes.edu.co.proyecto.modelo.Empleado;
import uniandes.edu.co.proyecto.repositorio.EmpleadoRepository;

@Controller
public class EmpleadoController {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @GetMapping("/empleados/new")
    public String empleadoForm(Model model) {
        model.addAttribute("empleado", new Empleado());
        return "empleadoNuevo";
    }

    @PostMapping("/empleados/new/save")
    public String empleadoGuardar(@ModelAttribute Empleado empleado) {
        empleadoRepository.insertarEmpleado(empleado.getUsuario().getLogin(), empleado.getTipo(), empleado.getId_oficina().getId());
        return "redirect:/gerentesGenerales";
    }
}
