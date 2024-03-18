package uniandes.edu.co.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.ui.Model;

import uniandes.edu.co.proyecto.modelo.Cliente;
import uniandes.edu.co.proyecto.repositorio.ClienteRepository;

@Controller
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping("/clientes/new/save")
    public String clienteGuardar(@ModelAttribute Cliente cliente) {
        clienteRepository.insertarCliente(cliente.getUsuario().getLogin());
        return "redirect:/clientes";
    }

    @GetMapping("/clientes/{login}/edit")
    public String clienteEditarForm(@PathVariable("login") String login, Model model) {
        Cliente cliente = clienteRepository.darInformacioncliente(login);
        if (cliente != null) {
            model.addAttribute("cliente", cliente);
            return "clienteEditar";
        } else {
            return "redirect:/clientes";
        }
    }

}
