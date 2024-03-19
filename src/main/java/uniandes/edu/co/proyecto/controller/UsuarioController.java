package uniandes.edu.co.proyecto.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.ui.Model;
import uniandes.edu.co.proyecto.modelo.Usuario;

import uniandes.edu.co.proyecto.repositorio.UsuarioRepository;


@Controller
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("/usuarios/new")
    public String usuarioForm(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "usuariosNuevo";
    }

    @PostMapping("/usuarios/new/save")
    public String usuarioGuardar(@ModelAttribute Usuario usuario) {
        usuarioRepository.insertarUsuario(usuario.getLogin(),usuario.getClave(),usuario.getDocumento_identidad(),
        usuario.getTipo_documento(),usuario.getNombre(),usuario.getNacionalidad(),usuario.getTelefono(),usuario.getDireccion_electronica());
        return "redirect:/usuarios";
    }   

}
