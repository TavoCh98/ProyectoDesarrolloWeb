
package com.Proyecto_DesaWeb.controller;

import com.Proyecto_DesaWeb.domain.Usuario;
import com.Proyecto_DesaWeb.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class IndexController {
    
    @Autowired
    UsuarioService usuarioService;
    
    @GetMapping("/usuario/listado")
    public String page(Model model) {
        log.info("Ahora estás conectado con la base de datos práctica");
        var usuarios = usuarioService.getUsuarios();
        Object usuario = null;
        model.addAttribute("usuarios", usuario);

        return "/usuario/listado";
    }
    
    @GetMapping("/usuario/nuevo")
    public String nuevoEstado(Usuario usuario) {
        return "/usuario/modificar";
    }
    
    @PostMapping("/usuario/salvar")
    public String salvarUsuario(Usuario usuario) {
        usuarioService.save(usuario);
        return "redirect:/usuario/listado";
    }
    
    @GetMapping("/usuario/modificar/{idUsuario}")
    
    public String modificarUsuario(Usuario Usuario, Model model) {
        Usuario = usuarioService.getUsuario(Usuario);
        model.addAttribute("usuario", Usuario);
        return "/usuario/modificar";
    }

    @GetMapping("/usuario/eliminar/{idUsuario}")
    public String eliminarEstado(Usuario usuario) {
        usuarioService.delete(usuario);
        return "redirect:/usuario/listado";
    } 
}
