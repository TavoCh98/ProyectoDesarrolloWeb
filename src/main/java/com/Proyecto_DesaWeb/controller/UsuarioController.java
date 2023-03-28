
package com.Proyecto_DesaWeb.controller;

import com.Proyecto_DesaWeb.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author mariafernandamiranda
 */
@Controller
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;
    
    @GetMapping("/")
    public String page(Model model) {
        
        var usuarios = usuarioService.getUsuarios();
        Object usuario = null;
        model.addAttribute("usuarios", usuario);

        return "index";
    }
}

