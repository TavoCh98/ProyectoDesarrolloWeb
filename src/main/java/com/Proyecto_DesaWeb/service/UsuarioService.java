
package com.Proyecto_DesaWeb.service;

import com.Proyecto_DesaWeb.domain.Usuario;
import java.util.List;

/**
 *
 * @author mariafernandamiranda
 */
public interface UsuarioService {
    
    public List<Usuario> getUsuarios();
    
    public Usuario getUsuario(Usuario usuario);
    
    public void save(Usuario usuario);
    
    public void delete(Usuario usuario);
}
